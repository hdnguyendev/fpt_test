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
@Table(name = "loai_vac_xin")
public class LoaiVacXin {
    @Id
    private String maLoaiVX;
    private String tenLoaiVX;
    private String nuocSX;
    private int soNgayTiemNhac;


//    @OneToMany(mappedBy = "loaiVacXin")
//    private List<LieuVacXin> lieuVacXins = new ArrayList<>();

}