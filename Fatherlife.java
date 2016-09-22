
package interfaces;


public class Fatherlife implements Father {

    @Override
    public void money() {
        System.out.println("Father has a lot of money.");
    }

    @Override
    public void house() {
        System.out.println("Father has a big house.");
    }

    @Override
    public void car() {
        System.out.println("Father has an expensive car.");
    }

    @Override
    public void family() {
        System.out.println("Father has a beautiful family.");
    }
    
    public static void main(String[] args){
        Fatherlife fat = new Fatherlife();
        fat.money();
        fat.house();
        fat.car();
        fat.family();
    }
    
}
