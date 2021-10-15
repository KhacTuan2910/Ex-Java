package com.cybersoft.oop.quanlinhansu_change.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.cybersoft.oop.quanlinhansu_change.model.CongTy;
import com.cybersoft.oop.quanlinhansu_change.model.GiamDoc;
import com.cybersoft.oop.quanlinhansu_change.model.NhanSu;
import com.cybersoft.oop.quanlinhansu_change.model.NhanVien;
import com.cybersoft.oop.quanlinhansu_change.model.TruongPhong;
import com.cybersoft.oop.quanlinhansu_change.utils.MyUtils;

public class QuanLiNhanSu {
	/* properties */
	private List<NhanSu> dsNhanSu;
	private List<NhanVien> dsNhanVienChuaPhanBo;
	private List<TruongPhong> dsTruongPhong;
	private CongTy congTy;
	
	/* constructor */
	public QuanLiNhanSu() {
		dsNhanSu = new ArrayList<NhanSu>();		
		
		congTy = new CongTy();
		
		dsNhanSu.add(new NhanVien("Tuấn", "113", 20));
		dsNhanSu.add(new NhanVien("Vương", "114", 20));
		dsNhanSu.add(new NhanVien("Thiên", "115", 20));
		dsNhanSu.add(new NhanVien("Nhất", "116", 22));
		dsNhanSu.add(new NhanVien("Trịnh", "117", 22));
		dsNhanSu.add(new NhanVien("Duy", "113", 20));
		dsNhanSu.add(new NhanVien("Đồng", "113", 20));
		dsNhanSu.add(new NhanVien("Nguyễn Thành Bảo", "113", 20));
		dsNhanSu.add(new NhanVien("Triệu", "113", 20));
		dsNhanSu.add(new NhanVien("Hâm", "113", 20));
		dsNhanSu.add(new NhanVien("Hâm", "113", 20));

		dsNhanSu.add(new TruongPhong("Hoàn", "113", 20));
		dsNhanSu.add(new TruongPhong("Khoa", "113", 20));

		dsNhanSu.add(new GiamDoc("Phúc", "225", 20, 45.55f));
		dsNhanSu.add(new GiamDoc("Long", "225", 20, 20.6f));
	}
	
	/* getters/setters */
	/* methods */
	public boolean themNhanSu(NhanSu ns) {
		// 1. check null
		if (ns == null) {
			return false;
		}
		
		// 2. check duplicated
		for(NhanSu nhanSu : dsNhanSu) {
			if(nhanSu.getMaSo().equals(ns)) {
				return false;
			}
		}
		
		// 3. add
		return dsNhanSu.add(ns);
	}
	
	public boolean xoaNhanSu(String maSo) {
		khoiTaoDsTruongPhong();
		var isSuccess = false;
		var ns = timNhanSu(maSo);
		if (ns != null) {
			if (ns instanceof TruongPhong) {
				for (NhanSu nhanSu : dsNhanSu) {
//					var nv = ((NhanVien) nhanSu); 
					if (nhanSu instanceof NhanVien && ((NhanVien) nhanSu).getTruongPhong() != null) {
						if (((NhanVien) nhanSu).getTruongPhong().getMaSo().equalsIgnoreCase(maSo)) {
							((NhanVien) nhanSu).setTruongPhong(null);
						}
					}
				}
				dsNhanSu.remove(ns);
				dsTruongPhong.remove(ns);
			} else if (ns instanceof NhanVien) {
				var truongPhongCuaNhanVien = ((NhanVien) ns).getTruongPhong();
				if (truongPhongCuaNhanVien != null) {
					var maSoTruongPhong = truongPhongCuaNhanVien.getMaSo();
					for (TruongPhong tp : dsTruongPhong) {
						if (tp.getMaSo().equalsIgnoreCase(maSoTruongPhong)) {
							tp.giamSoNhanVien();
							break;
						}
					}
				}
				dsNhanSu.remove(ns);
			} else { // ns instanceof GiamDoc
				dsNhanSu.remove(ns);
			}
			isSuccess = true;
		}
		return isSuccess;
	}
	
