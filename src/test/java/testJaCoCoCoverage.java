import org.testng.Assert;
import org.testng.annotations.Test;

public class testJaCoCoCoverage {

    JaCoCoCoverage jcc = new JaCoCoCoverage();

    @Test
    public void jacocoCoverage(){
        Assert.assertEquals(true, jcc.isPasswordValid("CGI@123"));

    }

    @Test
    public void jacocoCoverageWithInvalidPassword1(){
        Assert.assertEquals(false, jcc.isPasswordValid("CGI123"));

    }

    @Test
    public void jacocoCoverageWithInvalidPassword2(){
        Assert.assertEquals(false, jcc.isPasswordValid("CGI1"));

    }

    @Test
    public void jacocoCoverageWithInvalidPassword3(){
        Assert.assertEquals(false, jcc.isPasswordValid("CGI1282732ejedhj"));

    }
}
