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
    private static PieDataset createDataset(int a, int b, int c, int d ) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue( "A" , a);
        dataset.setValue( "B" , b);
        dataset.setValue( "C" , c);
        dataset.setValue( "D" , d);
        return dataset;
    }
    private static JFreeChart createChart(PieDataset dataset ) {
        JFreeChart chart = ChartFactory.createPieChart(
                "",
                dataset,
                true,
                true,
                false);

        return chart;
    }

    public static Container createDemoPanel( ) {
        JFreeChart chart = createChart(createDataset(1,2 ,3 ,4 ) );
        return new ChartPanel( chart );
    }


}
