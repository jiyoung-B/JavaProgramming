package jy.project.sungjuk.dao;

import java.sql.*;

public class Oracle11XE {

    private static String DRV ="oracle.jdbc.driver.OracleDriver";
    private static String URL = "jdbc:oracle:thin:@52.79.99.166:1521:XE";
    private static String USR = "hr";
    private static String PWD = "hr";

    // 데이터베이스 접속 객체 생성
    public static Connection makeConn() {
        Connection conn = null;
        try {
            Class.forName(DRV);
            conn = DriverManager.getConnection(URL, USR, PWD);
        } catch (ClassNotFoundException ex){
            System.out.println("oracle용 JDBC 드라이버가 없어요!!");
        } catch (SQLException ex) {
            System.out.println("DB 접속주소나 아이디/비번을 확인하세요!!");
        }
        return conn;
    }

    // 데이터베이스 접속 객체 해제
    public static void closeConn(ResultSet rs, PreparedStatement pstmt, Connection conn) {
        if(rs != null) try {rs.close();} catch (Exception ex){}
        if(pstmt != null) try {pstmt.close();} catch (Exception ex){}
        if(conn != null) try {conn.close();} catch (Exception ex){}
    }
}
