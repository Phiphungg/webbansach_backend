package com.pipo.webbansach_backend.dao;

import com.pipo.webbansach_backend.entity.ChiTietDonHang;
import com.pipo.webbansach_backend.entity.SuDanhGia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuDanhGiaRepository extends JpaRepository<SuDanhGia, Integer> {

}
