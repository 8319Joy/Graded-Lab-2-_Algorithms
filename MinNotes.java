package traveler;
import java.util.Arrays;
import java.util.Scanner;

public class MinNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the currency denominations (in random order), separated by spaces:");
        String denominationsInput = scanner.nextLine();
        String[] denominationStrings = denominationsInput.split("\\s+");
        int[] denominations = new int[denominationStrings.length];
        for (int i = 0; i < denominationStrings.length; i++) {
            denominations[i] = Integer.parseInt(denominationStrings[i]);
        }
        Arrays.sort(denominations);

        System.out.println("Enter the amount you want to pay:");
        int amount = scanner.nextInt();

        int minNotes = calculateMinNotes(denominations, amount);
        System.out.println("Minimum number of notes required: " + minNotes);

        scanner.close();
    }

    private static int calculateMinNotes(int[] denominations, int amount) {
        int notes = 0;
        int remainingAmount = amount;
        for (int i = denominations.length - 1; i >= 0; i--) {
            if (remainingAmount >= denominations[i]) {
                int count = remainingAmount / denominations[i];
                notes += count;
                remainingAmount -= count * denominations[i];
            }
        }
        return notes;
    }
}
