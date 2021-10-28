public class Konto {

    private int amount;

    public void addAmount(int value) {
        if (value > 0) {
            amount += value;
        } else {
            amount -= value;
        }

    }

    public void addAmount(Konto k) {
        amount += k.getAmount();
        k.setAmount(0);
    }

    public void addAmount(Konto k, int value) {
        amount += value;
        k.setAmount(k.getAmount()-value);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}