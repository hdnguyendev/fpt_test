package vku.hdn.webfpt.services;

import vku.hdn.webfpt.models.LieuVacXin;

import java.util.List;

public interface LieuVacXinService {
    List<LieuVacXin> findByMaLoaiVX(String maLoaiVX);

    List<LieuVacXin> getAll();
}
