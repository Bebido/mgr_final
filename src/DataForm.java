import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Sun Aug 04 18:13:44 CEST 2019
 */



/**
 * @author unknown
 */
public class DataForm extends JFrame {
    public DataForm() {
        initComponents();
    }

    private void selectedYes(ActionEvent e) {
        // TODO add your code here
        buttonNo.setSelected(false);
        buttonNA.setSelected(false);
    }

    private void selectedNo(ActionEvent e) {
        // TODO add your code here
        buttonYes.setSelected(false);
        buttonNA.setSelected(false);
    }

    private void selectedNA(ActionEvent e) {
        // TODO add your code here
        buttonYes.setSelected(false);
        buttonNo.setSelected(false);
    }

    private void thisWindowOpened(WindowEvent e) {
        // TODO add your code here
        System.out.println("sssss");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        buttonYes = new JRadioButton();
        buttonNo = new JRadioButton();
        buttonNA = new JRadioButton();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        button1 = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Question");
        setMinimumSize(new Dimension(600, 400));
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                thisWindowOpened(e);
            }
        });
        Container contentPane = getContentPane();

        //---- buttonYes ----
        buttonYes.setText("Tak");
        buttonYes.addActionListener(e -> selectedYes(e));

        //---- buttonNo ----
        buttonNo.setText("Nie");
        buttonNo.addActionListener(e -> selectedNo(e));

        //---- buttonNA ----
        buttonNA.setText("N/A");
        buttonNA.addActionListener(e -> selectedNA(e));

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(textArea1);
        }

        //---- button1 ----
        button1.setText("Dalej >>");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 486, GroupLayout.PREFERRED_SIZE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(buttonYes, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(buttonNo, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(buttonNA, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(48, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(423, Short.MAX_VALUE)
                    .addComponent(button1)
                    .addGap(83, 83, 83))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonYes)
                        .addComponent(buttonNo)
                        .addComponent(buttonNA))
                    .addGap(26, 26, 26)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(button1)
                    .addContainerGap(20, Short.MAX_VALUE))
        );
        setSize(600, 400);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JRadioButton buttonYes;
    private JRadioButton buttonNo;
    private JRadioButton buttonNA;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