	private NhanSu timNhanSu(String maSo) {
		for (NhanSu nhanSu : dsNhanSu) {
			if (nhanSu.getMaSo().equalsIgnoreCase(maSo)) {
				return nhanSu;
			}
		}
		return null;
	}

	public void inDanhSachNhanSu() {
		System.out.println("Danh sách nhân sự: ");
		inDanhSach(dsNhanSu);
		
	}

	public double tinhTongLuong() {
		double luong = 0;
		for (NhanSu nhanSu : dsNhanSu) {
			luong += nhanSu.tinhLuong();
		}
		return luong;
	}

	public void nhapThongTinCongTy(Scanner scanner) {
		this.congTy.nhapThongTin(scanner);
		
	}
	
	public void xuatThongTinCongTy() {
		this.congTy.xuatThongTin();
		
	}

	public void nhanVienLuongCaoNhat() {
		List<NhanSu> dsNhanVienLuongCao = new ArrayList<>();
		float max = luongNvCaoNhat();
		
		for (NhanSu nhanSu : dsNhanSu) {
			if (nhanSu.getChucVu().equals("Nhân viên") && nhanSu.tinhLuong() == max) {			
				dsNhanVienLuongCao.add(nhanSu);
			}
		}
		System.out.println("Lương cao nhất của nhân viên: " + max);
		
		System.out.println("Danh sách nhân viên lương cao nhất: ");
		inDanhSach(dsNhanVienLuongCao);
	}

	private float luongNvCaoNhat() {
		var max = 0.0f;
		for (NhanSu nhanSu : dsNhanSu) {
			if (nhanSu.getChucVu().equals("Nhân viên") && nhanSu.tinhLuong() >= max) {
				max = nhanSu.tinhLuong();			
			}
		}
		return max;
	}
	
	private void inDanhSach(List<NhanSu> danhSach) {
		for (NhanSu nhanSu : danhSach) {
			nhanSu.xuatThongTin();
		}
	}

	public void sapXepNhanSuTheoTen() {
		Collections.sort(dsNhanSu, new Comparator<NhanSu>() {
            @Override
            public int compare(NhanSu ns1, NhanSu ns2) {
                return ns1.getHoTen().compareTo(ns2.getHoTen());	
            }
        });	
		inDanhSach(dsNhanSu);
	}

	public void phanBoNhanVien(Scanner scanner) {
		
		
		phanBoNhanSu();
		
		for (NhanVien nv : dsNhanVienChuaPhanBo) {
			System.out.println("=====--PHÂN BỔ NHÂN VIÊN--=====");
			nv.xuatThongTin();
			MyUtils.drawLine(20);
			int i = 1;
			for (TruongPhong tp : dsTruongPhong) {
				System.out.printf("%d. %-22s | Mã số: %s\n", i, tp.getHoTen(), tp.getMaSo());
				i++;
			}
			System.out.println("0. Không phân bổ.");
			System.out.println("-1. Thoát chức năng phân bổ");
			System.out.print("Lựa chọn: ");
			var luaChon = Integer.parseInt(scanner.nextLine());
			
			switch (luaChon) {
			case -1:
				return;
			case 0:
				continue;
			default:
				var tp = dsTruongPhong.get(luaChon - 1);
				if (luaChon > 0 && luaChon <= dsTruongPhong.size()) {
					nv.setTruongPhong(tp);
					tp.tangSoNhanVien();
				} else
					System.out.println("Vui lòng phân bổ lại lần sau!");
			}
		}
	}
	
	private void khoiTaoDsTruongPhong() {
		dsTruongPhong = new ArrayList<TruongPhong>();
		for (NhanSu ns : dsNhanSu) {
			if (ns instanceof TruongPhong) {
				dsTruongPhong.add((TruongPhong) ns);
			}
		}
	}

