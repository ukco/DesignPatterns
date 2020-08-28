package operation_utils;

/**
 * @Author lyr
 * @Date 2020/8/28 10:13
 * @Version 1.0
 */
public class OperationDiv extends Operation {
    @Override
    public double GetResult(){
        //若是两者均为int型(long也是int型)，结果会抛出异常：java.lang.ArithmeticException: / by zeroi
        //0.0/0.0 得到的结果是NaN(not an number的简称，即"不是数字")。通过Double.isNaN(double x)来判断。
        //正数/0.0 得到的结果是正无穷大，即Infenity
        //负数/0.0 得到的结果是负无穷大，即Infenity。通过Double.isInfinite(double x)来判断。
        if(Double.isNaN(this.get_numberA() / this.get_numberB())){
            System.out.println("除数不能为0。");
            return 0;
        }else if(Double.isInfinite(this.get_numberA() / this.get_numberB())){
            System.out.println("除数不能为0。");
            return 0;
        }
        return this.get_numberA() / this.get_numberB();
    }
}
