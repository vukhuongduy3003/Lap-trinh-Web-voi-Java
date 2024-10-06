package model;

public class Product {
    private int id;
    private String ten;
    private String hangsx;
    private int soLuong;
    private String tinhTrang;

    public Product() {
    }

    public Product(int id, String ten, String hangsx, int soLuong, String tinhTrang) {
        this.id = id;
        this.ten = ten;
        this.hangsx = hangsx;
        this.soLuong = soLuong;
        this.tinhTrang = tinhTrang;
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

    public String getHangsx() {
        return hangsx;
    }

    public void setHangsx(String hangsx) {
        this.hangsx = hangsx;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

}
