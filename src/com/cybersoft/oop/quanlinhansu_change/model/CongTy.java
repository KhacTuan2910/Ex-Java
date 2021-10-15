package com.cybersoft.oop.quanlinhansu_change.model;

import java.util.Scanner;

import com.cybersoft.oop.quanlinhansu_change.utils.MyUtils;
import com.cybersoft.oop.quanlinhansu_change.utils.NhapXuat;

public class CongTy implements NhapXuat {
	/* properties */
	private String maSoThue;
	private String ten;
	private double doanhThuThang;

	/* constructor */
	/* getters/setters */
	public double getDoanhThuThang() {
		return this.doanhThuThang;
	}
	
	/* methods */

	@Override
	public void nhapThongTin(Scanner scanner) {
		MyUtils.drawLine(24);
		System.out.println("Nhập thông tin công ty:\n");
		System.out.print("Mã số thuế: ");
		this.maSoThue = scanner.nextLine();
		System.out.print("Tên công ty: ");
		this.ten = scanner.nextLine();
		System.out.print("Doanh thu tháng: ");
		this.doanhThuThang = Float.parseFloat(scanner.nextLine());
	}
	
	@Override
	public void xuatThongTin() {
		System.out.println("Thông tin công ty:\n");
		System.out.printf("%-18s: %s\n", "Mã số thuế", this.maSoThue);
		System.out.printf("%-18s: %s\n", "Tên công ty", this.ten);
		System.out.printf("%-18s: %s\n", "Doanh thu tháng",this.doanhThuThang);
	}
}
