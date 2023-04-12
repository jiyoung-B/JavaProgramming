package jy.project;

public class MemberShip {
    private int mno;
    private String name;
    private String email;
    private String hp;

    public MemberShip(int mno, String name, String email, String hp) {
        this.mno = mno;
        this.name = name;
        this.email = email;
        this.hp = hp;
    }

    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        String fmt = "%s %s %s\n";
        return String.format(fmt, name, email, hp);
    }
}
