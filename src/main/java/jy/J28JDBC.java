package jy;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class J28JDBC {
//    private static String DRV ="org.mariadb.jdbc.Driver";
//    private static String URL = "jdbc:mariadb://fullstacks.czvo3mok5lfm.ap-northeast-2.rds.amazonaws.com:3306/fullstacks";
//    private static String USR = "admin";
//    private static String PWD = "fullstack_2023";
    private static String selectBookSQL = " select * from newbooks order by bookno desc ";
    public static void main(String[] args) {
        // newbooks 테이블의 모든 레코드 조회
        List<Book> bookdata = new ArrayList<>();

        // 1. JDBC 드라이버를 메모리에 적재
//        try {
//            Class.forName(DRV); // 인터페이스 jdbc 메모리에 적재시켜서 관련 라이브러리를 쓸 수 있도록함. 반드시 있어야 돼.
//            //  private static String DRV ="org.mariadb.jdbc.Driver"; static으로 변경
//        } catch (ClassNotFoundException e) {
//            System.out.println("mariacb용 JDBC 드라이버가 없어요!!");
//        }
        Connection conn = null;
        PreparedStatement pstmt = null; // SQL 문 실행하기 위해
        ResultSet rs = null;    // SQL문 실행 후 넘어오는 값 받아오기 위해

        try {
//            conn = DriverManager.getConnection(URL, USR, PWD);
            conn = J32JDBCUtil.makeConn();
            pstmt = conn.prepareStatement(selectBookSQL);

            // SQL문 실행후 결과집합(result set) 받음
            rs = pstmt.executeQuery();// DML 실행시 사용(select)
            while (rs.next()) {
                Book book = new Book(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getInt(4), rs.getString(5));
                bookdata.add(book);
            }

        } catch (SQLException e) {
            System.out.println("DB 접속주소나 아이디/비번, SQL문을 확인하세요!!");
        } finally {
            // static으로 선언된 메서드는 객체 생성 없이 바로 호출 가능
            // 단, 클래스명.메서드명으로 호출(이탤릭체로 호출됨)
            J32JDBCUtil.closeConn(rs, pstmt, conn);
//            if(rs != null) try {rs.close();} catch (Exception ex){}
//            if(pstmt != null) try {pstmt.close();} catch (Exception ex){}
//            if(conn != null) try {conn.close();} catch (Exception ex){}
        }

        // 도서정보 출력
        for (Book b : bookdata) {
            System.out.println(b);
        }


    }
}
class Book {
    private int bookno;
    private String title;
    private String writer;
    private int price;
    private String regdate;

    public Book() {
    }

    public Book(int bookno, String title, String writer, int price, String regdate) {
        this.bookno = bookno;
        this.title = title;
        this.writer = writer;
        this.price = price;
        this.regdate = regdate;
    }

    public int getBookno() {return bookno;}
    public String getTitle() {return title;}
    public String getWriter() {return writer;}
    public int getPrice() {return price;}
    public String getRegdate() {return regdate;}
    @Override
    public String toString() {
        String fmt = "%d %s %s %d %s";
        return String.format(fmt, bookno, title, writer, price, regdate);
    }

}