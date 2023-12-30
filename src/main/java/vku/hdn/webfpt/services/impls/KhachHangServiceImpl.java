package vku.hdn.webfpt.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vku.hdn.webfpt.models.KhachHang;
import vku.hdn.webfpt.repositories.KhachHangRepository;
import vku.hdn.webfpt.services.KhachHangService;

@Service
public class KhachHangServiceImpl implements KhachHangService {
    @Autowired
    KhachHangRepository khachHangRepository;


    @Override
    public KhachHang addKhachHang(KhachHang khachHang) {
        return khachHangRepository.save(khachHang);
    }
}
