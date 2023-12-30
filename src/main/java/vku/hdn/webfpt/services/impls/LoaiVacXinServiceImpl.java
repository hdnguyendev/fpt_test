package vku.hdn.webfpt.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vku.hdn.webfpt.models.LoaiVacXin;
import vku.hdn.webfpt.repositories.LoaiVacXinRepository;
import vku.hdn.webfpt.services.LoaiVacXinService;

import java.util.List;

@Service
public class LoaiVacXinServiceImpl implements LoaiVacXinService {
    @Autowired
    LoaiVacXinRepository loaiVacXinRepository;
    @Override
    public List<LoaiVacXin> getAll() {
        return loaiVacXinRepository.findAll();
    }
}
