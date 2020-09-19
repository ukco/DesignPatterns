package operation_utils;

/**
 * @Author lyr
 * @Date 2020/9/19 21:37
 * @Version 1.0
 * @Description
 */
public class OperationMul extends Operation {
    @Override
    public double GetResult(){return this.get_numberA() * this.get_numberB();}
}