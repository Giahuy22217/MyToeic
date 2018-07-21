package com.haido.bigbabolbob.mytoeic.question;

/**
 * Created by Lenovo on 13/11/2017.
 */

public class Question {
    private int _id;
    private String cauhoi;
    private String traloi_a;
    private String traloi_b;
    private String traloi_c;
    private String traloi_d;
    private String ketqua;
    private String image;
    private String dokho;
    private int phanthi;
    private String mp3;
    private int dethi;
    private String traloi = "";

    public Question(int anInt, String string, String string1, String string2, String string3, String string4, String string5, String string6, String string7, int anInt1, String string8, int anInt2, String string9, String s) {
    }


    public void setTraloi(String traloi) {
        this.traloi = traloi;
    }

    public Question(int _id, String cauhoi, String traloi_a, String traloi_b, String traloi_c, String traloi_d, String ketqua, String image, String dokho, int phanthi, String mp3, int dethi, String traloi) {
        this._id = _id;
        this.cauhoi = cauhoi;
        this.traloi_a = traloi_a;
        this.traloi_b = traloi_b;
        this.traloi_c = traloi_c;
        this.traloi_d = traloi_d;
        this.ketqua = ketqua;
        this.image = image;
        this.dokho = dokho;
        this.phanthi = phanthi;
        this.mp3 = mp3;
        this.dethi = dethi;
        this.traloi = traloi;
    }

    public Question() {
    }

    public int get_id() {
        return _id;
    }

    public String getCauhoi() {
        return cauhoi;
    }

    public String getTraloi_a() {
        return traloi_a;
    }

    public String getTraloi_b() {
        return traloi_b;
    }

    public String getTraloi_c() {
        return traloi_c;
    }

    public String getTraloi_d() {
        return traloi_d;
    }

    public String getKetqua() {
        return ketqua;
    }

    public String getImage() {
        return image;
    }

    public String getDokho() {
        return dokho;
    }

    public int getPhanthi() {
        return phanthi;
    }

    public String getMp3() {
        return mp3;
    }

    public  int  getDethi() { return dethi; }

    public  String getTraloi(){ return  traloi;}


}
