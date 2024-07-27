package az.informix.security.basicauth.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthoritiesContainer;

public enum Role implements GrantedAuthority {
    ROLE_USER,
    ROLE_ADMIN,
    ROLE_MOD,
    ROLE_FSK;

    @Override
    public String getAuthority(){
        return name();
    }
}
