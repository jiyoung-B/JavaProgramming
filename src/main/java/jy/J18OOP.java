package jy;

public class J18OOP {

    // 인터페이스
    // 사물과 사물 사이 또는 사물과 인간 사이의 경계에서,
    // 상호 간의 소통을 위해 사용하는 물리적/논리적 매개체나 프로토콜
    // 사람 <- (말, 글) -> 사람
    // 컴퓨터 <- (입력장치, 출력장치) -> 사람
    // 객체 <-(메서드) -> 객체

    // 추상메서드와 상수만으로 구성된 특수한 클래스
    // 어떤 클래스를 만들때 추상메서드를 통해
    // 기본이 되는 틀을 제공하여 규칙에 맞춰
    // 코드를 짤수 있게 해 줌
    // => 접근제한자는 언제나 public abstract으로 고정
    // 클래스와는 달리 다중상속을 지원함

    // 인터페이스 작성시 interface 를 사용
    // 인터페이스를 구현할때는 implements를 사용
    public static void main(String[] args) {
        // 추상클래스는 객체화 불가!
        // Unit3 unit = Unit3();

        // 인터페이스도 객체화 불가!
        // UnitAction ua = new UnitAction();
        SCV3 scv = new SCV3();
        scv.attack();
        scv.move();

        Marine3 marine = new Marine3();
        marine.attack();
        marine.useStimpack();

        Firebet3 firebet = new Firebet3();
        firebet.attack();
        firebet.useStimpack();

    }
}

abstract class Unit3 { // 유닛의 속성만 다루는 클래스
    protected int life;   // 생명력
    protected int power;  // 공격력
    protected double move;   // 이동속도
    protected int sight;  // 시야
    protected int time;   // 생산소요시간

    public Unit3() {
    }

    public Unit3(int life, int power, double move, int sight, int time) {
        this.life = life;
        this.power = power;
        this.move = move;
        this.sight = sight;
        this.time = time;
    }


}
interface Unit3Action {
    public abstract void attack();
    public abstract void move();

}
class SCV3 extends Unit3 implements Unit3Action{
    public SCV3() {
        super(60, 5, 2.344, 7, 20);
    }

    @Override
    public void attack() {
        System.out.printf("융합 절단기(%d)으로 공격중...\n", power);
    }

    @Override
    public void move() {
        System.out.printf("%.1f 속도로 이동중...\n", move);

    }
    protected void collect() {
        System.out.println("미네랄이나 개스핀 가스를 캐는중...");
    }

}

class Marine3 extends Unit3 implements Unit3Action{
    public Marine3() {
        super(40, 6, 1.875, 7, 24);
    }
    @Override   // annotation
    public void attack() {
        System.out.printf("가우스 소총(%d)으로 공격중...\n", power);
    }

    @Override
    public void move() {
        System.out.printf("%.1f 속도로 이동중...\n", move);

    }

    public void useStimpack(){
        System.out.printf("전투 자극제 사용 : 공격력 %.1f로 증가, 이동속도 %.1f로 증가\n", power*1.72, move*1.15);

    }
}

class Firebet3 extends Unit3 implements Unit3Action {
    public Firebet3() {
        super(50, 8*2, 1.875, 7, 24);
    }

    @Override
    public void attack() {
        System.out.printf("화염방사기(%d)로 공격중...\n", power);
    }

    @Override
    public void move() {
        System.out.printf("%.1f 속도로 이동중...\n", move);

    }

    public void useStimpack(){
        System.out.printf("전투 자극제 사용 : 공격력 %.1f로 증가, 이동속도 %.1f로 증가\n", power*1.96, move*1.15);

    }
}

class Medic3 extends Unit3 implements Unit3Action{
    public Medic3() {
        super(60, 0, 1.875, 9, 30);
    }

    @Override
    public void attack() {
    }

    @Override
    public void move() {
        System.out.printf("%.1f 속도로 이동중...\n", move);
    }

    protected void useHeal() {
        System.out.println("대상 유닛의 체력을 초당 5.86만큼 회복시킴...");
    }

    protected void useRestoration() {
        System.out.println("대상 유닛의 적용된 행동제약을 해제시킴...");
    }
    protected void useOpticalFlare(){
        System.out.println("대상 유닛의 시야를 1로 고정시킴...");
    }
}
