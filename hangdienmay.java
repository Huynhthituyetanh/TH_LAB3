package thuchanh3;

public class hangdienmay extends HangHoa {
public int thoigianbaohanh;
public double congsuat;
	public hangdienmay(int maHang, String tenHang, double donGia, int soluong) {
		super(maHang, tenHang, donGia, soluong);
		
	}
	public int getThoigianbaohanh() {
		return thoigianbaohanh;
	}
	public void setThoigianbaohanh(int thoigianbaohanh) {
		this.thoigianbaohanh = thoigianbaohanh;
	}
	public double getCongsuat() {
		return congsuat;
	}
	public void setCongsuat(double congsuat) {
		this.congsuat = congsuat;
	}
	@Override
	public String toString() {
		return "hanngdienmay [thoigianbaohanh=" + thoigianbaohanh + ", congsuat=" + congsuat + "]";
	}
public double tinhVAT() {
	return getDonGia() *0.1;
}
	
		

	

}
