package main.java.MasterClass.Section7.BillsBurger;

public class Burger {
    private String bun;
    private String meat;
    final private double originalPrice;
    private double price;
    private double addonPrice = 0.50;
    private boolean lettuce = false;
    private boolean ketchup = false;
    private boolean mustard = false;
    private boolean onions = false;


    public Burger(String bun, String meat, double originalPrice) {
        this.bun = bun;
        this.meat = meat;
        this.originalPrice = originalPrice;
        this.price = originalPrice;
    }

    public void addLettuce(){
        if (!lettuce) {
            this.lettuce = true;
            this.price += addonPrice;
        } else {
            System.out.println("Lettuce already added");
        }
    }

    public void addKetchup(){
        if (!ketchup) {
            this.ketchup = true;
            this.price += addonPrice;
        } else {
            System.out.println("ketchup already added");
        }
    }

    public void addMustard(){
        if (!mustard) {
            this.mustard = true;
            this.price += addonPrice;
        } else {
            System.out.println("mustard already added");
        }
    }

    public void addOnions(){
        if (!onions) {
            this.onions = true;
            this.price += addonPrice;
        } else {
            System.out.println("onions already added");
        }
    }

    protected void getBaseInfo(){
        System.out.println(String.format("Base Price: $%1$,.2f", this.originalPrice));
        System.out.println(String.format("Meat: %s", this.meat));
        System.out.println(String.format("Bun: %s", this.bun));
    }

    protected void getAddons(){
        if (this.lettuce){
            System.out.println(String.format("Lettuce: $%1$,.2f", this.addonPrice));
        }
        if (this.ketchup){
            System.out.println(String.format("Ketchup: $%1$,.2f", this.addonPrice));
        }
        if (this.mustard){
            System.out.println(String.format("Mustard: $%1$,.2f", this.addonPrice));
        }
        if (this.onions){
            System.out.println(String.format("Onions: $%1$,.2f", this.addonPrice));
        }
    }

    protected void getFinalPrice(){
        System.out.println(String.format("Final Price: $%1$,.2f \n", this.price));
    }

    public void getOrder(){
        this.getBaseInfo();

        this.getAddons();

        this.getFinalPrice();
    }

}
