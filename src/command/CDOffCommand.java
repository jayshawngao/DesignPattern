package command;

public class CDOffCommand implements Command {

	@Override
	public void execute() {
		System.out.println("close CD...");
	}

	@Override
	public void undo() {
		System.out.println("open CD...");
	}

}
