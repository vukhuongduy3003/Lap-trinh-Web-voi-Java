package model;

public class SinhVien {

    private int ma;
    private String ten;
    private String lop;
    private float diemtb;

    public SinhVien() {
    }

    public SinhVien(int ma, String ten, String lop, float diemtb) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.diemtb = diemtb;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public float getDiemtb() {
        return diemtb;
    }

    public void setDiemtb(float diemtb) {
        this.diemtb = diemtb;
    }
}
