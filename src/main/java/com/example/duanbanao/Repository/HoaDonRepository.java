package com.example.duanbanao.Repository;

import com.example.duanbanao.Enitty.HoaDon;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HoaDonRepository extends JpaRepository<HoaDon,Integer> {
    @Query("select hd from HoaDon hd where hd.trangThai = ?1")
    Page<HoaDon> findHoaDonByTrangThai(Integer trangThai, Pageable pageable);
}
