package com.cybersoft.java14.javacore_oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int choice = 0;
		ArrayList<Student> students = new ArrayList<>();
		var input = new Scanner(System.in);
		do {
			System.out.println("================= MENU =================");
			System.out.println("1. Thêm mới 1 sinh viên");
			System.out.println("2. Sửa thông tin sinh viên theo id");
			System.out.println("3. Hiển thị thông tin sinh viên");
			System.out.println("4. Xóa sinh viên theo mã cho trước");
			System.out.println("5. Sắp xếp sinh viên theo ID sinh viên");
			System.out.println("6. Sắp xếp sinh viên theo điểm tổng kết");
			System.out.println("0. Thoát chương trình");
			System.out.print("Xin mời bạn chọn: ");
			choice = input.nextInt();
			input.nextLine(); 
			System.out.println();
			switch (choice) {
			case 0:
				System.out.println("==> THANK YOU! SEE YOU LATER <==");
				break;
			case 1:
				var stu = createNewStudent(input, students);
				students.add(stu); // thêm vào danh sách
				System.out.println("==> Thêm thành công 1 sinh viên <==");
				break;
			case 2:
				if (students.size() > 0) {
					var id = 0;
					System.out.println("Nhập ID sinh viên cần sửa : ");
					id = input.nextInt();
					var result = searchById(students, id);
					input.nextLine();
					if (result != null) {
						showStudent(result);
						System.out.println("Nhập tên sinh viên: ");
						result.setName(input.nextLine());
						System.out.println("Nhập điểm sinh viên: ");
						result.setGpa(input.nextFloat());
						input.nextLine();
						System.out.println("Nhập tuổi sinh viên: ");
						result.setAge(input.nextInt());
						input.nextLine();
						showStudent(result);
					} else {
						System.out.println("==> Không tìm thấy sinh viên nào có ID \"" + id + "\" <==");
					}
				} else {
					System.out.println("==> Danh sách sinh viên rỗng <==");
				}
				break;
			case 3:
				showStudents(students);
				break;
				
			case 4:
				if (students.size() > 0) {
					System.out.println("Nhập mã sinh viên cần xóa: ");
					var id = input.nextInt();
					var isDeleted = removeStu(students, id);
					if (isDeleted) {
						System.out.println("==> Xóa thành công <==");
					} else {
						System.out.println("==> Mã sinh viên không đúng <==");
					}
				} else {
					System.out.println("==> Danh sách sinh viên rỗng <==");
				}
				break;
				
			case 5:
				if (students.size() > 0) {
					sortById(students);
					System.out.println("==> Danh sách sinh viên đã được sắp xếp theo ID <==");
				} else {
					System.out.println("==> Danh sách sinh viên rỗng <==");
				}
				break;
			case 6:
				if (students.size() > 0) {
					sortByGpa(students);
					System.out.println("==> Danh sách sinh viên đã được sắp xếp theo điểm tổng kết <==");
					
				} else {
					System.out.println("==> Danh sách sinh viên rỗng <==");
				}
				break;
			default:
				System.out.println("==> Sai chức năng, vui lòng chọn lại <==");
				break;
			}
		} while (choice != 0);
	}
	
	private static Student createNewStudent(Scanner input, ArrayList<Student> students) {
        System.out.print("Nhập mã sinh viên: ");
        var id = input.nextInt();
        input.nextLine();
        System.out.print("Nhập tên sinh viên: ");
        var name = input.nextLine();
        System.out.print("Nhập điểm gpa: ");
        var gpa = input.nextFloat();
        System.out.print("Nhập tuổi: ");
        var age = input.nextInt();
        input.nextLine();
        Student student = new Student(id, name, gpa, age);
        return student;
	}
	
	private static void showStudents(ArrayList<Student> students) {
        if (students.size() > 0) {
            System.out.println("====================================> Danh sách sinh viên <=====================================");
            System.out.printf("%-15s%-25s%-15s%-15s\n",
                    "Mã sinh viên ", "Tên sinh viên", "Điểm GPA", "Tuổi");
            for (var stu : students) {
                showStudent(stu);
            }
        } else {
            System.out.println("==> Danh sách sinh viên rỗng <==");
        }
    }
	
	private static void showStudent(Student stu) {
        System.out.printf("%-15d%-25s%-15.1f%-15d\n",
                stu.getId(), stu.getName(), stu.getGpa(), stu.getAge());
    }
	
	private static Student searchById(ArrayList<Student> students, int id) {
        Student res = new Student();
        for (var stu : students) {
            var idValid = stu.getId();
            if (id == idValid) {
                res = stu ;
            }
        }
        return res;
    }
	
	private static boolean removeStu(ArrayList<Student> students, int id) {
        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).getId()) {
                students.remove(i); 
                return true;
            }
        }
        return false;
    }
	
	private static void sortByGpa(ArrayList<Student> students) {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student stu1, Student stu2) {
                if (stu1.getGpa() < stu2.getGpa()) {
                    return -1;
                } else {
                    if (stu1.getGpa() == stu2.getGpa()) {
                        return 0;
                    } else {
                        return 1;
                    }
                }
            }
        });

        showStudents(students);
    }
	
    private static void sortById(ArrayList<Student> students) {

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student stu1, Student stu2) {
                if (stu1.getId() < stu2.getId()) {
                    return -1;
                } else {
                    if (stu1.getId() == stu2.getId()) {
                        return 0;
                    } else {
                        return 1;
                    }
                }
            }
        });

        showStudents(students);

    }
}
