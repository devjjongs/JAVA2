package homework.bank_CGJ;

import java.util.Scanner;

public class Bank {
    Scanner scn = new Scanner(System.in);

    public void bankBookCreate() {
        System.out.println("통장 개설 메뉴\n[1] 저축 통장 [2] 적금 통장 [3] 대출 통장 [4] 종료");
        int num = scn.nextInt(); //속도 측면에서 대도록이면 문자열보다 숫자열 처리가 유리

        switch (num) {

            case 1:
                SavingBankAccount bank1 = new SavingBankAccount();
                bank1.setAccount();     //정적 바인딩
                bank1.setAccount2();
                break;
                //bankBookCreate(); 재기 반복문으로 실행 가능

            case 2:
                InstallmentBankAccount bank2 = new InstallmentBankAccount();
                bank2.setAccount();
                bank2.setAccount2();
                break;

            case 3:
                LoanBankAccount bank3 = new LoanBankAccount();
                bank3.setAccount();
                break;

            case 4:
                System.out.println("종료합니다.");
                break;
        }
    }
}
