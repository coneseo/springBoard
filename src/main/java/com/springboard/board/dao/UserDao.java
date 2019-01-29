package com.springboard.board.dao;

import com.springboard.board.dto.User;

public interface UserDao {
     Long addUser(User user);
     User getUser(String email);
}
