public class adultticket extends Ticket{
    public adultticket(DiscountBehavior discount) {
        super(discount);
    }

    public float getBasePrice(){
        return 20.00f;
    }
}