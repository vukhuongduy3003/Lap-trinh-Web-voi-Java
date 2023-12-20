/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Nga
 */
public class HoaDon {
    private String mahdon;
    private Date ngaylap;
    private int sokw;
    private int dongia;

    public HoaDon() {
    }

    public HoaDon(String mahdon, Date ngaylap, int sokw, int dongia) {
        this.mahdon = mahdon;
        this.ngaylap = ngaylap;
        this.sokw = sokw;
        this.dongia = dongia;
    }

    public String getMahdon() {
        return mahdon;
    }

    public void setMahdon(String mahdon) {
        this.mahdon = mahdon;
    }

    public Date getNgaylap() {
        return ngaylap;
    }

    public void setNgaylap(Date ngaylap) {
        this.ngaylap = ngaylap;
    }

    public int getSokw() {
        return sokw;
    }

    public void setSokw(int sokw) {
        this.sokw = sokw;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }
    
    
}
