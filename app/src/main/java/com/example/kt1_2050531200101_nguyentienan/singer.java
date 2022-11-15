package com.example.kt1_2050531200101_nguyentienan;

public class singer {
    private String ten;
    private String nghedanh;
    private String sosao;
    private int img;

    public singer() {
    }

    public singer(String ten, String nghedanh, String sosao, int img) {
        this.ten = ten;
        this.nghedanh = nghedanh;
        this.sosao = sosao;
        this.img = img;
    }


    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNghedanh() {
        return nghedanh;
    }

    public void setNghedanh(String nghedanh) {
        this.nghedanh = nghedanh;
    }

    public String getSosao() {
        return sosao;
    }

    public void setSosao(String sosao) {
        this.sosao = sosao;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}


