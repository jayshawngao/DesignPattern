package command;

public class LightOnCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Light on...");
	}

	@Override
	public void undo() {
		System.out.println("Light off...");
	}

}
