import java.util.Scanner;

public class ExpenseTrackere {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first expense description: ");
        String description1 = sc.nextLine();

        System.out.print("Enter first expense amount: ");
        double amount1 = sc.nextDouble();
        sc.nextLine();

        Expense expense1 = new Expense(description1, amount1);

        System.out.print("Enter second expense description: ");
        String description2 = sc.nextLine();

        System.out.print("Enter second expense amount: ");
        double amount2 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter category: ");
        String category2 = sc.nextLine();

        System.out.print("Enter date (DD-MM-YYYY): ");
        String date2 = sc.nextLine();

        Expense expense2 =
                new Expense(description2, amount2, category2, date2);

        // Third Expense object
        Expense expense3 =
                new Expense("Transport", 300, "Transport", "24-05-2025");

        expense1.displayExpense();
        expense2.displayExpense();
        expense3.displayExpense();

        sc.close();
    }
}