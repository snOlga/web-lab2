package mainLogic;

import java.io.Serializable;

public class DataBean implements Serializable
{
    private String xRequest;
    private String yRequest;
    private String rRequest;
    private long scriptTime;
    private Integer xParsed;
    private Float yParsed;
    private Integer rParsed;
    private boolean isInArea;

    public DataBean() {}

    public void setX(String x)
    {
        xParsed = parseIntegerNum(x, xRequest);
        if(xParsed != null && xParsed < -3 && xParsed > 5)
        {
            xParsed = null;
        }
    }
    public void setY(String y)
    {
        yParsed = parseFloatNum(y, yRequest);
        if(yParsed != null && yParsed < -5 && yParsed > 3)
        {
            yParsed = null;
        }
    }
    public void setR(String r)
    {
        rParsed = parseIntegerNum(r, rRequest);
        if(rParsed != null &&rParsed < 1 && rParsed > 5)
        {
            rParsed = null;
        }
    }

    public void setScriptTime(long scriptTime)
    {
        this.scriptTime = scriptTime;
    }

    public void setInArea(boolean inArea)
    {
        isInArea = inArea;
    }

    public Integer getX()
    {
        return xParsed;
    }
    public Float getY()
    {
        return yParsed;
    }
    public Integer getR()
    {
        return rParsed;
    }

    public long getScriptTime()
    {
        return scriptTime;
    }

    public boolean isInArea()
    {
        return isInArea;
    }

    private Float parseFloatNum(String notParsedNum, String notParsedBuf)
    {
        notParsedBuf = notParsedNum;
        try
        {
            return Float.parseFloat(notParsedNum);
        } catch (NumberFormatException e)
        {
            return null;
        }
    }

    private Integer parseIntegerNum(String notParsedNum, String notParsedBuf)
    {
        notParsedBuf = notParsedNum;
        try
        {
            return Integer.parseInt(notParsedNum);
        } catch (NumberFormatException e)
        {
            return null;
        }
    }

    public boolean isValidated()
    {
        if (xParsed != null && yParsed != null && rParsed != null)
        {
            return true;
        } else
        {
            return false;
        }
    }
}

