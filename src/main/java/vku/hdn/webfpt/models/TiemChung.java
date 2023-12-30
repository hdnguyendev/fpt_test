package vku.hdn.webfpt.models;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tiem_chung")
public class TiemChung {
    @Id
    private String maTC;



    @ManyToOne
    @JoinColumn(name = "maLieuVX")
    private LieuVacXin lieuVacXin;

    private String ngayTiem;
    private String ngayNhacTiem;
    private String sucKhoeSauTiem;
    private String danhGia;

    @ManyToOne
    @JoinColumn(name = "maKH")
    private KhachHang khachHang;

}