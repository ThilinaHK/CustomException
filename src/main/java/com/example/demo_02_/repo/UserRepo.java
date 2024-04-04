package com.example.demo_02_.repo;


import com.example.demo_02_.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity,Integer> {

}
