package midterm;

public class Bus extends Vehicle {

    private int capacity;
    private int ageOfBus;

    // Default constructor
    public Bus() {
        super();
        this.capacity = 0;
        this.ageOfBus = 0;
    }

    public Bus(String brand, String licencePlate, Person owner, int capacity, int ageOfBus) {
        super(brand, licencePlate, owner);
        this.capacity = capacity;
        this.ageOfBus = ageOfBus;
    }

    public Bus(Bus other) {
        super(other);
        this.capacity = other.capacity;
        this.ageOfBus = other.ageOfBus;
    }

    // Accessor 
    public int getCapacity() {
        return capacity;
    }

    public int getAgeOfBus() {
        return ageOfBus;
    }

    // Mutator
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setAgeOfBus(int ageOfBus) {
        this.ageOfBus = ageOfBus;
    }

    public int calculateTax() {
        if (ageOfBus < 5) {
            return 4000;
        } else if (ageOfBus >= 5 && ageOfBus <= 10) {
            return 3000;
        } else {
            return 2000;
        }
    }

    public String toString() {
        return "Bus: " +
                "brand='" + getBrand() + '\'' +
                ", licencePlate='" + getLicencePlate() + '\'' +
                ", owner=" + getOwner() +
                "Bus Information: \n"+
                "Capacity= " + capacity +
                "  Age of Bus= " + ageOfBus ;
                
    }
    
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }

        Bus other = (Bus) obj;

        if (capacity != other.capacity) {
            return false;
        }
        return ageOfBus == other.ageOfBus;
    }
}

