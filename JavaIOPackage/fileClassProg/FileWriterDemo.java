package fileClassProg;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo
{

    public static void main(String[] args) throws IOException
    {
	// Constructor 1) 
	FileWriter fw = new FileWriter("abc.txt");
	fw.close();
	String path = "D:\\MyWork\\Eclipse Workspace for Java\\CoreJava\\JavaIOPackage\\fileClassProg";
	File f = new File(path,"abc.txt");
//	Constructor 2)
	FileWriter fw1 = new FileWriter(f);
	String str = "Hello";
	fw1.write(str);
	
	fw1.close();
    }

}
