package jy;

import java.io.*;

public class J25File {
    // 직렬화/역직렬화
    // JVM 내에 생성된 자바 객체 또는 데이터를
    // JVM 외부에서 사용할 수 있도록 바이트 형태로 변환하는 행위
    public static void main(String[] args) {
    // 학생 객체 생성
    Student2 std01 = new Student2(201350050, "김태희", "경기도 고양시", "1985.3.22", "컴퓨터", 504);

    // 직렬화 마샬링
        String fname = "c:/Java/student.obj";
    //ObjectOutputStream baos = null;
        FileOutputStream fos = null;         // 파일저장용
        ObjectOutputStream oos = null;       // 직렬화용

    try {
        fos = new FileOutputStream(fname);
        oos = new ObjectOutputStream(fos);

        oos.writeObject(std01); // 객체를 파일에 저장

    } catch(Exception ex){
       ex.getMessage();
    } finally {
        if (oos != null) {
            try {
                oos.close();
            } catch (Exception ex) {
               ex.getMessage();
            }
        }
        if (fos != null) {
            try {
                fos.close();
            } catch (Exception ex) {
               ex.getMessage();
            }
        }
    }

    // 역직렬화
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        Student2 readOne = null;
        try {
            fis = new FileInputStream(fname);
            ois = new ObjectInputStream(fis);

            // 파일에 저장된 내용을 객체로 읽어옴
            readOne = (Student2) ois.readObject();

        } catch (Exception ex) {
            ex.getMessage();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (Exception ex) {

                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (Exception ex) {

                }
            }
        }

        System.out.println(readOne.hakbun);
        System.out.println(readOne.prof);
        System.out.println(readOne);

    }
}

class Student2 implements Serializable{
    int hakbun;
    String name;
    String addr;
    String birth;
    String dept;
    int prof;

    public Student2(int hakbun, String name, String addr, String birth, String dept, int prof) {
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
