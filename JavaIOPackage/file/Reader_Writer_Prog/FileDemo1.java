package file.Reader_Writer_Prog;

import java.io.File;
import java.io.IOException;

public class FileDemo1
{

    public static void main(String[] args) throws IOException
    {
	File f =  new File("D:\\MyWork\\Eclipse Workspace for Java\\CoreJava\\JavaIOPackage\\file\\Reader_Writer_Prog\\abc.txt");
//	This won't create a new file. Just a file object
	System.out.println(f.exists());
	f.createNewFile();
//	Now the file will be created
	System.out.println(f.exists());
    }

}
