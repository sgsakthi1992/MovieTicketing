package ua.epam.spring.hometask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.shell.standard.ShellComponent;
//import org.springframework.shell.standard.ShellMethod;
import ua.epam.spring.hometask.configuration.ApplicationConfiguration;
import ua.epam.spring.hometask.domain.User;
import ua.epam.spring.hometask.service.UserService;
import ua.epam.spring.hometask.service.impl.UserServiceImpl;

import java.util.List;

//@ShellComponent
public class Application {
    @Autowired
    UserServiceImpl userServiceImpl;

   // @ShellMethod(value = "Add Users", key = "addUser")
    public void addUser(){

    }
  //  @ShellMethod("display users")
    public int displayUsers(int a) {
        return userServiceImpl.getAll().size() + 0;
    }

  //  @ShellMethod("Add two integers together.")
    public int add(int a, int b) {
        return a + b;
    }
}
