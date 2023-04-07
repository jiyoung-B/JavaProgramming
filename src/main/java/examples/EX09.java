package examples;

import java.util.StringJoiner;

public class EX09 {
    public static void main(String[] args) {
        // board 테이블에 대응하는 클래스 작성
        Board b = new Board(1,"테스트", "abc123",
                "2023-04-07", 0, "테스트입니다");

        System.out.println(b);

        // employees, departments 테이블에 대응하는 클래스 작성
        EmployeesVO emp = new EmployeesVO(100, "Steven", "King",
                "SKING", "515.123.4567", "2003-06-17", "AD_PRES",
                24000, 0, 0, 90);

        System.out.println(emp);

        DepartmentsVO dept = new DepartmentsVO(
                10, "Administration",
                200, 1700);

        System.out.println(dept);

    }
}

class Board {
    private int bno;
    private String title;
    private String userid;
    private String regdate;
    private int views;
    private String contents;

    public Board() {
    }

    public Board(int bno, String title, String userid, String regdate, int views, String contents) {
        this.bno = bno;
        this.title = title;
        this.userid = userid;
        this.regdate = regdate;
        this.views = views;
        this.contents = contents;
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        String fmt = "%d %s %s %s %d %s\n";
        return String.format(fmt, bno, title, userid,
                regdate, views, contents);
    }

}

class EmployeesVO {
    private int employeeid;
    private String firstname;
    private String lastname;
    private String email;
    private String phonenumber;
    private String hiredate;
    private String jobid;
    private int salary;
    private double commisionpct;
    private int managerid;
    private int departmentid;

    public EmployeesVO() {
    }

    public EmployeesVO(int employeeid, String firstname, String lastname, String email, String phonenumber, String hiredate, String jobid, int salary, double commisionpct, int managerid, int departmentid) {
        this.employeeid = employeeid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phonenumber = phonenumber;
        this.hiredate = hiredate;
        this.jobid = jobid;
        this.salary = salary;
        this.commisionpct = commisionpct;
        this.managerid = managerid;
        this.departmentid = departmentid;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getCommisionpct() {
        return commisionpct;
    }

    public void setCommisionpct(double commisionpct) {
        this.commisionpct = commisionpct;
    }

    public int getManagerid() {
        return managerid;
    }

    public void setManagerid(int managerid) {
        this.managerid = managerid;
    }

    public int getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(int departmentid) {
        this.departmentid = departmentid;
    }

    @Override
    public String toString() {
        String fmt = "%d %s %s %s %s %s %s %d %.2f %d %d\n";
        return String.format(fmt, employeeid, firstname, lastname,
                email, phonenumber, hiredate, jobid, salary, commisionpct,
                managerid, departmentid);
    }
}

class DepartmentsVO {
    private int departmentid;
    private String departmentname;
    private int managerid;
    private int locationid;

    public DepartmentsVO() {
    }

    public DepartmentsVO(int departmentid, String departmentname, int managerid, int locationid) {
        this.departmentid = departmentid;
        this.departmentname = departmentname;
        this.managerid = managerid;
        this.locationid = locationid;
    }

    public int getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(int departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public int getManagerid() {
        return managerid;
    }

    public void setManagerid(int managerid) {
        this.managerid = managerid;
    }

    public int getLocationid() {
        return locationid;
    }

    public void setLocationid(int locationid) {
        this.locationid = locationid;
    }

    @Override
    public String toString() {
        String fmt = "%d %s %d %d\n";
        return String.format(fmt, departmentid, departmentname,
                managerid, locationid);
    }
}