/**
 * @Author lyr
 * @Date 2020/9/7 15:23
 * @Version 1.0
 * @Description
 */
public class DecoratorClient {
    public static void main(String[] args){
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecoratorA concreteComponentA = new ConcreteDecoratorA();
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB();

        concreteComponentA.setComponent(concreteComponent);
        concreteDecoratorB.setComponent(concreteComponentA);
        concreteDecoratorB.Operation();
    }
}
