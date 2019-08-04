import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;
import org.jdesktop.beansbinding.*;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
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

    public JRadioButton getRadioButton1() {
        return radioButton1;
    }

    public JRadioButton getRadioButton2() {
        return radioButton2;
    }

    public JRadioButton getRadioButton3() {
        return radioButton3;
    }

    public JButton getButton2() {
        return button2;
    }

    public JButton getButton1() {
        return button1;
    }

    public JScrollPane getScrollPane1() {
        return scrollPane1;
    }

    public JTextArea getTextArea2() {
        return textArea2;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        radioButton3 = new JRadioButton();
        scrollPane1 = new JScrollPane();
        textArea2 = new JTextArea();
        button2 = new JButton();
        button1 = new JButton();

        //======== this ========
        setMinimumSize(new Dimension(800, 600));
        setResizable(false);
        setBackground(Color.magenta);
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "fill,hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- radioButton1 ----
        radioButton1.setText("text");
        contentPane.add(radioButton1, "cell 3 1");

        //---- radioButton2 ----
        radioButton2.setText("text");
        contentPane.add(radioButton2, "cell 3 2");

        //---- radioButton3 ----
        radioButton3.setText("text");
        contentPane.add(radioButton3, "cell 3 3");

        //======== scrollPane1 ========
        {

            //---- textArea2 ----
            textArea2.setEditable(false);
            textArea2.setLineWrap(true);
            textArea2.setText("k");
            textArea2.setRows(10);
            textArea2.setBackground(Color.magenta);
            scrollPane1.setViewportView(textArea2);
        }
        contentPane.add(scrollPane1, "cell 7 5 10 3,dock center");

        //---- button2 ----
        button2.setText("text");
        contentPane.add(button2, "cell 4 8");

        //---- button1 ----
        button1.setText("text");
        contentPane.add(button1, "cell 16 9");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    public JRadioButton radioButton1;
    public JRadioButton radioButton2;
    public JRadioButton radioButton3;
    public JScrollPane scrollPane1;
    public JTextArea textArea2;
    public JButton button2;
    public JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
