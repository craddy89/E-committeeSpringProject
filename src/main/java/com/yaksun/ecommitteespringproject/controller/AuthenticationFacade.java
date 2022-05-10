package com.yaksun.ecommitteespringproject.controller;

import com.yaksun.ecommitteespringproject.domain.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationFacade {
    public Authentication getAuthentication() {
        return SecurityContextHolder.getContext().getAuthentication();
    }

    public User getPrincipalUser() {
        return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}

