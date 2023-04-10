package jy;

public class BookMarket {
    public static void main(String[] args) {
        BookMarketService bksrv = new BookMarketService();
        while (true) {
            // bookmarket 메뉴 작성
            String menu = bksrv.displayMenu();

            // 입력한 메뉴에 따라 작업 분기
            bksrv.processMenu(menu);

        }

    }
}
