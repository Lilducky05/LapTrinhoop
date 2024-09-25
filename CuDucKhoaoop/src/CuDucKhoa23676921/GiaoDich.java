package CuDucKhoa23676921;

import java.time.LocalDate;

public abstract class GiaoDich {
	public abstract double getThanhTien();

	protected String maGD;
	protected LocalDate ngayGD;
	protected double DienTich;
	protected double donGia;

	// dong goi
	public String getMaGD() {
		return maGD;
	}

	public void setMaGD(String ma) throws IllegalAccessException {
		if (maGD != null) {
			this.maGD = maGD;
		} else {
			throw new IllegalAccessException("Loi ma");

		}
	}

	public LocalDate getNgayGD() {
		return ngayGD;
	}

	public void setNgayGD(LocalDate ngayGD) {
		this.ngayGD = ngayGD;
	}

	public double getDienTich() {
		return DienTich;
	}

	public void setDienTich(double dienTich) {
		DienTich = dienTich;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	// ham tao
	public GiaoDich() throws IllegalAccessException {
		this("", LocalDate.now(), 0, 0);
	}

	public GiaoDich(String ma, LocalDate ngayGD, double dienTich, double donGia) throws IllegalAccessException {
		if (ma != null) {
			this.maGD = ma;
		} else {
			throw new IllegalAccessException("Loi ma");

		}
		this.ngayGD = ngayGD;
		DienTich = dienTich;
		this.donGia = donGia;
	}

	@Override
	public String toString() {
		String s = "";
		s += s.format("|%10s|%10s|%10s|%10s|", getMaGD(), getNgayGD(), getDienTich(), getDonGia());
		return s;
	}

}
