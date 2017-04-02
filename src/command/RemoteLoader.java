package command;

public class RemoteLoader {
	public static void main(String[] args) {
		Command lightOn = new LightOnCommand();
		Command lightOff = new LightOffCommand();
		Command cdOn = new CDOnCommand();
		Command cdOff = new CDOffCommand();
		Command macroOn = new MacroCommand(new Command[]{lightOn, cdOn});
		Command macroOff = new MacroCommand(new Command[]{lightOff, cdOff});
		RemoteControl remoteControl = new RemoteControl();
		remoteControl.setCommand(0, lightOn, lightOff);
		remoteControl.setCommand(1, cdOn, cdOff);
		remoteControl.setCommand(2, macroOn, macroOff);
		remoteControl.onButton(2);
		remoteControl.undoButton();
		
	}
}
