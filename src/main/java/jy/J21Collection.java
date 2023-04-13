package jy;

import java.util.ArrayList;
import java.util.List;

public class J21Collection {
    // Collection
    // 데이터를 저장하는 자료구조와
    // 데이터를 처리(CRUD)하는 알고리즘을
    // 체계적으로 정리(구조화)해서
    // 인터페이스와 클래스로 구현해 놓은 프레임워크
    public static void main(String[] args) {
        // ArrayList
        // 동적배열의 한 종류
        // List 인터페이스를 구현해서 만든 컬렉션 프레임워크
        // 요소의 저장순서가 유지
        // 중복으로 데이터를 저장할 수 있음
        // 크기가 늘어나면 새로운 배열을 생성하고
        // 기존의 요소들을 옮겨야 하는 복잡한 과정이 동반됨

        List<String> names = new ArrayList<>();
         ArrayList name2 = new ArrayList(); // 인터페이스의 기능을 십분활용하는게 아니기 때문에 위에 방식으로 사용
        // names의 데이터 타입 <String> 제네릭으로 표현

        // 데이터 추가 : add(대상)
        names.add("혜교");
        names.add("지현");
        names.add("수지");

        // 특정위치에 데이터 추가 : add(위치, 대상)
        names.add(1, "원영");
        System.out.println(names);

        // 조회 : enhanced for, foreach
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println("");

        // 특정요소 조회 : get(위치)
        System.out.println(names.get(1));

        // 특정요소 변경 : set(위치, 새로운값)
        names.set(1, "윤아");
        System.out.println(names.get(1));

        // 특정요소 제거 : remove(위치)
        names.remove(1);
        System.out.println(names.get(1));

        // 데이터 검색
        // 위치로 찾기 : get(위치), indexOf
        // 값으로 찾기 : foreach, contains

        // '지현'을 검색1
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals("지현")) {
                System.out.println((i + 1) + "번째에서 " + names.get(i) + " 찾음!");
            }
        } // 위치 기반 검색

        // '지현'을 검색2
        for (String name : names) {
            if (name.equals("지현")) {
                System.out.println(name + " 찾음!");
            }
        } // 값 기반 검색

        // '지현'을 검색3
        if (names.contains("지현")) {
            System.out.println("데이터 찾음!");
        }

        // '지현'을 검색 4
        if (names.indexOf("지현") > -1) {
            System.out.println("데이터 찾음!!");
        }

        System.out.println(names.contains("지현"));
        System.out.println(names.indexOf("수지"));

        // 게임정보 동적배열 생성
        List<GameInfo> games = new ArrayList<>();
        games.add(new GameInfo("디아블로4", 89600));
        games.add(new GameInfo("젤다의 전설", 74800));
        games.add(new GameInfo("바이오하자드 4RE", 67000));

        // 조회
        // GameInfo 타입은 객체형이므로
        // 객체자체를 출력시 객체의 메모리 주소가 출력
        // 따라서, toString을 재정의해두어야 올바른 값이 출력
        for (GameInfo game : games) {
            System.out.println(game);
            // System.out.println(game.getName()+"\n"+game.getPrice());
        }

        // '젤다의 전설'의 가격을 조회

        // v1- for
        for (int i = 0; i < games.size(); i++) {
            if (games.get(i).name.equals("젤다의 전설")) {
                System.out.println(games.get(i).name + "의 가격은 : " + games.get(i).price);
            }
        }
        // v2- foreach
        for (GameInfo game : games) {
            if (game.name.equals("젤다의 전설")) {
                System.out.println(game.price);
            }
        }

        // v3- contains
        for (GameInfo game : games) {
            if (game.name.contains("젤다의 전설")) {
                System.out.println(game.price);
                break;
            }
        }
        // v4- indexOf
        for (GameInfo game : games) {
            if (game.name.indexOf("젤다의 전설") > -1) {
                System.out.println(game.price);
                break;
            }
        }


    }
}
class GameInfo{
    String name;
    int price;



    public GameInfo(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        String fmt = "%s %,d";
        return String.format(fmt, name, price);
    }
}
