package com.springboard.board.service;

import com.springboard.board.dao.UserDao;
import com.springboard.board.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
     User addUser(User user);
     User getUserByEmail(String email);
     List<User> getUsers();
}
