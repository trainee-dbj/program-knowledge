package cn.dbj.knowledge.design.behavioral.mediator.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 简单单例中介者
 */
public class SimpleMediator {
    private static final SimpleMediator smd = new SimpleMediator();
    private List<SimpleColleague> colleagues = new ArrayList<>();

    private SimpleMediator() {
    }

    public static SimpleMediator getMedium() {
        return smd;
    }

    public void register(SimpleColleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
        }
    }

    public void relay(SimpleColleague scl) {
        for (SimpleColleague ob : colleagues) {
            if (!ob.equals(scl)) {
                ob.receive();
            }
        }
    }
}
