package vku.hdn.webfpt.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "lieu_vac_xin")
public class LieuVacXin {
    @Id
    private String maLieuVX;
    private String soLo;

    private String ngaySanXuat;
    private String ngayNhap;
    private String ngayHetHan;

    @ManyToOne
    @JoinColumn(name = "maLoaiVX")
    private LoaiVacXin loaiVacXin;

}