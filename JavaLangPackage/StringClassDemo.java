
public class StringClassDemo
{
//    There are 5 constructors
    
    String s1 = new String();
    String s2 = new String("Hello to String Class");
    
    StringBuffer sb = new StringBuffer("Hi from SB");
    String s3 = new String(sb);// Takes StringBuffer Argument
    
    char[] ch={'a','b','c'};
    String s4 = new String(ch);
    
    byte[] b={97,98,99,100,101};
    String s5 = new String(b);
    
    
    public static void main(String[] args)
    {
	// TODO Auto-generated method stub
	StringClassDemo obj = new StringClassDemo();
	System.out.println("\tSTRING CONSTRUCTORS");
	System.out.println("Empty constructor: "+obj.s1);
	System.out.println("String literal Constructor: "+obj.s2);
	System.out.println("StringBuffer arg Constructor: "+obj.s3);
	System.out.println("Char[] arg Constructor: "+obj.s4);
	System.out.println("Byte[] arg Constructor: "+obj.s5);
	System.out.println("-------------------------------------");
	
	System.out.println("\tSTRING Methods");
	System.out.println("1)char charAt(int index): "+obj.s2.charAt(1));
	System.out.println("2)String concat(String s): "+obj.s1.concat("hey"));
	System.out.println("3)boolean equals(Object o): "+obj.s1.equals(obj.s1));
	System.out.println("4)boolean equalsIgnoreCase(String s): "+obj.s1.equalsIgnoreCase(""));
	System.out.println("5.1)String substring(int begin): "+obj.s2.substring(5));
	System.out.println("5.2)String substring(int begin, int end): "+obj.s2.substring(5,15));
	System.out.println("6)int length(): "+obj.s2.length());
	System.out.println("7)String replace(char old, char new)[case-sensitive]: "+obj.s2.replace('H', 'C'));
	System.out.println("8.1)String toLowerCase(): "+obj.s4.toLowerCase());
	System.out.println("8.2)String toUpperCase(): "+obj.s4.toUpperCase());
	System.out.println("9)String trim() "+obj.s2.trim());
	System.out.println("10)int indexOf(char ch):"+obj.s3.indexOf('i'));
	System.out.println("11)int lastIndexOf(char ch):"+obj.s3.lastIndexOf('B'));
    }

}
