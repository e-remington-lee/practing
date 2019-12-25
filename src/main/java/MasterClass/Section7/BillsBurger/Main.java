package main.java.MasterClass.Section7.BillsBurger;

public class Main {
    public static void main(String[] args) {
        Burger x = new Burger("Whole", "steak", 1.50);
        x.addKetchup();
        x.addLettuce();
        x.getOrder();

        HealthyBurger hb = new HealthyBurger(1.50);

        hb.addKetchup();
        hb.addVeganCheese();
        hb.addVeganSauce();
        hb.addMustard();

        hb.getOrder();

        DeluxBurger db = new DeluxBurger("big", "steak", 1.50);
        db.addKetchup();
        db.getOrder();
    }
}
