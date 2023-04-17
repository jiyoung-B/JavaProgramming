package jy;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J30JDBC {
//    private static String DRV ="org.mariadb.jdbc.Driver";
//    private static String URL = "jdbc:mariadb://fullstacks.czvo3mok5lfm.ap-northeast-2.rds.amazonaws.com:3306/fullstacks";
//    private static String USR = "admin";
//    private static String PWD = "fullstack_2023";
    private static String deletetBookSQL = " delete from newbooks " +
            " where bookno = ? ";

    public static void main(String[] args) {
        // newbooks 테이블에서 입력받은 도서번호를 이용해서 레코드 삭제

        //삭제할 도서명을 입력받음
        Scanner sc = new Scanner(System.in);
        System.out.print("삭제할 도서번호? ");
        int bookno = sc.nextInt();


        // 1. JDBC 드라이버를 메모리에 적재
//        try {
//            Class.forName(DRV); // 인터페이스 jdbc 메모리에 적재시켜서 관련 라이브러리를 쓸 수 있도록함. 반드시 있어야 돼.
//            //  private static String DRV ="org.mariadb.jdbc.Driver"; static으로 변경
//        } catch (ClassNotFoundException e) {
//            System.out.println("mariacb용 JDBC 드라이버가 없어요!!");
//        }
        Connection conn = null;
        PreparedStatement pstmt = null; // SQL 문 실행하기 위해


        try {
//            conn = DriverManager.getConnection(URL, USR, PWD);
            conn = J32JDBCUtil.makeConn();
            pstmt = conn.prepareStatement(deletetBookSQL);
            pstmt.setInt(1, bookno);

            int cnt = pstmt.executeUpdate();
            System.out.println("데이터 삭제 확인 :" + cnt);



        } catch (SQLException e) {
            System.out.println("DB 접속주소나 아이디/비번, SQL문을 확인하세요!!");
        } finally {
            J32JDBCUtil.closeConn(null, pstmt, conn);

//            if(pstmt != null) try {pstmt.close();} catch (Exception ex){}
//            if(conn != null) try {conn.close();} catch (Exception ex){}
        }




    }
}