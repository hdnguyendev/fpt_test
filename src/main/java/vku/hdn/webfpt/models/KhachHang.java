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
@Table(name = "khach_hang")
public class KhachHang {
    @Id
    private String maKH;
    private String hoTen;
    private String ngaySinh;
    private String cmnd;
    private String soDT;
    private String diaChi;
    private String email;

//    @OneToMany(mappedBy = "khachHang")
//    private List<TiemChung> tiemChungs = new ArrayList<>();

}