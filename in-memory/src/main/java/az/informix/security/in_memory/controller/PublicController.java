package az.informix.security.in_memory.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class PublicController {

    @GetMapping
    public String helloWorldPrivate(){
        return "Hello World! from private endpoint";
    }
    @PreAuthorize("hasRole('USER')")
    @GetMapping("/user")
    public String helloWorldUser(){
        return "Hello World! From Admin To User";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String helloWorldAdmin(){
        return "Hello World! From User To Admin";
    }
}
