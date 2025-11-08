package unit3_generics_threads;
public class GenericNotifier<T>{
    public void notifyUser(T message){
        System.out.println("Reminder: "+message);
    }
}