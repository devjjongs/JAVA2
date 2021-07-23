package statictest;

public class Test {
    public static void main(String[] args) {
        System.out.println(A.y);

        A instance의주소를참조하는변소ref1 = new A();
        A instance의주소를참조하는변소ref2 = new A();
        A instance의주소를참조하는변소ref3 = new A();
        A instance의주소를참조하는변소ref4 = new A();

//        instance의주소를참조하는변소ref1.x = 90;
//        System.out.println(instance의주소를참조하는변소ref4.x);   // 0 출력
//
//        instance의주소를참조하는변소ref2.y=789;   //  y에 대한 변수로 인식하기 떄문에 권장X
//        //A.y = 789; // 선언을 하려면 이런 식으로 선언
//        System.out.println(instance의주소를참조하는변소ref4.y);   // 789 출력

//        System.out.println(instance의주소를참조하는변소ref1.y + ":" + instance의주소를참조하는변소ref1.x);
//        System.out.println(instance의주소를참조하는변소ref2.y + ":" + instance의주소를참조하는변소ref2.x);
//        System.out.println(instance의주소를참조하는변소ref3.y + ":" + instance의주소를참조하는변소ref3.x);
//        System.out.println(instance의주소를참조하는변소ref4.y + ":" + instance의주소를참조하는변소ref4.x);

        System.out.println(instance의주소를참조하는변소ref1.y + ":" + instance의주소를참조하는변소ref1.x + ":" + instance의주소를참조하는변소ref1.x2);
        System.out.println(instance의주소를참조하는변소ref2.y + ":" + instance의주소를참조하는변소ref2.x + ":" + instance의주소를참조하는변소ref2.x2);
        System.out.println(instance의주소를참조하는변소ref3.y + ":" + instance의주소를참조하는변소ref3.x + ":" + instance의주소를참조하는변소ref3.x2);
        System.out.println(instance의주소를참조하는변소ref4.y + ":" + instance의주소를참조하는변소ref4.x + ":" + instance의주소를참조하는변소ref4.x2);
    }
}


