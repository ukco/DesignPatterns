package Strategies;

/**
 * @Author lyr
 * @Date 2020/8/28 15:19
 * @Version 1.0
 * @Description
 */
public class Context {
    Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public void ContextInterface(){
        strategy.AlgorithmInterface();
    }
}
