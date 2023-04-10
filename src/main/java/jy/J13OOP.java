package jy;

public class J13OOP {

    // 메서드 다중정의
    // 객체지향 3대 중요개념 중 하나인 다형성에 해당
    // 같은 이름의 메서드를 중복해서 정의하는 것을 의미
    // 한 클래스에 같은 이름의 메서드가 2개 이상 존재할 수 있음
    // 이때 메서드의 서명만 다르게 작성한다면 정의 가능

    public static void main(String[] args) {
        Cat persian = new Cat();

        NotOverloading nol = new NotOverloading();
        ApplyOverloading aol = new ApplyOverloading();

        System.out.println(nol.addInt(10, 20));
        System.out.println(nol.addDouble(10.5, 10.5));
        System.out.println(nol.addInt3(10, 20, 30));

        System.out.println(aol.add(10, 20));
        System.out.println(aol.add(10.5, 20.5));
        System.out.println(aol.add(10, 20, 30));

    }
}

class Cat {
    private String breed;
    private String color;

    public Cat() {
    }

    // 생성자 다중정의
    public Cat(String breed, String color) {
        this.breed = breed;
        this.color = color;
    }

    public Cat(String breed) {
        this.breed = breed;
    }

    //public Cat(String color) {  // String 매개변수 생성자가 이미 있기 때문
    //    this.color = color;
    //}
}

class NotOverloading {
    // 간단한 덧셈 프로그램
    // 1. 정수2개를 더하는 메서드
    public int addInt(int x, int y) {
        return x + y;
    }

    // 2. 실수2개를 더하는 메서드
    public double addDouble(double x, double y) {
        return x + y;
    }

    // 3. 정수3개를 더하는 메서드
    public int addInt3(int x, int y, int z) {
        return x + y + z;
    }
    // 메서드 오버로딩을 사용하지 않는 경우
    // 생성할 메서드마다 이름을 제각각으로 정해야하므로
    // 개발자가 일일히 기억해서 사용해야 하는 불편 초래
}

class ApplyOverloading {
    // 간단한 덧셈 프로그램
    // 1. 정수2개를 더하는 메서드
    public int add(int x, int y) {
        return x + y;
    }
    // 2. 실수2개를 더하는 메서드
    public double add(double x, double y) {
        return x + y;
    }
    // 3. 정수3개를 더하는 메서드
    public int add(int x, int y, int z) {
        return x + y + z;
    }

    // 메서드 다중정의를 적용하면
    // 메서드의 이름을 하나로 통일해서 작성 가능
    // 개발자가 외울 메서드의 이름이 줄어듬
    // 단, 메서드를 어떻게 호출할지만 알고있으면 됨
}