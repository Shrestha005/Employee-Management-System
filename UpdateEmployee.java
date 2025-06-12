package employee.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UpdateEmployee extends JFrame implements ActionListener {

    JTextField teducation, tgname, taddress, tphone, taadhar, temail, tsalary, tdesignation;

    JLabel tempid;

    JButton add, back;

    String number;

    UpdateEmployee(String number){

        this.number= number;
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

        JLabel tname= new JLabel();
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

        JLabel tdob= new JLabel();
        tdob.setBounds(200, 200, 150, 30);
        tdob.setFont(new Font("Tahoma", Font.BOLD, 20));
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

        teducation= new JTextField();
        teducation.setBounds(600, 300, 150, 30);
        teducation.setBackground(new Color(255, 255, 255));
        add(teducation);

        //aadhar label and text field
        JLabel aadhar= new JLabel("Aadhar Number");
        aadhar.setBounds(400, 350, 150, 30);
        aadhar.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(aadhar);

        JLabel taadhar= new JLabel();
        taadhar.setBounds(600, 350, 150, 30);
        taadhar.setBackground(new Color(255, 255, 255));
        add(taadhar);

        //empid label and text field
        JLabel empid= new JLabel("Employee ID");
        empid.setBounds(50, 400, 150, 30);
        empid.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(empid);

        tempid= new JLabel();
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

        try {
            conn c= new conn();
            String query= "select * from employee where empID= '"+number+"'";
            ResultSet resultSet= c.statement.executeQuery(query);
            while (resultSet.next()){
                tname.setText(resultSet.getString("name"));
                tgname.setText(resultSet.getString("gname"));
                tdob.setText(resultSet.getString("dob"));
                taddress.setText(resultSet.getString("salary"));
                tsalary.setText(resultSet.getString("name"));
                tphone.setText(resultSet.getString("phone"));
                temail.setText(resultSet.getString("email"));
                teducation.setText(resultSet.getString("education"));
                tdesignation.setText(resultSet.getString("designation"));
                taadhar.setText(resultSet.getString("aadhar"));
                tempid.setText(resultSet.getString("empID"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        //buttons (add, back)
        add= new JButton("UPDATE");
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
        if (e.getSource()==add){
            String gname= tgname.getText();
            String salary= tsalary.getText();
            String address= taddress.getText();
            String phone= tphone.getText();
            String email= temail.getText();
            String education= teducation.getText();
            String designation= tdesignation.getText();

            try {
                conn c= new conn();
                String query= "update employee set gname= '"+gname+"' , salary= '"+salary+"' , address= '"+address+"' , phone= '"+phone+"' , email= '"+email+"' , education= '"+education+"' , designation= '"+designation+"' where empID= '"+number+"'";
                c.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details updated successfully");
                setVisible(false);
                new Main_class();
            }catch (Exception E){
                E.printStackTrace();
            }
        }else {
            setVisible(false);
            new ViewEmployee();
        }
    }

    public static void main(String[] args) {
        new UpdateEmployee("");
    }
}
