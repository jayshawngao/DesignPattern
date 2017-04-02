package command;

public class LightOffCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Light off...");
	}

	@Override
	public void undo() {
		System.out.println("Light on...");
	}

}
