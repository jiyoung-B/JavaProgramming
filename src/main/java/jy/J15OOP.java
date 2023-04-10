package jy;

import java.util.ArrayList;

public class J15OOP {
    // 클래스 종류
    // Service : 비지니스 로직 처리를 담당하는 클래스
    // VO로 저장된 데이터를 DAO로 넘기기 전에
    // 처리해야 하는 일반적인 작업을 기능으로 구현한 클래스
    // 메서드만 저장하기 위해 생성하는 클래스

    // 일반적인 프로그래밍 작성 흐름
    // J2EE 개발에 최적화된 방식
    // VO - Service - DAO - DB

    public static void main(String[] args) {
        // 회원처리 기능이 정의된 클래스 객체 선언
        MemberService msrv = new MemberService();

        Member m = new Member(
                "홍길동","010","1234","5678",
                "abc123","xyz987.com");

        msrv.newMember(m);
        msrv.readMember();
        msrv.readOneMember("홍길동");
        msrv.modifyMember("홍길동");
        msrv.removeMember("홍길동");
    }
}

// 회원정보 : 이름, 전화번호, 이메일
class Member {
    private String name;
    private String hp1;    // 지역번호
    private String hp2;    // 국번
    private String hp3;    // 국번
    private String email1;
    private String email2;

    public Member(String name, String hp1, String hp2, String hp3, String email1, String email2) {
        this.name = name;
        this.hp1 = hp1;
        this.hp2 = hp2;
        this.hp3 = hp3;
        this.email1 = email1;
        this.email2 = email2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHp1() {
        return hp1;
    }

    public void setHp1(String hp1) {
        this.hp1 = hp1;
    }

    public String getHp2() {
        return hp2;
    }

    public void setHp2(String hp2) {
        this.hp2 = hp2;
    }

    public String getHp3() {
        return hp3;
    }

    public void setHp3(String hp3) {
        this.hp3 = hp3;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }
}

// 회원정보와 관련된 CRUD 기능 구현
class MemberService {
    // 회원 생성C : new~
    public boolean newMember(Member mvo) {
        System.out.println("회원정보 생성");
        return false;
    }

    // 회원 조회R : read~
    public Member[] readMember() {
        System.out.println("회원정보 리스트 조회");
        return null;
    }

    // 회원 조회R : readOne~
    public Member readOneMember(String name) {
        System.out.println("회원정보 상세 조회");
        return null;
    }

    // 회원 수정U: modify~
    public boolean modifyMember(String name) {
        System.out.println("회원정보 수정");
        return false;
    }

    // 회원 삭제D: remove~
    public boolean removeMember(String name) {
        System.out.println("회원정보 삭제");
        return false;
    }
}