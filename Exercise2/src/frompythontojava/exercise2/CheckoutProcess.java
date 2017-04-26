package frompythontojava.exercise2;

/**
 * Created by marti on 2017.04.26..
 */
public class CheckoutProcess extends AbstractProcess {

    @Override
    public void action(Orderable item) {
        item.checkout();
    }
}
