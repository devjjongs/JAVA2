package use;

import bit.싱글턴;

import java.util.Calendar;

public class Test {

    public static void main(String[] ags) {
//        싱글턴 ref = new 싱글턴();
//        ref.output();

        //= new Calendar(); abstract 하기 떄문에 사용 불가
        Calendar today = Calendar.getInstance();

        싱글턴 ref2 = 싱글턴.getInstance();
        ref2.output();

        싱글턴 ref3 = 싱글턴.getInstance();
        ref3.output();

        싱글턴 ref4 = 싱글턴.getInstance();
        ref4.output();
    }
}
