package Commands;

import java.util.HashMap;

public class CommandController
{
    private static HashMap<String, Command> allCommands = new HashMap();

    public void fillCommandMap()
    {
        allCommands.put("submit", new SubmitCommand());
        allCommands.put("clear", new ClearCommand());
    }

    public Command findCommand(String key)
    {
        return allCommands.get(key);
    }
}
