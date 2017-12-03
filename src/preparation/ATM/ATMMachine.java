package preparation.ATM;

public class ATMMachine {

    ATMState hasCard;
    ATMState hasNoCard;
    ATMState hasPin;
    ATMState outOfMoney;

    ATMState currentState;

    int cash = 10000;

    public ATMMachine() {
        hasCard = new HasCard(this);
        hasNoCard = new HasNoCard(this);
        hasPin = new HasPin(this);
        outOfMoney = new NoCash(this);
        currentState = hasNoCard;
        if(cash <=0)
            currentState = outOfMoney;

    }

    public void setCurrentState(ATMState state){
        currentState = state;
    }

    public void setCash(int cash){
        this.cash = cash;
    }

    public void insertCard(){
        currentState.insertCard();
    }

    public void ejectCard(){
        currentState.ejectCard();
    }

    public void insertPin(int pin){
        currentState.insertPin(pin);
    }

    public void requestCash(int cash){
        currentState.requestCash(cash);
    }

}
