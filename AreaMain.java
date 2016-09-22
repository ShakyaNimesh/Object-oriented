

package function.overloading;

public class AreaMain{ 
    public AreaMain(){    
AreaFormula foc = new AreaFormula ();
    int square = foc.area (4);
    int rectangle = foc.area(4, 5);
    System.out.println("The area of square= " + square + "sq.m");
    System.out.println("The area of rectangle= " + rectangle + "cubic.m");
    
    }
public static void main (String args[]) {
    new AreaMain();
    
}

    
}

