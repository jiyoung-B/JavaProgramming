package jy;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J29JDBC {
//    private static String DRV ="org.mariadb.jdbc.Driver";
//    private static String URL = "jdbc:mariadb://fullstacks.czvo3mok5lfm.ap-northeast-2.rds.amazonaws.com:3306/fullstacks";
//    private static String USR = "admin";
//    private static String PWD = "fullstack_2023";
    private static String selectBookSQL = " select * from newbooks" +
            " where title like ? order by bookno desc "; // ?에 '%IT CookBook%'
    // select * from newbooks where title like "%IT CookBook%" order by bookno desc;

    public static void main(String[] args) {
        // newbooks 테이블에서 도서명에 'IT CookBook'이 포함된 레코드 조회
        List<Book> bookdata = new ArrayList<>();

        // 검색할 도서명을 입력받음
        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 도서명은? ");
        String findbook = sc.nextLine();


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
            pstmt.setString(1, "%" + findbook + "%"); // where절 만들때 ?에 들어갈 첫번째 값

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