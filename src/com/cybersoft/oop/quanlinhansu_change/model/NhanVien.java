package com.cybersoft.oop.quanlinhansu_change.model;

public class NhanVien extends NhanSu {
	/* properties */
	private TruongPhong truongPhong;
	
	/* constructor */
	/* getters/setters */
	public TruongPhong getTruongPhong() {
		return truongPhong;
	}

	public void setTruongPhong(TruongPhong truongPhong) {
		this.truongPhong = truongPhong;
	}
	
	/* methods */	
	@Override
	public String getChucVu() {
		// TODO Auto-generated method stub
		return "Nhân viên";
	}

	@Override
	protected float getLuong() {
		return 100f;
	}	
	
}
