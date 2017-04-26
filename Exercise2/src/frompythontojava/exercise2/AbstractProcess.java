package frompythontojava.exercise2;

/**
 * Created by marti on 2017.04.26..
 */
public abstract class AbstractProcess {

    public void process(Orderable item) {
        stepBefore();
        action(item);
        stepAfter();
    }

    public void stepBefore() {
        System.out.println("Preparing item.");
    }

    public abstract void action(Orderable item);

    public void stepAfter() {
        System.out.println("Finishing order.");
    }
}
