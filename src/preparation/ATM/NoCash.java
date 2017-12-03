package preparation.ATM;

public class NoCash implements ATMState {

    ATMMachine machine;

    public NoCash(ATMMachine obj){
        machine = obj;
    }
    @Override
    public void insertCard() {
        System.out.println("No cash in ATM");
    }

    @Override
    public void ejectCard() {
        System.out.println("No cash in ATM");

    }

    @Override
    public void insertPin(int pin) {
        System.out.println("No cash in ATM");

    }

    @Override
    public void requestCash(int cash) {
        System.out.println("No cash in ATM");

    }
}
