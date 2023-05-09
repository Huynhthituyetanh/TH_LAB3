package thuchanh3;

import java.util.Date;

public class hangsanhxu extends HangHoa{
public String nhasanxuat;
public Date ngaynhapkho;
	public hangsanhxu(int maHang, String tenHang, double donGia, int soluong) {
		super(maHang, tenHang, donGia, soluong);
		
	}
	
	public hangsanhxu(int maHang, String tenHang, double donGia, int soluong, String nhasanxuat, Date ngaynhapkho) {
		super(maHang, tenHang, donGia, soluong);
		this.nhasanxuat = nhasanxuat;
		this.ngaynhapkho = ngaynhapkho;
	}

	public String getNhasanxuat() {
		return nhasanxuat;
	}
	public void setNhasanxuat(String nhasanxuat) {
		this.nhasanxuat = nhasanxuat;
	}
	public Date getNgaynhapkho() {
		return ngaynhapkho;
	}
	public void setNgaynhapkho(Date ngaynhapkho) {
		this.ngaynhapkho = ngaynhapkho;
	}

	@Override
	public String toString() {
		return "hangsanhxu [nhasanxuat=" + nhasanxuat + ", ngaynhapkho=" + ngaynhapkho + "]";
	}

}
