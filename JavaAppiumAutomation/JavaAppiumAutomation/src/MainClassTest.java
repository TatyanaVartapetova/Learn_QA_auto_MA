import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
public void testGetClassNumber(){
        int actual = getClassNumber();
        Assert.assertTrue("number <= 45",actual>45);
    }
}
