package use;

import homework.BankBook;
import homework.InstallmentBankBook;
import homework.LoanBankBook;
import homework.SavingsBankBook;

import java.util.Scanner;

/*
 * init() -->
 * 신규통장을 만듭니다. 원하는 번호를 누르세요
 * 1. 저축 2. 적금 3. 대출 0. 종료 선택하고 BankBookk 으로 클래스들이 실행될 수 있도록 하고
 * 처리할 수 있는 메소드를 호출
 *
 * main 메소드 에서는 단순히 프로젝트 RUN 을 하기 위해 BankBookApp 의 init 을 호출하도록
 * */

public class BankBookApp {
    private Scanner in = new Scanner(System.in); //대도록이면 private Scanner in; 형식이 좋음

    public void init() {
        System.out.println("신규통장을 만듭니다. 원하는 번호를 0~3 사이의 수를 누르세요 \n 1.저축  2.적금  3.대출  0.종료");
        BankBook bankBook = null;
        switch (in.nextInt()) {
            case 1:
                bankBook = new SavingsBankBook();
                break;

            case 2:
                bankBook = new InstallmentBankBook();
                break;

            case 3:
                bankBook = new LoanBankBook();
                break;

            case 0:
                System.out.println("프로그램을 종료합니다.");
                System.exit(0); // 웹프로그램에서는 WAS 자체가 종료될 수 있기 떄문에 사용 XXXX
                return;

            default:
                System.out.println("프로그램을 처음부터 시작합니다. 알맞은 번호를 입력하세요");
                init();
        }
        bankBookCreateProcess(bankBook);
        init();
    }   //init() end

//    public void bankBookCreateProcess(LoanBankBook bankBook) {
//        bankBook.baseInput();
//        bankBook.output();
//    }
//
//    public void bankBookCreateProcess(SavingsBankBook bankBook){
//        bankBook.baseInput();
//        bankBook.output();
//    }

    public void bankBookCreateProcess(BankBook bankBook) {
        bankBook.baseInput();
        bankBook.output();
    }

    public static void main(String[] args) {
//        init();
        BankBookApp app = new BankBookApp();
        app.init();
    }
}
