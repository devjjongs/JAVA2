package homework;

import java.io.IOException;

public class SavingsBankBook extends BankBookUse {
    protected int depositAmount; //입금액

    private static int count;

    public SavingsBankBook() {
        accountNum = String.format("%3d-%04d", BankCode.SAVING_ACCOUNT, ++count);
    }

    @Override
    public void input() {
        System.out.print("저축 금액? ");
        try {
            total = Long.parseLong(reader.readLine());
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
        depositAmount = (int) (total+interest);
    }

    @Override
    public void output() {
        System.out.println("고객명: " + custName + "님");
        System.out.println("계좌번호: " + accountNum);
        System.out.println("입금액: " + depositAmount);
        System.out.println("저축 기간: " + period + "년");
        System.out.println("이자율: " + rate * 100 + "%");
        System.out.println("이자: " + interest + "원");
        System.out.println("만기환급액: " + total + "원");
    }
}