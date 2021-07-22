package homework.bank_CGJ;

public class LoanBankAccount extends BankAccount {

    final double interest = 0.078;

    public void setAccount() {
        System.out.println("대출통장 정보 입력");
        System.out.print("고객명 : ");
        name = scn.nextLine();
        System.out.print("대출액 : ");
        money = scn.nextInt();
        System.out.print("기간 : ");
        period = scn.nextInt();

        System.out.println("대출통장이 개설되었습니다.");

        System.out.println("고객명 : " + name);
        System.out.println("계좌번호 : 0" + accountNum1 + "-0" + accountNum2);
        System.out.println("대출액 : " + money + " 원");
        System.out.println("기간 : " + period + " 년");
        System.out.println("금리 : " + interest * 100 + "%");
        System.out.println("월 상환액 : " + Math.round((money * interest * period) / 12) + " 원");
    }
}
