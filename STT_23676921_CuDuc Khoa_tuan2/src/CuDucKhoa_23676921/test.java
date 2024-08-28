package CuDucKhoa_23676921;

public class test {
public static void main(String[] args) throws Exception {
	Tam I = new Tam("I", 5, 6);
	HinhTron h1 = new HinhTron(3, I);
	System.out.println("Tam HinhTron: " + I.toString() );
	System.out.println("Dien Tinh HinhTron:  " + h1.DienTich());
	System.out.println("Chu Vi HinhTron: " + h1.ChuVi());
}
}
