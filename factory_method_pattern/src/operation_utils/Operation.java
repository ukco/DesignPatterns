package operation_utils;

/**
 * @Author lyr
 * @Date 2020/9/19 21:35
 * @Version 1.0
 * @Description
 */
public abstract class Operation {
    private double _numberA = 0;
    private double _numberB = 0;

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
