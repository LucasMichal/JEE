package org.kreognenberg.service;

import org.kreognenberg.model.User;

public interface UserService {
    User register(User  newUser);
    User  logUser(String  username , String  password);
}
