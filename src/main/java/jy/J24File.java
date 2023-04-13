package jy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class J24File {
    public static void main(String[] args) {
        // 학번,이름,주소,생년월일,학과명,교수등으로
        // 구성된 객체 데이터를 students.dat에

        // 학생 객체 생성
        Student std01 = new Student(201350050, "김태희", "경기도 고양시", "1985.3.22", "컴퓨터", 504);

        // 학생정보 저장용 파일 지정
        String fname = "c:/Java/students.dat";
        System.out.println(std01);

        // 학생정보 파일에 저장
        FileWriter fw = null;
        try {
            fw = new FileWriter(fname);

            fw.write(std01.toString());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }

        }

        // 파일에 저장된 학생정보를 읽어서 변수(stdinfo)에 저장
        BufferedReader br = null;
        FileReader fr = null;
        String stdinfo = "";
        try {
            fr = new FileReader(fname);
            br = new BufferedReader(fr);
            while (br.ready()) {
                stdinfo = br.readLine();
            }
                // System.out.println(br.readLine());

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (br != null){
                try {
                    br.close();
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
            if (fr != null){
                try {
                    fr.close();
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }


        // 변수에 저장된 학생정보 출력 1
        System.out.println(stdinfo);

        // 변수에 저장된 학생정보 출력 2
        String[] info = stdinfo.split("[ ]");
        System.out.println("학번 : " + info[0]);
        System.out.println("학번 : " + info[1]);
        System.out.println("이름 : " + info[2]);
        System.out.println("주소 : " + info[3] + info[4]);
        System.out.println("생년월일 : " + info[5]);
        System.out.println("학과 : " + info[6]);
        System.out.println("교수 : " + info[7]);
    }
}

class Student {
    int hakbun;
    String name;
    String addr;
    String birth;
    String dept;
    int prof;

    public Student(int hakbun, String name, String addr, String birth, String dept, int prof) {
        this.hakbun = hakbun;
        this.name = name;
        this.addr = addr;
        this.birth = birth;
        this.dept = dept;
        this.prof = prof;
    }

    @Override
    public String toString() {
        String fmt = " %d %s %s %s %s %d\n";
        return String.format(fmt, hakbun, name, addr, birth, dept, prof);
    }
}