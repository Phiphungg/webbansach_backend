package com.pipo.webbansach_backend.service;

import com.pipo.webbansach_backend.entity.NguoiDung;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserService extends UserDetailsService {
    public NguoiDung findByUsername(String tenDangNhap);

}
