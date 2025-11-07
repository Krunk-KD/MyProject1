import java.util.Scanner;

class Order {
    String drinkName;
    double basePrice;

    Order(String d, double b) {
        drinkName = d;
        basePrice = b;
    }

    void printBill(Scanner input) {
        double memberDiscount = .10;
        System.out.println("Are you a Cafe Member? (Y/N) ");
        String discount = input.nextLine();
        if (discount.equalsIgnoreCase("Y")) {
            double finalPrice = basePrice - (basePrice * memberDiscount);
            System.out.println("Drink: " + drinkName);
            System.out.println("Base Price: $ " + basePrice);
            System.out.println("Discount: " + memberDiscount * 100 +"%");
            System.out.println("Final Price: $ " + finalPrice);}
            else {
            double finalPrice = basePrice;
            System.out.println("Drink: " + drinkName);
            System.out.println("Base Price: $" + basePrice);
            System.out.println("Discount: 0%");
            System.out.println("Final Price: $" + finalPrice);

        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===Coffee Menu===");
        System.out.println("1. Espresso......$3.50");
        System.out.println("2. Latte.........$4.50");
        System.out.println("3. Cappuccino....$5.00");
        System.out.println("Enter your choice (1-3): ");

        int choice = input.nextInt();
        input.nextLine();

        Order o = null;

        switch(choice){
            case 1:
                o = new Order("Espresso", 3.50);
                break;
            case 2:
                o = new Order("Latte", 4.50);
                break;
            case 3:
                o = new Order("Cappuccino", 5.00);
                break;
            default:
                System.out.println("Invalid Entry");
        }

        o.printBill(input);

    }
}