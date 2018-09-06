
public class Demo_this_keyword_2
{
    int a;
    int b;
    
    public Demo_this_keyword_2() {
	
	this(10,20);
	
	System.out.println("Inside default constructor");
    }
    
    Demo_this_keyword_2(int a , int b) {
	this.a = a;
	this.b = b;
	System.out.println("Inside parameterized constructor");
    }
    @SuppressWarnings("unused")
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Demo_this_keyword_2 obj = new Demo_this_keyword_2();
    }

}
