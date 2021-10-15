package com.cybersoft.oop.quanlinhansu_change.model;

public class TruongPhong extends NhanSu {
	/* properties */
	private int soNhanVien;


	/* constructor */
	public TruongPhong() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TruongPhong(String hoTen, String soDienthoai, float soNgayLamViec) {
		super(hoTen, soDienthoai, soNgayLamViec);
		// TODO Auto-generated constructor stub
	}
	
	/* getters/setters */
	
	public int getSoNhanVien() {
		return this.soNhanVien;
	}
	
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
	
	public void tangSoNhanVien() {
		this.soNhanVien++;
	}
	
	public void giamSoNhanVien() {
		this.soNhanVien--;
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
	
	@Override
	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.printf("%-18s: %d\n", "Số nhân viên",this.soNhanVien);
	}
}
