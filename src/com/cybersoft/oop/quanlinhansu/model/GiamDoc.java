package com.cybersoft.oop.quanlinhansu.model;

public class GiamDoc extends NhanSu {
	private float coPhan;
	
	public GiamDoc() {
		super();
		this.luongMotNgay = 300;
	}

	public GiamDoc(String hoTen, String soDienThoai, int soNgayLam) {
		super(hoTen, soDienThoai, soNgayLam);
		this.luongMotNgay = 300;
	}
	
	public GiamDoc(String hoTen, String soDienThoai, int soNgayLam, float coPhan) {
		super(hoTen, soDienThoai, soNgayLam);
		this.coPhan = coPhan;
		this.luongMotNgay = 300;
	}
	

	@Override
	public String getChucVu() {
		return "Giám đốc";
	}
	

}
