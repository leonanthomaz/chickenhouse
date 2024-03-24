package app.vercel.leonanthomaz.auth.service;

import app.vercel.leonanthomaz.auth.repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private AuthRepository authRepository;


}
