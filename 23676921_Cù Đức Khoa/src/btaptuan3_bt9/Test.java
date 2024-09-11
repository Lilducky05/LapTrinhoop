package btaptuan3_bt9;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		DanhSachCongNhan ds = new DanhSachCongNhan();
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập số lượng công nhân: ");
		int n = sc.nextInt();
		sc.nextLine(); // Đọc bỏ dòng trống

		for (int i = 0; i < n; i++) {
			System.out.println("Nhập thông tin công nhân thứ " + (i + 1));
			System.out.print("Mã CN: ");
			String maCN = sc.nextLine();
			System.out.print("Họ tên: ");
			String hoTen = sc.nextLine();
			System.out.print("Số sản phẩm: ");
			int soSP = sc.nextInt();
			sc.nextLine();

			CongNhan cn = new CongNhan(maCN, hoTen, soSP);
			ds.themCongNhan(cn);
		}

		System.out.println("Thông tin tất cả công nhân:");
		ds.xuatThongTinCongNhan();

		ds.sapXepTheoSoSPGiamDan();
		System.out.println("\nDanh sách công nhân sau khi sắp xếp theo số sản phẩm giảm dần:");
		ds.xuatThongTinCongNhan();

		System.out.println("\nCông nhân có số sản phẩm lớn hơn 200 :");
		ds.xuatCongNhanTren200SP();
	}
}
