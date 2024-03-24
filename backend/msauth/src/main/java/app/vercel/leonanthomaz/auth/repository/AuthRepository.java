package app.vercel.leonanthomaz.auth.repository;

import app.vercel.leonanthomaz.auth.model.Auth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface AuthRepository extends JpaRepository<Auth, Long> {
    UserDetails findByEmail(String email);
}
