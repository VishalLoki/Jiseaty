package com.example.jiseaty;

public class Item2 {
    String sub_name;
    String dept;
    String reg;
    String sem;

    public Item2(String sub_name, String dept, String reg, String sem) {
        this.sub_name = sub_name;
        this.dept = dept;
        this.reg = reg;
        this.sem = sem;
    }

    public String getSub_name() {
        return sub_name;
    }

    public void setSub_name(String sub_name) {
        this.sub_name = sub_name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getSem() {
        return sem;
    }

    public void setSem(String sem) {
        this.sem = sem;
    }
}
