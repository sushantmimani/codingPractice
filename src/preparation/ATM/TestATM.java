package preparation.ATM;

public class TestATM {

    public static void main(String[] args) {
        ATMMachine atm = new ATMMachine();
        atm.insertCard();
        atm.insertPin(1234);
        atm.requestCash(2000);
        atm.insertCard();
        atm.insertPin(2345);
        atm.requestCash(1);
    }
}
