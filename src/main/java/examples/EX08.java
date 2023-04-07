package examples;

    public class EX08 {
        public static void main(String[] args) {
            // 학생Student 클래스를 선언하고 객체 초기화한 후 출력
            Student std1 = new Student(
                    201350050, "김태희", "경기도고양시",
                    "1985.3.22", "컴퓨터", 504);

            //System.out.printf("%d %s %s %s %s %d \n",
            //    std1.hakbun, std1.name, std1.addr, std1.birth,
            //    std1.dept, std1.prof);

            System.out.printf("%d %s %s %s %s %d \n",
                    std1.getHakbun(), std1.getName(), std1.getAddr(),
                    std1.getBirth(), std1.getDept(), std1.getProf());

            System.out.println(std1);

            // 교수Professor 클래스를 선언하고 객체 초기화한 후 출력
            Professor p1 =
                    new Professor(301, "이순신", "프로그래밍");

            //System.out.printf("%d %s %s \n", p1.prof, p1.name, p1.major);
            System.out.printf("%d %s %s \n",
                    p1.getProf(), p1.getName(), p1.getMajor());

            System.out.println(p1);

        }

    }

    class Student {
        private int hakbun;
        private String name;
        private String addr;
        private String birth;
        private String dept;
        private int prof;

        public Student() {}

        public Student(int hakbun, String name, String addr,
                       String birth, String dept, int prof) {
            this.hakbun = hakbun;
            this.name = name;
            this.addr = addr;
            this.birth = birth;
            this.dept = dept;
            this.prof = prof;
        }

        // setter
        public void setHakbun(int hakbun) {
            this.hakbun = hakbun;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAddr(String addr) {
            this.addr = addr;
        }

        public void setDept(String dept) {
            this.dept = dept;
        }

        public void setProf(int prof) {
            this.prof = prof;
        }

        // getter
        public int getHakbun() {
            return hakbun;
        }

        public String getName() {
            return name;
        }

        public String getAddr() {
            return addr;
        }

        public String getBirth() {
            return birth;
        }

        public String getDept() {
            return dept;
        }

        public int getProf() {
            return prof;
        }

        // toString
        @Override
        public String toString() {
            String fmt = "%d %s %s %s %s %d\n";
            return String.format(fmt, hakbun, name, addr, birth, dept, prof);
        }
    }

    class Professor {
        private int prof;
        private String name;
        private String major;

        public Professor() {}

        public Professor(int prof, String name, String major) {
            this.prof = prof;
            this.name = name;
            this.major = major;
        }

        // setter
        public void setProf(int prof) {
            this.prof = prof;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setMajor(String major) {
            this.major = major;
        }

        public int getProf() {
            return prof;
        }

        public String getName() {
            return name;
        }

        public String getMajor() {
            return major;
        }

        @Override
        public String toString() {
            String fmt = "%d %s %s";
            return String.format(fmt, prof, name, major);
        }
    }