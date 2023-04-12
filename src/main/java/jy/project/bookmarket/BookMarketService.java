package jy.project.bookmarket;

import jy.project.MemberShip;

import java.util.Scanner;

public class BookMarketService {
    private Scanner sc = null;
    private MemberShip m = null; // 회원정보 저장용
    private Book[] books = null;
    public BookMarketService(){
        sc = new Scanner(System.in);
        registerBooks(); //도서 생성
    }

    // bookmarket 메뉴 작성
    public String displayMenu(){
        StringBuilder sb = new StringBuilder();
        sb.append("---------------------------\n")
            .append("Welcome to Shopping Mall\n")
            .append("Welcome to Book Market\n")
            .append("---------------------------\n")
            .append("1. 고객정보 확인하기\n")
            .append("2. 장바구니 상품 목록 보기 \n")
            .append("3. 장바구니 비우기 \n")
            .append("4. 장바구니 상품 추가\n")
            .append("5. 장바구니의 주문수량 변경 \n")
            .append("6. 장바구니의 상품 삭제\n")
            .append("7. 상품주문 영수증 출력\n")
            .append("0. 프로그램 종료\n")
            .append("---------------------------\n")
            .append("작업을 선택하세요 : \n");
        System.out.print(sb);
        String menu = sc.next(); // 작업할 메뉴 입력받기

        return menu;
    }

    // 메뉴 분기 처리
    public void processMenu(String menu){
        switch (menu) {
            case "1":
                System.out.println("\n고객정보 확인\n");
                System.out.println(m);
                break;
            case "2":
                System.out.println("\n장바구니 상품 목록\n");
                break;
            case "3":
                System.out.println("\n장바구니 비우기\n");
                break;
            case "4":
                System.out.println("\n장바구니 상품 추가\n");
                for(Book b : books){
                    System.out.println(b);
                }
                break;
            case "5":
                System.out.println("\n주문수량 변경\n");
                break;
            case "6":
                System.out.println("\n상품 삭제\n");
                break;
            case "7":
                System.out.println("\n주문 영수증 출력\n");
                break;
            case "0":
                System.out.println("\n프로그램을 종료합니다!\n");
                System.exit(0);
                break; // 정상 종료
            default:
                System.out.println("\n잘못 입력햐셨습니다!\n");
        } // switch
    }

    // 회원 등록
    public void registerMember() {
        System.out.print("회원 이름은?");
        String name = sc.next();
        System.out.print("회원 이메일은?");
        String email = sc.next();
        System.out.print("회원 전화번호은?");
        String hp = sc.next();

        m = new MemberShip(230410, name, email, hp); // lazy initialization


    }

    // 도서정보 자동등록
    public void registerBooks(){
        books = new Book[3];
        books[0] = new Book("2304101234", "JSP웹프로그래밍", 27000, "송미영", "단계별로 쇼핑몰을 구현", "IT전문서", "2018-10-08");
        books[1] = new Book("2304104567", "안드로이드 프로그래밍", 33000, "우재남", "실습 멘토링 제공", "IT전문서", "2022-01-22");
        books[2] = new Book("2304107891", "스크래치", 22000, "고광일", "사고력을 키우는 코딩", "컴퓨터입문", "2019-06-10");


    }
}
