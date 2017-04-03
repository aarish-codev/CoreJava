package buffered.Reader_Writer_Prog;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo
{

    public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub
	String path = "D:\\MyWork\\Eclipse Workspace for Java\\CoreJava\\JavaIOPackage\\buffered\\Reader_Writer_Prog\\";
	File f = new File(path,"abc.txt");
	System.out.println("File exists: "+f.exists());
	FileReader fr = new FileReader(f);
	
	BufferedReader br = new BufferedReader(fr);
	String line = br.readLine();
	while(line!=null){
	    System.out.println(line);
	    line=br.readLine();
	}
	    
	br.close();
    }	

}
