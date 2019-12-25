package main.java.MasterClass.Section7;

public class Monitor {
    private String color;
    private int pixels;

    public Monitor(String color, int pixels) {
        this.color = color;
        this.pixels = pixels;
    }

    public void drawImage(int pixels, String color){
        System.out.println(String.format("drawing pixels at %d in color %s", pixels, color));
    }

    public String getColor() {
        return color;
    }

    public int getPixels() {
        return pixels;
    }
}
