import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;
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
        fileIndex = "000";
        arrayList1 = new ArrayList<Answer>();
        Answer answer = new Answer();
        try {
            FileReader question = new FileReader(getClass().getResource("/questions/pytanie_" + fileIndex + ".txt").getPath());
            BufferedReader bufferedReader = new BufferedReader(question);

            answer.setType(bufferedReader.readLine());
            arrayList1.add(answer);

            String line;
            String text = "";
            while((line = bufferedReader.readLine()) != null) {
                text = text + line;
            }
            getTextArea1().setText(text);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //getTextArea1().setText().setIcon(new ImageIcon(getClass().getResource("/images/img_mgr.jpg")));
    }

    private void nextQuestion(ActionEvent e) {
        // TODO add your code here
        // save answer
        Answer myAnswer = (Answer)arrayList1.get(arrayList1.size() - 1);
        if (buttonYes.isSelected()){
            myAnswer.setAnswer("Tak");
            buttonYes.setSelected(false);
        } else if (buttonNo.isSelected()){
            myAnswer.setAnswer("Nie");
            buttonNo.setSelected(false);
        } else {
            myAnswer.setAnswer("N/A");
            buttonNA.setSelected(false);
        }

        // read next file
        Long index = Long.parseLong(fileIndex);
        index++;
        fileIndex = String.valueOf(index);
        while (fileIndex.length() < 3){
            fileIndex = "0" + fileIndex;
        }

        Answer answer = new Answer();
        try {
            FileReader question = new FileReader(getClass().getResource("/questions/pytanie_" + fileIndex + ".txt").getPath());
            BufferedReader bufferedReader = new BufferedReader(question);

            answer.setType(bufferedReader.readLine());
            arrayList1.add(answer);

            String line;
            String text = "";
            while((line = bufferedReader.readLine()) != null) {
                text = text + line;
            }
            getTextArea1().setText(text);
        } catch (Exception ex) {
            //jesli wyjatek to oznacza ze nie ma wiecej pytan
            Result resultWindow = new Result();
            this.setVisible(false);
            resultWindow.answerList = arrayList1;
            resultWindow.setVisible(true);
        }
    }

    public JRadioButton getButtonYes() {
        return buttonYes;
    }

    public JRadioButton getButtonNo() {
        return buttonNo;
    }

    public JRadioButton getButtonNA() {
        return buttonNA;
    }

    public JScrollPane getScrollPane1() {
        return scrollPane1;
    }

    public JTextArea getTextArea1() {
        return textArea1;
    }

    public JButton getButton1() {
        return button1;
    }

    public ArrayList getArrayList1() {
        return arrayList1;
    }

    public String getFileIndex() {
        return fileIndex;
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
        arrayList1 = new ArrayList();
        fileIndex = new String();

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

            //---- textArea1 ----
            textArea1.setEditable(false);
            textArea1.setLineWrap(true);
            scrollPane1.setViewportView(textArea1);
        }

        //---- button1 ----
        button1.setText("Dalej >>");
        button1.addActionListener(e -> nextQuestion(e));

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
                    .addContainerGap(422, Short.MAX_VALUE)
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
    private ArrayList arrayList1;
    private String fileIndex;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
