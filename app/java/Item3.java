package com.example.jiseaty;

public class Item3 {
    String date;
    String pdf_name;
    String pdf_url;

    public Item3(String date, String pdf_name, String pdf_url) {
        this.date = date;
        this.pdf_name = pdf_name;
        this.pdf_url = pdf_url;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String sub_name) {
        this.date = date;
    }

    public String getPdf_name() {
        return pdf_name;
    }

    public void setPdf_name(String pdf_name) {
        this.pdf_name = pdf_name;
    }

    public String getPdf_url() {
        return pdf_url;
    }

    public void setPdf_url(String pdf_url) {
        this.pdf_url = pdf_url;
    }
}
