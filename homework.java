import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
//import java.awt.event.*;
import java.util.ArrayList;

class My extends JFrame implements ListSelectionListener {
    
    private JList<String> jli = new JList<>();
    //private JLabel lab1 = new JLabel();
    private JTextArea jta = new JTextArea();

    My() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("food");
        setBounds(50,50,500,300);
        setLayout(null);

        String[] city = {"淡水", "深坑", "新竹", "大湖", "台中", "彰化", "古坑", "美濃", "萬巒"};
        JPanel jp1 = new JPanel();
        add(jp1);
        

        jli = new JList<>(city);
        jli.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jli.setBounds(40, 10 , 100, 100);
        jli.setVisibleRowCount(5);
        jli.addListSelectionListener(this);
        
        jp1.add(jli);
        

        JScrollPane jsp = new JScrollPane(jli,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jsp.setBounds(40, 10, 100, 100);
        add(jsp);

        jta = new JTextArea("請選擇地區");
        add(jta);
        jta.setBounds(200, 10, 150, 50);
        jta.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jta.setBackground(Color.WHITE);

        setVisible(true);
    };

    public void valueChanged(ListSelectionEvent e) {
        String food = "";
        String labShow = "";
            
        if (jli.getSelectedValue().equals("淡水")) { 
            food += "阿給";
        }
        if (jli.getSelectedValue().equals("深坑")) {
            food += "臭豆腐";
        }
        if (jli.getSelectedValue().equals("新竹")) {
            food += "貢丸";
        }
        if (jli.getSelectedValue().equals("大湖")) {
            food += "草莓";
        }
        if (jli.getSelectedValue().equals("台中")) {
            food += "太陽餅";
        }
        if (jli.getSelectedValue().equals("彰化")) {
            food += "肉圓";
        }
        if (jli.getSelectedValue().equals("古坑")) {
            food += "咖啡";
        }
        if (jli.getSelectedValue().equals("美濃")) {
            food += "粄條";
        }
        if (jli.getSelectedValue().equals("萬巒")) {
            food += "豬腳";
        }    
        labShow += jli.getSelectedValue()+"的小吃是"+food;
        jta.setText(labShow);
        
    }
}


public class homework {
    public static void main(String[] args) throws Exception {
        My f1 = new My();
    }    
}
