import java.text.DecimalFormat;
//main method/class that brings everything together
public class ticketsimulator {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);//creating our age variable and setting it equal to the string argument taken in when program is run
        boolean hasdiscount = false;//creating a hasdiscount variable to be used later and setting its default value to false
        if(age >= 16){//checking if the age variable taken in is greater than 16
            String hasdiscountyorn = args[1];//if so then take in another variable at runtime right after age is input 
            if(hasdiscountyorn.equals("yes")){//checking if the new variable taken in is equal to yes
                hasdiscount = true;//if so, then set the hasdiscount variable defined above to be true
            }
        }
        Ticket ticket;//creating a new ticket object
        DiscountBehavior discount = new NoDiscount();//creating a new discount object and setting its default value to be "no discount"
        DecimalFormat df = new DecimalFormat("#.00");//creating a variable to help with formatting our finalized prices
        if(age >= 16 && age <= 64){//checking if age is greater than or equal to 16 and less than or equal to 64
            if (hasdiscount) {//if they have a discount as set above
                discount = new MilitaryDiscount();//then create a new military discount object 
                System.out.println("This ticket has a " + df.format(discount.getDiscountPercent()*100) + "% discount");//print the discount amount with proper formatting
            }
            else{//if not then print that there's no discount 
                System.out.println("There is no discount for this ticket");
            }
            ticket = new adultticket(discount);//then create a new adult ticket object and get its discount whether military or none
            System.out.println("This adult's ticket costs $"+ df.format(ticket.getFinalPrice()));//then print out the finalized price based on the discount amount with proper formatting 

        }
        else if (age > 64) {//checking if age is greater than 64
            if (hasdiscount) {//if they have a discount
                discount = new AARPDiscount();//create a new aarp discount object 
                System.out.println("This ticket has a " + df.format(discount.getDiscountPercent()*100) + "% discount");//print the discount amount with proper formatting

            }
            else{//if no discount, then print there's no discount
                System.out.println("There is no discount for this ticket");
            }
            ticket = new seniorticket(discount);//then create a new senior ticket object 
            System.out.println("This senior's ticket costs $"+ df.format(ticket.getFinalPrice()));//then print out the finalized price based on the discount with proper formatting

        }
        else{//if age doesn't fall into any of the categories above, then they must be younger than 16
            ticket = new childticket(discount);//create a new child ticket object 
            System.out.println("There is no discount for this ticket");//print that there is no discount
            System.out.println("This child's ticket costs $"+ df.format(ticket.getFinalPrice()));//print the total cost of the child's ticket with proper formatting
        }
    }
}
