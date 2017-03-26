import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo1
{

    public static void main(String[] args)
    {
	// TODO Auto-generated method stub
	int count =0;
	Pattern p = Pattern.compile("ab");
	Matcher m = p.matcher("abbabbbaaaabbbbb");
	while(m.find())
	{
	    count++;
	    System.out.println(m.start()+".."+m.end()+"-->"+m.group());
	}
	System.out.println("Count is: "+count);
    }

}
