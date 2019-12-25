package main.java.MasterClass.Section6;

public class Bank {
    private double balance;
    private int accountNumber;
    private int phone;
    private String name;


    public Bank(int accountNumber, int phone, String name, double balance){
        this.accountNumber = accountNumber;
        this.phone = phone;
        this.name = name;
        this.balance = balance;
    }

    public Bank(int accountNumber, int phone, String name) {
        this(accountNumber, phone, name, 100.0);
    }

    public Bank(){
        this(123, 555,"bob", 0.00);
    }

    public double addBalance(double x){
        System.out.println("Added: "+x);
        this.balance+=x;
        return this.balance;
    }

    public void removeFunds(double x) {
        if (x>this.balance){
            System.out.println("Only: "+this.balance+" available");
        } else {
            this.balance-=x;
            System.out.println(this.balance);
        }
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


}
