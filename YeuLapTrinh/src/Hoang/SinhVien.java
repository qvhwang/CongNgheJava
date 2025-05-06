package Hoang;
public class SinhVien {
  
    private int maSV;
    private String hoTen;
    private String lop;
    private double diemTB;

    public SinhVien(int maSV, String hoTen, String lop, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.diemTB = diemTB;
    }
    public SinhVien() {
    	
    }
    public int getMaSV() {
		return maSV;
	}


	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}


	public String getHoTen() {
		return hoTen;
	}


	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}


	public String getLop() {
		return lop;
	}


	public void setLop(String lop) {
		this.lop = lop;
	}


	public double getDiemTB() {
		return diemTB;
	}


	public void setDiemTB(double diemTB) {
		if(diemTB >= 0 && diemTB <= 10) {
			this.diemTB = diemTB;
		} else {
			System.out.println("Diem khong hop le. Phai tu 0 den 10. ");
		}
	}

    public void DisplayInfor() {
        System.out.println("Mã SV: " + maSV);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Lớp: " + lop);
        System.out.println("Điểm TB: " + diemTB);
    }
}
