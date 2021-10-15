package com.cybersoft.oop.quanlinhansu_change.model;

public class NhanVien extends NhanSu {
	/* properties */
	private TruongPhong truongPhong;
	
	/* constructor */
	public NhanVien() {
		super();
	}

	public NhanVien(String hoTen, String soDienthoai, float soNgayLamViec) {
		super(hoTen, soDienthoai, soNgayLamViec);
		// TODO Auto-generated constructor stub 
	}	
	
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
	
	@Override
	public void xuatThongTin() {
		super.xuatThongTin();
		if (truongPhong != null) {
			System.out.printf("%-18s: %s\n", "Mã số trưởng phòng", this.truongPhong.getMaSo());			
		} else 
			System.out.printf("%-18s: %s\n", "Mã số trưởng phòng", null);		
	}
	
}
