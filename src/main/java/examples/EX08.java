package examples;

public class EX08 {
    class Student {

        int 학번;
        String 이름;
        String 주소;
        int 생년월일;
        String 학과명;
        int 교수;

        public Student() {
        }

        public Student(int 학번, String 이름, String 주소, int 생년월일, String 학과명, int 교수) {
            this.학번 = 학번;
            this.이름 = 이름;
            this.주소 = 주소;
            this.생년월일 = 생년월일;
            this.학과명 = 학과명;
            this.교수 = 교수;
        }

        public String toString() {
            return "학번: " + 학번 + ", 이름: " + 이름 + ", 주소: " + 주소 + ", 생년월일: " + 생년월일 + ", 학과명: " + 학과명 + ", 교수: " + 교수;
        }


    }

    public static void main(String[] args) {
        EX08 ex08 = new EX08();
        Student student = ex08.new Student(201350050, "김태희", "경기도고양시", 19850322, "컴퓨터", 504);
        //Student student1 = new Student(201350050, "김태희", "경기도고양시", 19850322, "컴퓨터", 504);
        System.out.println(student);

        Professor professor = new Professor(0205, "이순신", "자바 프로그래밍");
       // Professor professor = ex08.new Professor(0205, "이순신", "자바 프로그래밍");
        System.out.println(professor);
    }
}
class Professor{
    int 교수번호;
    String 이름;
    String 전공분야;

    public Professor() {
    }

    public Professor(int 교수번호, String 이름, String 전공분야) {
        this.교수번호 = 교수번호;
        this.이름 = 이름;
        this.전공분야 = 전공분야;
    }

    public String toString(){
        return "교수번호: " + 교수번호 + ", 이름: " + 이름 + ", 전공분야: " + 전공분야;

    }
}
