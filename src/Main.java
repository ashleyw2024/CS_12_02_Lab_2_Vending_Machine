import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String userInput = sc.next();

        VendingMachine vend = new VendingMachine();

        Cappuccino capp1 = new Cappuccino();
        Cappuccino capp2 = new Cappuccino();
        Cappuccino capp3 = new Cappuccino();

        vend.addCap(capp1);

        System.out.println(userInput);

    }
}