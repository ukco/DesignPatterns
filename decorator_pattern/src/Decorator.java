/**
 * @Author lyr
 * @Date 2020/9/7 15:14
 * @Version 1.0
 * @Description
 */
public class Decorator extends Component {
    protected Component component;
    public void setComponent(Component component){
        this.component = component;
    }
    @Override
    public void Operation(){
        if(component != null){
            component.Operation();
        }
    }
}

class ConcreteDecoratorA extends Decorator{
    private String addState;
    @Override
    public void Operation(){
        //首先运行原Component的Operation(),再执行本类的功能，如addState，相当于对原Component进行连装饰
        super.Operation();
        addState = "A中的state";
        System.out.println(addState + "具体装饰对象A的操作");
    }
}

class ConcreteDecoratorB extends Decorator{
    @Override
    public void Operation(){
        super.Operation();
        addBehavior();
        System.out.println("具体装饰对象B的操作");
    }
    private void addBehavior(){
        System.out.println("B中新增行为");
    }
}
