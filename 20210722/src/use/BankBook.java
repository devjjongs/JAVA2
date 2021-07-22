package use;

import homework.InstallmentBankBook;
import homework.LoanBankBook;
import homework.SavingBankBook;

import java.util.Scanner;

public class BankBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingBankBook cust1 = new SavingBankBook();
        InstallmentBankBook cust2 = new InstallmentBankBook();
        homework.BankBook cust3 = new LoanBankBook();
        //계좌번호 자동생성부분
        System.out.println("업무 목록");
        System.out.println("1. 저축 | 2. 적금 | 3. 대출 | 4. 종료");
        System.out.print("업무 선택 : ");
        int selectNum = sc.nextInt();

        switch (selectNum) {
            case 1: //저축통장 선택
                cust1.baseInput();
                cust1.output();
                break;

            case 2: //적금통장 선택
                cust2.baseInput();
                cust2.output();
                break;

            case 3: //대출통장 선택
                cust3.baseInput();  //  binding
                cust3.output(); //  300-0005
                break;

            case 4: //프로그램 종료
                break;
        }
//        System.in == 키보드;
//        System.out == 모니터;
    }
}