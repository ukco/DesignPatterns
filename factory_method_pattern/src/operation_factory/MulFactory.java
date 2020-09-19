package operation_factory;

import operation_utils.Operation;
import operation_utils.OperationMul;

/**
 * @Author lyr
 * @Date 2020/9/19 21:47
 * @Version 1.0
 * @Description
 */
public class MulFactory implements IFactory {
    @Override
    public Operation CreateOperation(){
        return new OperationMul();
    }
}