	/**
	 * Phân loại các nhân viên chưa được phân bổ và các trưởng phòng.
	 * @param dsNhanVienChuaPhanBo chứa những nhân viên chưa được phân bổ vào trưởng phòng nào.
	 * @param dsTruongPhong chứa nhưng trưởng phòng hiện có.
	 * 
	 */
	private void phanBoNhanSu() {
		khoiTaoDsTruongPhong();
		dsNhanVienChuaPhanBo = new ArrayList<NhanVien>();
		
		
		for (NhanSu ns : dsNhanSu) {
			/**
			 * kiểm tra nhân sự có phải là nhân viên chưa được phân bổ hay không
			 * Nếu đã phân bổ getTruongPhong != null
			 */
			if (ns instanceof NhanVien && ((NhanVien) ns).getTruongPhong() == null) {
				dsNhanVienChuaPhanBo.add((NhanVien) ns);
			} 
			
		}
	}

	public void timTruongPhongNhieuNhanVien() {
		khoiTaoDsTruongPhong();
		List<NhanSu> dsTruongPhongNhieuNhanVien = new ArrayList<NhanSu>();
		int max = soNhanVienMax();
		
		for (TruongPhong tp : dsTruongPhong) {
			if (tp != null && tp.getSoNhanVien() == max) {			
				dsTruongPhongNhieuNhanVien.add(tp);
			}
		}
		
		System.out.println("Số lượng nhân viên nhiều nhất của 1 trưởng phòng: " + max);
		System.out.println("Danh sách trưởng phòng có nhiều nhân viên nhất: ");
		inDanhSach(dsTruongPhongNhieuNhanVien);
	}

	private int soNhanVienMax() {
		var max = dsTruongPhong.get(0).getSoNhanVien();
		for (TruongPhong tp : dsTruongPhong) {
			if (tp.getSoNhanVien() > max) {
				max = tp.getSoNhanVien();
			}
		}
		return max;
	}

	public void sapXepNhanSuTheoLuongDESC() {
		Collections.sort(dsNhanSu, new Comparator<NhanSu>() {
            @Override
            public int compare(NhanSu ns1, NhanSu ns2) {
                if (ns1.tinhLuong() < ns2.tinhLuong()) {
                    return 1;
                } else {
                    if (ns1.tinhLuong() == ns2.tinhLuong()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });	
		inDanhSach(dsNhanSu);
	}

	public void timGiamDocNhieuCoPhanNhat() {
		List<NhanSu> dsGiamDocNhieuCoPhanNhat = new ArrayList<>();
		float max = nhieuCoPhanNhat();
		
		for (NhanSu nhanSu : dsNhanSu) {
			if (nhanSu.getChucVu().equals("Giám đốc") && ((GiamDoc) nhanSu).getCoPhan() == max) {			
				dsGiamDocNhieuCoPhanNhat.add(nhanSu);
			}
		}
		System.out.println("Cổ phần nhiều nhất: " + max);
		
		System.out.println("Danh sách giám đốc có cổ phần nhiều nhất: ");
		inDanhSach(dsGiamDocNhieuCoPhanNhat);
	}

	private float nhieuCoPhanNhat() {
		var max = 0.0f;
		for (NhanSu nhanSu : dsNhanSu) {
			if (nhanSu.getChucVu().equals("Giám đốc") && ((GiamDoc) nhanSu).getCoPhan() >= max) {
				max = ((GiamDoc) nhanSu).getCoPhan();			
			}
		}
		return max;
	}

	public void thuNhapGiamDoc() {
		for (NhanSu nhanSu : dsNhanSu) {
			if (nhanSu instanceof GiamDoc) {
				var coPhan = (float) Math.round(((GiamDoc) nhanSu).getCoPhan() * 100) / 100;
				double thuNhap = ((GiamDoc) nhanSu).getLuong() + coPhan * this.congTy.getDoanhThuThang() - this.tinhTongLuong();
				System.out.printf("%-12s: %s\n", "Mã số", nhanSu.getMaSo());
				System.out.printf("%-12s: %s\n", "Họ tên", nhanSu.getHoTen());
				System.out.printf("%-12s: %s\n", "Chức vụ", nhanSu.getChucVu());
				System.out.printf("%-12s: %.2f\n", "Thu Nhập", thuNhap);
				MyUtils.drawLine(20);
			}
		}
	}

	

}
 