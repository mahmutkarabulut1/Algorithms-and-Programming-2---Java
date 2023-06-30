package midterm;

public class ContactInfo {

    private String homeAddress;
    private String telNumber;
    private String eMail;

    // Default 
    public ContactInfo() {
        this.homeAddress = null;
        this.telNumber = null;
        this.eMail = null;
    }

    // with parameters
    public ContactInfo(String homeAddress, String telNumber, String eMail) {
        this.homeAddress = homeAddress;
        this.telNumber = telNumber;
        this.eMail = eMail;
    }

    public ContactInfo(ContactInfo other) {
        this.homeAddress = other.homeAddress;
        this.telNumber = other.telNumber;
        this.eMail = other.eMail;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public String getEMail() {
        return eMail;
    }

    //here is the mutator method
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String toString() {
        return "\nHome Address: " + homeAddress + '\n' +
                "Tel Number: " + telNumber + '\n' +
                "eMail: " + eMail + '\n' ;
                
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        ContactInfo other = (ContactInfo) obj;

        if (homeAddress != null ? !homeAddress.equals(other.homeAddress) : other.homeAddress != null) {
            return false;
        }
        if (telNumber != null ? !telNumber.equals(other.telNumber) : other.telNumber != null) {
            return false;
        }
        return eMail != null ? eMail.equals(other.eMail) : other.eMail == null;
    }
}
