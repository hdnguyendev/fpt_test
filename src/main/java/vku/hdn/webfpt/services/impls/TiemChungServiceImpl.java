package vku.hdn.webfpt.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vku.hdn.webfpt.models.TiemChung;
import vku.hdn.webfpt.repositories.TiemChungRepository;
import vku.hdn.webfpt.services.TiemChungService;

import java.util.List;

@Service
public class TiemChungServiceImpl implements TiemChungService {
    @Autowired
    TiemChungRepository tiemChungRepository;

    @Override
    public TiemChung addTiemChung(TiemChung tiemChung) {
        return tiemChungRepository.save(tiemChung);
    }

    @Override
    public List<TiemChung> getAll() {
        return tiemChungRepository.findAll();
    }

    @Override
    public List<TiemChung> searchByKey(String sdtSearch, String tenLoaiVacXinSearch, String ngayTiemSearch) {
        return tiemChungRepository.findByKhachHang_SoDTOrLieuVacXin_LoaiVacXin_TenLoaiVXOrNgayTiem(sdtSearch,tenLoaiVacXinSearch,ngayTiemSearch);
    }

    @Override
    public TiemChung findByMaTC(String tiemChungId) {
        return tiemChungRepository.findById(tiemChungId).get();
    }

    @Override
    public void del(TiemChung tiemChung) {
        tiemChungRepository.delete(tiemChung);
    }
}
