//	Using this to refer current class instance variables
public class Demo_this_keyword_1
{	
    static int a = 1;
    static int b = 2;
    
    @SuppressWarnings("static-access")
    public Demo_this_keyword_1(int a , int b) {
	 this.a = a;
	 this.b = b;
	 
    }
    
    public Demo_this_keyword_1() {
	
    }

    void display() {
	System.out.println("A="+a+" B="+b);
    }
    
    public static void main(String[] args) {
	// TODO Auto-generated method stub
//	Demo_this_keyword_1 obj = new Demo_this_keyword_1();
	
	Demo_this_keyword_1 obj = new Demo_this_keyword_1(10, 20);
	obj.display();
	System.out.println("A="+a);
	System.out.println("B="+b);
    }

}
