package operation_factory;

import operation_utils.Operation;

/**
 * @Author lyr
 * @Date 2020/9/19 21:40
 * @Version 1.0
 * @Description
 */
public interface IFactory {
    Operation CreateOperation();
}
