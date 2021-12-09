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
public abstract class Staff implements TinhLuong{
    private String id;
    private String name;
    private byte age;
    private float heSoLuong;
    private String ngayVaoLam;
    private Department boPhan;
    
    public abstract void showInfo();

    @Override
    public double calculateSalary() {
        return calculateSalary();
    }
    
    public Staff() {
    }

    public Staff(String id, String name, byte age, float heSoLuong, String ngayVaoLam, Department boPhan) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.heSoLuong = heSoLuong;
        this.ngayVaoLam = ngayVaoLam;
        this.boPhan = boPhan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public String getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(String ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public Department getBoPhan() {
        return boPhan;
    }

    public void setBoPhan(Department boPhan) {
        this.boPhan = boPhan;
    }
    
}
