package unit2_exceptions_streams;
import unit1_basics.Appointment;
import java.util.*;
public class AppointmentManager {
    private List<Appointment> appointments=new ArrayList<>();
    public void addAppointment(Appointment a)throws CustomExceptions{
        if(a==null) throw new CustomExceptions("Invalid Appointment!");
        appointments.add(a);
    }
    public void listAppointments(){
        appointments.forEach(Appointment::showDetails);
    }
}