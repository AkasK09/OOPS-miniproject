package unit2_exceptions_streams;
import java.io.*;
public class FileHandler {
    public static void saveLog(String data){
        try(FileWriter w=new FileWriter("data/appointments.log",true)){
            w.write(data+"\n");
        } catch(IOException e){ e.printStackTrace(); }
    }
}