package jy;

import java.util.ArrayList;
import java.util.List;

public class J22Generic {
    // 제네릭Generic
    // 데이터 유형을 일반화(통일)한다는 것을 의미
    public static void main(String[] args) {
        // 여러 유형의 데이터를 사용하는 클래스의 경우
        // 매개변수의 유형을 Object로 선언하는 경우
        // 경우에 따라 원래의 유형으로 변환해야하는
        // 번거로움이 존재하고 오류가 발생할 수 있는 가능성 존재

        // 동물원 객체 생성
        // 일반적으로 배열은 동일한 유형의
        // 자료들을 저장하는 자료구조
        // 하지만, 배열의 유형을 Object로 선언하면
        // 온갖 종류의 데이터들을 저장할 수 있음
        Object[] zoo = new Object[10];

        // 동물들을 동물원 우리에 가둠
        zoo[0] = new Lion();    // upcasting!
        zoo[1] = new Tiger();
        zoo[2] = new Zebra();

        // 우리에서 동물을 하나씩 빼냄
        // 하지만, 배열에 저장된 데이터를 빼낼때는
        // 적절한 형변환이 필요함!
        Lion l1 = (Lion)zoo[0]; // 동물타입을 사자타입으로 형변환 // downcasting!
        Tiger t1 = (Tiger)zoo[1];
        Zebra z1 = (Zebra)zoo[2];

        // 제네릭을 이용하면 데이터의 타입을 통일시켜
        // 컴파일시 타입체크 오류 방지와
        // 불필요한 형변환을 없앨수 있음
        // type-parameter (<>)를 이용해서 자료구조의
        // 데이터 유형을 미리 설정해 둠
        List<Lion> lionzoo = new ArrayList<>();
        lionzoo.add(new Lion());
        // lionzoo.add(new Tiger()); // 컴파일타임 오류발생!

        // 자동형변환이 되므로 오류없이 실행됨 - 자동형변환이 되는 것인지 변환할 필요가 없어서되는것인지 ..?
        Lion l2 = lionzoo.get(0);

        // 데이터 타입을 매개변수로 넘긴다고 했는데, 어떻게 작동하는지 봅시다.
        // 제네릭 타입
        // 임의의 숫자를 입력받아 더하는 메서드를 만듦
        Adds example = new Adds();
        System.out.println(example.add(3, 3));
        System.out.println(example.add(4.5, 5.5));
        System.out.println(example.add(4.5f, 5.5f));

        // 제네릭 타입
        // 클래스나 메서드의 자료형을 미리 정해두고 사용하는 것이 아니고,
        // 외부에서 사용자에 의해 정해지도록 지정하는 것을 의미
        // 즉, 특정 타입을 미리 작성하고 사용하는 것이 아니고
        // 실행중에 필요에 따라 타입을 매개변수 형태로 받아 사용함
        // 비슷한 기능을 지원하는 코드들을 간략하게 작성할 수 있어
        // 코드의 재사용성이 높아짐
        System.out.println(example.add(new Integer(10), new Integer(100)));





    }
}

class Lion{}
class Tiger{}
class Zebra{}
class Adds{ // 이럴때 제네릭타입 쓰면 하나로 통합할 수 있어
    public int add(int a, int b) {
        System.out.println("int add");
        return a + b;
    }
    public double add(double a, double b) {
        System.out.println("double add");
        return a + b;
    }
    public float add(float a, float b) {
        System.out.println("float add");
        return a + b;
    }
    public <T>T add(T a, T b) {
        T sum = null;
        if (a.getClass() == Integer.class){ // a 클래스가 integer로 선언되어 있다면
            System.out.println("Integer add");
            sum = (T) (Integer) ((Integer) a + (Integer) b);
        } else if (a.getClass() == Double.class){
            System.out.println("Double add");
            sum = (T) (Double) ((Double) a + (Double) b);
        } else if (a.getClass() == Float.class) {
            System.out.println("Float add");
            sum = (T) (Float) ((Float) a + (Float) b);
        }
        return sum;
    }
}

