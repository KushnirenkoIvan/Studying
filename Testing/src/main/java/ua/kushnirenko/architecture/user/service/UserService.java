package ua.kushnirenko.architecture.user.service;

import ua.kushnirenko.architecture.user.domain.User;

public interface UserService {

    User findUserById(Long id);

    boolean saveNewUser(User user);
}
