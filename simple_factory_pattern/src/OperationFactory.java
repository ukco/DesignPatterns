import operation_utils.*;

/**
 * @Author lyr
 * @Date 2020/8/28 10:14
 * @Version 1.0
 */
public class OperationFactory {
    public static Operation getOperation(char operate){
        switch (operate){
            case '+':
                return new OperationAdd();
            case '-':
                return new OperationSub();
            case '*':
                return new OperationMul();
            case '/':
                return new OperationDiv();
            default:
                throw new RuntimeException();
        }
    }
}
