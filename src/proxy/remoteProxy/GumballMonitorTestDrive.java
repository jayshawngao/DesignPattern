package proxy.remoteProxy;

import java.rmi.Naming;

public class GumballMonitorTestDrive {
	public static void main(String[] args) {
		try {
			GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup("rmi://localhost/GumballMachine");
			GumballMonitor monitor = new GumballMonitor(machine);
			monitor.report();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
