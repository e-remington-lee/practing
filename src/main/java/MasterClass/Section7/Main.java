package main.java.MasterClass.Section7;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "no plot";
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot(){
        return "shark eats people";
    }
}

class Indie extends Movie {
    public Indie(){
        super("none");
    }
}

public class Main {
    public static void main(String[] args) {
        Movie movie = randomMovie();
        System.out.println(movie.plot());
    }

    public static Movie randomMovie(){
        int randomNum = (int) (Math.random()*2)+1;
        switch (randomNum) {
            case 1:
                return new Indie();
            case 2:
                return new Jaws();
        }
        return null;
    }
}
