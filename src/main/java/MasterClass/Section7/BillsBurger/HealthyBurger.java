package main.java.MasterClass.Section7.BillsBurger;

public class HealthyBurger extends Burger {
    private boolean veganCheese = false;
    private boolean veganSauce = false;
    private double price;
    private double addonPrice = 0.50;

    public HealthyBurger(double price) {
        super("Wheat", "Vegan meat", price);
        this.price = price;
    }

    public void addVeganCheese(){
        if (!veganCheese) {
            this.veganCheese = true;
            this.price += addonPrice;
        } else {
            System.out.println("Vegan cheese already added");
        }
    }

    public void addVeganSauce(){
        if (!veganSauce) {
            this.veganSauce = true;
            this.price += addonPrice;
        } else {
            System.out.println("Vegan sauce already added");
        }
    }

    @Override
    public void addLettuce() {
        this.price += addonPrice;
        super.addLettuce();
    }

    @Override
    public void addKetchup() {
        this.price += addonPrice;
        super.addKetchup();
    }

    @Override
    public void addMustard() {
        this.price += addonPrice;
        super.addMustard();
    }

    @Override
    public void addOnions() {
        this.price += addonPrice;
        super.addOnions();
    }

    @Override
    protected void getAddons(){
        if (this.veganCheese){
            System.out.println(String.format("Vegan cheese: $%1$,.2f", this.addonPrice));
        }
        if (this.veganSauce){
            System.out.println(String.format("Vegan sauce: $%1$,.2f", this.addonPrice));
        }

        super.getAddons();
    }

    @Override
    protected void getFinalPrice() {
        System.out.println(String.format("Final Price: $%1$,.2f \n", this.price));
    }

//    @Override
//    public void getOrder() {
//        super.getBaseInfo();
//        getAddons();
//        getFinalPrice();
//    }
}
