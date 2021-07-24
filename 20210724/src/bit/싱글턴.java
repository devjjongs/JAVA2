package bit;

public class 싱글턴 {

    private static 싱글턴 instance참조변수;

    private 싱글턴() { // private 하게 만들었기 때문에 인스턴스 생성 불가
        System.out.println(this + "이 위치에 인스턴스 생성"); // 생성자 / @45ee12a7 위치의 해쉬코드 주소
    }

    public static 싱글턴 getInstance() {
        if (instance참조변수 == null) { // 만약 () 일때
            instance참조변수 = new 싱글턴();
        }
        return instance참조변수;
    }

    public void output() {
        System.out.println("이 메소드를 호출한 인스턴스의 주소: " + this + " output()~~~~~");
    }
}