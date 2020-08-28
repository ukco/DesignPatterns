package operation_utils;

/**
 * @Author lyr
 * @Date 2020/8/28 10:13
 * @Version 1.0
 */
public class OperationSub extends Operation {
    @Override
    public double GetResult(){return this.get_numberA() - this.get_numberB();}
}
