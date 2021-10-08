package com.cybersoft.oop.quanlinhansu.model;

public class NhanVien extends NhanSu {
	private int truongPhong;
	
	public NhanVien() {
		super();
		this.luongMotNgay=100;
	}

	public NhanVien(String hoTen, String soDienThoai
			, int soNgayLam, float luongMotNgay) {
		super(hoTen, soDienThoai, soNgayLam, luongMotNgay);
		this.luongMotNgay=100;
	}
	
	
	public int getTruongPhong() {
		return truongPhong;
	}

	public void setTruongPhong(int truongPhong) {
		this.truongPhong = truongPhong;
	}

	@Override
	public String getChucVu() {
		// TODO Auto-generated method stub
		return "Nhân viên";
	}

}
