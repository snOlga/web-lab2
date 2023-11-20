package Commands;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mainLogic.DataBean;
import mainLogic.*;

import java.io.IOException;

public abstract class Command
{
    public abstract void execute(HttpServletRequest request, HttpServletResponse response, DataBean bean) throws IOException;
}
