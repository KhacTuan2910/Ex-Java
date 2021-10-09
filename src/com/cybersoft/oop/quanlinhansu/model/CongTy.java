package com.cybersoft.oop.quanlinhansu.model;

public class CongTy {
	private String ten;
	private String maSoThue;
	private double doanhThuThang;
	
	public CongTy() {
		ten = "";
		maSoThue = "";
		doanhThuThang = 0.0;
	}

	public CongTy(String ten, String maSoThue, double doanhThuThang) {
		super();
		this.ten = ten;
		this.maSoThue = maSoThue;
		this.doanhThuThang = doanhThuThang;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getMaSoThue() {
		return maSoThue;
	}

	public void setMaSoThue(String maSoThue) {
		this.maSoThue = maSoThue;
	}

	public double getDoanhThuThang() {
		return doanhThuThang;
	}

	public void setDoanhThuThang(double doanhThuThang) {
		this.doanhThuThang = doanhThuThang;
	}

	@Override
	public String toString() {
		return "Tên công ty: " + ten + "\nMã Số Thuế: " + maSoThue + "\nDoanh Thu Thang: " + doanhThuThang + "\n";
	}
	
	
}
