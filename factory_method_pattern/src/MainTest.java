import com.sun.corba.se.spi.ior.IdentifiableFactory;
import operation_factory.AddFactory;
import operation_factory.IFactory;
import operation_factory.SubFactory;
import operation_utils.Operation;

/**
 * @Author lyr
 * @Date 2020/9/19 21:49
 * @Version 1.0
 * @Description
 */
public class MainTest {
    public static void main(String[] args) {
        IFactory operFactory = new SubFactory();
        Operation oper = operFactory.CreateOperation();
        oper.set_numberA(1);
        oper.set_numberB(2);
        System.out.println(oper.GetResult());
    }
}
