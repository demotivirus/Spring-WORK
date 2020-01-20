package demotivirus.dao;

import demotivirus.models.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User(1,"Adam", "Smith"));
        users.add(new User(2,"Ada", "Loveleys"));
        return users;
    }
}
