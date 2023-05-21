package com.ShubhamAmande.Cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

        @GetMapping("/userServiceFallBackMethod")
        public String userServiceFallBackMethod(){
            return "User Service is Taking longer than expected . Please try Again Later.....";
        }


        @GetMapping("/departmentServiceFallBackMethod")
        public String departmentServiceFallBackMethod(){
            return "Department Service is Taking longer than expected . Please try Again Later.....";
        }
}
