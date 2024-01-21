import org.junit.Assert;
import org.junit.Test;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

public class MainClassTest extends MainClass
{
    @Test
public void testGetClassString(){
        String actual = getClassString();
        Assert.assertTrue("no Hello or hello in this string", actual.toLowerCase().contains("hello"));

    }}

