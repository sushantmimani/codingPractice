package preparation;

import java.util.Arrays;

public class CurrencyArbitrage {

    static int[] arbitrage(String[] quotes) {
        int result[] = new int[quotes.length];
        double usdToeur = Double.parseDouble(quotes[0]);
        double eurTogbp = Double.parseDouble(quotes[1]);
        double gbpTousd = Double.parseDouble(quotes[2]);
        double x = 100000/usdToeur;
        double y = x/eurTogbp;
        double z = y/gbpTousd;
        int profit = (int)Math.round(z);
        System.out.println(profit);
        return result;

    }


    public static void main(String[] args) {
        String[] quotes = {"0.1837","1.3829","0.6102"};
        int[] result = arbitrage(quotes);
    }
}
