package main.java.MasterClass.Section7;

public class Printer {
    private int pages = 0;
    private int toner = 100;
    private boolean ds;

    public Printer(boolean ds) {
        this.ds = ds;
    }

    public void printPage(int pages){
        if (pages > 100 || pages > this.toner){
            System.out.println("unable to print");
        } else {
            this.pages += pages;
            this.toner -= pages;
            System.out.println(String.format("printed %d page(s)", pages));
        }
    }

    public void fillToner(){
        this.toner = 100;
    }

    public int getPages() {
        return pages;
    }

    public int getToner() {
        return toner;
    }
}
