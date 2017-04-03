package buffered.Reader_Writer_Prog;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo
{
    public static void main(String[] args) throws IOException{
	
    
    String path = "D:\\MyWork\\Eclipse Workspace for Java\\CoreJava\\JavaIOPackage\\buffered\\Reader_Writer_Prog\\";
    File f = new File(path,"abc.txt");
    FileWriter fw = new FileWriter(f);
    
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write("Hello");
    bw.newLine();
    bw.append('c');
    bw.write(100);
    bw.flush();
    bw.close();
//    fw.close(); Don't need to do explicitly
//    bw.close() will close fw automatically
    }
}
