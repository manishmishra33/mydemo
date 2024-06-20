package com.java.mydemo.JwtController;

import com.java.mydemo.DTO.LoginResponse;
import com.java.mydemo.DTO.LoginUserDto;
import com.java.mydemo.DTO.RegisterUserDto;
import com.java.mydemo.Entity.User;
import com.java.mydemo.JwtService.JwtService;
import com.java.mydemo.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/auth")
@RestController
public class jwtController {

    private final JwtService jwtService;
    private final UserService userService;

    public jwtController(JwtService jwtService, UserService userService) {
        this.jwtService = jwtService;
        this.userService = userService;


    }

    @PostMapping("/signup")
    public ResponseEntity<User> register(@RequestBody RegisterUserDto registerUserDto) {
        User registeredUser = userService.createUser(registerUserDto);

        return ResponseEntity.ok(registeredUser);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> authenticate(@RequestBody LoginUserDto loginUserDto) {
        User authenticatedUser = userService.authenticate(loginUserDto);

        String jwtToken = jwtService.generateToken(authenticatedUser);

        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setToken(jwtToken);
        loginResponse.setExpiresIn(jwtService.getExpirationTime());
        return ResponseEntity.ok(loginResponse);
    }
}
