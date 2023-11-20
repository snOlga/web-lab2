package mainLogic;

import java.util.ArrayList;

public class BeanController
{
    private static ArrayList<DataBean> dataBeanList;
    private DataBean bean;

    public static ArrayList<DataBean> getDataBeanList()
    {
        return dataBeanList;
    }

    public static void setDataBeanList(ArrayList<DataBean> dataBeanListOutside)
    {
        dataBeanList = dataBeanListOutside;
    }

    public DataBean getBean()
    {
        return bean;
    }
}
