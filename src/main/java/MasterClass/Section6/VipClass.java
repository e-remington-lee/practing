package main.java.MasterClass.Section6;

public class VipClass {
    int credit;
    String name;
    String email;

    public VipClass(int credit, String email, String name){
        this.email = email;
        if (name == "bob") {
            this.name = "Why are were still here";
        } else {
            this.name = name;
        }

        this.credit = credit;

        System.out.println("constructed standard");
    }

    public VipClass(String name, String email){
        this(1001, email, name);
        System.out.println("2 parameter constructor");
    }

    public VipClass(){
        this(5, "derekemail", "derek");
        System.out.println("no parameter constructor, great overloading!");
    }

    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }

    public String getEmail() {
        return email;
    }
}
