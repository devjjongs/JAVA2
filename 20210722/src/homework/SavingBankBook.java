package homework;

import java.io.IOException;

public class SavingBankBook extends BankBook {
    protected int depositAmount;

    private static int count;

    public SavingBankBook() {
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

    }

    @Override
    public void output() {
        System.out.println("고객명: " + custName);
        System.out.println("저축 기간: " + period);
        System.out.println("저축 총액: " + total);
        System.out.println("계좌번호: " + accountNum);
    }

}
