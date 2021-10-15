package com.cybersoft.oop.quanlinhansu_change.view;

import java.util.Scanner;

import com.cybersoft.oop.quanlinhansu_change.model.GiamDoc;
import com.cybersoft.oop.quanlinhansu_change.model.NhanVien;
import com.cybersoft.oop.quanlinhansu_change.model.TruongPhong;
import com.cybersoft.oop.quanlinhansu_change.controller.QuanLiNhanSu;
import com.cybersoft.oop.quanlinhansu_change.model.NhanSu;
import com.cybersoft.oop.quanlinhansu_change.utils.MyUtils;

public class QuanLiNhanSuConsole {
	/* properties */
	private static QuanLiNhanSu quanLiNhanSuCore;
	private static Scanner scanner = new Scanner(System.in);
	
	/* constructor */
	/* getters/setters */
	/* methods */
	public static void start() {
		quanLiNhanSuCore = new QuanLiNhanSu();
		int luaChon = 0;
		do {
			inMenu();
			luaChon = Integer.parseInt(scanner.nextLine());  
			MyUtils.drawLine(40);
			xuLyLuaChon(luaChon);
			scanner.nextLine();
		} while (luaChon != 0);
		System.out.println("Chương trình đã kết thúc.\nHẹn gặp lại lần sau!");
	}
	
	public static void inMenu() {
		MyUtils.drawLine(40);
		quanLiNhanSuCore.xuatThongTinCongTy();
		System.out.println("================= MENU =================");
		System.out.println("1.  Nhập thông tin công ty");
		System.out.println("2.  Phân bổ Nhân viên vào Trưởng phòng");
		System.out.println("3.  Thêm thông tin một nhân sự");
		System.out.println("4.  Xóa thông tin một nhân sự");
		System.out.println("5.  Xuất ra thông tin toàn bộ người trong công ty");
		System.out.println("6.  Tính và xuất tổng lương cho toàn công ty");
		System.out.println("7.  Tìm Nhân viên thường có lương cao nhất");
		System.out.println("8.  Tìm Trưởng Phòng có số lượng nhân viên dưới quyền nhiều nhất");
		System.out.println("9.  Sắp xếp nhân viên toàn công ty theo thứ tự abc");
		System.out.println("10. Sắp xếp nhân viên toàn công ty theo thứ tự lương giảm dần");
		System.out.println("11. Tìm Giám Đốc có số lượng cổ phần nhiều nhất");
		System.out.println("12. Tính và Xuất tổng THU NHẬP của từng Giám Đốc");
		System.out.println("0. Thoát chương trình");
		System.out.print("Chức năng bạn chọn: ");
	}

	public static void xuLyLuaChon(int luaChon) {
		switch(luaChon) {
		case 0:
			System.out.println("Đang thoát chương trình...");
			break;
		case 1:
			quanLiNhanSuCore.nhapThongTinCongTy(scanner);
			break;
		case 2:
			quanLiNhanSuCore.phanBoNhanVien(scanner);
			break;
		case 3: // Thêm nhân sự
			themNhanSu();
			break;
		case 4:
			
			break;
		case 5:
			quanLiNhanSuCore.inDanhSachNhanSu();
			break;
		case 6:
			System.out.println("Tổng lương của toàn công ty: " + quanLiNhanSuCore.tinhTongLuong());
			break;
		case 7:
			quanLiNhanSuCore.nhanVienLuongCaoNhat();
			break;
		case 8:
			quanLiNhanSuCore.timTruongPhongNhieuNhanVien();
			break;
		case 9:
			quanLiNhanSuCore.sapXepNhanSuTheoTen();
			break;
		case 10:
			quanLiNhanSuCore.sapXepNhanSuTheoLuongDESC();
			break;
		case 11:
			quanLiNhanSuCore.timGiamDocNhieuCoPhanNhat();
			break;
		case 12:
			quanLiNhanSuCore.thuNhapGiamDoc();
			break;
		default:
			System.out.println("Vui lòng chọn đúng chức năng!");
		}
	}

	private static void themNhanSu() {
		int loaiNhanSu = 0;
		boolean isSuccess = false;
		System.out.println("1. Thêm nhân viên");
		System.out.println("2. Thêm trưởng phòng");
		System.out.println("3. Thêm giám đốc");
		System.out.print("Chọn chức vụ muốn thêm: ");
		loaiNhanSu = Integer.parseInt(scanner.nextLine());
		switch(loaiNhanSu) {
		case 1: {
			NhanVien nhanVien = new NhanVien();
			nhanVien.nhapThongTin(scanner);
			isSuccess = quanLiNhanSuCore.themNhanSu(nhanVien);
			break;			
		}
		case 2: {
			TruongPhong truongPhong = new TruongPhong();
			truongPhong.nhapThongTin(scanner);
			isSuccess = quanLiNhanSuCore.themNhanSu(truongPhong);
			break;			
		}
		case 3: {
			GiamDoc gd = new GiamDoc();
			gd.nhapThongTin(scanner);
			isSuccess = quanLiNhanSuCore.themNhanSu(gd);
			break;			
		}
		default:
			System.out.print("Vui lòng chọn lại!!");
		}
		// check trạng thái thêm vào
		if (isSuccess) {
			System.out.println("==> Thêm thành công <==");				
		} else {
			System.out.println("==> Thêm thất bại <==");		
		}
	}
}
