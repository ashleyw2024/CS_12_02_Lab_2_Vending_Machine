import java.util.*;

public class VendingMachine
{
    ArrayList<Cappuccino> cappuccinos = new ArrayList();
    ArrayList<Latte> lattes;
    ArrayList<Espresso> espresso;


    public void addCap(Cappuccino cap)
    {
        //System.out.println("Is cap null? : " + cap);
        cappuccinos.add(cap);
    }
}