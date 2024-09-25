package model;

public class GV {
    private int id;
    private String ten;
    private String khoa;
    private long luong;

    public GV() {
    }

    public GV(int id, String ten, String khoa, long luong) {
        this.id = id;
        this.ten = ten;
        this.khoa = khoa;
        this.luong = luong;
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

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }

}
