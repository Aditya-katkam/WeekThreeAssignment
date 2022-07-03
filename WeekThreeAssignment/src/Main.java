import Person.Farmer;
import Person.WholeSaler;
public class Main {
    
    public static void main(String[] args)  {

        WholeSaler wholeSaler1 = new WholeSaler("Akash Thallam",(long) 1222233344);

        Farmer farmer1 = new Farmer("Aditya Katkam", (long) 810585841);
        Farmer farmer2 = new Farmer("Rohan Nayak", (long) 123452222);
        Farmer farmer3 = new Farmer("Rahul Patel", (long) 15678546);
        Farmer farmer4 = new Farmer("Thomas Shelby", (long) 67574789);
        Farmer farmer5 = new Farmer("Lokesh Choudhary", (long) 987348476);
        Farmer farmer6 = new Farmer("Naveen Patnaik", (long) 987890886);
        try {
            wholeSaler1.addFarmer(farmer1);
            wholeSaler1.addFarmer(farmer2);
            wholeSaler1.addFarmer(farmer3);
            wholeSaler1.addFarmer(farmer4);
            wholeSaler1.addFarmer(farmer5);
            wholeSaler1.addFarmer(farmer6);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("You cannot add more than 5 farmers to the farmers list");
        }

        System.out.println("List of Farmers");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        for (Farmer f : wholeSaler1.farmers) {
            System.out.printf("\n Farmer name: %s and Phone number: %s", f.getName(), f.getContact());
        }

    }

}
