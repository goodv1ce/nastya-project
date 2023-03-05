package ua.goodvice.easylib.easylib.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ua.goodvice.easylib.easylib.dao.AuthorityRepository;
import ua.goodvice.easylib.easylib.dao.UserRepository;
import ua.goodvice.easylib.easylib.entity.User;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthorityRepository authorityRepository;

    public List<User> getUserList() {
        return userRepository.findAll();
    }
}
