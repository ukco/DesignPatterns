/**
 * @Author lyr
 * @Date 2020/9/8 11:15
 * @Version 1.0
 * @Description
 */
public class Proxy implements Subject {
    RealSubject realSubject;
    @Override
    public void request(){
        if(realSubject == null){
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
