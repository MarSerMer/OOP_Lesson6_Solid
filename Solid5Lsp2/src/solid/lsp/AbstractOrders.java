package solid.lsp;

public abstract class AbstractOrders implements Orderable{
    protected int price;
    protected int qnt;
    public AbstractOrders(int qnt, int price) {
        this.price = price;
        this.qnt = qnt;
    }
    @Override
    public String toString() {
        return String.format("Количество = %d, Цена = %d", qnt, price);
    }
}
