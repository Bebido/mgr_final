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

        /////////////////////// utworzenie wykresu kolowego /////////////////////////////////////////

        PieChartSample pieChartSample = new PieChartSample("Odpowiedzi",
                new PieChartSample().createDataset(yesCounter, noCounter, naCounter));
        panel1.setLayout(new java.awt.BorderLayout());
        panel1.add(pieChartSample.getChartPanel(), BorderLayout.CENTER);
        panel1.validate();

        ////////////////////// utworzenie wykresu slupkowego ////////////////////////////////////////

        StackedBarChart stackedBarChart = new StackedBarChart("Wyniki", resultAnswers);
        panel2.setLayout(new java.awt.BorderLayout());
        panel2.add(stackedBarChart.getChartPanel(), BorderLayout.CENTER);
        panel2.validate();
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel1 = new JPanel();
        panel2 = new JPanel();
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

        //======== panel1 ========
        {
            panel1.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing.
            border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax. swing .border . TitledBorder. CENTER
            ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .awt . Font
            . BOLD ,12 ) ,java . awt. Color .red ) ,panel1. getBorder () ) ); panel1. addPropertyChangeListener(
            new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062ord\u0065r"
            .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGap(0, 375, Short.MAX_VALUE)
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGap(0, 228, Short.MAX_VALUE)
            );
        }

        //======== panel2 ========
        {

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGap(0, 577, Short.MAX_VALUE)
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGap(0, 244, Short.MAX_VALUE)
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(144, Short.MAX_VALUE)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(161, 161, 161))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(61, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29)
                    .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(34, Short.MAX_VALUE))
        );
        setSize(700, 600);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel panel1;
    private JPanel panel2;
    public ArrayList answerList;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
