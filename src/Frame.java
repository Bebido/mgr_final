import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.jgoodies.forms.factories.*;
/*
 * Created by JFormDesigner on Sun Aug 04 14:42:48 CEST 2019
 */



/**
 * @author unknown
 */
public class Frame extends JFrame {
    public Frame() {
        initComponents();
    }

    public JLabel getLabel1() {
        return label1;
    }

    public JTextArea getTextArea1() {
        return textArea1;
    }

    public JButton getButton1() {
        return button1;
    }

    private void clickedButton(ActionEvent e) {
        // TODO add your code here
        DataForm dataForm = new DataForm();
        dataForm.setVisible(true);
        this.setVisible(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        DefaultComponentFactory compFactory = DefaultComponentFactory.getInstance();
        label1 = compFactory.createLabel("");
        textArea1 = new JTextArea();
        button1 = new JButton();

        //======== this ========
        setMinimumSize(new Dimension(600, 400));
        setBackground(Color.magenta);
        setTitle("Hej");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setIcon(new ImageIcon(getClass().getResource("/images/img_mgr.jpg")));
        label1.setMaximumSize(new Dimension(250, 100));
        label1.setMinimumSize(new Dimension(250, 100));
        label1.setPreferredSize(new Dimension(250, 100));
        label1.setHorizontalAlignment(SwingConstants.LEFT);
        label1.setAlignmentY(0.0F);

        //---- textArea1 ----
        textArea1.setText("gdgbrfhgfdhgfdbgfdhngb fhngfdnbhg fdbg fnhb gfhn gbfhn gbfhn vc nbvcn bgfn bf ngbfn bv");
        textArea1.setEditable(false);
        textArea1.setLineWrap(true);

        //---- button1 ----
        button1.setText("Next >>");
        button1.addActionListener(e -> clickedButton(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(380, 380, 380)
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(154, 154, 154)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(113, 113, 113)
                            .addComponent(textArea1, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE)))
                    .addGap(64, 64, 64))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(52, Short.MAX_VALUE)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(textArea1, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                    .addGap(64, 64, 64)
                    .addComponent(button1)
                    .addGap(26, 26, 26))
        );
        setSize(600, 400);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    public JLabel label1;
    public JTextArea textArea1;
    public JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    private class ButtonNextAction extends AbstractAction {
        private ButtonNextAction() {
            // JFormDesigner - Action initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
            // Generated using JFormDesigner Evaluation license - unknown
            // JFormDesigner - End of action initialization  //GEN-END:initComponents
        }

        public void actionPerformed(ActionEvent e) {
            // TODO add your code here

        }
    }

    private class Form_2 extends AbstractAction {
        private Form_2() {
            // JFormDesigner - Action initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
            // Generated using JFormDesigner Evaluation license - unknown
            // JFormDesigner - End of action initialization  //GEN-END:initComponents
        }

        public void actionPerformed(ActionEvent e) {
            // TODO add your code here
        }
    }
}
