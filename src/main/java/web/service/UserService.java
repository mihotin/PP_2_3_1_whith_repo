package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    void save(User user);

    void delete(Long id);

    void update(Long id, User updateUser);

    User getOne(Long id);

    List<User> getAll();
}
