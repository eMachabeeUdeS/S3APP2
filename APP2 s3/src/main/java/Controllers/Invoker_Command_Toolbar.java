package Controllers;

public class Invoker_Command_Toolbar {
	Command_Toolbar[] commands = new Command_Toolbar[128];
	
	public void addCommand(int position, Command_Toolbar newCommand) {
		commands[position] =  newCommand;
	}
	
}
