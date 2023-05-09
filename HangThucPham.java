package thuchanh3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HangThucPham extends HangHoa {

	public String nhasanxuat;
	private Date nsx;
	private Date hsd;
	public HangThucPham(int maHang, String tenHang, double donGia, int soluong) {
		super(maHang, tenHang, donGia, soluong);
	
	}
	public void setNSX(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.nsx = calendar.getTime();
    }
	 public void setHSD(int year, int month, int day) {
	        Calendar calendar = Calendar.getInstance();
	        calendar.set(year, month - 1, day);
	        this.hsd = calendar.getTime();
}
	public String getNhasanxuat() {
		return nhasanxuat;
	}
	public void setNhasanxuat(String nhasanxuat) {
		this.nhasanxuat = nhasanxuat;
	}
	
	 @Override
	public String toString() {
		return "HangThucPham [nhasanxuat=" + nhasanxuat + ", nsx=" + nsx + ", hsd=" + hsd + "]";
	}
	 public double tinhVAT() {
			return getDonGia() *0.1;}
	public boolean kiemTraNgay(boolean t) {
	        if (this.getnSX().compareTo(this.gethSD()) < 0) {
	            t = false;
	        } else {
	            System.out.println("Ngày hết hạn không được nhỏ hơn ngày sản xuất : ");
	        }
	        return t;
	    }
	private Calendar getnSX() {
		
		return null;
	}
	private Calendar gethSD() {
		
		return null;
	}
	public void kiemTraHSD() {
        Object today = new Date();
        ((Calendar) today).getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String st = simpleDateFormat.format(today);
        if (this.gethSD().compareTo((Calendar) today) < 0) {
            System.out.println("Hôm nay là ngày " + st + ", hàng hóa đã hết hạn ");
        } else {
            System.out.println("Hôm nay là ngày " + st + ", hàng hóa vẫn còn hạn ");
        }
    }
}
