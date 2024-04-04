package com.example.demo_02_.controller;

import com.example.demo_02_.DTO.UserDTO;
import com.example.demo_02_.exceptions.rest.ForeingKeyNotFound;
import com.example.demo_02_.exceptions.rest.UserNameInvalidException;
import com.example.demo_02_.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@CustomRestContoller(path = "api/v1/ssp/user")
//@AllArgsConstructor
@RestController
@RequestMapping("api/v1/ssp/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/")
    public ResponseEntity<?> findByUser(){
//        try{
            return new ResponseEntity<List<UserDTO>>(userService.getUsers(), HttpStatus.ACCEPTED);
//        }catch (RuntimeException e){
//            if(e instanceof ForeingKeyNotFound){
//                e.printStackTrace();
//                ////////////////////////////////////////
//            }else{
//                if(e.getCause() instanceof UserNameInvalidException){
//                        UserNameInvalidException exceptione= (UserNameInvalidException) e.getCause();
//                         exceptione.getUsername();
//                }else{
//
//                }
//            }

//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        return new ResponseEntity<List<UserDTO>>((List<UserDTO>) null, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
