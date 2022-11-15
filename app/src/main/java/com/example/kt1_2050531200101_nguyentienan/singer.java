package com.example.kt1_2050531200101_nguyentienan;

public class singer {
    private String tenbai;
    private String tacgia;
    private String infor;
    private int img;

    public singer(String tenbai, String tacgia, String infor, int img) {
        this.tenbai = tenbai;
        this.tacgia = tacgia;
        this.infor = infor;
        this.img = img;
    }

    public String getTenbai() {
        return tenbai;
    }

    public void setTenbai(String tenbai) {
        this.tenbai = tenbai;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getInfor() {
        return infor;
    }

    public void setInfor(String infor) {
        this.infor = infor;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
