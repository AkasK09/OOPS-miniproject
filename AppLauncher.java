import unit1_basics.*; import unit2_exceptions_streams.*; import unit3_generics_threads.*; import unit5_gui.*;
public class AppLauncher {
    public static void main(String[] args)throws Exception{
        Patient p=new Patient(1,"Akash","9876543210");
        Doctor d=new Doctor(101,"Dr.Raman","Physician");
        Appointment a=new Appointment(p,d,"2025-12-10");
        AppointmentManager m=new AppointmentManager();
        m.addAppointment(a);
        m.listAppointments();
        new ReminderThread("Doctor appointment at 10AM").start();
        MainUI.main(args);
    }
}