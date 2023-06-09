package jy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J33JDBC {
    //public static String insertEmployeeSQL = " insert into employees (EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE, JOB_ID, SALARY, COMMISSION_PCT, MANAGER_ID, DEPARTMENT_ID) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // EMPDAOImpl는 불필요하게 인스턴스 객체로 생성하지 않도록
        // 따라서, singleton 패턴을 이용해서 단일 객체로만 만들어지도록 함
        // EMPDAO empdao = new EMPDAOImpl();
        EMPDAO empdao = EMPDAOImpl.getInstance();



        // 사원등록
       /* System.out.println("사원 등록을 진행합니다");
        System.out.print("empno? ");
        int empno = sc.nextInt();
        System.out.print("fname? ");
        String fname = sc.next();
        System.out.print("lname? ");
        String lname = sc.next();
        System.out.print("email? ");
        String email = sc.next();
        System.out.print("phone? ");
        String phone = sc.next();
        System.out.print("hdate? ");
        String hdate = sc.next();
        System.out.print("jobid? ");
        String jobid = sc.next();
        System.out.print("sal? ");
        int sal = sc.nextInt();
        System.out.print("comm? ");
        double comm = sc.nextDouble();
        System.out.print("mgrid? ");
        int mgrid = sc.nextInt();
        System.out.print("deptno? ");
        int deptno = sc.nextInt();

        EMPVO emp = new EMPVO(empno, fname, lname, email, phone, hdate, jobid, sal, comm, mgrid, deptno);
        int cnt = empdao.insertEmp(emp);
        if(cnt > 0) System.out.println(cnt + "건 입력 성공");*/

        // 사원 조회
          List<EMPVO> empdata = empdao.selectEmp();
          String fmt = "%d %s %s %s %d \n";
          for (EMPVO emp : empdata){
              System.out.printf(fmt, emp.getEmpno(), emp.getFname(), emp.getEmail(), emp.getJobid(), emp.getDeptno());
          }

        // 사원 상세조회
        /*  System.out.print("조회할 사원번호 empno? ");
        int empno = sc.nextInt();

        EMPVO emp = empdao.selectOneEmp(empno);
        if (emp!= null) System.out.println(emp);*/

        // 사원 수정
        System.out.print("수정할 사원번호 empno? ");
        int empno = sc.nextInt();
        System.out.print("fname? ");
        String fname = sc.next();
        System.out.print("lname? ");
        String lname = sc.next();
        System.out.print("email? ");
        String email = sc.next();
        System.out.print("phone? ");
        String phone = sc.next();

        EMPVO emp = new EMPVO(empno, fname, lname, email, phone);
        //EMPVO emp = new EMPVO(empno, fname, lname, email, phone, null, null, 0, 0.0, 0, 0);
        int cnt = empdao.updateEmp(emp);
        if(cnt > 0) System.out.println(cnt + "건 수정 성공");


        // 사원 삭제
        /*System.out.print("삭제할 사원번호 empno? ");
        int empno = sc.nextInt();

        int cnt = EMPDAOImpl.deleteEmp(empno);
        if(cnt > 0) System.out.println(cnt + "건 삭제 성공");*/

        //EMPDAO empDAO = new EMPDAO();
//        EMPVO emp = new EMPVO(500, "Baek", "Jiyoung", "KELLY", "010.222.2222", "2023-04-17", "DV_MASTER", 75000, 30, 500, 222);




        // 전체 조회
       // List<EMPVO> empnoList = EMPDAO.selectEmp();



    }
}
class EMPVO {
    private int empno;
    private String fname;
    private String lname;
    private String email;
    private String phone;
    private String hdate;
    private String jobid;
    private int sal;
    private double comm;
    private int mgrid;
    private int deptno;

    public EMPVO() {
    }

    public EMPVO(int empno, String fname, String lname, String email, String phone, String hdate, String jobid, int sal, double comm, int mgrid, int deptno) {
        this.empno = empno;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
        this.hdate = hdate;
        this.jobid = jobid;
        this.sal = sal;
        this.comm = comm;
        this.mgrid = mgrid;
        this.deptno = deptno;
    }

    public EMPVO(int empno, String fname, String lname, String email, String phone) {
        this.empno = empno;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
    }

