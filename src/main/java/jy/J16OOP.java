package jy;

public class J16OOP {
    // 상속
    // 부모클래스로 부터 변수,함수를 물려받아
    // 새로운 클래스를 만드는 기법
    // 한번 정의된 데이터유형을 필요에 따라
    // 다시 재활용함으로써 반복되는 코드를 줄일수 있음

    // 상속의 장점 : 중복코드 배제, 유지보수 용이
    // 통일성 유지, 다형성 구현 용이

    // 부모/상위/슈퍼 <=> 자식/하위/파생

    // 메서드 재정의override
    // 객체지향 중요 3대 개념중 다형성에 해당
    // 상속관계에 있는 상위클래스의 메서드를
    // 하위클래스에서 같은 이름의 메서드로 다시 작성하는 것을 의미
    // 즉, 상속받은 메서드를 새로 정의해서 사용하는 것을 말함

    // 클래스 형변환
    // 다형성의 또 다른 예
    // upcasting : 자식클래스가 부모클래스로 변환하는 것을 의미 (자동)
    // downcasting : 부모클래스가 자식클래스로 변환하는 것을 의미 (수동)

    public static void main(String[] args) {
        //SCV scv1 = new SCV();
        Unit scv1 = new SCV(); // 다형성 : upcasting - scv -> unit
        Marine marine1 = new Marine();
        Firebet firebet1 = new Firebet();
        Medic medic1 = new Medic();

        System.out.println(scv1.life);
        scv1.attack();
        // scv1.collect(); // unit 클래스에는 collect 메서드가 없음
        ((SCV)scv1).collect(); // 다형성 : downcasting - unit -> scv

        System.out.println(marine1.life);
        marine1.attack();
        marine1.useStimpack();

        System.out.println(firebet1.life);
        firebet1.attack();
        firebet1.useStimpack();

        System.out.println(medic1.life);
        medic1.useHeal();
        medic1.useRestoration();
        medic1.useOpticalFlare();

        // 한편, 부모클래스인 unit도 객체화 가능
        Unit unit1 = new Unit();
        System.out.println(unit1.life);
        unit1.attack();

    }
}
class SCV0 {
    protected int life;   // 생명력
    protected int power;  // 공격력
    protected double move;   // 이동속도
    protected int sight;  // 시야
    protected int time;   // 생산소요시간

    public SCV0() {
        this.life = 60;
        this.power = 5;
        this.move = 2.344;
        this.sight = 7;
        this.time = 20;
    }

    protected void attack() {System.out.printf("융합 절단기(%d)으로 공격중...\n", power);}
    protected void move() {System.out.printf("%.1f 속도로 이동중...\n", move);}
    protected void collect() {System.out.println("미네랄이나 개스핀 가스를 캐는중...");}


}
class Marine0 {
    protected int life;   // 생명력
    protected int power;  // 공격력
    protected double move;   // 이동속도
    protected int sight;  // 시야
    protected int time;   // 생산소요시간

    public Marine0() {
        this.life = 40;
        this.power = 6;
        this.move = 1.875;
        this.sight = 7;
        this.time = 24;
    }

    protected void attack() {System.out.printf("가우스 소총(%d)으로 공격중...\n", power);}
    protected void move() {System.out.printf("%.1f 속도로 이동중...\n", move);}
    protected void useStimpack(){System.out.printf("전투 자극제 사용 : 공격력 %.1f로 증가, 이동속도 %.1f로 증가\n", power*1.72, move*1.15);}


}

// ---------------------------------------
class Unit {
    protected int life;   // 생명력
    protected int power;  // 공격력
    protected double move;   // 이동속도
    protected int sight;  // 시야
    protected int time;   // 생산소요시간

    public Unit() {
    }

    public Unit(int life, int power, double move, int sight, int time) {
        this.life = life;
        this.power = power;
        this.move = move;
        this.sight = sight;
        this.time = time;
    }

    protected void attack() {

    }
    protected void move() {

    }


}

class SCV extends Unit {
    public SCV() {
        // super : 부모클래스의 생성자를 호출하는 특수한 키워드
        super(60, 5, 2.344, 7, 20);
    }

    @Override
    protected void attack() {
        System.out.printf("융합 절단기(%d)으로 공격중...\n", power);
    }
    protected void collect() {
        System.out.println("미네랄이나 개스핀 가스를 캐는중...");
    }

}

class Marine extends Unit {
    public Marine() {
        super(40, 6, 1.875, 7, 24);
    }

    @Override   // annotation
    protected void attack() {
        System.out.printf("가우스 소총(%d)으로 공격중...\n", power);
    }

    protected void useStimpack(){
        System.out.printf("전투 자극제 사용 : 공격력 %.1f로 증가, 이동속도 %.1f로 증가\n", power*1.72, move*1.15);

    }
}

class Firebet extends Unit {
    public Firebet() {
        super(50, 8*2, 1.875, 7, 24);
    }

    @Override
    protected void attack() {
        System.out.printf("화염방사기(%d)로 공격중...\n", power);
    }

    protected void useStimpack(){
        System.out.printf("전투 자극제 사용 : 공격력 %.1f로 증가, 이동속도 %.1f로 증가\n", power*1.96, move*1.15);

    }
}

class Medic extends Unit{
    public Medic() {
        super(60, 0, 1.875, 9, 30);
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
