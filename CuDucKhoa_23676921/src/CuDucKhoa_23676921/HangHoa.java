package CuDucKhoa_23676921;

import java.time.LocalDate;

import java.util.ArrayList;

	@SuppressWarnings("unused")
	abstract class HangHoa {
	    protected String maHang;
	    protected String tenHang = "xxx";
	    protected double donGia;
	    protected int soLuongTon;

	    public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon) {
	        this.maHang = maHang;
	        this.tenHang = tenHang;
	        this.donGia = donGia;
	        this.soLuongTon = soLuongTon;
	    }

		public String getMaHang() {
			return maHang;
		}

		public void setMaHang(String maHang) {
			this.maHang = maHang;
		}

		public String getTenHang() {
			return tenHang;
		}

		public void setTenHang(String tenHang) {
			this.tenHang = tenHang;
		}

		public double getDonGia() {
			return donGia;
		}

		public void setDonGia(double donGia) {
			this.donGia = donGia;
		}

		public int getSoLuongTon() {
			return soLuongTon;
		}

		public void setSoLuongTon(int soLuongTon) {
			this.soLuongTon = soLuongTon;
		}

		@Override
		public String toString() {
			return "HangHoa [maHang=" + maHang + ", tenHang=" + tenHang + ", donGia=" + donGia + ", soLuongTon="
					+ soLuongTon + "]";
		}
		
	}
	
