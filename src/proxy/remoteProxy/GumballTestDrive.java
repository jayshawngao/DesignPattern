package proxy.remoteProxy;

import java.rmi.Naming;

public class GumballTestDrive {
	public static void main(String[] args) {
		try {
			GumballMachineRemote machine = new GumballMachine("GumballMachine", 10);
			Naming.bind("GumballMachine", machine);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
