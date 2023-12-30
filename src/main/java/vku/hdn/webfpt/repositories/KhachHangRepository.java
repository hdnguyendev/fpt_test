package vku.hdn.webfpt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vku.hdn.webfpt.models.KhachHang;

public interface KhachHangRepository extends JpaRepository<KhachHang, String> {
}