package algoOdev2;


public class Employee {
    private String nameSurname,department,position;
    private int ID;
    
    public Employee(){
        nameSurname = "";
        ID = 9999;
        department = "";
        position = ""; 
        
    }
    public Employee(String nameSurname,String department, String position,int ID){
        this.department = department;
        this.ID = ID;
        this.nameSurname = nameSurname;
        this.position = position;
        
    }
    public String getNameSurname(){
        return nameSurname;
    }
    public void setNameSurname(String nameSurname){
        this.nameSurname = nameSurname;
    }
    public int getID(){
        return ID;
    }
    public void setID(int kurumSicilNo){
        this.ID = ID;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position = position;
    }

    
    
    @Override
    public String toString(){
        return "Name Surname: "+getNameSurname() + "\n" + "ID: " + Integer.toString(getID())
                + "\n" + "Department: " + getDepartment() + "\n" + "Position: " + getPosition();
    }
    
}
