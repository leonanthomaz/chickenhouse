package app.vercel.leonanthomaz.auth.model;

import app.vercel.leonanthomaz.auth.enums.AuthRole;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
@Table(name = "tb_user")
@Data
@EqualsAndHashCode(of = "id")
public class Auth implements UserDetails, Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String password;

    private static final Map<AuthRole, Set<String>> ROLE_AUTHORITY_MAPPING = Map.of(
            AuthRole.ADMIN, Set.of("ROLE_ADMIN", "ROLE_USER"),
            AuthRole.USER, Set.of("ROLE_USER")
    );

    private AuthRole role;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return ROLE_AUTHORITY_MAPPING.getOrDefault(role, Set.of())
                .stream()
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }
    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
