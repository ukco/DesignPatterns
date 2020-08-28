package operation_utils;

/**
 * @Author lyr
 * @Date 2020/8/28 10:12
 * @Version 1.0
 */
public abstract class Operation {

    //java接口中的成员变量都是 public static final的，无法通过行为来修改属性，所以不使用接口类来实现

    public double _numberA = 0;
    public double _numberB = 0;

    public double get_numberA() {
        return _numberA;
    }

    public void set_numberA(double _numberA) {
        this._numberA = _numberA;
    }

    public double get_numberB() {
        return _numberB;
    }

    public void set_numberB(double _numberB) {
        this._numberB = _numberB;
    }

    public double GetResult(){return 0.0;}

}
