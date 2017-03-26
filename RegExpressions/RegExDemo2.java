import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo2
{
//    Program to validate {10/11/12} digit Mobile Number
    public static void main(String[] args)
    {
	// TODO Auto-generated method stub
		
	Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
	// either 0 or 91 then digit b/w 7-9 then digit b/w 0-9{9 no of times}
	System.out.println("Enter mobile no");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();	// user input 
	Matcher m = p.matcher(s);
	if( (m.find()) && m.group().equals(s))
	{
	   System.out.println("Valid Mobile no");
	}
	else
	{    
	System.out.println("Invalid Number");
	}
	sc.close();
    }

}
// For email validation
// Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+[.][a-zA-Z]+)+");