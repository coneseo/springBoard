package com.springboard.board.dao;

import com.springboard.board.dto.User;

import java.util.List;

public interface UserDao {
     Long addUser(User user);
     User getUser(String email);

    List<User> getUsers();
}
