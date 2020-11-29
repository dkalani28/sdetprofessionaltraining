package core_java.Basic_OOPS;

public class OverloadingExample {
    
    float perimeter;
    
    void calculatePerimeter(int a)
    {
        perimeter=4*a;
        System.out.println("The perimeter of the square is " + perimeter);
    }
    
    void calculatePerimeter(int a, int b)
    {
        perimeter= (2*a)+(2*b);
        System.out.println("The perimeter of the rectangle is " + perimeter);
    }
    
    float calculatePerimeter(int a, int b, int c)
    {
        perimeter= a+b+c;
        System.out.println("The perimeter of the triangle is " + perimeter);
        
        return perimeter; //last line in the method : return to main() or the calling function()
        
    }

    public static void main(String[] args) 
    {
        // TODO Auto-generated method stub
        
    	OverloadingExample p= new OverloadingExample();
        p.calculatePerimeter(2);
        p.calculatePerimeter(2, 3);
        float result = p.calculatePerimeter(2, 3, 4);
        
    }

}
