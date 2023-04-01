public class seniorticket extends Ticket{
    public seniorticket(DiscountBehavior discount) {
        super(discount);
    }

    public float getBasePrice(){
        return 15.00f;
    }
}