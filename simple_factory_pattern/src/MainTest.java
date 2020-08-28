import operation_utils.*;

/**
 * @Author lyr
 * @Date 2020/8/28 10:14
 * @Version 1.0
 */
public class MainTest {
    public static void main(String args[]){
        Operation operation = OperationFactory.getOperation('+');
        operation.set_numberA(1.0);
        operation.set_numberB(2.0);
        double result = operation.GetResult();
        System.out.println(result);
        System.out.println("==============================");

        Operation operation2 = OperationFactory.getOperation('/');
        operation2.set_numberA(1.0);
        operation2.set_numberB(2.0);
        double result2 = operation2.GetResult();
        System.out.println(result2);
        System.out.println("==============================");

        Operation operation3 = OperationFactory.getOperation('*');
        operation3.set_numberA(1.0);
        operation3.set_numberB(2.0);
        double result3 = operation3.GetResult();
        System.out.println(result3);
        System.out.println("==============================");

    }
}
