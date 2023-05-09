package thuchanh3;

public class HangHoa {
	private int maHang;
    private String tenHang;
    private double donGia;
    private int soluong;
	public HangHoa(int maHang, String tenHang, double donGia, int soluong) {
	
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donGia = donGia;
		this.soluong = soluong;
	}
	
	public int getMaHang() {
		return maHang;
	}
	public void setMaHang(int maHang) {
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
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
    
}
