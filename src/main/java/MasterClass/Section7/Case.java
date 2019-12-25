package main.java.MasterClass.Section7;

public class Case {
    private int button;
    private String color;
    private int size;

    public Case(int button, String color, int size) {
        this.button = button;
        this.color = color;
        this.size = size;
    }

    public void pressButton(){
        System.out.println("I pressed the button");
    }

    public int getButton() {
        return button;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }
}
