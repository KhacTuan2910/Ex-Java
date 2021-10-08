package com.cybersoft.oop.quanlinhansu.model;

public class TruongPhong extends NhanSu {
	private int soNhanVien;
	
	public TruongPhong() {
		super();
		this.luongMotNgay = 200;
	}

	public void setSoNhanVien(int soNhanVien) {
		this.soNhanVien = soNhanVien;
	}
	
	public TruongPhong(String hoTen, String soDienThoai, int soNgayLam, float luongMotNgay) {
		super(hoTen, soDienThoai, soNgayLam, luongMotNgay);
		this.luongMotNgay = 200;
	}

	@Override
	public String getChucVu() {
		return "Trưởng phòng";
	}
	
	@Override
	public float tinhLuong() {
		return super.tinhLuong() + soNhanVien * 100;
	}

}
