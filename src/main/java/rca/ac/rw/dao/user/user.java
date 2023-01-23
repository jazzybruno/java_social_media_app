package rca.ac.rw.dao.user;

import rca.ac.rw.orm.User;

import java.util.List;

public interface user {
    public void saveUser();
    public void updateUser();
    public void deleteUser();
    public List<User> getUsers();
}
