package CuDucKhoa_23676921;


public class HangDienMay {
		private int thoiGianBaoHanh;
	    private double congSuat;

	    public HangDienMay(String maHang, String tenHang, double donGia, int soLuongTon, int thoiGianBaoHanh, double congSuat) {
	        super();
	        this.thoiGianBaoHanh = thoiGianBaoHanh;
	        this.congSuat = congSuat;
	    }

	    public int getThoiGianBaoHanh() {
			return thoiGianBaoHanh;
		}

		public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
			this.thoiGianBaoHanh = thoiGianBaoHanh;
		}

		public double getCongSuat() {
			return congSuat;
		}

		public void setCongSuat(double congSuat) {
			this.congSuat = congSuat;
		}

		@Override
		public String toString() {
			return "HangDienMay [thoiGianBaoHanh=" + thoiGianBaoHanh + ", congSuat=" + congSuat + "]";
		}

		public double tinhVAT() {
	        double donGia = 0;
			return donGia * 0.1;
	    }

	    public String danhGiaBanBuon() {
	        int soLuongTon = 0;
			if (soLuongTon < 3) {
	            return "Bán được";
	        }
	        return "Không đánh giá";
	    }
	}

