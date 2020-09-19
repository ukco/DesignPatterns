package operation_factory;

import operation_utils.Operation;
import operation_utils.OperationDiv;

/**
 * @Author lyr
 * @Date 2020/9/19 21:46
 * @Version 1.0
 * @Description
 */
public class DivFactory implements IFactory {
    @Override
    public Operation CreateOperation(){
        return new OperationDiv();
    }
}
