package com.pipo.webbansach_backend.dao;

import com.pipo.webbansach_backend.entity.ChiTietDonHang;
import com.pipo.webbansach_backend.entity.DonHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "don-hang")
public interface DonHangRepository extends JpaRepository<DonHang, Integer> {
    
}
