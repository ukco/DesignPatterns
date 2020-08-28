import Strategies.*;
/**
 * @Author lyr
 * @Date 2020/8/28 15:21
 * @Version 1.0
 * @Description
 */
public class MainTest {
    public static void main(String[] args){
        Context context;

        context = new Context(new ConcreateStrategyA());
        context.ContextInterface();

        context = new Context(new ConcreateStrategyB());
        context.ContextInterface();

        context = new Context(new ConcreateStrategyC());
        context.ContextInterface();
    }
}
