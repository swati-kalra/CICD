import org.testng.Assert;
import org.testng.annotations.Test;

public class testLineCoverage {
    lineCoverage lc = new lineCoverage();

    @Test
    public void testGetWinner(){
        Assert.assertEquals(19, lc.findWinnerForSomeGame(19, 17));

    }

    @Test
    public void testGetLoser(){
        Assert.assertEquals(0, lc.findWinnerForSomeGame(31, 27));

    }

}
