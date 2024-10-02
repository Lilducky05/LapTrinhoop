package CuDucKhoa_23676921;

import java.time.LocalDate;

public class HangThucPham {
	protected String nhaCungCap;
	protected LocalDate ngaySanXuat;
	protected LocalDate ngayHetHan;

public HangThucPham(String maHang, String tenHang, double donGia, int soLuongTon,
        String nhaCungCap, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
super();
		this.nhaCungCap = nhaCungCap;
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
}

public String getNhaCungCap() {
	return nhaCungCap;
}

public void setNhaCungCap(String nhaCungCap) {
	this.nhaCungCap = nhaCungCap;
}

public LocalDate getNgaySanXuat() {
	return ngaySanXuat;
}

public void setNgaySanXuat(LocalDate ngaySanXuat) {
	this.ngaySanXuat = ngaySanXuat;
}

public LocalDate getNgayHetHan() {
	return ngayHetHan;
}

public void setNgayHetHan(LocalDate ngayHetHan) {
	this.ngayHetHan = ngayHetHan;
}

@Override
public String toString() {
	return "HangThucPham [nhaCungCap=" + nhaCungCap + ", ngaySanXuat=" + ngaySanXuat + ", ngayHetHan=" + ngayHetHan	+ "]";
}

public double tinhVAT() {
double donGia = 0;
return donGia * 0.05;
}
public String danhGiaBanBuon() {
int soLuongTon = 0;
if (soLuongTon > 0 && ngayHetHan.isBefore(LocalDate.now())) {
return "Khó bán";
}
return "Không đánh giá";
}
}