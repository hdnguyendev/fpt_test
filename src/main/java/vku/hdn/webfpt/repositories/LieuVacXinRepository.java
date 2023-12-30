package vku.hdn.webfpt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vku.hdn.webfpt.models.LieuVacXin;

import java.util.List;

public interface LieuVacXinRepository extends JpaRepository<LieuVacXin, String> {
    List<LieuVacXin> findByLoaiVacXin_MaLoaiVX(String maLoaiVX);
}