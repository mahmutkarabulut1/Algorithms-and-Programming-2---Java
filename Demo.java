package midterm;

//This main class uses Bus.java class, ContactInfo.java class, Person.java class
//and Vehicle.java class.


public class Demo {

    
    public static void main(String[] args) {
        
  
        ContactInfo contactInfo = new ContactInfo("Ataturk Caddesi,72. Sokak, No 3", "553 963 23 56", "mahmutkarabulut13579@gmail.com");

        Person person = new Person("Mahmut Karabulut", contactInfo);

        Bus bus = new Bus("Toyota", "20 BJK 1903", person, 43, 13);

        // Print the Bus object using toString method
        System.out.println(bus.toString());

        // Print the amount of tax to be paid for the Bus object
        System.out.println("Tax to be paid: " + bus.calculateTax() + " TL");

        // Create a copy of the Bus object using the copy constructor
        Bus copiedBus = new Bus(bus);

        // Show the equality of the two Bus objects using the equals method
        System.out.println("Are the two Bus objects equal? " + bus.equals(copiedBus));
    }
}

    
    

