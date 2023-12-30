package vku.hdn.webfpt.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vku.hdn.webfpt.models.LieuVacXin;
import vku.hdn.webfpt.repositories.LieuVacXinRepository;
import vku.hdn.webfpt.services.LieuVacXinService;

import java.util.List;

@Service
public class LieuVacXinServiceImpl implements LieuVacXinService {
    @Autowired
    private LieuVacXinRepository lieuVacXinRepository;
    @Override
    public List<LieuVacXin> findByMaLoaiVX(String maLoaiVX) {
        return lieuVacXinRepository.findByLoaiVacXin_MaLoaiVX(maLoaiVX);
    }

    @Override
    public List<LieuVacXin> getAll() {
        return lieuVacXinRepository.findAll();
    }
}
