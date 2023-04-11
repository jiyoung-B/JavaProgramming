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

    public static void main(String[] args) {
        SCV scv1 = new SCV();
        Marine marine1 = new Marine();
        Firebet firebet1 = new Firebet();
        Medic medic1 = new Medic();

        System.out.println(scv1.life);
        scv1.attack();
        scv1.collect();

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

    }
}

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
