package state;

public class GumballMachine {
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State winnerState;
	State soldState;
	
	State state = soldOutState;
	int count = 0;
	
	public GumballMachine(int num) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		this.count = num;
		if(count > 0){
			state = noQuarterState;
		}
		
	}
	
	public void insertQuarter(){
		state.insertQuarter();
	}
	public void ejectQuarter(){
		state.ejectQuarter();
	}
	public void turnCrank(){
		try {
			state.turnCrank();
			state.dispense();
		} catch (Exception e) {}
		
	}
	public void setState(State state){
		this.state = state;
	}
	public void releaseBall(){
		System.out.println("A gumball comes rolling out the slot...");
		if(count!=0){
			count--;
		}
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getState() {
		return state;
	}

	public int getCount() {
		return count;
	}
	public State getWinnerState() {
		return winnerState;
	}
	
	@Override
	public String toString() {
		return "GumballMachine: "+getCount();
	}
}
