import java.text.DecimalFormat;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;


public class PieChartSample extends JFrame {
    private ChartPanel chartPanel;

    public PieChartSample() {
        super();
    }

    public PieChartSample(String title, PieDataset dataset) {
        super(title);

        // Create chart
        JFreeChart chart = ChartFactory.createPieChart(title, dataset, false, true, false);

        //Format Label
        PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator(
                "{0} : {1} ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));
        ((PiePlot) chart.getPlot()).setLabelGenerator(labelGenerator);

        chartPanel = new ChartPanel(chart);
    }


    public ChartPanel getChartPanel() {
        return chartPanel;
    }

    public DefaultPieDataset createDataset(Long yesCounter, Long noCounter, Long naCounter) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Tak", yesCounter);
        dataset.setValue("Nie", noCounter);
        dataset.setValue("N/A", naCounter);
        return dataset;
    }
}