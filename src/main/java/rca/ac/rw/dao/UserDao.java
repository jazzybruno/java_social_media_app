package rca.ac.rw.dao;

import rca.ac.rw.orm.User;

import java.util.List;

public interface UserDao {
        public void saveUser(User user);
        public void updateUser(User user);
        public void deleteUser(int id);
        public List<User> getUsers();

}
