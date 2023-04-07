package jy;

public class J12OOP {
    public static void main(String[] args) {
        Person2 p2 = new Person2("지현", "배우", 32, '여');

        p2.setName("혜교");
        p2.setJob("가수");
        p2.setAge(35);
        p2.setGender('남');

        System.out.println(p2.getName());
        System.out.println(p2.getJob());
        System.out.println(p2.getAge());
        System.out.println(p2.getGender());

        System.out.println(p2);


    }
}
class Person2{
    private  String name;
    private  String job;
    private  int age;
    private  char gender;

    public Person2(){}// 기본생성자

    // getter / setter 선언
    // private 으로 선언된 변수를 외부에 접근할 수 있도록
    // 정의하는 특수한 메서드

    // getXxx
    public String getName() {
        return name;
    }
    public String getJob() {
        return job;
    }
    public int getAge() {
        return age;
    }
    public char getGender() {
        return gender;
    }

    // setXxx
    public void setName(String name) {
        this.name = name;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

//    @Override
//    public String toString() {
//        return "Person2{" +
//                "name='" + name + '\'' +
//                ", job='" + job + '\'' +
//                ", age=" + age +
//                ", gender=" + gender +
//                '}';
//    }
//

    // ctrl + spacebar
    @Override
    public String toString() {
        String fmt = "";
        return "Person2{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public Person2(String name, String job, int age, char gender) {
        this.name = name;
        this.job = job;
        this.age = age;
        this.gender = gender;
    }// 매개변수 있는 생성자
}


