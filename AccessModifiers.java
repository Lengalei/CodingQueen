public class Program {
    public static void main(String[] args) {
        Country c = new Country();
        c.name = "France";
        c.capital = "Paris";

        System.out.println("Country:  " + c.name);
        System.out.println("Capital:  " + c.capital);
    }
}

class Country {
    // changed access modifiers to public
    public String name;
    public String capital;
}
