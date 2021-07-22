package iotest;

import java.io.Serializable;
import java.util.Objects;

public class Member implements Serializable{
    private int num;
    private String name;
    private String pw;

    public Member() {
    }

    public Member(int num, String name, String pw) {
        this.num = num;
        this.name = name;
        this.pw = pw;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return num == member.num && Objects.equals(name, member.name) && Objects.equals(pw, member.pw);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, name, pw);
    }
}