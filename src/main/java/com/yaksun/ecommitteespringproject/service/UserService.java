package com.yaksun.ecommitteespringproject.service;

import com.yaksun.ecommitteespringproject.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User register(User user);
    User updateProfile(User currentUser, User userUpdate);
    User saveStudentWithLists(User user);

    Page<User> findAll(int pageIndex, int pageSize);
    User findById(Integer id);
    Long count();
}
