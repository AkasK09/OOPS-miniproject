package unit3_generics_threads;
public class ReminderThread extends Thread{
    private String message;
    public ReminderThread(String message){ this.message=message; }
    public void run(){
        try{ Thread.sleep(3000);
            System.out.println("🔔 Reminder: "+message);
        } catch(InterruptedException e){ System.out.println("Reminder interrupted!"); }
    }
}