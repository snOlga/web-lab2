package Commands;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.PrintWriter;

import mainLogic.*;


public class SubmitCommand extends Command
{
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response, DataBean bean) throws IOException
    {
        bean = new DataBean();
        bean.setX(request.getParameter("selectX"));
        bean.setY(request.getParameter("selectY"));
        bean.setR(request.getParameter("selectR"));

        long startTime = System.currentTimeMillis();

        try
        {
            bean.setInArea(ArithmeticLogic.checkArea(bean));
        } catch (NullNumberException e)
        {
            return;
        }

        long endTime = System.currentTimeMillis();
        bean.setScriptTime(endTime - startTime);
        BeanController.getDataBeanList().add(bean);

        PrintWriter writer = response.getWriter();
        JSONObject json = new JSONObject();
        JSONArray arrayOfArrays = new JSONArray();
        for (int i = 0; i < BeanController.getDataBeanList().size(); i++)
        {
            JSONObject item = new JSONObject();
            item.put("x", BeanController.getDataBeanList().get(i).getX());
            item.put("y", BeanController.getDataBeanList().get(i).getY());
            item.put("r", BeanController.getDataBeanList().get(i).getR());
            item.put("time", BeanController.getDataBeanList().get(i).getScriptTime());
            item.put("result", BeanController.getDataBeanList().get(i).isInArea());

            arrayOfArrays.put(item);
        }
        json.put("response", arrayOfArrays);
        writer.print(json);
        writer.flush();
    }
}
