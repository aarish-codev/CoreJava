package basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DemoSerialization
{
    public static void main(String[] args) throws Exception{
	 Demo d = new Demo();
	 FileOutputStream fos = new FileOutputStream("demo.abc");
	 ObjectOutputStream oos = new ObjectOutputStream(fos);
	 oos.writeObject(d);
	 System.out.println("OOS object:"+oos);
	 
	 FileInputStream fis = new FileInputStream("demo.abc");
	 ObjectInputStream ois = new ObjectInputStream(fis);
	 Demo d1 = (Demo) ois.readObject();
	 System.out.println(d1.i);
	 System.out.println(d1.j);
	
    }
}

class Demo implements Serializable{
	int i =10;
	int j = 5;
}