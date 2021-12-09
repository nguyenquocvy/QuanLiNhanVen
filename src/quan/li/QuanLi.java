/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quan.li;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author quocv
 */
public class QuanLi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Staff> listStaff = new ArrayList<Staff>();

        ArrayList<Department> bophan = new ArrayList<Department>();
        Department de1 = new Department(1, "IT", 0);
        Department de2 = new Department(2, "Nhân Sự", 0);
        Department de3 = new Department(3, "Hanh Chinh", 0);
        bophan.add(de1);
        bophan.add(de2);
        bophan.add(de3);

        byte choose;

        do {
            menu();
            choose = Byte.parseByte(sc.nextLine());
            switch (choose) {
                case 1:
                    if (listStaff != null) {
                        for (Staff s : listStaff) {
                            s.showInfo();
                            System.out.println("------------------------------");
                        }
                    } else {
                        System.out.println("chưa có nhân viên nào");
                    }
                    break;
                case 2:
                    for (Department d : bophan) {
                        d.display();
                    }
                    break;
                case 3:
                    System.out.println("(IT = 1) (Nhân Sự = 2) (Hành Chính = 3)");
                    System.out.print("Mời bạn chọn bộ phận theo số (1-3): ");
                    byte chon = 0;
                    boolean chek = true;
                    while (chek == true) {
                        try {
                            chon = Byte.parseByte(sc.nextLine());
                            chek = false;
                        } catch (NumberFormatException e) {
                            System.err.print("bạn phải nhập số (1-3), mời bạn nhập lại: ");
                        }
                    }

                    boolean b = true;
                    if (chon == 1) {

                        for (int i = 0; i < listStaff.size(); i++) {
                            if (listStaff.get(i).getBoPhan().getMaBoPhan() == 1) {
                                listStaff.get(i).showInfo();
                                System.out.println("------------------------------");
                                b = false;
                            }
                        }
                        if (b == true) {
                            System.err.println("Chưa có nhân viên bộ phận IT ");
                        }
                    }

                    if (chon == 2) {

                        for (int i = 0; i < listStaff.size(); i++) {
                            if (listStaff.get(i).getBoPhan().getMaBoPhan() == 2) {
                                listStaff.get(i).showInfo();
                                System.out.println("------------------------------");
                                b = false;
                            }
                        }
                        if (b == true) {
                            System.err.println("Chưa có nhân viên bộ phận nhân sự ");
                        }
                    }
                    if (chon == 3) {

                        for (int i = 0; i < listStaff.size(); i++) {
                            if (listStaff.get(i).getBoPhan().getMaBoPhan() == 3) {
                                listStaff.get(i).showInfo();
                                System.out.println("------------------------------");
                                b = false;
                            }
                        }
                        if (b == true) {
                            System.err.println("Chưa có nhân viên bộ phận hành chính ");
                        }
                    }
                    break;
                case 4:
                    boolean cheek = true;
                    System.out.print("Nhập ID: ");
                    String id = "";
                    
                    while (cheek) {
                        cheek = false;
                        id = sc.nextLine();
                        for (Staff s : listStaff) {
                            if (s.getId().equalsIgnoreCase(id)) {
                                System.err.print("id tồn tại mời bạn nhập lại: ");                           
                                cheek = true;
                                break;
                            }   
                        }             
                    }
                    
                    System.out.print("Nhập tên: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập tuổi: ");
                    byte age = 1;
                    while (true) {
                        try {
                            age = Byte.parseByte(sc.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.err.print("Bạn phải nhập số: ");
                        }
                    }
                    System.out.print("Hệ số lương: ");
                    float heSoLuong = Float.parseFloat(sc.nextLine());
                    System.out.print("Ngày vào làm: ");
                    String ngayVaoLam = sc.nextLine();
                    for (Department d : bophan) {
                        d.display();
                    }
                    System.out.print("Chọn theo mã bộ phân: ");
                    byte boPhan = Byte.parseByte(sc.nextLine());
                    Department depe = new Department();
                    for (Department d : bophan) {
                        if (d.getMaBoPhan() == boPhan) {
                            depe.setMaBoPhan(d.getMaBoPhan());
                            depe.setTenBoPhan(d.getTenBoPhan());
                            depe.setSoNhanVien(d.getSoNhanVien() + 1);
                            d.setSoNhanVien(depe.getSoNhanVien());
                        }
                    }
                    System.out.println("    1. nhân viên thông thường");
                    System.out.println("    2. quản lí");
                    System.out.print("Bạn chọn thêm theo số 1 or 2: ");
                    byte a = Byte.parseByte(sc.nextLine());
                    if (a == 1) {
                        System.out.print("nhập số giờ làm thêm: ");
                        byte soGioLamThem = Byte.parseByte(sc.nextLine());
                        NhanVien nv = new NhanVien(id, name, age, heSoLuong, ngayVaoLam, depe, soGioLamThem);
                        listStaff.add(nv);
                    }
                    if (a == 2) {
                        System.out.println("Nhập Chức Danh (Business Leader = 1) (Project Leader = 2 ) (Technical Leader = 3) ");
                        System.out.print("Bạn chọn chức danh số: ");
                        String chucDanh = "";
                        boolean check = true;
                        while (check == true) {
                            try {
                                byte chose = Byte.parseByte(sc.nextLine());
                                if (chose < 1 || chose > 3) {
                                    System.err.print("chỉ nhập số trong khoảng từ 1 đến 3: ");
                                    check = true;
                                }
                                if (chose == 1) {
                                    chucDanh = "Business Leader";
                                    check = false;
                                }
                                if (chose == 2) {
                                    chucDanh = "Project Leader";
                                    check = false;
                                }
                                if (chose == 3) {
                                    chucDanh = "Technical Leader";
                                    check = false;
                                }
                            } catch (NumberFormatException e) {
                                System.err.print("Bạn phải nhập số: ");
                            }
                        }
                        System.out.println("-----------------------------------------------------");
                        Manager mana = new Manager(id, name, age, heSoLuong, ngayVaoLam, depe, chucDanh);
                        listStaff.add(mana);
                    }

                    break;
                case 5:
                    System.out.print("nhập tên hoặc mã nhân viên cần tìm: ");
                    String tim = sc.nextLine();
                    if (!listStaff.isEmpty()) {
                        for(Staff s : listStaff){
                            if (s.getId().equalsIgnoreCase(tim)||s.getName().equalsIgnoreCase(tim)) {
                                s.showInfo();
                            }else
                                System.out.println("nhập mã hoặc tên không đúng");
                        }
                    }else
                        System.err.println("chưa có nhân viên");
                    break;
                case 6:
                    System.out.println("BẢNG LƯƠNG TOÀN CÔNG TY");
                    if (!listStaff.isEmpty()) {
                        for(Staff s: listStaff){
                            s.showInfo();
                            System.out.println(s.calculateSalary());                           
                            System.out.println("--------------------------------");
                        }
                    }
                    break;
                case 7:
                    break;
                case 0:
                    break;
                default:
                    System.err.println("Nhập lại từ 0 --> 7: ");
            }
        } while (choose != 0);

    }

    public static void menu() {
        System.out.println("********************************");
        System.out.println("1. Hiển thị tất cả nhân viên");
        System.out.println("2. Hiển thị các bộ phận công ty");
        System.out.println("3. Hiển thị nhân viên theo bộ phận");
        System.out.println("4. Thêm nhân viên mới");
        System.out.println("5. Tìm kiếm nhân viên theo tên và mã");
        System.out.println("6. Hiển thị bảng lương nhân viên toàn công ty");
        System.out.println("7. Hiển thị lương theo thứ tự tăng ");
        System.out.println("0. Thoát");
        System.out.println("*********************************");
        System.out.print("NHẬP LỰA CHỌN CỦA BẠN: ");
    }

}
