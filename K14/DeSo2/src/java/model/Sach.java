package model;

public class Sach {
    private int id;
    private String tenSach;
    private String nxb;
    private int namXB;

    public Sach() {
    }

    public Sach(int id, String tenSach, String nxb, int String) {
        this.id = id;
        this.tenSach = tenSach;
        this.nxb = nxb;
        this.namXB = String;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getNamXB() {
        return this.namXB;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }

}
