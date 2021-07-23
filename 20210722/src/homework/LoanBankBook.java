package homework;

import java.io.IOException;

public class LoanBankBook extends BankBook {
    protected int monthlyPaidAmount;    //월 상환금
    private static int count;            //static 을 이용하여 인스턴스 하나씩 적용
    protected double rate = 7.8;              //  이자율

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
        //interest = (long) (period*total*rate);
        //monthlyPaidAmount = (int) ((total + interest)/(period*12));
        //(10000 + (10000*10/100))/(N*12)
        monthlyPaidAmount = (int) ((total + (total * rate / 100)) / (period * 12));
    }

    @Override
    public void output() {
        System.out.println("고객명: " + custName + "님");
        System.out.println("계좌번호: " + accountNum);
        System.out.println("대출금액: -" + total + "원");
        System.out.println("상환 기간: " + period + "년");
        System.out.println("이자율: " + rate * 100 + "%");
        System.out.println("이자: " + interest + "원");
        System.out.println("월 납입금액: " + monthlyPaidAmount + "원");

//        고객이름      계좌번호        입금액     기간  이율      이자      만기환급금(월납입금)
//        김말자       100-0001     10000000     1   4.5%

        System.out.printf(
                "%10s%10s%10s%4s%6s%10s%10s\n",
                "", "고객이름", "계좌번호", "대출출금", "기간", "이율", "이자", "월 납입금");
        System.out.printf(
                "%");
    }
}