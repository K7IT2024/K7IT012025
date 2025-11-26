class Address {
    String doorNumber;
    int floorNumber;
    String street;
    String locality;
    String city;
    String state;
    String country;
    int Pincode;

    // Override toString() for readable printing
    @Override
    public String toString() {
        return doorNumber + 
               (floorNumber > 0 ? ", Floor " + floorNumber : "") +
               ", " + street + 
               ", " + locality + 
               ", " + city + 
               ", " + state + 
               ", " + country + 
               " - " + Pincode;
    }
}

class Person {
    String surName;
    int age;
    double height;
    double weight;
    Address address;
    long telephone;
    static String food;
}

class MemoryData {
    public static void main(String args[]) {

        Person raju = new Person();
        raju.surName = "Kamasani";
        raju.age = 28;
        raju.height = 5.6;
        raju.weight = 75;
        raju.telephone = 89780413;
        raju.food = "FastFood";

        Address andhra = new Address();
        andhra.doorNumber = "6-14";
        andhra.street = "Kothur";
        andhra.locality = "GangharaNellore";
        andhra.city = "Chittoor";
        andhra.state = "AndhraPradesh";
        andhra.country = "India";
        andhra.Pincode = 517167;
        raju.address = andhra;

        Person yuva = new Person();
        yuva.surName = "Nellepalli";
        yuva.age = 28;
        yuva.height = 5.11;
        yuva.weight = 78;
        yuva.telephone = 814239143;
        yuva.food = "Non-Veg";

        Address karnataka = new Address();
        karnataka.doorNumber = "25";
        karnataka.floorNumber = 1;
        karnataka.street = "6th A Main road";
        karnataka.locality = "Kalkere";
        karnataka.city = "Bangalore";
        karnataka.state = "Karnataka";
        karnataka.country = "India";
        karnataka.Pincode = 560016;
        yuva.address = karnataka;

        System.out.println("===Printing Statement Details ===\n");
        System.out.println("Name of the Candidate1 = " + raju.surName);
        System.out.println("Age of the Candidate1 = " + raju.age);
        System.out.println("Height of the Candidate1 = " + raju.height);
        System.out.println("Weight of the Candidate1 = " + raju.weight);
        System.out.println("Address of the Candidate1 = " + raju.address);
        System.out.println("Telephone Number of the Candidate1 = " + raju.telephone);
        System.out.println("Food of the Candidate1 = " + raju.food);

        System.out.println("\n===Printing Statement Details ===\n");
        System.out.println("Name of the Candidate2 = " + yuva.surName);
        System.out.println("Age of the Candidate2 = " + yuva.age);
        System.out.println("Height of the Candidate2 = " + yuva.height);
        System.out.println("Weight of the Candidate2 = " + yuva.weight);
        System.out.println("Address of the Candidate2 = " + yuva.address);
        System.out.println("Telephone Number of the Candidate2 = " + yuva.telephone);
        System.out.println("Food of the Candidate2 = " + yuva.food);
    }
}