    public int getEmpno() {
        return empno;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getHdate() {
        return hdate;
    }

    public String getJobid() {
        return jobid;
    }

    public int getSal() {
        return sal;
    }

    public double getComm() {
        return comm;
    }

    public int getMgrid() {
        return mgrid;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setHdate(String hdate) {
        this.hdate = hdate;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public void setMgrid(int mgrid) {
        this.mgrid = mgrid;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        String fmt = "%d %s %s %s %s %s %s %d %.2f %d %d";
        return String.format(fmt, empno, fname, lname, email,
                phone, hdate, jobid, sal, comm, mgrid, deptno);

    }
}
interface EMPDAO {
    int insertEmp(EMPVO empvo);
    List<EMPVO> selectEmp();
    EMPVO selectOneEmp(int empno);
    int updateEmp(EMPVO emp);
    int deleteEmp(int empno);
    // 생성자, set, get, toString 만들고 CRUD 구현 (p.574 ~ 577, 27 ~ 31JDBC 클래스 참고)
}

    // private static String insertEmp = " insert into employees (EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE, JOB_ID, SALARY, COMMISSION_PCT, MANAGER_ID, DEPARTMENT_ID) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
    // DAO 는 static으로 공유 객체로 쓰는것, VO는 개별 인스턴스
    // 단일 객체로 만들어 두고 Utility 객체로 shared 객체로 만든다.
    // static, preparedstatement 주의하기
    // 5개 작성하기
class EMPDAOImpl implements EMPDAO{
    private String insertEmpSQL = " insert into employees values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
    private String selectEMPSQL = " select EMPLOYEE_ID, FIRST_NAME, EMAIL, JOB_ID, DEPARTMENT_ID from employees order by EMPLOYEE_ID";
    private String selectOneEMPSQL = " select * from employees where EMPLOYEE_ID = ? ";
    private String deleteEMPSQL = " delete from employees where EMPLOYEE_ID = ? ";
    private String updateEmpSQL = " update employees set FIRST_NAME = ?, LAST_NAME = ?, EMAIL = ?, PHONE_NUMBER = ? where EMPLOYEE_ID =? ";

    // 싱글톤 패턴을 위해 선언한 변수
    private static EMPDAO instance;
    private EMPDAOImpl() {
    } // 생성자 호출 금지 - 인스턴스 객체로 생성되지 못하게 막음

    public static EMPDAO getInstance() {
        if (instance == null) instance = new EMPDAOImpl();
        return instance;
    }


    public int insertEmp(EMPVO emp){
        Connection conn = null;
        PreparedStatement pstmt = null;
        int cnt = 0;

        try {
            conn = J34JDBCUtil.makeConn();
            pstmt = conn.prepareStatement(insertEmpSQL);

            pstmt.setInt(1, emp.getEmpno());
            pstmt.setString(2, emp.getFname());
            pstmt.setString(3, emp.getLname());
            pstmt.setString(4, emp.getEmail());
            pstmt.setString(5, emp.getPhone());
            pstmt.setString(6, emp.getHdate());
            pstmt.setString(7, emp.getJobid());
            pstmt.setInt(8, emp.getSal());
            pstmt.setDouble(9, emp.getComm());
            pstmt.setInt(10, emp.getMgrid());
            pstmt.setInt(11, emp.getDeptno());

            cnt = pstmt.executeUpdate();
            System.out.println("데이터 입력 확인 : " + cnt);

        } catch (SQLException ex) {
            System.out.println("insertEmp 에서 오류발생!!");
            System.out.println(ex.getMessage());
        }
        finally {
            J34JDBCUtil.closeConn(null, pstmt, conn);
        }
        return cnt;}

    public List<EMPVO> selectEmp(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        List<EMPVO> empdata = new ArrayList<>();


        try {
            conn = J34JDBCUtil.makeConn();
            pstmt = conn.prepareStatement(selectEMPSQL);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                EMPVO emp = new EMPVO(
                        rs.getInt(1), rs.getString(2), "", rs.getString(3), "", "",
                        rs.getString(4), 0, 0.0, 0, rs.getInt(5)
                );
                empdata.add(emp);
            }


        } catch (Exception ex) {
            System.out.println("selectEmp 에서 오류발생!!");
            System.out.println(ex.getMessage());
        }
        finally {
            J34JDBCUtil.closeConn(rs, pstmt, conn);

        }
        return empdata;
    }


    public EMPVO selectOneEmp(int empno){

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        EMPVO emp = null;


        try {
            conn = J34JDBCUtil.makeConn();
            pstmt = conn.prepareStatement(selectOneEMPSQL);
            pstmt.setInt(1, empno); // 사원번호로 가져와

            rs = pstmt.executeQuery();

            if (rs.next()) {
                emp = new EMPVO(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8),
                        rs.getDouble(9),
                        rs.getInt(10),
                        rs.getInt(11)
                );
            }

        } catch (Exception ex) {
            System.out.println("selectOneEmp 에서 오류발생!!");
            System.out.println(ex.getMessage());
        }
        finally {
            J34JDBCUtil.closeConn(rs, pstmt, conn);

        }
        return emp;
    }
    public int updateEmp(EMPVO emp){
        Connection conn = null;
        PreparedStatement pstmt = null;
        int cnt = 0;

        try {
            conn = J34JDBCUtil.makeConn();
            pstmt = conn.prepareStatement(updateEmpSQL);
            pstmt.setString(1, emp.getFname());
            pstmt.setString(2, emp.getLname());
            pstmt.setString(3, emp.getEmail());
            pstmt.setString(4, emp.getPhone());
            pstmt.setInt(5, emp.getEmpno());

            cnt = pstmt.executeUpdate();

        } catch (Exception ex) {
            System.out.println("updateEmp 에서 오류발생!!");
            System.out.println(ex.getMessage());
        }
        finally {
            J34JDBCUtil.closeConn(null, pstmt, conn);

        }
        return cnt;
    }

    public int deleteEmp(int empno){
        Connection conn = null;
        PreparedStatement pstmt = null;
        int cnt = 0;

        try {
            conn = J34JDBCUtil.makeConn();
            pstmt = conn.prepareStatement(deleteEMPSQL);
            pstmt.setInt(1, empno);
            cnt = pstmt.executeUpdate();

        } catch (Exception ex) {
            System.out.println("deleteEmp 에서 오류발생!!");
            System.out.println(ex.getMessage());
        }
        finally {
            J34JDBCUtil.closeConn(null, pstmt, conn);
        }
        return cnt;
    }

}
