/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quan.li;

import Interface.TinhLuong;

/**
 *
 * @author quocv
 */
public class Manager extends Staff implements TinhLuong {

    private String chucDanh;

    @Override
    public void showInfo() {
        System.out.println("ID: " + super.getId());
        System.out.println("tên: " + super.getName());
        System.out.println("tuổi: " + super.getAge());
        System.out.println("hệ số lương: " + super.getHeSoLuong());
        System.out.println("ngày vào công ty: " + super.getNgayVaoLam());
        System.out.println("bộ phận: " + super.getBoPhan().getTenBoPhan());
        System.out.println("chức danh: " + this.chucDanh);
    }

    @Override
    public double calculateSalary() {
        double luong = 0.0;
        if (this.getChucDanh().equals("Business Leader")) {
            luong = (super.getHeSoLuong() * 5000000) + 8000000;
        }
        if (this.getChucDanh().equals("Project Leader")) {
            luong = (super.getHeSoLuong() * 5000000) + 5000000;
        }
        if (this.getChucDanh().equals("Technical Leader")) {
            luong = (super.getHeSoLuong() * 5000000) + 6000000;
        }
        return luong;
    }

    public Manager() {
    }

    public Manager(String id, String name, byte age, float heSoLuong, String ngayVaoLam, Department boPhan, String chucDanh) {
        super(id, name, age, heSoLuong, ngayVaoLam, boPhan);
        this.chucDanh = chucDanh;
    }

    public String getChucDanh() {
        return chucDanh;
    }

    public void setChucDanh(String chucDanh) {
        this.chucDanh = chucDanh;
    }

}
