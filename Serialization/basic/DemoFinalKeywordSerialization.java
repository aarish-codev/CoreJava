package basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DemoFinalKeywordSerialization
{
        public static void main(String[] args) throws Exception{
        TestFinal obj = new TestFinal();
    	FileOutputStream fos = new FileOutputStream("test.txt");
    	ObjectOutputStream oos = new ObjectOutputStream(fos);
    	oos.writeObject(obj);
    	
    	FileInputStream fis = new FileInputStream("test.txt");
    	ObjectInputStream ois = new ObjectInputStream(fis);
    	TestFinal obj1 = (TestFinal)ois.readObject();
    	
    	System.out.println(obj1.i);
    	System.out.println(obj1.j);
    	System.out.println(obj1.k);
    	System.out.println(obj1.l);
    	System.out.println(obj1.m);
        }
    }

class TestFinal implements Serializable{
    int i=10;
    static int j = 20;
    transient static int k = 30;
    final int l = 40;
    transient final int m = 50;
}