package unit1_basics;
public class Patient {
    private int id;
    private String name;
    private String contact;
    public Patient(int id, String name, String contact) {
        this.id=id; this.name=name; this.contact=contact;
    }
    public String getName(){ return name; }
    public void displayInfo(){
        System.out.println("Patient ID: "+id+", Name: "+name+", Contact: "+contact);
    }
}