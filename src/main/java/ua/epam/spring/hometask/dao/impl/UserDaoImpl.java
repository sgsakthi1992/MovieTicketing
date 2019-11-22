package ua.epam.spring.hometask.dao.impl;

import org.springframework.stereotype.Service;
import ua.epam.spring.hometask.dao.UserDao;
import ua.epam.spring.hometask.domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserDaoImpl implements UserDao {
    private List<User> usersList = new ArrayList<User>();

    @Override
    public User save(User user){
        usersList.add(user);
        return user;
    }

    @Override
    public void remove(User user){
        usersList.remove(user);
    }

    @Override
    public User getById(long userId){
        Optional<User> filteredUser = usersList.stream().filter(user -> user.getId().equals(userId)).findFirst();
        return filteredUser.get();
    }

    @Override
    public User getUserByEmail(String email){
        Optional<User> filteredUser = usersList.stream().filter(user -> user.getEmail().equals(email)).findFirst();
        return filteredUser.get();
    }

    @Override
    public List<User> getAll(){
        return usersList;
    }
}
