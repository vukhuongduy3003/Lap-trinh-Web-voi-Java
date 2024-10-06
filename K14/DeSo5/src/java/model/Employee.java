package model;

public class Employee {
    private int id;
    private String ten;
    private String queQuan;
    private int tuoi;

    public Employee() {
    }

    public Employee(int id, String ten, String queQuan, int tuoi) {
        this.id = id;
        this.ten = ten;
        this.queQuan = queQuan;
        this.tuoi = tuoi;
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

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

}
