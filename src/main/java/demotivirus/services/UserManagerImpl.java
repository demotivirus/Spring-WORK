package demotivirus.services;

import demotivirus.dao.UserDao;
import demotivirus.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManagerImpl implements UserManager {
    @Autowired
    UserDao dao;

    @Override
    public List<User> getAllUsers() {
        return dao.getAllUsers();
    }
}
