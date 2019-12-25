package main.java.MasterClass.Section7;

public class Pc {
    private Case case1;
    private Monitor monitor;


    public Pc(Case case1, Monitor monitor) {
        this.case1 = case1;
        this.monitor = monitor;
    }

    public void pressPower(){
        monitor.drawImage(1000, "green");
    }

}
