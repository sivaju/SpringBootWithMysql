package com.iicinf.datamod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sivakrishna on 7/1/2016.
 */

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping("/")
    public List<User> userList() {
        return userRepository.findAll();
    }

    @RequestMapping("/save")
    public void addUser() {
        User us=new User(255,"krish","Ny");
       userRepository.save(us);
    }
//    public void deleteUser()
//    {
//        userRepository.delete(555);
//    }
}
