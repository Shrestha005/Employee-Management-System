package employee.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AddEmployee extends JFrame implements ActionListener {

    Random ran= new Random();
    int number= ran.nextInt(999999);

    JTextField tname, tgname, taddress, tphone, taadhar, temail, tsalary, tdesignation;

    JLabel tempid;

    JDateChooser tdob;

    JButton add, back;

    JComboBox BoxEducation;

    AddEmployee(){
        getContentPane().setBackground(new Color(185, 235, 255));

        JLabel heading= new JLabel("Add Employee Detail");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD, 25));
        add(heading);

        //name label and text field
        JLabel name= new JLabel("Name");
        name.setBounds(50, 150, 150, 30);
        name.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(name);

        tname= new JTextField();
        tname.setBounds(200, 150, 150, 30);
        tname.setBackground(new Color(255, 255, 255));
        add(tname);

        //guardian name label and text field
        JLabel gname= new JLabel("Guardian's Name");
        gname.setBounds(400, 150, 150, 30);
        gname.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(gname);

        tgname= new JTextField();
        tgname.setBounds(600, 150, 150, 30);
        tgname.setBackground(new Color(255, 255, 255));
        add(tgname);

        //dob label
        JLabel dob= new JLabel("Date Of Birth");
        dob.setBounds(50, 200, 150, 30);
        dob.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(dob);

        tdob= new JDateChooser();
        tdob.setBounds(200, 200, 150, 30);
        setBackground(new Color(255, 255, 255));
        add(tdob);

        //salary label and text field
        JLabel salary= new JLabel("Salary");
        salary.setBounds(400, 200, 150, 30);
        salary.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(salary);

        tsalary= new JTextField();
        tsalary.setBounds(600, 200, 150, 30);
        tsalary.setBackground(new Color(255, 255, 255));
        add(tsalary);

        //address label and text field
        JLabel address= new JLabel("Address");
        address.setBounds(50, 250, 150, 30);
        address.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(address);

        taddress= new JTextField();
        taddress.setBounds(200, 250, 150, 30);
        taddress.setBackground(new Color(255, 255, 255));
        add(taddress);

        //phone label and text field
        JLabel phone= new JLabel("Phone");
        phone.setBounds(400, 250, 150, 30);
        phone.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(phone);

        tphone= new JTextField();
        tphone.setBounds(600, 250, 150, 30);
        tphone.setBackground(new Color(255, 255, 255));
        add(tphone);

        //email label and text field
        JLabel email= new JLabel("Email");
        email.setBounds(50, 300, 150, 30);
        email.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(email);

        temail= new JTextField();
        temail.setBounds(200, 300, 150, 30);
        temail.setBackground(new Color(255, 255, 255));
        add(temail);

        //highest qualification/education label
        JLabel education= new JLabel("Highest Qualification");
        education.setBounds(400, 300, 150, 30);
        education.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(education);

        String items[]={"BTech", "BCA", "BSc", "BBA", "BCom", "BA", "MTech", "MCA", "MSc", "MBA", "MCom", "MA", "PhD"};
        BoxEducation= new JComboBox(items);
        BoxEducation.setBackground(new Color(255, 255, 255));
        BoxEducation.setBounds(600, 300, 150, 30);
        add(BoxEducation);

        //aadhar label and text field
        JLabel aadhar= new JLabel("Aadhar Number");
        aadhar.setBounds(400, 350, 150, 30);
        aadhar.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(aadhar);

        taadhar= new JTextField();
        taadhar.setBounds(600, 350, 150, 30);
        taadhar.setBackground(new Color(255, 255, 255));
        add(taadhar);

        //empid label and text field
        JLabel empid= new JLabel("Employee ID");
        empid.setBounds(50, 400, 150, 30);
        empid.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(empid);

        tempid= new JLabel(""+number);
        tempid.setBounds(200, 400, 150, 30);
        tempid.setFont(new Font("SAN_SARIF", Font.BOLD, 20));
        tempid.setForeground(new Color(11, 9, 82));
        add(tempid);

        //designation label and text field
        JLabel designation= new JLabel("Designation");
        designation.setBounds(50, 350, 150, 30);
        designation.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(designation);

        tdesignation= new JTextField();
        tdesignation.setBounds(200, 350, 150, 30);
        tdesignation.setBackground(new Color(255, 255, 255));
        add(tdesignation);

        //buttons (add, back)
        add= new JButton("ADD");
        add.setBounds(450, 550, 150, 40);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);

        back= new JButton("BACK");
        back.setBounds(250, 550, 150, 40);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);


        setSize(900, 700);
        setLayout(null);
        setLocation(300, 50);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==add){
            String name= tname.getText();
            String gname= tgname.getText();
            String dob= ((JTextField) tdob.getDateEditor().getUiComponent()).getText();
            String salary= tsalary.getText();
            String address= taddress.getText();
            String phone= tphone.getText();
            String email= temail.getText();
            String education= (String) BoxEducation.getSelectedItem();
            String designation= tdesignation.getText();
            String aadhar= taadhar.getText();
            String empID= tempid.getText();

            try{
                conn c= new conn();
                String query= "insert into employee values('"+name+"' , '"+gname+"' , '"+dob+"' , '"+salary+"' , '"+address+"' , '"+phone+"' , '"+email+"' , '"+education+"' , '"+designation+"' , '"+aadhar+"' ,  '"+empID+"')";
                c.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details added successfully");
                setVisible(false);
                new Main_class();
            }catch (Exception E){
                E.printStackTrace();
            }
        } else {
            setVisible(false);
            new Main_class();
        }
    }

    public static void main(String[] args) {
        new AddEmployee();
    }
}
