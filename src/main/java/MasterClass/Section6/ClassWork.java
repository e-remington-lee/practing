package main.java.MasterClass.Section6;

public class ClassWork {
    public static void main(String[] args) {
//        Bank bank = new Bank(555,555888, "R", 1000.50);
//        Bank bank = new Bank();
//        System.out.println(bank.getPhone());
//        System.out.println(bank.addBalance(5));
//        bank.removeFunds(100);
//
//        Bank bank2 = new Bank(333, 555555, "bob");
//        System.out.println(bank2.getBalance());

        VipClass x = new VipClass();
        System.out.println(x.getCredit());

        VipClass y = new VipClass("bob", "email2");
        System.out.println(y.getName());
    }
}
