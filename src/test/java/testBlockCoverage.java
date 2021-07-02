import org.testng.Assert;
import org.testng.annotations.Test;

public class testBlockCoverage {

    BlockCoverage block = new BlockCoverage();

    @Test
    public void testCountOfWords(){
        Assert.assertEquals(2, block.countOfWordsEndingWithUAndE("How are you"));
    }

    @Test
    public void testAnotherCountOfWords(){
        Assert.assertEquals(2, block.countOfWordsEndingWithUAndE("How are you doing"));
    }

    @Test
    public void testAnotherNewCountOfWordsU(){
        Assert.assertEquals(1, block.countOfWordsEndingWithUAndE("You"));
    }

    @Test
    public void testAnotherNewCountOfWordsE(){
        Assert.assertEquals(1, block.countOfWordsEndingWithUAndE("Bee"));
    }

}
