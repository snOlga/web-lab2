package Commands;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mainLogic.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ClearCommand extends Command
{
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response, DataBean bean) throws IOException
    {
        BeanController.setDataBeanList(new ArrayList<>());
        PrintWriter writer = response.getWriter();
        writer.flush();
    }
}
