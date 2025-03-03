package com.siwy.lukas.users;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class UserLoginService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByNumber(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found ...");
        }
        return new org.springframework.security.core.userdetails.User(user.getNumber(), user.getPassword(), Set.of(new SimpleGrantedAuthority(user.getRole())));
    }
}
