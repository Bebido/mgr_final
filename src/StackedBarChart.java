import java.awt.Color;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.ui.ApplicationFrame;

public class StackedBarChart extends ApplicationFrame {

    private ChartPanel chartPanel;

    public StackedBarChart(String title, List<ResultAnswer> resultAnswers) {
        super(title);

        final CategoryDataset dataset = createDataset(resultAnswers);
        final JFreeChart chart = createChart(dataset);
        chartPanel = new ChartPanel(chart);
    }

    private CategoryDataset createDataset(List<ResultAnswer> resultAnswers) {
        double[][] data = new double[][]{
                {210, 300, 320, 265, 299, 200},
                {200, 304, 201, 201, 340, 300},
                {200, 304, 201, 201, 340, 300},
        };
        return DatasetUtilities.createCategoryDataset(
                "Team ", "Kategora", data);
    }

    private JFreeChart createChart(final CategoryDataset dataset) {

        final JFreeChart chart = ChartFactory.createStackedBarChart(
                null, "", null,
                dataset, PlotOrientation.HORIZONTAL, true, true, false);

        chart.setBackgroundPaint(new Color(249, 231, 236));

        CategoryPlot plot = chart.getCategoryPlot();
        plot.getRenderer().setSeriesPaint(0, new Color(40, 128, 37));
        plot.getRenderer().setSeriesPaint(1, new Color(255, 49, 47));
        plot.getRenderer().setSeriesPaint(2, new Color(189, 181, 192));

        return chart;
    }

    public ChartPanel getChartPanel() {
        return chartPanel;
    }

    public void setChartPanel(ChartPanel chartPanel) {
        this.chartPanel = chartPanel;
    }
}