package jy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class J27JDBC {
    private static String DRV ="org.mariadb.jdbc.Driver";
    private static String URL = "jdbc:mariadb://fullstacks.czvo3mok5lfm.ap-northeast-2.rds.amazonaws.com:3306/fullstacks";
    private static String USR = "admin";
    private static String PWD = "fullstack_2023";
    private static String insertBookSQL = " insert into newbooks (title, writer, price) values (?, ?, ?) ";
    public static void main(String[] args) {
        // newbooks 테이블에 도서정보 저장
        Scanner sc = new Scanner(System.in);
        System.out.print("도서명? ");
        String bkname = sc.next();
        System.out.print("저자는? ");
        String author = sc.next();
        System.out.print("가격은? ");
        int price = sc.nextInt();

        // 1. JDBC 드라이버를 메모리에 적재
        try {
            Class.forName(DRV); // 인터페이스 jdbc 메모리에 적재시켜서 관련 라이브러리를 쓸 수 있도록함. 반드시 있어야 돼.
            //  private static String DRV ="org.mariadb.jdbc.Driver"; static으로 변경
        } catch (ClassNotFoundException e) {
            System.out.println("mariacb용 JDBC 드라이버가 없어요!!");
        }
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // 데이터베이스 접속
            conn = DriverManager.getConnection(URL, USR, PWD);
            // 실행할 SQL문 생성
            pstmt = conn.prepareStatement(insertBookSQL);
            // 실행할 SQL문의 placeholder(sql문의 ?물음표)에 값 전달
            pstmt.setString(1, bkname);
            pstmt.setString(2, author);
            pstmt.setInt(3, price);
            // SQL문 실행후 결과 확인
            int cnt = pstmt.executeUpdate(); // DML 실행시 사용
            System.out.println("데이터 입력 확인 : " + cnt); // insert가 되었으면, insert가 반영된 행 return

        } catch (SQLException e) {
            System.out.println("DB 접속주소나 아이디/비번, SQL문을 확인하세요!!");
        } finally {
            if(pstmt != null) try {pstmt.close();} catch (Exception ex){}
            if(conn != null) try {conn.close();} catch (Exception ex){}
        }


    }
}
