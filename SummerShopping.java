import java.util.Scanner;

public class SummerShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int budget = Integer.parseInt(scan.nextLine());
        double towelPrice = Double.parseDouble(scan.nextLine());
        int discountPercent = Integer.parseInt(scan.nextLine());

        double umbrellaPrice = (towelPrice * 2) / 3;
        double flipFlopPrice = umbrellaPrice * 0.75;
        double bagPrice = (flipFlopPrice + towelPrice) / 3;

        double finalPrice = (towelPrice + umbrellaPrice + flipFlopPrice + bagPrice) * (1 - discountPercent / 100.0);
        double difference = Math.abs(finalPrice - budget);

        if (finalPrice <= budget) {
            System.out.println(String.format("Annie's sum is %.2f lv. She has %.2f lv. left.", finalPrice, difference));
        } else {
            System.out.println(String.format("Annie's sum is %.2f lv. She needs %.2f lv. more.", finalPrice, difference));
        }
    }
}
