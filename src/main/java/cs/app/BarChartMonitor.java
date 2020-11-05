package cs.app;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class BarChartMonitor extends ApplicationFrame {
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

    private CategoryDataset createDataset(int a, int b, int c, int d ) {
        final String A = "A";
        final String B = "B";
        final String C = "C";
        final String D = "D";
        final DefaultCategoryDataset dataset =
                new DefaultCategoryDataset( );

        dataset.addValue( a  , A, A );
        dataset.addValue( b , B, B );
        dataset.addValue( c, C, C );
        dataset.addValue( d , D, D );
        return dataset;
    }

}
