package basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DemoStaticKeywordSerialization
{
    public static void main(String[] args) throws Exception{
	Test obj = new Test();
	FileOutputStream fos = new FileOutputStream("a.txt");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(obj);
	
	FileInputStream fis = new FileInputStream("a.txt");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Test obj1 = (Test)ois.readObject();
	
	System.out.println(obj.i);
	System.out.println(obj.j);
	System.out.println(obj.k);
    }
}

class Test implements Serializable{
    int i=10;
    static int j = 20;
    transient static int k = 30;
}
