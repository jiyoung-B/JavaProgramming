package jy.project.sungjuk;

import jy.project.sungjuk.service.SungJukV1bServiceImpl;
import jy.project.sungjuk.service.SungJukV1bService;

public class SungJukV1bMain {
    // 성적 처리프로그램 v1b
    // 배열과 클래스, 인터페이스를 이용해서
    // 성적을 입력하면 총점, 평균, 학점을 계산함
    // 입력가능한 학생 성적 데이터는 최대 10명까지

    // SungJukV1bMain, SungJukVO, SungJukV1bService, SungJukV1bServiceImpl
    // 1. 성적데이터 입력
    // 2. 성적데이터 조회      (이름, 국어, 영어, 수학)
    // 3. 성적데이터 상세조회   (모두 다 출력)
    // 4. 성적데이터 수정
    // 5. 성적데이터 삭제
    // 0. 프로그램 종료

    public static void main(String[] args) {
        SungJukV1bService sjsrv = new SungJukV1bServiceImpl();

        while(true) {
            String menu = sjsrv.displayMenu();

            sjsrv.processMenu(menu);
        }




    }
}
