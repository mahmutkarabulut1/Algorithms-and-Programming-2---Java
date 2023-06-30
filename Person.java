package midterm;

public class Person {

    private String name;
    private ContactInfo contactInformation;

    public Person() {
        this.name = null;
        this.contactInformation = null;
    }

    public Person(String name, ContactInfo contactInformation) {
        this.name = name;
        this.contactInformation = new ContactInfo(contactInformation);
    }

    public Person(Person other) {
        this.name = other.name;
        // for privacy leak
        this.contactInformation = new ContactInfo(other.contactInformation);
    }
    
    public String getName() {
        return name;
    }

    public ContactInfo getContactInformation() {
        // for privacy leak
        return new ContactInfo(contactInformation);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactInformation(ContactInfo contactInformation) {
        // for privacy leak
        this.contactInformation = new ContactInfo(contactInformation);
    }

    public String toString() {
        return "Person," +
                "name='" + name + '\n' +
                "Contact Information: " + contactInformation ;
                
    }

    // equals method
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Person other = (Person) obj;

        if (name != null ? !name.equals(other.name) : other.name != null) {
            return false;
        }
        return contactInformation != null ? contactInformation.equals(other.contactInformation) : other.contactInformation == null;
    }
}
