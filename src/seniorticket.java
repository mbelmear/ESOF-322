public class seniorticket extends Ticket{
    public seniorticket(DiscountBehavior discountBehavior) {
        super(discountBehavior);
    }

    public float getBasePrice(){
        return 15.00f;
    }
}