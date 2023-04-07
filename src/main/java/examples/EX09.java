package examples;

public class EX09 {
    public static void main(String[] args) {
        EmployeesVO emp = new EmployeesVO(100, "Steven", "King", "SKING@go.kr","0108456", "2022-06-25", "24000", 56,5.5,8674,984);
        DepartmentsVO dept = new DepartmentsVO(10, "Administration", 200, 1700);
        System.out.println(emp);

        System.out.println(dept);
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
        String fmt = "%d %s %s %s %s %s %s %d %.2f %d %d \n";
        return String.format(fmt, employeeid, firstname, lastname, email, phonenumber, hiredate, jobid, salary, commisionpct, managerid, departmentid);
    }
}
class DepartmentsVO{
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

    @Override
    public String toString() {
        String fmt = "%d %s %d %d\n";
        return String.format(fmt, departmentid, departmentname, managerid, locationid);
    }
}
