package cn.dbj.knowledge.design.behavioral.observer.base;

/**
 * 具体观察者1
 */
public class ConcreteObserver1 implements Observer{
    @Override
    public void response() {
        System.out.println("具体观察者1作出反应！");
    }
}
