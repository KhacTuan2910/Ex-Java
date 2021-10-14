package com.cybersoft.oop.quanlinhansu_change.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.cybersoft.oop.quanlinhansu_change.model.CongTy;
import com.cybersoft.oop.quanlinhansu_change.model.NhanSu;

public class QuanLiNhanSu {
	/* properties */
	private List<NhanSu> dsNhanSu;
	private CongTy congTy;
	
	/* constructor */
	public QuanLiNhanSu() {
		dsNhanSu = new ArrayList<NhanSu>();		
		congTy = new CongTy();
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
		/*
		 * TODO: xoa nhan su
		 */
		return false;
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
		float max = 0.0f;
		List<NhanSu> dsNhanVienLuongCao = new ArrayList<>();
		max = luongNvCaoNhat();
		
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
}
 