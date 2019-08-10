import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Sat Aug 10 06:30:32 CEST 2019
 */



/**
 * @author unknown
 */
public class Result extends JFrame {
    public Result() {
        initComponents();
    }

    public ArrayList getAnswerList() {
        return answerList;
    }

    public JScrollPane getScrollPane1() {
        return scrollPane1;
    }

    public JTextArea getTextArea1() {
        return textArea1;
    }

    private void thisWindowOpened(WindowEvent e) {
        // TODO add your code here
        List<ResultAnswer> resultAnswers = new ArrayList<ResultAnswer>();

        List typeList = new ArrayList<String>();
        for (Object answer : answerList){
            String type = ((Answer) answer).getType();
            if (!typeList.contains(type)){
                typeList.add(type);
            }
        }

        for (Object text : typeList){
            ResultAnswer resultAnswer = new ResultAnswer();
            resultAnswer.setType((String) text);
            resultAnswers.add(resultAnswer);
        }

        for (ResultAnswer resultAnswer : resultAnswers){
            for (Object answer : answerList){
                String type = ((Answer) answer).getType();
                String myAnswer = ((Answer) answer).getAnswer();
                if (resultAnswer.getType().equalsIgnoreCase(type)){
                    if (myAnswer.equalsIgnoreCase("Tak"))
                        resultAnswer.yesAnswers++;
                    else if (myAnswer.equalsIgnoreCase("Nie"))
                        resultAnswer.noAnswers++;
                    else
                        resultAnswer.naAnswers++;
                }
            }
        }

        for (ResultAnswer resultAnswer : resultAnswers){
            String text = resultAnswer.getType() + ":   " + " Tak: " + resultAnswer.yesAnswers + " Nie: " + resultAnswer.noAnswers +
                    " N/A:" + resultAnswer.naAnswers;
            textArea1.setText(textArea1.getText() + text + "\n");
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        answerList = new ArrayList();

        //======== this ========
        setTitle("Result");
        setMinimumSize(new Dimension(600, 400));
        setResizable(false);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                thisWindowOpened(e);
            }
        });
        Container contentPane = getContentPane();

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(textArea1);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(166, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(72, Short.MAX_VALUE))
        );
        setSize(600, 400);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    public ArrayList answerList;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
