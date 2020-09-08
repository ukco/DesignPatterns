/**
 * @Author lyr
 * @Date 2020/9/8 11:13
 * @Version 1.0
 * @Description
 */
public class RealSubject implements Subject {
    @Override
    public void request(){
        System.out.println("真实对象的请求");
    }
}
