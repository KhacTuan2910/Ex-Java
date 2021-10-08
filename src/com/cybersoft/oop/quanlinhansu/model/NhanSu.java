package com.cybersoft.oop.quanlinhansu.model;

public abstract class NhanSu {
	private int id;
	protected String hoTen;
	protected String soDienThoai;
	protected int soNgayLam;
	protected float luongMotNgay;
	
	private static int STT = 1;
	
//	Constructor
	public NhanSu() {
		id = STT++;
	}
	
	public NhanSu(String hoTen, String soDienThoai, int soNgayLam, float luongMotNgay) {
		this.id = STT++;
		this.hoTen = hoTen;
		this.soDienThoai = soDienThoai;
		this.soNgayLam = soNgayLam;
		this.luongMotNgay = luongMotNgay;
	}
	
	/* getters/setters */
	public int getMaSo() {
		return this.id;
	}
	
	public String getHoTen() {
		return hoTen;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public float getSoNgayLam() {
		return soNgayLam;
	}

	public float getLuongMotNgay() {
		return luongMotNgay;
	}
	
//	methods
	public float tinhLuong() {
		return soNgayLam * luongMotNgay;
	}
	
	public abstract String getChucVu();
}
