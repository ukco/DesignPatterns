package operation_factory;

import operation_utils.Operation;
import operation_utils.OperationSub;

/**
 * @Author lyr
 * @Date 2020/9/19 21:43
 * @Version 1.0
 * @Description
 */
public class SubFactory implements IFactory {
    @Override
    public Operation CreateOperation(){
        return new OperationSub();
    }
}
