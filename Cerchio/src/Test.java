
public class Test {
    public static void main(String[] Args){
        Cerchio c1;
        Cerchio c2;
        c1 = new Cerchio();
        c2 = new Cerchio(10);
        c1.setRaggio(5);
        System.out.println("Area: " + c1.GetArea());
        System.out.println("Area2: " + c2.GetArea());

    }
}
