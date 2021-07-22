package homework;

import java.io.IOException;

public class LoanBankBook extends BankBook {
    protected int monthlyPaidAmount; //월 상환금

    private static int count;   //static 을 이용하여 인스턴스 하나씩 적용

    public LoanBankBook() {
        //accountNum = "300-" + ++count;    //300-0001 에 대한 BankCode interface
        accountNum = String.format("%3d-%04d", BankCode.LOAN_ACCOUNT, ++count);
        rate = 0.078;
    }

    @Override
    public void input() {
        //Exception 존재 하지 않는다고 설정하지 않기
        System.out.print("대출금액? ");
        try {
            total = Long.parseLong(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println(",나 특수문자 사용하지 마시고 숫자만 입력");
            input();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void calc() {
        interest = (long) (period*total*rate);
        monthlyPaidAmount = (int) ((total + interest)/(period*12));
    }

    @Override
    public void output() {
        System.out.println("고객명: " + custName + "님");
        System.out.println("계좌번호: " + accountNum);
        System.out.println("대출금액: " + total + "원");
        System.out.println("상환 기간: " + period + "년");
        System.out.println("이자율: " + rate * 100 + "%");
        System.out.println("이자: " + interest + "원");
        System.out.println("월 납입금액: " + monthlyPaidAmount + "원");
    }
}