package com.example.demo_02_.service;

import com.example.demo_02_.DTO.UserDTO;
import org.springframework.stereotype.Service;
import java.util.List;


public interface UserService {

    List<UserDTO> getUsers();

}
