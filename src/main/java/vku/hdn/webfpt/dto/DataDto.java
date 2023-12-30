package vku.hdn.webfpt.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.validation.annotation.Validated;
import vku.hdn.webfpt.models.LieuVacXin;
import vku.hdn.webfpt.models.LoaiVacXin;

import java.io.Serializable;

/**
 * DTO for {@link vku.hdn.webfpt.models.TiemChung}
 */
@Value
@Data
@AllArgsConstructor
@Builder
public class DataDto implements Serializable {
    @NotNull(message = "Mã khách hàng không được để trống ")
    @NotEmpty(message = "Mã khách hàng không được để trống ")
    String maKH;
    @NotEmpty(message = "Họ và tên không được để trống ")
    String hoTen;
//    @NotEmpty(message = "Ngày sinh không được để trống ")
    String ngaySinh;
    @NotEmpty(message = "Số CMND không được để trống ")
    String cmnd;
//    @NotEmpty(message = "Số điện thoại không được để trống ")
    String soDT;
    String diaChi;
    @Email
//    @NotEmpty(message = " Email không được để trống ")
    String email;
    String maTC;
//    LoaiVacXin loaiVacXin;
    @NotNull(message = "Không được để trống")
    LieuVacXin lieuVacXin;
    @NotEmpty(message = " Ngày tiêm không được để trống ")
    String ngayTiem;
    String ngayNhacTiem;
    String sucKhoeSauTiem;
    String danhGia;

}