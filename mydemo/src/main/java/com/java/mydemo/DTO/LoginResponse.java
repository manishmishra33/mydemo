package com.java.mydemo.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponse {

    private String token;

    private long expiresIn;

    }

