import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import Commands.*;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mainLogic.BeanController;
import mainLogic.DataBean;

public class ControllerServlet extends HttpServlet
{
    /**
     * this life-cycle method is invoked when this servlet is first accessed
     * by the client
     */
    public void init(ServletConfig config)
    {
        BeanController.setDataBeanList(new ArrayList<>());
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException
    {
//        if(bean.isValidated())
//        {
//            PrintWriter writer = response.getWriter();
//            for(int i = 0; i < dataBeanList.size(); i++)
//            {
//                writer.print("<html>" + dataBeanList.get(i).getX() + "<br>" +
//                        dataBeanList.get(i).getY() + "<br>" +
//                        dataBeanList.get(i).getR() + "<br>" +
//                        dataBeanList.get(i).getScriptTime() + "<br>" +
//                        dataBeanList.get(i).isInArea() + "<br></html>");
//            }
//            writer.flush();
//        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException
    {
        String action = request.getParameter("actions");

        CommandController commandController = new CommandController();
        BeanController beanController = new BeanController();

        commandController.fillCommandMap();
        Command command = commandController.findCommand(action);

        command.execute(request, response, beanController.getBean());
    }

    public void destroy() {
        System.out.println("Servlet is being destroyed");
    }
}
