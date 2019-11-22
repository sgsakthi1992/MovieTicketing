package ua.epam.spring.hometask.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.epam.spring.hometask.dao.UserDao;
import ua.epam.spring.hometask.domain.User;
import ua.epam.spring.hometask.service.UserService;

import javax.annotation.Nonnull;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    public User save(User user){
        return userDao.save(user);
    }

    @Override
    public void remove(@Nonnull User user) {
        userDao.remove(user);
    }

    @Override
    public User getById(@Nonnull Long userId) {
        return userDao.getById(userId);
    }


    public User getUserByEmail(String email){
        return userDao.getUserByEmail(email);
    }

    public List<User> getAll(){
        return userDao.getAll();
    }
}
