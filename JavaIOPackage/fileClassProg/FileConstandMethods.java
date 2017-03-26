package fileClassProg;

import java.io.File;
import java.io.IOException;

public class FileConstandMethods
{

    public static void main(String[] args) throws IOException
    {
	// 1) File f = new File(dir_path, File name);
	String path = "D:\\MyWork\\Eclipse Workspace for Java\\CoreJava\\JavaIOPackage\\fileClassProg";
	File f = new File(path,"abc.txt");
	f.createNewFile();
	System.out.println(f.exists());
	File f1 = new File(path, "demo");
	
//	To create a new directory "demo" in path
	f1.mkdir();
	
//	Constructor 2) To create a file inside f1 reference(dir)
	File f2 = new File(f1,"abc.txt");
	f2.createNewFile();
	
//	Returns true if f1 is file
	System.out.println(f2.isFile());
	
//	Returns true if f1 is directory
	System.out.println(f1.isDirectory());
	System.out.println(f2.isDirectory());
	String[] s = f2.list();
	System.out.println(s);
	long l = f2.length();
	System.out.println(l);
	
//	To display all files/folders in a path	
	File f3 = new File("C:\\");
	String[] s1 = f3.list();
	int count = 0;
	for(String ss:s1)
	{
	    count++;
	    System.out.println(ss);
	}
	System.out.println("Total file/folders are: "+count);
	System.out.println("---------------------------------------------");
	
//	To display only file\folder names in path
	File f4 = new File("C:\\");
	String[] s2 = f3.list();
	int count1 = 0;
	for(String sss:s2)
	{
	    File ff1 = new File(f4,sss);
	    if(ff1.isFile())	
//	    if(ff1.isDirectory())
	    {
	    count1++;
	    System.out.println(sss);
	    }
	}
	System.out.println("Total files are: "+count1);
	System.out.println("----------------------------------------------");
	
//	System.out.println(f2.delete());
    }

}
