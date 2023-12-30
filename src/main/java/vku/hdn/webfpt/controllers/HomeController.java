package vku.hdn.webfpt.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import vku.hdn.webfpt.dto.DataDto;
import vku.hdn.webfpt.models.KhachHang;
import vku.hdn.webfpt.models.LieuVacXin;
import vku.hdn.webfpt.models.LoaiVacXin;
import vku.hdn.webfpt.models.TiemChung;
import vku.hdn.webfpt.services.KhachHangService;
import vku.hdn.webfpt.services.LieuVacXinService;
import vku.hdn.webfpt.services.LoaiVacXinService;
import vku.hdn.webfpt.services.TiemChungService;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private LoaiVacXinService loaiVacXinService;
    @Autowired
    private LieuVacXinService lieuVacXinService;
    @Autowired
    private KhachHangService khachHangService;
    @Autowired
    private TiemChungService tiemChungService;

    @GetMapping("/")
    public String getDashboard() {
        return "home";
    }
    @GetMapping("/add")
    public String getAddForm(Model model) {
        DataDto dataDto = DataDto.builder().build();
//        List<LoaiVacXin> loaiVacXinList = loaiVacXinService.getAll();
        List<LieuVacXin> lieuVacXinList = lieuVacXinService.getAll();
        model.addAttribute("data", dataDto);
        model.addAttribute("lieuVacXinList", lieuVacXinList);
        return "form-add";
    }
@PostMapping("/add")
    public String addData(@Valid @ModelAttribute("data") DataDto data,
                          BindingResult result,
                          Model model) {
        if (result.hasErrors()) {
            // TODO: Validate Ngày Tiêm <= Ngày Hiện tại

            model.addAttribute("data", data);
            return "form-add";
        }
    KhachHang khachHang = KhachHang.builder()
            .maKH(data.getMaKH())
            .hoTen(data.getHoTen())
            .ngaySinh(data.getNgaySinh())
            .cmnd(data.getCmnd())
            .soDT(data.getSoDT())
            .diaChi(data.getDiaChi())
            .email(data.getEmail()).build();
    KhachHang khachHangSave = khachHangService.addKhachHang(khachHang);
    TiemChung tiemChung = TiemChung.builder()
            .khachHang(khachHangSave)
            .maTC(data.getMaTC())
            .lieuVacXin(data.getLieuVacXin())
            .ngayTiem(data.getNgayTiem())
            .ngayNhacTiem(data.getNgayNhacTiem())
            .sucKhoeSauTiem(data.getSucKhoeSauTiem())
            .danhGia(data.getDanhGia())
            .build();
    tiemChungService.addTiemChung(tiemChung);
    List<LieuVacXin> lieuVacXinList = lieuVacXinService.getAll();
    model.addAttribute("data", data);
    model.addAttribute("lieuVacXinList", lieuVacXinList);
        return "redirect:/list";
    }

//    @GetMapping("/getLieuVacXin")
//    public List<LieuVacXin> getLieuVacXin(@RequestParam("maLoaiVX") String maLoaiVX) {
//        List<LieuVacXin> lieuVacXins = lieuVacXinService.findByMaLoaiVX(maLoaiVX);
//        return lieuVacXins;
//    }

    @GetMapping("/list")
    public String getListPage(Model model) {
        List<TiemChung> tiemChungList = tiemChungService.getAll();
        model.addAttribute("tiemchungList", tiemChungList);
        return "list";
    }

    @GetMapping("/search")
    public String search(@RequestParam("soDtSearch") String sdtSearch,
                         @RequestParam("tenLoaiVacXinSearch") String tenLoaiVacXinSearch,
                         @RequestParam("ngayTiemSearch") String ngayTiemSearch,
                         Model model) {
        List<TiemChung> tiemChungList = tiemChungService.searchByKey(sdtSearch,tenLoaiVacXinSearch,ngayTiemSearch);
        model.addAttribute("tiemchungList", tiemChungList);
        model.addAttribute("sdtSearch", sdtSearch);
        model.addAttribute("tenLoaiVacXinSearch", tenLoaiVacXinSearch);
        model.addAttribute("ngayTiemSearch", ngayTiemSearch);
        return "list";
    }
    @GetMapping("/del/{tiemchungId}")
    public String delTiemChung(@PathVariable("tiemchungId") String tiemChungId) {
        TiemChung tiemChung = tiemChungService.findByMaTC(tiemChungId);
        tiemChungService.del(tiemChung);
        return "redirect:/list";
    }
}
