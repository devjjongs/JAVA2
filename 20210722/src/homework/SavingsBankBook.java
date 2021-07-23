package homework;

import java.io.IOException;

public class SavingsBankBook extends BankBook {
    protected int savingsAmount; //입금액
    private static int count; // 기초 클래스로 빼면? 2021.07.23 확인 필요
    protected double rate = 4.5;              //  이자율


    public SavingsBankBook() {
        accountNum = String.format("%3d-%04d", BankCode.SAVINGS_ACCOUNT, ++count);
    }

    @Override
    public void input() {
        System.out.print("저축금액? ");
        try {
            savingsAmount = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println(",나 특수문자 사용불가, 숫자만 입력");
            input();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("예상치 못한 오류 발생 " + e.getMessage());
            input();
        }
    }

    @Override
    public void calc() {
//        interest = (long) (total * rate);
//         =(int) (total + interest);
        //원금 + (원금*이자율/100)*기간
        total = savingsAmount + (long)(savingsAmount * rate / 100) * period;
    }

    @Override
    public void output() {
//        System.out.println("고객명: " + custName + "님");
//        System.out.println("계좌번호: " + accountNum);
//        System.out.println("입금액: " +);
//        System.out.println("저축 기간: " + period + "년");
//        System.out.println("이자율: " + rate * 100 + "%");
//        System.out.println("이자: " + interest + "원");
//        System.out.println("만기환급액: " + total + "원");

//        고객이름      계좌번호        입금액     기간  이율      이자      만기환급금
//        김말자       100-0001     10000000     1   4.5%
    }
}