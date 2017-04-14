package com.yingjun.ssm.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.Collection;

/**
 * <描述>
 *
 * @author lilw
 * @date: 2017/4/14
 * @version: v1.0
 */
public class MyUserDetailService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Collection<GrantedAuthority> auths=new ArrayList<GrantedAuthority>();

        SimpleGrantedAuthority auth2=new SimpleGrantedAuthority("ROLE_ADMIN");
        SimpleGrantedAuthority auth1=new SimpleGrantedAuthority("ROLE_USER");

        if(username.equals("lcy")){
            auths=new ArrayList<GrantedAuthority>();
            auths.add(auth1);
            auths.add(auth2);
        }
        User user = new User(username, "lcy", true, true, true, true, auths);
        return user;
    }
}
