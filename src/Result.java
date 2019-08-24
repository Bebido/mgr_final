import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;
import javax.swing.*;
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

        Long yesCounter = 0L;
        Long noCounter = 0L;
        Long naCounter = 0L;

        List typeList = new ArrayList<String>();
        for (Object answer : answerList) {
            String type = ((Answer) answer).getType();
            if (!typeList.contains(type)) {
                typeList.add(type);
            }
        }

        for (Object text : typeList) {
            ResultAnswer resultAnswer = new ResultAnswer();
            resultAnswer.setType((String) text);
            resultAnswers.add(resultAnswer);
        }

        for (ResultAnswer resultAnswer : resultAnswers) {
            for (Object answer : answerList) {
                String type = ((Answer) answer).getType();
                String myAnswer = ((Answer) answer).getAnswer();
                if (resultAnswer.getType().equalsIgnoreCase(type)) {
                    if (myAnswer.equalsIgnoreCase("Tak")) {
                        resultAnswer.yesAnswers++;
                        yesCounter++;
                    } else if (myAnswer.equalsIgnoreCase("Nie")) {
                        resultAnswer.noAnswers++;
                        noCounter++;
                    } else {
                        resultAnswer.naAnswers++;
                        naCounter++;
                    }
                }
            }
        }

        for (ResultAnswer resultAnswer : resultAnswers) {
            String text = resultAnswer.getType() + ":   " +
                    " Tak: " + resultAnswer.toPercents(resultAnswer.yesAnswers, resultAnswers.size()) +
                    " Nie: " + resultAnswer.toPercents(resultAnswer.noAnswers, resultAnswers.size()) +
                    " N/A: " + resultAnswer.toPercents(resultAnswer.naAnswers, resultAnswers.size());
            textArea1.setText(textArea1.getText() + text + "\n");
        }

        /////////////////////// utworzenie wykresu kolowego /////////////////////////////////////////

        PieChartSample pieChartSample = new PieChartSample("Odpowiedzi",
                new PieChartSample().createDataset(yesCounter, noCounter, naCounter));
        panel1.setLayout(new java.awt.BorderLayout());
        panel1.add(pieChartSample.getChartPanel(), BorderLayout.CENTER);
        panel1.validate();
    }

    public JPanel getPanel1() {
        return panel1;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        panel1 = new JPanel();
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

        //======== panel1 ========
        {
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(
                    0, 0, 0, 0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder
                    .BOTTOM, new java.awt.Font("Dia\u006cog", java.awt.Font.BOLD, 12), java.awt.Color.
                    red), panel1.getBorder()));
            panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                @Override
                public void propertyChange(java.
                                                   beans.PropertyChangeEvent e) {
                    if ("bord\u0065r".equals(e.getPropertyName())) throw new RuntimeException();
                }
            });

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                            .addGap(0, 266, Short.MAX_VALUE)
            );
            panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                            .addGap(0, 195, Short.MAX_VALUE)
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(51, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(128, Short.MAX_VALUE))
        );
        setSize(600, 400);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JPanel panel1;
    public ArrayList answerList;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
