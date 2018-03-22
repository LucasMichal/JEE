package org.kreognenberg.service;
import org.kreognenberg.model.User;
import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    HashMap<Integer, User> users = new HashMap<Integer, User>();

    public User register(User newUser) {
        for (User u : users.values()) {
            if (newUser.name == u.name) {
                return (null);
            }
        }
        users.put(users.size() + 1, newUser);
        return (newUser);
    }

    public User logUser(String username, String password) {
        for (User u : users.values()) {
            if (username == u.name) {
                if (u.password == password)
                    return (u);
                else
                    return (null);
            }
        }
        return (null);
    }
}
