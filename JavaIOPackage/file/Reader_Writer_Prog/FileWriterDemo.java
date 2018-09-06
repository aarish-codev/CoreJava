package file.Reader_Writer_Prog;

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
	String path = "D:\\MyWork\\Eclipse Workspace for Java\\CoreJava\\JavaIOPackage\\File\\Reader_Writer_Prog";
	File f = new File(path,"abc.txt");
//	Constructor 2)
	FileWriter fw1 = new FileWriter(f);
//	String str = "Hello\n";
//	fw1.write(str);
	fw1.close();
//	Above 2 constructors will override existing data present in file
	
//	Below 2 constructors will append existing data present in file
	FileWriter fw2 = new FileWriter("abc.txt", true);
	
	FileWriter fw3 = new FileWriter(f,true);	// to append instead of overwrite
	fw3.write("Hi");
	fw3.write("\r\n");
	fw3.write("nice");
	fw3.write("\r Meeting");
	
	fw3.flush();
	fw2.close();
	fw3.close();
	
    }

}
