package examples;

import java.util.Scanner;

public class BookaMarket {
    // 프로그램 실행 흐름
    // BookMarket -> BookService, MemberService <- Book, Member
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // bookmarket 메뉴 작성
            System.out.println("---------------------------");
            System.out.println("Welcome to Shopping Mall");
            System.out.println("Welcome to Book Market");
            System.out.println("---------------------------");
            System.out.println("1. 고객정보 확인하기");
            System.out.println("2. 장바구니 상품 목록 보기 ");
            System.out.println("3. 장바구니 비우기 ");
            System.out.println("4. 장바구니 상품 추가");
            System.out.println("5. 장바구니의 주문수량 변경 ");
            System.out.println("6. 장바구니의 상품 삭제");
            System.out.println("7. 상품주문 영수증 출력");
            System.out.println("0. 프로그램 종료");
            System.out.println("---------------------------");
            System.out.println("작업을 선택하세요 : ");
            int menu = sc.nextInt(); // 작업할 메뉴 입력받기

            // 입력한 메뉴에 따라 작업 분기
            switch(menu){
                case 1: System.out.println("\n고객정보 확인\n"); break;
                case 2: System.out.println("\n장바구니 상품 목록\n"); break;
                case 3: System.out.println("\n장바구니 비우기\n"); break;
                case 4: System.out.println("\n장바구니 상품 추가\n"); break;
                case 5: System.out.println("\n주문수량 변경\n"); break;
                case 6: System.out.println("\n상품 삭제\n"); break;
                case 7: System.out.println("\n주문 영수증 출력\n"); break;
                case 0: System.out.println("\n프로그램을 종료합니다!\n");
                        System.exit(0); break; // 정상 종료
            } // switch

        } // while

    } // main
} // class
