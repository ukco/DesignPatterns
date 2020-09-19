package operation_factory;

import operation_utils.Operation;
import operation_utils.OperationAdd;

/**
 * @Author lyr
 * @Date 2020/9/19 21:42
 * @Version 1.0
 * @Description
 */
public class AddFactory implements IFactory {
    @Override
    public Operation CreateOperation() {
        return new OperationAdd();
    }
}
