import java.util.Scanner;

public class PayMoneyTransactions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the daily target
        System.out.print("Enter the daily target amount: ");
        int target = scanner.nextInt();
        
        // Input the number of transactions
        System.out.print("Enter the number of transactions: ");
        int numTransactions = scanner.nextInt();
        
        // Input the list of transactions
        int[] transactions = new int[numTransactions];
        System.out.println("Enter the list of transactions:");
        for (int i = 0; i < numTransactions; i++) {
            transactions[i] = scanner.nextInt();
        }
        
        // Check if the target is achievable
        int sum = 0;
        int transactionNumber = 0;
        for (int i = 0; i < numTransactions; i++) {
            sum += transactions[i];
            transactionNumber++;
            if (sum >= target) {
                System.out.println("Target achieved at transaction number: " + transactionNumber);
                break;
            }
        }
        
        if (sum < target) {
            System.out.println("Target is not achievable.");
        }
        
        scanner.close();
    }
}
