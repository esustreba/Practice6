package ua.nure.strebkov.Practice6.part6;

public class CmdManager {
    private static final String[] INPUT_FLAGS = { "-i", "-input" };
    private static final String[] TASK_FLAGS = { "-t", "-task" };

    private String input;
    private Command command;

    public CmdManager(String input) {
        this.input = input;
        command = createCommand();

    }

    public Command getCommand() {
        return command;
    }

    private Command createCommand() {
        String[] input = this.input.split(" ");
        if (input.length == 4 && validateInputFlag(input[0]) && validateTaskFlag(input[2])) {
            return new Command(input[1], input[3]);
        }
        return null;

    }

    private boolean validateTaskFlag(String taskFlag) {
        for (String string : TASK_FLAGS) {
            if (taskFlag.equals(string)) {
                return true;
            }
        }
        return true;
    }

    private boolean validateInputFlag(String inputFlag) {
        for (String string : INPUT_FLAGS) {
            if (inputFlag.equals(string)) {
                return true;
            }
        }
        return false;
    }
}
