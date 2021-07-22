package homework;

import java.io.IOException;

public class LoanBankBook extends BankBook {
    protected int monthlyPaidAmount;

    private static int count;   //static 을 이용하여 인스턴스 하나씩 적용

    public LoanBankBook() {
        //accountNum = "300-" + ++count;    //300-0001 에 대한 BankCode interface
        accountNum = String.format("%3d-%04d", BankCode.LOAN_ACCOUNT, ++count);
    }

    @Override
    public void input() {
        //Exception 존재 하지 않는다고 설정하지 않기
        System.out.println("대출금액? ");
        try {
            total = Long.parseLong(reader.readLine());
        }catch (NumberFormatException e) {
            System.out.println(",나 특수문자 사용하지 마시고 숫자만 입력");
            input();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void calc() {

    }

    @Override
    public void output() {
        System.out.println(accountNum);
        System.out.println(period);
        System.out.println(total);
        System.out.println(accountNum);
    }
}