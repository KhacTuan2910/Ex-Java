package com.cybersoft.oop.quanlinhansu.model;

public class TruongPhong extends NhanSu {
	private int soNhanVien = 0;
	
	public TruongPhong() {
		super();
		this.luongMotNgay = 200;
	}

	public void setSoNhanVien(int soNhanVien) {
		this.soNhanVien = soNhanVien;
	}
	
	public TruongPhong(String hoTen, String soDienThoai, int soNgayLam) {
		super(hoTen, soDienThoai, soNgayLam);
		this.luongMotNgay = 200;
	}

	@Override
	public String getChucVu() {
		return "Trưởng phòng";
	}
	
	@Override
	public float tinhLuong() {
		return Math.round((super.tinhLuong() + soNhanVien * 100) * 100) / 100;
	}

}
