package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class BankBook {
    protected String custName;      //  고객이름
    protected String accountNum;    //  계좌번호
    protected int period;           //  기간
    protected double rate;          //  이자율
    protected long interest;        //  이자액
    protected long total;           //  총 환급액

    protected BufferedReader reader;

    public void baseInput() {       //  입력
        if (reader == null) {
            reader = new BufferedReader(
                    new InputStreamReader(System.in));
        }//if(reader == null) true 구문의 종료부분

        /**
         저축 관련 입력, 대출, 적금 동일하게 받을 자리가 존재
         고객이름 : 김말자
         입금액 : 10000000
         기간(연단위) : 1
         **/

        System.out.print("고객 이름은? ");
        try {
            custName = reader.readLine();
            //sub 클래스에서 override한 메소드를 호출하도록 만들어준다

            //각자 다르게 입력
            input();
            System.out.print("기간은(년 단위)? ");
            period = reader.read() - 48;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected abstract void input();

    public abstract void calc();       //  연산

    public abstract void output();      //  출력
}
