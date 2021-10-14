package com.cybersoft.oop.quanlinhansu_change.model;

public class TruongPhong extends NhanSu {
	/* properties */
	private int soNhanVien;

	/* constructor */
	
	/* getters/setters */
	
	/* methods */
	public boolean themNhanVien(NhanVien nv){
		/*
		 * TODO: them nhan vien
		 */
		return false;
	}
	
	public boolean xoaNhanVien(String maSo){
		/*
		 * TODO: xoa nhan vien
		 */
		return false;
	}
	
	@Override
	public String getChucVu() {
		// TODO Auto-generated method stub
		return "Trưởng phòng";
	}
	
	@Override
	protected float getLuong() {
		return 200f;
	}
}
