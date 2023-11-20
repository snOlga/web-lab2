package Commands;

public class NoCommandException extends Exception
{
    public NoCommandException()
    {
        super("There is no such command");
    }
}
