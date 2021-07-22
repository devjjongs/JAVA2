package homework.bank_CGJ;

public class InstallmentBankAccount extends BankAccount {

    final double interest = 0.012;

    public void setAccount2() {
        System.out.println("이율 : " + interest * 100 + "%");
        System.out.println("월간 이자 : " + (money * interest * period * 12) + " 원");
        System.out.println("환급액 : " + Math.round((money * 12 + (money * interest * (period * 12) * 12))) + " 원");
    }
}
