package command;

public class CDOnCommand implements Command {

	@Override
	public void execute() {
		System.out.println("open CD...");

	}

	@Override
	public void undo() {
		System.out.println("close CD...");
	}

}
