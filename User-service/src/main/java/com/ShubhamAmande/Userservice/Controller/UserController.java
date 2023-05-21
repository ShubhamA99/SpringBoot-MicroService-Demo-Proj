package com.ShubhamAmande.Userservice.Controller;


import com.ShubhamAmande.Userservice.Entity.Custom_User;
import com.ShubhamAmande.Userservice.Service.UserService;
import com.ShubhamAmande.Userservice.VO.ResponseTemplateVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/saveUser")
    public Custom_User saveUser(@RequestBody Custom_User user){
        log.info("inside save user of User Controller");
        return  userService.saveUser(user);
    }

    @GetMapping("/getUserWithDept/{id}")
    public ResponseTemplateVo getUserWithDepartment( @PathVariable("id")  Long userId)
    {
        log.info("inside getUserWithDepartment of User Controller");
        return userService.getUserWithDepartment(userId);
    }

}
