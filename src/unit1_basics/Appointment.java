package unit1_basics;
public class Appointment {
    private Patient patient;
    private Doctor doctor;
    private String date;
    public Appointment(Patient patient,Doctor doctor,String date){
        this.patient=patient; this.doctor=doctor; this.date=date;
    }
    public void showDetails(){
        System.out.println("Appointment: "+patient.getName()+" with Dr. "+doctor.getName()+" on "+date);
    }
}