package function;

public class Function4 {

    public static void main(String[] args) {
        System.out.println(exchangeToUSD(7_00_000));
    }

    public static double exchangeToUSD (double rublesAmount) {
        if (rublesAmount > 0.0) {
            double usdAmount = rublesAmount / 83.0;
            return usdAmount;
        } else {
            System.out.println("Error");
            return 0.0;
        }
    }

}
