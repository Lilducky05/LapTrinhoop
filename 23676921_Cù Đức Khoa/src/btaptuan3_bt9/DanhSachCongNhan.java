package btaptuan3_bt9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachCongNhan {
	private ArrayList<CongNhan> danhSach;

	public DanhSachCongNhan() {
		danhSach = new ArrayList<>();
	}

	// Phương thức thêm công nhân
	public boolean themCongNhan(CongNhan cn) {
		if (danhSach.size() < 100) {
			danhSach.add(cn);
			return true;
		}
		return false;
	}

	public void xuatThongTinCongNhan() {
		for (CongNhan cn : danhSach) {
			System.out.println(cn);
		}
	}

	public int soLuongCongNhan() {
		return danhSach.size();
	}

	public void xuatCongNhanTren200SP() {
		for (CongNhan cn : danhSach) {
			if (cn.getSoSP() > 200) {
				System.out.println(cn);
			}
		}
	}

	public void sapXepTheoSoSPGiamDan() {
		Collections.sort(danhSach, new Comparator<CongNhan>() {
			@Override
			public int compare(CongNhan cn1, CongNhan cn2) {
				return cn2.getSoSP() - cn1.getSoSP();
			}
		});
	}
}
