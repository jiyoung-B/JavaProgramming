package examples;

import java.util.Scanner;

public class EX05 {

    public static void main(String[] args) {
        // 특정년도에 윤년여부를 출력
        // 조건1 : 4로 나눠 떨어지고, 100으로는 나눠 떨어지지 않으면 윤년
        // 조건2 : 400으로 나눠 떨어지면 윤년

        // ex) 1988, 2000, 2008, 2020 : 윤년
        //     1900, 2100, 2022 : 평년

        int year = 2024;
        if( (year % 4 == 0 && year % 100 !=0) || year % 400 ==0){
            System.out.println("윤년입니다");
        }
        else System.out.println("윤년이 아닙니다.");

        // ex) 아이디와 비밀번호를 이용해서
        // 로그인 기능 구현하기

        String userid = "abc123";
        String passwd = "987xyz";
        Scanner sc = new Scanner(System.in);
        System.out.print("이름은 ?");
        String uid = sc.next();
        System.out.print("비번은 ?");
        String pwd = sc.next();

        //  if((userid == "abc123") && (passwd == "987xyz")){ // (x)
        // if (uid.equals("abc123") && pwd.equals("987xyz")){
        // if (uid.equals(userid) && pwd.equals(passwd)){
        if (userid.equals(uid) && passwd.equals(pwd)){
            System.out.println("로그인 is oK");
        } else {
            System.out.println("로그인 실패");
        }
    }
}
