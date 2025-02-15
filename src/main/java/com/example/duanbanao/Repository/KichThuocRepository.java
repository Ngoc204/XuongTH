package com.example.duanbanao.Repository;

import com.example.duanbanao.Enitty.Size;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface KichThuocRepository extends JpaRepository<Size,Integer> {
    @Query("select kt from Size kt")
    Page<Size> findKtBy(Integer id, Pageable pageable);
}
