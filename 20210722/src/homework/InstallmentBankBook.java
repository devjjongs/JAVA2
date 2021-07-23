package homework;

import java.io.IOException;

public class InstallmentBankBook extends BankBook {
    protected int monthlyDepositAmount; //월 입금액
    private static int count;
    protected double rate = 1.2;         //  이자율

    public InstallmentBankBook() {
        accountNum = String.format("%3d-04d", BankCode.INSTALLMENT_ACCOUNT, ++count);
    }

    @Override
    protected void input() {
        try {
            System.out.println("월 입금액? ");
            monthlyDepositAmount = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println(",나 특수문자 사용불가, 숫자만 입력");
            input();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void calc() {
        interest = (long) (total * rate);
//        total = ;
    }

    @Override
    public void output() {
//        System.out.println("고객명: " + custName + "님");
//        System.out.println("계좌번호: " + accountNum);
//        System.out.println("월 납입액: " + monthlyDepositAmount);
//        System.out.println("저축 기간: " + period + "년");
//        System.out.println("이자율: " + rate * 100 + "%");
//        System.out.println("이자: " + interest + "원");
//        System.out.println("만기수령액: " + total + "원");

        System.out.printf(
                "%8s%10s%10s%4s(년)%6s%10s%10s\n",
                "고객이름", "계좌번호", "월 입금액", "기간", "이율", "이자", "만기시환급금");
        System.out.printf(
                "%10s%10s%,10d%4d  %4.1f%% %,10d%,10d\n",
                custName, accountNum, monthlyDepositAmount, period, rate, interest, total);

    }
}
