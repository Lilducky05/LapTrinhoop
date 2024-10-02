package CuDucKhoa_23676921;

import CuDucKhoa_23676921.HangHoa;

public class LopKiemNghiem {
	public static void main(String[] args) {
		        DanhSachHangHoa danhSachHangHoa = new DanhSachHangHoa(10);
		        
		       danhSachHangHoa.themHang(new HangHoa("001", "Gao", 10, 20.0, "Thuc pham"));
		       danhSachHangHoa.themHang(new HangHoa("002", "Duong", 4, 15.0, "Thuc pham"));
		       danhSachHangHoa.themHang(new HangHoa("003", "Bot giat", 5, 25.0, "Dien may"));
		        danhSachHangHoa.themHang(new HangHoa("004", "Coc su", 7, 30.0, "Sanh su"));
		        
		        System.out.println("Danh sách hàng hóa:");
		        danhSachHangHoa.hienThiTatCaHang();
		        
		        System.out.println("\nHàng thực phẩm khó bán:");
		        danhSachHangHoa.hienThiHangThucPhamKhoBan();
		        
		        System.out.println("\nSắp xếp theo tên hàng:");
		        danhSachHangHoa.sapXepTheoTen();
		        danhSachHangHoa.hienThiTatCaHang();
		        
		        System.out.println("\nSắp xếp theo số lượng tồn:");
		        danhSachHangHoa.sapXepTheoSoLuong();
		        danhSachHangHoa.hienThiTatCaHang();
		        
		        System.out.println("\nTìm kiếm hàng hóa mã '002':");
		        System.out.println(danhSachHangHoa.timHang("002"));

		        danhSachHangHoa.capNhatDonGia("001", 22.0);
		        
		        System.out.println("\nXóa hàng hóa mã '003':");
		        danhSachHangHoa.xoaHang("003");
		        
		        System.out.println("\nDanh sách hàng hóa sau khi xóa:");
		        danhSachHangHoa.hienThiTatCaHang();
		    }

	}



