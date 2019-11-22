package ua.epam.spring.hometask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.epam.spring.hometask.domain.User;
import ua.epam.spring.hometask.service.UserService;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    User user;

    @RequestMapping(value = "/displayUsers", method = RequestMethod.GET)
    public String displayUsers(ModelMap modelMap) {
        modelMap.put("usersList", userService.getAll().toString());
        return "UsersList";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public String showAddUser(ModelMap modelMap) {
        modelMap.addAttribute("user", user);
        return "AddUser";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(ModelMap modelMap, @Valid User user, BindingResult result) {
        System.out.println(user.toString());
        userService.save(user);
        return "redirect:/displayUsers";
    }

    @RequestMapping(value = "/getUserByEmailId", method = RequestMethod.GET)
    public String getUserByEmailId(ModelMap modelMap, @RequestParam String email) {
        modelMap.put("usersList", userService.getUserByEmail(email));
        return "UsersList";
    }
}
