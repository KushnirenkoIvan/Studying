package ua.kushnirenko.architecture.user.dao;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import ua.kushnirenko.architecture.user.domain.User;


@Repository
public class UserDAOImpl implements UserDAO {

    private static Logger log = Logger.getLogger("TESTListenerLOGGER");

    @Override
    public Long create(User user) {
        log.info("New User was created: \n" + user);
        return user.getId();
    }

    @Override
    public User read(Long id) {
        User user = new User(id, "login");
        log.info("Get user by id: " + user);
        return user;
    }

    @Override
    public boolean update(User user) {
        log.info("User: \n" + user + "\n was updated.");
        return true;
    }

    @Override
    public boolean delete(User user) {
        log.info("User: \n" + user + "\n was deleted.");
        return true;
    }


}
