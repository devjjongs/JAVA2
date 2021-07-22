package use;

import poly.Duke;
import poly.서브클래스2;
import poly.클래스명2;

public class 클래스명1Use {
    public static void main(String[] args) {
        클래스명2 ref2 = new 서브클래스2();
        ref2.메소드이름2();

        ref2 = new Duke();
        ref2.메소드이름2();
    }
}
