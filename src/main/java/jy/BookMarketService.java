package jy;

import java.util.Scanner;

public class BookMarketService {
    private Scanner sc = null;
    private MemberShip m = null; // 회원정보 저장용
    public BookMarketService(){
        sc = new Scanner(System.in);
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
}
