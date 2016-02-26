package ua.kushnirenko.architecture.user.dao;

import ua.kushnirenko.architecture.user.domain.User;

public interface UserDAO {

    Long create(User user);

    User read(Long id);

    boolean update(User user);

    boolean delete(User user);

}
