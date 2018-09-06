package printWriter_Prog;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@SuppressWarnings("unused")
public class PrintWriterDemo
{
    public static void main(String[] args) throws IOException {
	String path="D:\\MyWork\\Eclipse Workspace for Java\\CoreJava\\JavaIOPackage\\printWriter_Prog";
	File f = new File(path,"abc.txt");
	
//	FileWriter fw1= new FileWriter(f);
//	PrintWriter pw1 = new PrintWriter(fw1);
	
	PrintWriter pw = new PrintWriter(f);
	pw.println("Hello");
	pw.println('I');
	pw.println(true);
	pw.println(10.00);
	
	pw.println(100); // int value 100 will be added to file directly
	pw.write(100); 	// Will add 'd' to the file
	pw.flush();
	pw.close();
	}
}
