package jy;

public class J14OOP {
    public static void main(String[] args) {
        // 캡슐화
        // 클래스와 멤버변수 선언시 정보의 은닉정도를 부여
        // 정보은닉 : 사용자가 굳이 알 필요가 없는 정보는
        // 사용자로부터 숨겨야 한다는 개념
        // 최소한의 정보만으로 보안과 보호를 구현할 수 있음

        // 자바에서 지원하는 4가지 접근 제한자
        // public (모두 허용) > protected (같은 패키지나 상속관계만 허용)
        // > default(같은 패키지끼리는 허용) > private(나만 허용)

        Address addr = new Address();

        // addr.name = "홍길동";             // private 으로 선언됨! - 접근 불가!
        addr.email = "abc123@xyz987.com";   // default 로 선언됨
        addr.addr = "서울 구로구";           // public 으로 선언됨

    }

}

class Address {
    private String name;
    String email;
    public String addr;
}

// 자바빈즈Beans : 식별가능하고, 재사용성이 높은 소프트웨어를
// 만들기 위한 기본 규칙, POJO 클래스라고도 함
// 멤버변수는 반드시 private으로 선언
// 기본생성자가 있어야 함
// setter/getter 메서드가 정의되어야 함