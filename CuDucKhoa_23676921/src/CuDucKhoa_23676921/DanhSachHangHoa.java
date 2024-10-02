package CuDucKhoa_23676921;

import java.util.Arrays;

public class DanhSachHangHoa {

		private HangHoa[] danhSachHang;
	    private int count;

	    public DanhSachHangHoa(int size) {
	        danhSachHang = new HangHoa[size];
	        count = 0;
	    }

	    public boolean themHang(HangHoa hang) {
	        if (count >= danhSachHang.length) {
	            System.out.println("Danh sách đã đầy!");
	            return false;
	        }
	        for (int i = 0; i < count; i++) {
	            if (danhSachHang[i].getMaHang().equals(hang.getMaHang())) {
	                System.out.println("Mã hàng đã tồn tại!");
	                return false;
	            }
	        }
	        danhSachHang[count++] = hang;
	        return true;
	    }

	    public void hienThiTatCaHang() {
	        for (int i = 0; i < count; i++) {
	            System.out.println(danhSachHang[i]);
	        }
	    }

	    public void hienThiHangThucPham() {
	        for (int i = 0; i < count; i++) {
	            if (danhSachHang[i].getMaHang().equalsIgnoreCase("Thực phẩm")) {
	                System.out.println(danhSachHang[i]);
	            }
	        }
	    }

	    public HangHoa timHang(String maHang) {
	        for (int i = 0; i < count; i++) {
	            if (danhSachHang[i].getMaHang().equals(maHang)) {
	                return danhSachHang[i];
	            }
	        }
	        return null; 
	    }

	    public void sapXepTheoTen() {
	        Arrays.sort(danhSachHang, 0, count, (a, b) -> a.getTenHang().compareTo(b.getTenHang()));
	    }

	    public void sapXepTheoSoLuong() {
	        Arrays.sort(danhSachHang, 0, count, (a, b) -> Integer.compare(b.getSoLuongTon(), a.getSoLuongTon()));
	    }

	    public void xoaHang(String maHang) {
	        for (int i = 0; i < count; i++) {
	            if (danhSachHang[i].getMaHang().equals(maHang)) {
	                danhSachHang[i] = danhSachHang[count - 1]; 
	                danhSachHang[count - 1] = null; 
	                System.out.println("Đã xóa hàng hóa với mã: " + maHang);
	                return;
	            }
	        }
	        System.out.println("Không tìm thấy hàng hóa với mã: " + maHang);
	    }

	    public void capNhatDonGia(String maHang, double donGiaMoi) {
	        HangHoa hang = timHang(maHang);
	        if (hang != null) {
	            hang.setDonGia(donGiaMoi);
	            System.out.println("Cập nhật đơn giá thành công cho hàng hóa với mã: " + maHang);
	        } else {
	            System.out.println("Không tìm thấy hàng hóa với mã: " + maHang);
	        }
	    }

	    public void hienThiHangThucPhamKhoBan() {
	        for (int i = 0; i < count; i++) {
	            if (danhSachHang[i].getMaHang().equalsIgnoreCase("Thực phẩm") && danhSachHang[i].getSoLuongTon() < 5) {
	                System.out.println(danhSachHang[i]);
	            }
	        }
	    }
	}





