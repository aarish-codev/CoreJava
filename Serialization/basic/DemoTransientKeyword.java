package basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DemoTransientKeyword
{
    public static void main(String[] args) throws Exception{
	DemoTransient demoTransient = new DemoTransient();
	
	FileOutputStream fos = new FileOutputStream("test.xyz");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(demoTransient);
	
	FileInputStream fis = new FileInputStream("test.xyz");
	ObjectInputStream ois = new ObjectInputStream(fis);
	DemoTransient demo = (DemoTransient)ois.readObject();
	
	System.out.println(demo.i);
	System.out.println(demo.j);	
    }
}

class DemoTransient implements Serializable{
    int i =10;
    // as transient so doesn't takes part in serialization and on de-serializing sets it to default value, i.e 0
    transient int j = 5;
	
}