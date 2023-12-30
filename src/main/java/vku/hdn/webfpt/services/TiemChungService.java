package vku.hdn.webfpt.services;

import vku.hdn.webfpt.models.TiemChung;

import java.util.List;

public interface TiemChungService {
    TiemChung addTiemChung(TiemChung tiemChung);

    List<TiemChung> getAll();

    List<TiemChung> searchByKey(String sdtSearch, String tenLoaiVacXinSearch, String ngayTiemSearch);

    TiemChung findByMaTC(String tiemChungId);

    void del(TiemChung tiemChung);
}
