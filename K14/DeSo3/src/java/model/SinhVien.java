package model;

public class SinhVien {
    private int id;
    private String ten;
    private String lop;
    private float diemTB;

    public SinhVien() {
    }

    public SinhVien(int id, String ten, String lop, float diemTB) {
        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.diemTB = diemTB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

}
