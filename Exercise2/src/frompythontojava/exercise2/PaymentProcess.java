package frompythontojava.exercise2;

/**
 * Created by marti on 2017.04.26..
 */
public class PaymentProcess extends AbstractProcess {
    @Override
    public void action(Orderable item) {
        item.pay();
    }
}
