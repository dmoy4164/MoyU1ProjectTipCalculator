import java.util.Scanner;
public class tip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //asks for bill value//
        System.out.print("What's the bill? ");
        double bill = scanner.nextDouble();

        //asks for tip percentage value//
        System.out.print("Tip percentage? ");
        double tipPercent = scanner.nextDouble();

        //asks for amount of people//
        System.out.print("How many people? ");
        int people = scanner.nextInt();

        //calculates the tip, total bill, tip per person, and bill per person//
        double tip = bill * (tipPercent / 100.0);
        double totalBill = bill + tip;
        double tipPerPerson = tip / people;
        double billPerPerson = totalBill / people;

        //rounds the values and then prints the results//
        System.out.println("The total tip amount is $" + String.format("%.2f", tip));
        System.out.println("The total bill is $" + String.format("%.2f" , totalBill));
        System.out.println("The tip per person is $" + String.format("%.2f", tipPerPerson));
        System.out.println("The total amount per person is $" + String.format("%.2f", billPerPerson));


    }
}
