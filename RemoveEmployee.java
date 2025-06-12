package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class RemoveEmployee extends JFrame implements ActionListener {

    Choice choiceEMPID;
    JLabel textName, textPhone, textEmail;
    JButton delete, back;

    RemoveEmployee() {
        setLayout(null);

        JLabel label = new JLabel("Employee ID");
        label.setBounds(50, 50, 100, 30);
        label.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(label);

        choiceEMPID = new Choice();
        choiceEMPID.setBounds(200, 50, 150, 30);
        add(choiceEMPID);

        try {
            conn c = new conn();
            ResultSet resultSet = c.statement.executeQuery("select * from employee");
            while (resultSet.next()) {
                choiceEMPID.add(resultSet.getString("empID"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel labelName = new JLabel("Name");
        labelName.setBounds(50, 100, 100, 30);
        labelName.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(labelName);

        textName = new JLabel();
        textName.setBounds(200, 100, 250, 30);
        textName.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(textName);

        JLabel labelPhone = new JLabel("Phone");
        labelPhone.setBounds(50, 150, 100, 30);
        labelPhone.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(labelPhone);

        textPhone = new JLabel();
        textPhone.setBounds(200, 150, 250, 30);
        textPhone.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(textPhone);

        JLabel labelEmail = new JLabel("Email");
        labelEmail.setBounds(50, 200, 100, 30);
        labelEmail.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(labelEmail);

        textEmail = new JLabel();
        textEmail.setBounds(200, 200, 250, 30);
        textEmail.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(textEmail);

        // Initial values
        updateEmployeeDetails(choiceEMPID.getSelectedItem());

        choiceEMPID.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                updateEmployeeDetails(choiceEMPID.getSelectedItem());
            }
        });

        // Delete Button
        delete = new JButton("Delete");
        delete.setBounds(80, 300, 100, 30);
        delete.setBackground(Color.BLACK);
        delete.setForeground(Color.WHITE);
        delete.addActionListener(this);
        add(delete);

        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    conn c = new conn();
                    String query = "delete from employee where empID = '" + choiceEMPID.getSelectedItem() + "'";
                    c.statement.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Employee removed successfully");
                    setVisible(false);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        // Back Button
        back = new JButton("Back");
        back.setBounds(220, 300, 100, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/delete.png"));
        Image i2= i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel img= new JLabel(i3);
        img.setBounds(700, 80, 200, 200);
        add(img);

        ImageIcon i11= new ImageIcon(ClassLoader.getSystemResource("icons/back.jpg"));
        Image i22= i11.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i33= new ImageIcon(i22);
        JLabel image= new JLabel(i33);
        image.setBounds(0, 0, 1120, 630);
        add(image);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setSize(1000, 400);
        setLocation(300, 150);
        setVisible(true);
    }

    void updateEmployeeDetails(String empID) {
        try {
            conn c = new conn();
            ResultSet resultSet = c.statement.executeQuery("select * from employee where empID='" + empID + "'");
            if (resultSet.next()) {
                textName.setText(resultSet.getString("name"));
                textPhone.setText(resultSet.getString("phone"));
                textEmail.setText(resultSet.getString("email"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==delete){
            try {
                conn c= new conn();
                String query= "delete from employee where empID= '"+choiceEMPID.getSelectedItem()+"'";
                c.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Employee deleted successfully");
                setVisible(false);
                new Main_class();
            }catch (Exception E){
                E.printStackTrace();
            }
        }else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new RemoveEmployee();
    }
}
