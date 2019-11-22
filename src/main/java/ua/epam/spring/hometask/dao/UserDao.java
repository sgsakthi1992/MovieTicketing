package ua.epam.spring.hometask.dao;

import org.springframework.stereotype.Service;
import ua.epam.spring.hometask.domain.User;

import java.util.List;

@Service
public interface UserDao {
    public User save(User user);
    public void remove(User user);
    public User getById(long userId);
    public User getUserByEmail(String email);
    public List<User> getAll();
}
