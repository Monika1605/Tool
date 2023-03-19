package com.example.ALMTool.Controller;



import com.example.ALMTool.Entity.UserEntity;
import com.example.ALMTool.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    List<UserEntity> getUsers(){
        return userService.getUsers();
    }


//    @GetMapping("/students/{id}")
//    Optional<StudentEnity> getStudents(@RequestParam Integer id){
//        return studentService.getStudentsById(id);
//    }




    @PostMapping
    void addUsers(@RequestBody UserEntity userEntity){
        userService.addUsers(userEntity);
    }
}
