package com.cybersoft.oop.quanlinhansu;

import java.util.ArrayList;
import java.util.Scanner;

import com.cybersoft.java14.javacore_oop.Student;
import com.cybersoft.oop.quanlinhansu.model.CongTy;
import com.cybersoft.oop.quanlinhansu.model.GiamDoc;
import com.cybersoft.oop.quanlinhansu.model.NhanSu;
import com.cybersoft.oop.quanlinhansu.model.NhanVien;
import com.cybersoft.oop.quanlinhansu.model.TruongPhong;

public class MainProgram {
	public static void main(String[] args) {
		CongTy cty = new CongTy();
		ArrayList<NhanSu> dsNhanSu = new ArrayList();
		
		var choice = 0;
		var input = new Scanner(System.in);
		do {
			System.out.println("-----------------------------");
			System.out.println(cty);
			showMenu();
			choice = input.nextInt();
			input.nextLine(); 
			System.out.println();
			switch (choice) {
			case 0:
				System.out.println("THANKYOU!");
				break;
			case 1: 
				nhapThongTinCongTy(cty, input);
				break;
			case 3:
				themNhanSu(input, dsNhanSu);
				break;
			case 4:
				break;
			case 5:
				showFullInfoCompany(dsNhanSu);
				break;
			case 6:
				tinhTongLuong(dsNhanSu);
				break;
			default:
				System.out.println("Vui lòng chọn lại!!");
			}
		} while(choice != 0);
	}
		
	private static void tinhTongLuong(ArrayList<NhanSu> dsNhanSu) {
		var sum = 0.0f;
		if (dsNhanSu.size() > 0) {
            for (var nhanSu : dsNhanSu) {
            	sum += nhanSu.tinhLuong();
            }
        } else {
            System.out.println("==> Danh sách nhân sự rỗng <==");
        }
		System.out.println("Tổng lương: " + sum);
	}

	private static void themNhanSu(Scanner input, ArrayList<NhanSu> dsNhanSu) {
		System.out.println("1. Thêm nhân viên");
		System.out.println("2. Thêm trưởng phòng");
		System.out.println("3. Thêm giám đốc");
		System.out.print("Chọn chức vụ muốn thêm: ");
		var choice = input.nextInt();
		input.nextLine();
		switch(choice) {
		case 1: {
			System.out.print("Nhập tên: ");
			var ten = input.nextLine();
			System.out.print("Nhập số điện thoại: ");
			var soDienThoai = input.nextLine();
			System.out.print("Nhập số ngày làm: ");
			var soNgayLam = input.nextInt();
			input.nextLine();
			NhanVien nVien = new NhanVien(ten, soDienThoai, soNgayLam);
			dsNhanSu.add(nVien);
			break;			
		}
		case 2: {
			System.out.print("Nhập tên: ");
			var ten = input.nextLine();
			System.out.print("Nhập số điện thoại: ");
			var soDienThoai = input.nextLine();
			System.out.print("Nhập số ngày làm: ");
			var soNgayLam = input.nextInt();
			input.nextLine();
			TruongPhong truongPhong = new TruongPhong(ten, soDienThoai, soNgayLam);
			dsNhanSu.add(truongPhong);
			break;			
		}
		case 3: {
			System.out.print("Nhập tên: ");
			var ten = input.nextLine();
			System.out.print("Nhập số điện thoại: ");
			var soDienThoai = input.nextLine();
			System.out.print("Nhập số ngày làm: ");
			var soNgayLam = input.nextInt();
			input.nextLine();
			System.out.print("Nhập số cổ phần: ");
			var coPhan = input.nextFloat();
			input.nextLine();
			GiamDoc giamDoc = new GiamDoc(ten, soDienThoai, soNgayLam, coPhan);
			dsNhanSu.add(giamDoc);
			break;			
		}
		default:
			System.out.print("Vui lòng chọn lại!!");
		}
		System.out.println("==> Nhập thành công <==");
	}
	
//	private static NhanSu nhapThongTinNhanSu(Scanner input) {
//		
//		return nSu;
//	}

	private static void showFullInfoCompany(ArrayList<NhanSu> dsNhanSu) {
		System.out.println("====================================> Danh sách nhân sự <=====================================");
        System.out.printf("| %-6s| %-24s| %-14s| %-12s| %-13s| %-12s|\n",
                "Mã số", "Tên nhân sự", "Số điện thoại", "Số ngày làm", "Chức vụ", "Lương");
        System.out.println("==============================================================================================");
		if (dsNhanSu.size() > 0) {
            for (var nhanSu : dsNhanSu) {
            	showInfo(nhanSu);
            	System.out.println("----------------------------------------------------------------------------------------------");
            }
        } else {
            System.out.println("==> Danh sách nhân sự rỗng <==");
        }
		
	}
	
	private static void showInfo(NhanSu nSu) {
		System.out.printf("| %-6d| %-24s| %-14s| %-12d| %-13s| %-12.2f|\n",
                nSu.getMaSo(), nSu.getHoTen(), nSu.getSoDienThoai(), nSu.getSoNgayLam(), nSu.getChucVu(), nSu.tinhLuong());
		
	}

	private static void nhapThongTinCongTy(CongTy cty, Scanner input) {
		System.out.print("Nhập tên công ty: ");
		cty.setTen(input.nextLine());
		System.out.print("Nhập mã số thuế: ");
		cty.setMaSoThue(input.nextLine());
		System.out.print("Nhập doanh thu tháng công ty: ");
		cty.setDoanhThuThang(input.nextDouble());
		input.nextLine();
	}
	
	

	private static void showMenu() {
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
		System.out.print("Xin mời bạn chọn: ");
	}
}
