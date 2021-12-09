/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quan.li;

/**
 *
 * @author quocv
 */
public class Department {
    private int maBoPhan;
    private String tenBoPhan;
    private int soNhanVien;

    @Override
    public String toString() {
        
        return   "Mã bộ phận = " + maBoPhan + ", Tên bộ phận=" + tenBoPhan + ", Số nhân viên=" + soNhanVien ;
        
    }    

    public Department() {
    }

    public Department(int maBoPhan, String tenBoPhan, int soNhanVien) {
        this.maBoPhan = maBoPhan;
        this.tenBoPhan = tenBoPhan;
        this.soNhanVien = soNhanVien;
    }
    
    
    public int getMaBoPhan() {
        return maBoPhan;
    }

    public void setMaBoPhan(int maBoPhan) {
        this.maBoPhan = maBoPhan;
    }

    public String getTenBoPhan() {
        return tenBoPhan;
    }

    public void setTenBoPhan(String tenBoPhan) {
        this.tenBoPhan = tenBoPhan;
    }

    public int getSoNhanVien() {
        return soNhanVien;
    }

    public void setSoNhanVien(int soNhanVien) {
        this.soNhanVien = soNhanVien;
    }
    
    public void display(){
        System.out.println(toString());
    }
}
