package proxy.remoteProxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	String location;
	
	State state = soldOutState;
	int count = 0;
	
	public GumballMachine(String location, int num) throws RemoteException {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		this.location = location;
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


	@Override
	public int getCount() {
		return count;
	}
	
	@Override
	public String getLocation(){
		return location;
	}

	@Override
	public State getState(){
		return state;
	}
	
	


}
