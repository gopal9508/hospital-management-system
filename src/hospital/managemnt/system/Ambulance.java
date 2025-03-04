package hospital.managemnt.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Ambulance extends JFrame {
     Ambulance(){


         JPanel panel = new JPanel();
         panel.setBounds(5,5,1000,590);
         panel.setBackground(new Color(90,156,163));
         panel.setLayout(null);
         add(panel);

         JTable table = new JTable();
         table.setBounds(10,40,1000,450);
         table.setBackground(new Color(90,156,163));
         table.setFont(new Font("Tahoma",Font.BOLD,12));
         panel.add(table);

         try {
             conn c= new conn();
             String q = "select * from Ambulance";
             ResultSet resultSet = c.statement.executeQuery(q);
             table.setModel(DbUtils.resultSetToTableModel(resultSet));

         }catch (Exception e){
             e.printStackTrace();
         }

         JLabel label1 = new JLabel("Name");
         label1.setBounds(10,11,100,14);
         label1.setFont(new Font("Tahoma",Font.BOLD,14));
         panel.add(label1);




         JLabel label2 = new JLabel("Gender");
         label2.setBounds(210,11,100,14);
         label2.setFont(new Font("Tahoma",Font.BOLD,14));
         panel.add(label2);

         JLabel label3 = new JLabel("CarName");
         label3.setBounds(410,11,100,14);
         label3.setFont(new Font("Tahoma",Font.BOLD,14));
         panel.add(label3);


         JLabel label4 = new JLabel("Available");
         label4.setBounds(610,11,100,14);
         label4.setFont(new Font("Tahoma",Font.BOLD,14));
         panel.add(label4);


         JLabel label5 = new JLabel("Room");
         label5.setBounds(810,11,100,14);
         label5.setFont(new Font("Tahoma",Font.BOLD,14));
         panel.add(label5);



         JButton button = new JButton("BLACK");
         button.setBounds(450,510,120,30);
         button.setBackground(Color.BLACK);
         button.setForeground(Color.WHITE);
         panel.add(button);
         button.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 setVisible(false);
             }
         });

         setUndecorated(true);
         setSize(1000,600);
         setLayout(null);
         setLocation(300,300);
         setVisible(true);

     }
    public static void main(String[] args) {
         new Ambulance();

    }
}
