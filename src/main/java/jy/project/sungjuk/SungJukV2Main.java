package jy.project.sungjuk;

import jy.project.sungjuk.service.SungJukV1cService;
import jy.project.sungjuk.service.SungJukV1cServiceImpl;

public class SungJukV2Main {
    // 성적 처리프로그램 v2
    // 배열과 클래스, 인터페이스, 예외처리, 컬렉션을 이용해서
    // 성적을 입력하면 총점, 평균, 학점을 계산함
    
    // SungJukV2bMain, SungJukVO, SungJukV1cService, SungJukV2ServiceImpl
    // 1. 성적데이터 입력
    // 2. 성적데이터 조회      (이름, 국어, 영어, 수학)
    // 3. 성적데이터 상세조회   (모두 다 출력)
    // 4. 성적데이터 수정
    // 5. 성적데이터 삭제
    // 0. 프로그램 종료

    public static void main(String[] args) {
        SungJukV1cService sjsrv = new SungJukV1cServiceImpl();

        while(true) {
            int menu = sjsrv.displayMenu();

            sjsrv.processMenu(menu);
        }




    }
}
