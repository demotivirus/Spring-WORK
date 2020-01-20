package demotivirus.dao;

import demotivirus.models.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
}