public abstract class Ticket {
    private DiscountBehavior discount;

    public abstract float getBasePrice();

    public float getFinalPrice(){
        float base = getBasePrice();
        return base - discount.getDiscountPercent() * base;
    }

    public Ticket(DiscountBehavior discount) {
        this.discount = discount;
    }
}
