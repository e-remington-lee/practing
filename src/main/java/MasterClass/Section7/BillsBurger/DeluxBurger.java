package main.java.MasterClass.Section7.BillsBurger;

public class DeluxBurger extends Burger{
    private boolean fries;
    private boolean drink;

    public DeluxBurger(String bun, String meat, double originalPrice) {
        super(bun, meat, originalPrice+1);
        this.fries = true;
        this.drink = true;
    }

    @Override
    public void addLettuce() {

    }

    @Override
    public void addKetchup() {
    }

    @Override
    public void addMustard() {
    }

    @Override
    public void addOnions() {
    }

    @Override
    protected void getAddons(){
        System.out.println("Fries: $0.50");
        System.out.println("Drink: $0.50");
    }

}
