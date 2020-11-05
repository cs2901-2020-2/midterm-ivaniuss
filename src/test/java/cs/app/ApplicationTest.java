package cs.app;

import jdk.internal.loader.AbstractClassLoaderValue;
import org.jfree.ui.RefineryUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class ApplicationTest {

    @Test
    void SubjectTest(){

        Subject subject = new Subject();
        Assert.assertEquals(subject.getA(), 40);
        Assert.assertEquals(subject.getB(), 25);
        Assert.assertEquals(subject.getC(), 15);
        Assert.assertEquals(subject.getD(), 20);



    }

    @Test
    void barChartMonitortest(){
/*        BarChartMonitor chart = new BarChartMonitor("Car Usage Statistics",
                "Which car do you like?");
        chart.pack( );
        RefineryUtilities.centerFrameOnScreen( chart );
        chart.setVisible( true );
  */  }
/*
    @Test
    void pieChartMonitortest(){
        PieChartMonitor demo = new PieChartMonitor( "Mobile Sales" );
        demo.setSize( 560 , 367 );
        RefineryUtilities.centerFrameOnScreen( demo );
        demo.setVisible( true );
    }
 */

}
