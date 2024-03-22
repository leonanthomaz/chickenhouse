package app.vercel.leonanthomaz.auth.controller;

import app.vercel.leonanthomaz.auth.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
@RequiredArgsConstructor
public class AuthController {

    private AuthService authService;

    @PostMapping("login")
    public void login(){}

}
