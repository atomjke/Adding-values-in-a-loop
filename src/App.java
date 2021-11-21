import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int inputNumber, sum = 0;

        System.out.println("I will add up the numbers you give me.");
        System.out.print("Number: ");

        inputNumber = input.nextInt();

        while (inputNumber != 0) {
            sum += inputNumber;

            System.out.println("The total so far is " + sum + ".");
            System.out.print("Number: ");

            inputNumber = input.nextInt();
        }
        
        input.close();

        System.out.println("The total is " + sum + ".");
    }
}