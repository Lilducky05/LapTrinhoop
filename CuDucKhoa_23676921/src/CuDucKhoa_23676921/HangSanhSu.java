package CuDucKhoa_23676921;

import java.time.LocalDate;

public class HangSanhSu {
	 private String nhaSanXuat;
	    private LocalDate ngayNhapKho;

	    public HangSanhSu(String maHang, String tenHang, double donGia, int soLuongTon,
	                      String nhaSanXuat, LocalDate ngayNhapKho) {
	        super();
	        this.nhaSanXuat = nhaSanXuat;
	        this.ngayNhapKho = ngayNhapKho;
	    }

	    public String getNhaSanXuat() {
			return nhaSanXuat;
		}

		public void setNhaSanXuat(String nhaSanXuat) {
			this.nhaSanXuat = nhaSanXuat;
		}

		public LocalDate getNgayNhapKho() {
			return ngayNhapKho;
		}

		public void setNgayNhapKho(LocalDate ngayNhapKho) {
			this.ngayNhapKho = ngayNhapKho;
		}

		@Override
		public String toString() {
			return "HangSanhSu [nhaSanXuat=" + nhaSanXuat + ", ngayNhapKho=" + ngayNhapKho + "]";
		}

		public double tinhVAT() {
	        double donGia = 0;
			return donGia * 0.1;
	    }

	    public String danhGiaBanBuon() {
	        int soLuongTon = 0;
			if (soLuongTon > 50 && LocalDate.now().toEpochDay() - ngayNhapKho.toEpochDay() > 10) {
	            return "Bán chậm";
	        }
	        return "Không đánh giá";
	    }
	}





