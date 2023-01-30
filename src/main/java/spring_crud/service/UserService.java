package spring_crud.service;

import spring_crud.entity.User;

import java.util.List;

public interface UserService {

    public List<User> showAllUsers();

    public User getUser(Long id);

    public void save(User user);

    public void delete(Long id);

    public void update(User user);

}
