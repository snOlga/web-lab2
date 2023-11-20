package mainLogic;

public class ArithmeticLogic
{
    public static boolean checkArea(DataBean bean) throws NullNumberException
    {
        Integer x = bean.getX();
        Float y = bean.getY();
        Integer r = bean.getR();

        if (bean.isValidated())
        {
            int xAbs = Math.abs(x);
            float yAbs = Math.abs(y);

            //_ge_ - greater or equals
            //_le_ - lower or equals
            boolean isX_ge_Zero = x >= 0;
            boolean isY_ge_Zero = y >= 0;

            boolean isX_le_R = xAbs <= r;
            boolean isY_le_R = yAbs <= r;

            boolean isX_le_RDiv2 = xAbs <= (r/2);
            //boolean isY_le_RDiv2 = yAbs <= (r/2); //no need

            boolean isXZero = x == 0;
            boolean isYZero = y == 0;

            if(isXZero && isY_le_R || isYZero && isY_le_R)
            {
                return true;
            }

            if (isX_ge_Zero && isY_ge_Zero)
            {
                if (isX_le_RDiv2 && isY_le_R)
                {
                    return true;
                } else
                {
                    return false;
                }
            } else if (isX_ge_Zero && !isY_ge_Zero)
            {
                if (isX_le_R && isY_le_R)
                {
                    return true;
                } else
                {
                    return false;
                }
            } else if (!isX_ge_Zero && !isY_ge_Zero)
            {
                //"is in round"
                if (y >= (0-Math.sqrt(r*r - Math.pow(Math.sqrt(0-x), 4)))
                        && x >= (0-Math.sqrt(r*r - Math.pow(Math.sqrt(0-y), 4))))
                {
                    return true;
                } else
                {
                    return false;
                }
            } else //if (!isX_ge_Zero && !isY_ge_Zero)
            {
                return false;
            }
        } else
        {
            throw new NullNumberException();
        }
    }
}
