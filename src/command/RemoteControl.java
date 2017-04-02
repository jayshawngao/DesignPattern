package command;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	public RemoteControl() {
		onCommands = new Command[3]; //用于开关灯, 开关CD, 宏模式开关
		offCommands = new Command[3];
		for(int i=0;i<3;i++){
			onCommands[i] = new NoCommand();
			offCommands[i] = new NoCommand();
		}
		undoCommand = new NoCommand();
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommmand){
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommmand;
	}
	
	public void onButton(int slot){
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void offButton(int slot){
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButton(){
		undoCommand.undo();
	}
}
