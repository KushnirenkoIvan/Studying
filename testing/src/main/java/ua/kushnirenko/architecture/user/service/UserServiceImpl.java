package ua.kushnirenko.architecture.user.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.kushnirenko.architecture.user.dao.UserDAO;
import ua.kushnirenko.architecture.user.domain.User;

@Service
public class UserServiceImpl implements UserService {

    private static Logger logger = Logger.getLogger("TESTListenerLOGGER");

    @Autowired
    private UserDAO userDAO;

    @Override
    public User findUserById(Long id) {
        logger.info("Method findUserById called. Input data: " + id);
        return userDAO.read(id);
    }

    @Override
    public boolean saveNewUser(User user) {
        logger.info("Method saveNewUser called. Input data: \n" + user);
        return userDAO.create(user) != null;
    }
}
