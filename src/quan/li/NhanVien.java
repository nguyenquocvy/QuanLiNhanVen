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
public class NhanVien extends Staff implements TinhLuong {

    private byte soGioLamThem;

    @Override
    public void showInfo() {
        System.out.println("ID: " + super.getId());
        System.out.println("tên: " + super.getName());
        System.out.println("tuổi: " + super.getAge());
        System.out.println("hệ số lương: " + super.getHeSoLuong());
        System.out.println("ngày vào công ty: " + super.getNgayVaoLam());
        System.out.println("bộ phận: " + super.getBoPhan().getTenBoPhan());
        System.out.println("giờ làm thêm: " + this.soGioLamThem);
    }

    public NhanVien() {
    }

    public NhanVien(String id, String name, byte age, float heSoLuong, String ngayVaoLam, Department boPhan, byte soGioLamThem) {
        super(id, name, age, heSoLuong, ngayVaoLam, boPhan);
        this.soGioLamThem = soGioLamThem;
    }

    public byte getSoGioLamThem() {
        return soGioLamThem;
    }

    public void setSoGioLamThem(byte soGioLamThem) {
        this.soGioLamThem = soGioLamThem;
    }

    @Override
    public double calculateSalary() {
        return (super.getHeSoLuong() * 3000000) + (soGioLamThem * 200000);
    }

}
