package ua.kushnirenko.rest.repository;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import ua.kushnirenko.rest.entity.User;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.List;


@Repository
public class UserTextFileRepositoryImpl implements UserRepository {

    private Logger LOG = Logger.getLogger("controllerLogger");

    private RandomAccessFile repository;

    private static Charset utf8;
    private static CharsetEncoder utf8Enc;
    private static CharsetDecoder utf8Dec;

    private FileChannel channel;
    private ByteBuffer byteBuffer;


    private Integer currentId;

    public UserTextFileRepositoryImpl() {

        try {
            repository = new RandomAccessFile("RESTfullService/data/userData.repo", "rws");
        } catch (FileNotFoundException e) {
            LOG.info("Cannot fund repository file: \n" + e.getStackTrace());
        }

        utf8 = Charset.forName("utf-8");
        utf8Enc = utf8.newEncoder();
        utf8Dec = utf8.newDecoder();

        channel = repository.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate(11);

        try {
            channel.read(byteBuffer, 29);
        } catch (IOException e) {
            LOG.fatal("Cannot get current id from repository file: \n" + e.getStackTrace());
            return;
        }

        try {
            currentId = Integer.parseInt(new String(byteBuffer.array(), "UTF-8").trim());
        } catch (UnsupportedEncodingException e) {
            LOG.fatal("Cannot encode received id value: \n" + e.getStackTrace());
            return;
        }

        LOG.debug("New UserTextFileRepositoryCreated.");
    }

    @Override
    public Integer save(User user) throws UnsupportedEncodingException {

        user.setId(getCurrentId());

        LOG.debug("Saving user: \n" + user);

        byteBuffer = ByteBuffer.allocate(120);

        byteBuffer = encodeString(user.toString());

        try {
            channel.position(channel.size());
        } catch (IOException e) {
            LOG.fatal("Cannot set position to write new user: \n" + e.getStackTrace());
        }

        try {
            channel.write(byteBuffer);
        } catch (IOException e) {
            LOG.fatal("Cannot write user: \n" + user + " to repository: \n" + e.getStackTrace());
        }

        setCurrentId();

        LOG.debug("User: \n" + user + " successfully saved to repository.");

        return user.getId();
    }

    @Override
    public User find(Integer integer) {
        return null;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public boolean delete(User user) {
        return false;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public List<User> deleteAll() {
        return null;
    }

    @Override
    public Integer getCurrentId() {
        return currentId;
    }

    private void setCurrentId() {
        if (currentId == Integer.MIN_VALUE) {
            throw new OutOfMemoryError("Repository file is empty, you have to choose another one.");
        }
        currentId++;
    }

    @Override
    public void synchronizeValues() {

        LOG.info("Synchronizing id value with repository.");

        byteBuffer = ByteBuffer.allocate(11);

        byteBuffer = encodeString(currentId.toString());

        try {
            channel.position(29);
        } catch (IOException e) {
            LOG.fatal("Cannot set up position to synchronize with repository: \n" + e.getStackTrace());
            return;
        }

        byteBuffer.limit(11);

        try {
            channel.write(byteBuffer);
        } catch (IOException e) {
            LOG.fatal("Cannot write new id value to repository: \n" + e.getStackTrace());
            return;
        }

        LOG.debug("New id value successfully wrote to repository.");
    }

    private ByteBuffer encodeString(String info) {

        StringBuilder sb = new StringBuilder(info);

        for (int i = sb.length(); i < 118; i++) {
            sb.append(' ');
        }

        sb.append('\r').append('\n');

        CharBuffer charBuff = CharBuffer.wrap(sb);

        byteBuffer = ByteBuffer.allocate(120);

        utf8Enc.encode(charBuff, byteBuffer, false);

        byteBuffer.limit(byteBuffer.position());
        byteBuffer.rewind();

        return byteBuffer;
    }
}
