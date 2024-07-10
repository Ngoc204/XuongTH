package com.example.duanbanao.Repository;

import com.example.duanbanao.Enitty.ChiTietHoaDon;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ChiTietHoaDonRepository extends JpaRepository<ChiTietHoaDon,Integer> {
    @Query("select hd from ChiTietHoaDon hd where hd.hoaDon.id=?1")
    Page<ChiTietHoaDon> findChiTietHoaDonByHoaDon(Integer id, Pageable pageable);
}
