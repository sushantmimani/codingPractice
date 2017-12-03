package preparation.ATM;

public class HasPin implements ATMState {

    ATMMachine machine;

    public HasPin(ATMMachine obj){
        machine = obj;
    }
    @Override
    public void insertCard() {
        System.out.println("Can insert only one card");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected");
        machine.setCurrentState(machine.hasNoCard);
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("Pin already inserted");
    }

    @Override
    public void requestCash(int cash) {
        System.out.println("Here");
        if (cash<=machine.cash){
                System.out.println(cash+" dispensed by ATM");
                System.out.println("Card Ejected");
                machine.setCash(machine.cash-cash);
                machine.setCurrentState(machine.hasNoCard);
        }
        if(machine.cash <=0)
            machine.setCurrentState(machine.outOfMoney);
    }
}
