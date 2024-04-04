package com.example.demo_02_.serviceImpl;

import com.example.demo_02_.DTO.UserDTO;
import com.example.demo_02_.entity.UserEntity;
import com.example.demo_02_.exceptions.rest.ForeingKeyNotFound;
import com.example.demo_02_.exceptions.rest.UserNameInvalidException;
import com.example.demo_02_.repo.UserRepo;
import com.example.demo_02_.service.UserService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Transactional(rollbackOn = RuntimeException.class,dontRollbackOn = ForeingKeyNotFound.class)
public class UserServiceImpl implements UserService {

    /**
     * @param
     * @return
     */


    private final UserRepo userRepo;
//    private final ModelMapper modelMapper;

    @Override
    public List<UserDTO> getUsers() {
        List<UserDTO> userDTOS = new ArrayList<>();
        List<UserEntity> userEntities = userRepo.findAll();


        if(userEntities.isEmpty()){
            System.out.println("isEmpty");
            UserNameInvalidException exception=new UserNameInvalidException(7250,"User Array may not be empty.....");
            throw new RuntimeException("UserNameInvalidException Error",exception);
        }
        else if(!userEntities.isEmpty()){
            for (UserEntity user : userEntities) {
                UserDTO dto = new UserDTO();
                dto.setId(user.getId());
                dto.setEmail(user.getEmail());
                dto.setFirstName(user.getFirstName());
                dto.setLastName(user.getLastName());
                dto.setPassword(user.getPassword());
                userDTOS.add(dto);
            }
//            System.out.println("nooooooooo isEmpty");
//            ForeingKeyNotFound exceptionfk=new ForeingKeyNotFound(7251,"User Array may be empty.....");
//            throw new RuntimeException("ForeingKeyNotFound Error",exceptionfk);
            UserNameInvalidException exception=new UserNameInvalidException(7250,"User Array may not be empty.....");
            throw new RuntimeException("UserNameInvalidException Error",exception);
        }else{
            System.out.println("@@@@@@@@@@@@@@");
        }


        return userDTOS;
    }
}
