package homework.bank_CGJ;

import java.util.Scanner;

/**
 * 신규 계좌개설의 기초 클래스
 *
 */
public class BankAccount {
    protected String name;  // 고객명
    protected int accountNum1 = (int) (Math.random() * 99);     //counting
    protected int accountNum2 = (int) (Math.random() * 999);    //counting
    protected int money;    //  총금액, 만기시 환급금
    protected int period;   //  기간

    Scanner scn = new Scanner(System.in);

    public void setAccount() {
        System.out.println("통장 정보 입력");
        System.out.print("고객명 : ");
        name = scn.nextLine();
        System.out.print("입금액 : ");
        money = scn.nextInt();
        System.out.print("기간 : ");
        period = scn.nextInt();

        System.out.println("통장이 개설되었습니다.");

        System.out.println("고객명 : " + name);
        System.out.println("계좌번호 : 0" + accountNum1 + "-0" + accountNum2);
        System.out.println("입금액 : " + money + " 원");
        System.out.println("기간 : " + period + " 년");

    }
}


