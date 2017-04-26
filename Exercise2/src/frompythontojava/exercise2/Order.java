package frompythontojava.exercise2;

/**
 * Created by marti on 2017.04.26..
 */
public class Order implements Orderable {

    private int id;
    private int idCounter;
    private String status;

    public Order() {
        this.id = idCounter;
        this.idCounter ++;
        this.status = "new";
    }

    @Override
    public boolean checkout() {
        this.status = "checked";
        return true;
    }

    @Override
    public boolean pay() {
        this.status = "payed";
        return true;
    }
}
