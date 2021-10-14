package com.cybersoft.oop.quanlinhansu_change.model;

import java.util.Scanner;

import com.cybersoft.oop.quanlinhansu_change.utils.MyUtils;

public class GiamDoc extends NhanSu {
	/* properties */
	private float coPhan;

	/* constructor */
	/* getters/setters */
	/* methods */
	@Override
	public String getChucVu() {
		return "Giám đốc";
	}
	
	@Override
	protected float getLuong() {
		return 300f;
	}
	
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
		System.out.print("Số cổ phần: ");
		this.coPhan = Float.parseFloat(scanner.nextLine());
		System.out.printf("Lương một ngày: %.2f\n", this.getLuong());
		this.luongMotNgay = this.getLuong();
	}
	
	@Override
	public void xuatThongTin() {
		MyUtils.drawLine(24);
		System.out.printf("Thông tin %s:\n", getChucVu());
		System.out.printf("%-18s: %s\n", "Mã số", super.getMaSo());
		System.out.printf("%-18s: %s\n", "Họ tên", this.hoTen);
		System.out.printf("%-18s: %s\n", "Số điện thoại",this.soDienthoai);
		System.out.printf("%-18s: %.1f\n", "Số cổ phần", this.coPhan);
		System.out.printf("%-18s: %.1f\n", "Số ngày làm việc", this.soNgayLamViec);
		System.out.printf("%-18s: %.2f\n", "Lương 1 ngày", this.luongMotNgay);
		System.out.printf("%-18s: %.2f\n", "Lương tháng",this.tinhLuong());
	}
}
