package com.cybersoft.oop.quanlinhansu_change.model;

import java.util.Scanner;

import com.cybersoft.oop.quanlinhansu_change.utils.MyUtils;
import com.cybersoft.oop.quanlinhansu_change.utils.NhapXuat;

public abstract class NhanSu implements NhapXuat {
	/* properties */
	private String maSo;
	protected String hoTen;
	protected String soDienthoai;
	protected float soNgayLamViec;
	protected float luongMotNgay;
	private static int STT = 1;
	
	/* constructor */
	public NhanSu() {
		maSo = "NS" + STT++;
	}
	
	public NhanSu(String hoTen, String soDienthoai, float soNgayLamViec) {
		super();
		maSo = "NS" + STT++;
		this.hoTen = hoTen;
		this.soDienthoai = soDienthoai;
		this.soNgayLamViec = soNgayLamViec;
		this.luongMotNgay = this.getLuong();
	}



	/* getters/setters */
	public String getMaSo() {
		if (this.hoTen != null) {
			return maSo;			
		}
		return null;
	}
	
	public String getHoTen() {
		return this.hoTen;
	}
	
	/* methods */
	@Override
	public void nhapThongTin(Scanner scanner) {
		MyUtils.drawLine(24);
		System.out.printf("Nhập thông tin %s:\n", getChucVu());
		System.out.print("Họ tên: ");
		this.hoTen = scanner.nextLine();
		System.out.print("Số điện thoại: ");
		this.soDienthoai = scanner.nextLine();
		System.out.print("Số ngày làm việc: ");
		this.soNgayLamViec = Float.parseFloat(scanner.nextLine());
		System.out.printf("Lương một ngày: %.2f\n", this.getLuong());
		this.luongMotNgay = this.getLuong();
	}
	
	@Override
	public void xuatThongTin() {
		MyUtils.drawLine(24);
		System.out.printf("Thông tin %s:\n", getChucVu());
		System.out.printf("%-18s: %s\n", "Mã số", this.maSo);
		System.out.printf("%-18s: %s\n", "Họ tên", this.hoTen);
		System.out.printf("%-18s: %s\n", "Số điện thoại",this.soDienthoai);
		System.out.printf("%-18s: %.1f\n", "Số ngày làm việc", this.soNgayLamViec);
		System.out.printf("%-18s: %.2f\n", "Lương 1 ngày", this.luongMotNgay);
		System.out.printf("%-18s: %.2f\n", "Lương tháng",this.tinhLuong());
	}
	
	/**
	 * Tính lương cơ bản của nhân sự:
	 * Lương cơ bản = số ngày làm x lương một ngày
	 * @return Lương cơ bản
	 */
	public float tinhLuong() {
		return soNgayLamViec * luongMotNgay;
	}

	public abstract String getChucVu();
	
	protected abstract float getLuong();
}
