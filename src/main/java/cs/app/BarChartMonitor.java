package cs.app;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class BarChartMonitor extends ApplicationFrame {
    private static Subject subject;
    public BarChartMonitor( String applicationTitle , String chartTitle ) {
        super( applicationTitle );
        JFreeChart barChart = ChartFactory.createBarChart(
                chartTitle,
                "",
                "",
                createDataset(),
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel( barChart );
        chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );
        setContentPane( chartPanel );
    }

    private CategoryDataset createDataset( ) {
        final String A = "A";
        final String B = "B";
        final String C = "C";
        final String D = "D";
        final DefaultCategoryDataset dataset =
                new DefaultCategoryDataset( );

        dataset.addValue( subject.getA() , A, A );
        dataset.addValue( subject.getB() , B, B );
        dataset.addValue( subject.getC() , C, C );
        dataset.addValue( subject.getD() , D, D );
        return dataset;
    }

}
