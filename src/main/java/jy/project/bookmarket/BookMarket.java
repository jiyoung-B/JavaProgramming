package jy.project.bookmarket;

public class BookMarket {

    // 프로그램 실행 흐름
    // BookMarket -> BookService, MemberService <- Book, Member
    public static void main(String[] args) {
        BookMarketService bksrv = new BookMarketService();
        bksrv.registerMember(); // 회원등록

        while(true) {
            // bookmarket 메뉴 작성
            String menu = bksrv.displayMenu();

            // 입력한 메뉴에 따라 작업 분기
            bksrv.processMenu(menu);
        } // while

    } // main
} // class