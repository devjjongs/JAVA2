package use;

import homework.InstallmentBankBook;
import homework.LoanBankBook;
import homework.SavingsBankBook;

import java.util.Scanner;

public class BankBookUse {
    public static void main(String[] args) {

        //계좌번호 자동생성부분
        SavingsBankBook savingsBankBook1 = new SavingsBankBook(); //저축통장 생성
        savingsBankBook1.baseInput();
        savingsBankBook1.output();

        homework.BankBook savingsBankBook2 = new SavingsBankBook();
        savingsBankBook2.baseInput();
        savingsBankBook2.output();
//
//        InstallmentBankBook cust2 = new InstallmentBankBook();  //적금통장 생성
//        cust2.baseInput();
//        cust2.output();

        homework.BankBook cust3 = new LoanBankBook();   //대출통장 생성
        cust3.baseInput();  //  binding
        cust3.output(); //  300-0005

//        System.in == 키보드;
//        System.out == 모니터;
    }
}