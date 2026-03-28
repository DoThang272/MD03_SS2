package re.edu.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
//    Một hệ thống quản lý khách hàng cần phát triển dịch vụ web như sau:
//    Mỗi khách hàng gồm:
//        - Mã khách hàng
//        - Họ
//        - Tên
//        - Ngày sinh
//        - Địa chỉ
//        - Số điện thoại
//        - số CCCD
//    Yêu cầu: Xây dụng api cơ bản:
//        -Lấy danh sách khách hàng
//        -Thêm mới khách hàng
//        -Cập nhật thông tin khách hàng
//        -Xóa khách hàng
//        -Tìm kiếm khách hàng theo tên

//  Tạo các thuộc tính của model/resource
    private String idCustomer;
    private String surname;
    private String lastname;
    private String birth;
    private String address;
    private String phone;
    private String idCard;
}
