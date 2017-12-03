package preparation.ATM;

public class HasCard implements ATMState {

    ATMMachine machine;

    public HasCard(ATMMachine obj){
        machine = obj;
    }
    @Override
    public void insertCard() {
        System.out.println("Cannot insert more that one card");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected");
        machine.setCurrentState(machine.hasNoCard);
    }

    @Override
    public void insertPin(int pin) {
        if(pin == 1234){
            System.out.println("Correct pin entered");
            System.out.println("Enter amount to withdraw");
            machine.setCurrentState(machine.hasPin);
        }
        else{
            System.out.println("Incorrect Pin");

        }
    }

    @Override
    public void requestCash(int cash) {

        System.out.println("Please enter your PIN");

    }
}
