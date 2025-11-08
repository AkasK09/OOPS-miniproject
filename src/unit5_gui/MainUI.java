package unit5_gui;
import javax.swing.*; import java.awt.*;
import unit3_generics_threads.ReminderThread;
public class MainUI {
    public static void main(String[] args){
        JFrame f=new JFrame("Patient Reminder System");
        f.setSize(400,300);
        f.setLayout(new GridLayout(3,2));
        JTextField p=new JTextField();
        JTextField t=new JTextField();
        JButton b=new JButton("Set Reminder");
        b.addActionListener(e-> new ReminderThread(p.getText()+" at "+t.getText()).start());
        f.add(new JLabel("Patient Name:")); f.add(p);
        f.add(new JLabel("Time:")); f.add(t);
        f.add(b);
        f.setVisible(true);
    }
}