package homework.bank_CGJ;

public class SavingBankAccount extends BankAccount {

    final double interest = 0.045;

    public void setAccount2() {
        System.out.println("이율 : " + interest * 100 + "%");
        System.out.println("연간 총 이자 : " + money * interest * period + " 원");
        System.out.println("환급액 : " + Math.round(money + (money * interest * period)) + " 원");
    }
}
