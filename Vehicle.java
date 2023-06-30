package midterm;

public abstract class Vehicle {

    private String brand;
    private String licencePlate;
    private Person owner;

   
    public Vehicle() {
        this.brand = null;
        this.licencePlate = null;
        this.owner = null;
    }

    public Vehicle(String brand, String licencePlate, Person owner) {
        this.brand = brand;
        this.licencePlate = licencePlate;
        // for privacy leak
        this.owner = new Person(owner);
    }

    public Vehicle(Vehicle other) {
        this.brand = other.brand;
        this.licencePlate = other.licencePlate;
        // for privacy leak
        this.owner = new Person(other.owner);
    }


    public String getBrand() {
        return brand;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public Person getOwner() {
        // for privacy leak
        return new Person(owner);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public void setOwner(Person owner) {
        // for privacy leak
        this.owner = new Person(owner);
    }

    public String toString() {
        return "Vehicle: " +
                "Brand='" + brand + '\n' +
                "LicencePlate='" + licencePlate + '\n' +
                "Owner: " + owner ;
               
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Vehicle other = (Vehicle) obj;

        if (brand != null ? !brand.equals(other.brand) : other.brand != null) {
            return false;
        }
        if (licencePlate != null ? !licencePlate.equals(other.licencePlate) : other.licencePlate != null) {
            return false;
        }
        return owner != null ? owner.equals(other.owner) : other.owner == null;
    }

    public abstract int calculateTax();
}

