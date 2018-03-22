package org.kreognenberg.controller;

import org.kreognenberg.model.User;
import org.kreognenberg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@ControllerAdvice
public class UserController {

    @Autowired
    private UserService Userv;

    @RequestMapping(value = "/", method = GET)
    public String index(Model model)
    {
        model.addAttribute("user", new User());
        return ("redirect:/userForm");
    }

    @RequestMapping(value = "/userForm", method = GET)
    public ModelAndView userForm()
    {
        ModelAndView mav = new ModelAndView("userForm", "User", "User");
        return (mav);
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") User user, Model model)
    {
        return ("/userInfo");
    }


}
