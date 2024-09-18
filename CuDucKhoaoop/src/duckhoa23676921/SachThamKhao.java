package duckhoa23676921;

import java.time.LocalDate;

public class SachThamKhao extends Sach {
	private static final double THUE = 0.1;
	private String xuatXu;
   @Override
	public double getThanhTien() {
		if (getXuatXu().equals("NgoaiNhap")) {
			return getSoLuong() * getDonGia() * (1 + THUE);
		} else {
			return getSoLuong() * getDonGia();
		}
	}

	public String getXuatXu() {
		return xuatXu;
	}

	public void setXuatXu(String xuatXu) {
		this.xuatXu = xuatXu;
	}

	public SachThamKhao(String maSach, String nhaXB, LocalDate ngayNhap, double donGia, int soLuong, String xuatXu) {
		super(maSach, nhaXB, ngayNhap, donGia, soLuong);
		this.xuatXu = xuatXu;
	}

	public SachThamKhao() {
	}
}