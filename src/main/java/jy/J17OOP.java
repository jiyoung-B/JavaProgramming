package jy;

public class J17OOP {
    // 추상 클래스
    // 추상메서드를 포함하는 클래스
    // 추상메서드 : 메서드의 선언부만 있고, 몸체가 없는 메서드
    // 메서드의 몸체는 이것을 상속하는 자식클래스에서 정의함

    // 따라서, 추상클래스는 불완전 클래스이므로 객체화할 수 없음
    // 추상메서드나 추상클래스는 abstract라는 키워드 사용
    public static void main(String[] args) {
        // 추상클래스 객체화 시도 - 실패!
        // Unit2 unit = new Unit2();
        SCV2 scv = new SCV2();
        scv.attack();
        scv.move();

    }
}

abstract class Unit2 {
    protected int life;   // 생명력
    protected int power;  // 공격력
    protected double move;   // 이동속도
    protected int sight;  // 시야
    protected int time;   // 생산소요시간

    public Unit2() {
    }

    public Unit2(int life, int power, double move, int sight, int time) {
        this.life = life;
        this.power = power;
        this.move = move;
        this.sight = sight;
        this.time = time;
    }

    protected abstract void attack();
    protected abstract void move();
}

class SCV2 extends Unit2 {
    public SCV2() {
        // super : 부모클래스의 생성자를 호출하는 특수한 키워드
        super(60, 5, 2.344, 7, 20);
    }

    @Override
    protected void attack() {
        System.out.printf("융합 절단기(%d)으로 공격중...\n", power);
    }

    @Override
    protected void move() {
        System.out.printf("%.1f 속도로 이동중...\n", move);

    }

    protected void collect() {
        System.out.println("미네랄이나 개스핀 가스를 캐는중...");
    }

}

class Marine2 extends Unit2 {
    public Marine2() {
        super(40, 6, 1.875, 7, 24);
    }

    @Override   // annotation
    protected void attack() {
        System.out.printf("가우스 소총(%d)으로 공격중...\n", power);
    }

    @Override
    protected void move() {
        System.out.printf("%.1f 속도로 이동중...\n", move);

    }

    protected void useStimpack(){
        System.out.printf("전투 자극제 사용 : 공격력 %.1f로 증가, 이동속도 %.1f로 증가\n", power*1.72, move*1.15);

    }
}

class Firebet2 extends Unit2 {
    public Firebet2() {
        super(50, 8*2, 1.875, 7, 24);
    }

    @Override
    protected void attack() {
        System.out.printf("화염방사기(%d)로 공격중...\n", power);
    }

    @Override
    protected void move() {
        System.out.printf("%.1f 속도로 이동중...\n", move);

    }

    protected void useStimpack(){
        System.out.printf("전투 자극제 사용 : 공격력 %.1f로 증가, 이동속도 %.1f로 증가\n", power*1.96, move*1.15);

    }
}

class Medic2 extends Unit2{
    public Medic2() {
        super(60, 0, 1.875, 9, 30);
    }

    @Override
    protected void attack() {
    }

    @Override
    protected void move() {
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
