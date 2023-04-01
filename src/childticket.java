public class childticket extends Ticket {
    public childticket(DiscountBehavior discount) {
        super(discount);
    }

    public float getBasePrice(){
        return 10.00f;
    }
}
