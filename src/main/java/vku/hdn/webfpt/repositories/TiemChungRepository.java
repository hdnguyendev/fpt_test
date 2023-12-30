package vku.hdn.webfpt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vku.hdn.webfpt.models.TiemChung;

import java.util.List;

public interface TiemChungRepository extends JpaRepository<TiemChung, String> {
    List<TiemChung> findByKhachHang_SoDTOrLieuVacXin_LoaiVacXin_TenLoaiVXOrNgayTiem(String soDT, String tenLoaiVX, String ngayTiem);

}