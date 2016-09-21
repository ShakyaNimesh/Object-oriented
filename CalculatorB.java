

package homework;


public class CalculatorB extends Calculator{
    public void volume(int b, int c, int d){
    a= b * c * d;
    System.out.println("The volume of the room is" + " "+ a + "cubic m");
    
}
    public static void main(String[] args){
        int height=10, length=20, breadth=30;
        CalculatorB cal= new CalculatorB();
        cal.area(length, breadth);
        cal.volume(height, length, breadth);
    }
    
}
