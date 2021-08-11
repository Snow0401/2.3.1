package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {
    public List<User> index();

    public User show(int id);

    public void save(User user);

    public void update(int id, User user);

    public void delete(int id);
}
