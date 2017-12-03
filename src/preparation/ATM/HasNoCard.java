package preparation.ATM;

public class HasNoCard implements ATMState {

    ATMMachine machine;

    public HasNoCard(ATMMachine obj){
        machine = obj;
    }
    @Override
    public void insertCard() {
        System.out.println("Card inserted successfully");
        System.out.println("Insert PIN");
        machine.setCurrentState(machine.hasCard);

    }

    @Override
    public void ejectCard() {
        System.out.println("Insert card first");
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("Insert card first");
    }

    @Override
    public void requestCash(int cash) {
        System.out.println("Insert card first");
    }
}
