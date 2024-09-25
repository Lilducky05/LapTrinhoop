package CuDucKhoa23676921;

import java.time.LocalDate;

public class GiaoDichDat extends GiaoDich {
	private String loaiDat;

	public String getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}
//ham tao

	@Override
	public double getThanhTien() {
		if (getLoaiDat() == "A") {
			return getDienTich() * getDonGia() * 1.5;
		} else {
			return getDienTich() * getDonGia();
		}
	}

	public GiaoDichDat() throws IllegalAccessException {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiaoDichDat(String ma, LocalDate ngayGD, double dienTich, double donGia, String loaiDat)
			throws IllegalAccessException {
		super(ma, ngayGD, dienTich, donGia);
		this.loaiDat = loaiDat;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
