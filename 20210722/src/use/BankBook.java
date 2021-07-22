package use;

import homework.LoanBankBook;

public class BankBook {
    public static void main(String[] args) {
        //계좌번호 자동생성부분
        LoanBankBook cust1 = new LoanBankBook();
        LoanBankBook cust2 = new LoanBankBook();
        LoanBankBook cust3 = new LoanBankBook();
        LoanBankBook cust4 = new LoanBankBook();
        homework.BankBook cust5 = new LoanBankBook();

        cust5.baseInput();  //  binding

        cust5.output(); //  300-0005


//        System.in == 키보드;
//        System.out == 모니터;
    }
}