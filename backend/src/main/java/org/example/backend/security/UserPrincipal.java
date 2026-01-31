package org.example.backend.security;

import jakarta.validation.constraints.NotNull;
import org.example.backend.user.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.core.user.OAuth2User;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class UserPrincipal implements OAuth2User {
    private User user;
    private Map<String, Object> attributes;

    public UserPrincipal(User user, Map<String, Object> attributes){
        this.user = user;
        this.attributes = attributes;
    }

    @Override
    public Map<String, Object> getAttributes() {
        return attributes;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.emptyList();
    }

    @Override
    @NotNull
    public String getName() {
        return user.getId().toString();
    }
}
