package cs.app;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;

import java.awt.*;


public class PieChartMonitor extends ApplicationFrame {
    private static Subject subject;

    public PieChartMonitor( String title ) {
        super( title );
        setContentPane(createDemoPanel( ));
    }
    private static PieDataset createDataset( ) {
        DefaultPieDataset dataset = new DefaultPieDataset( );
        dataset.setValue( "A" , subject.getA());
        dataset.setValue( "B" , subject.getB());
        dataset.setValue( "C" , subject.getC());
        dataset.setValue( "D" , subject.getD());
        return dataset;
    }
    private static JFreeChart createChart(PieDataset dataset ) {
        JFreeChart chart = ChartFactory.createPieChart(
                "Mobile Sales",   // chart title
                dataset,          // data
                true,             // include legend
                true,
                false);

        return chart;
    }

    public static Container createDemoPanel( ) {
        JFreeChart chart = createChart(createDataset( ) );
        return new ChartPanel( chart );
    }


}
