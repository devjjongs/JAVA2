package iotest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReadTest {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream("20210722/20210722.dat");
            System.out.println("파일존재");
            objectInputStream = new ObjectInputStream(fileInputStream);
//          Object obj = objectInputStream.readObject();
            Member member = (Member) objectInputStream.readObject();
            System.out.println(member.toString()); // println, print 에서만 toString 생략 가능
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {  // 예외가 발생하던 발생하지 않던
            if (objectInputStream != null) objectInputStream.close();
            if (fileInputStream != null) fileInputStream.close();
        }
    }
}
