package Gun01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _07_Assertions {
    @Test
    public void EqualOrnek(){
     String s1="Merhaba";
     String s2="Merhaba";

     //Actual(oluşan), Expected(beklenen), mesajı(opsiyonel)
        Assert.assertEquals(s1,s2,"Oluşan ile beklenen aynı değil.");

    }

    @Test
    public void NotEqualOrnek(){
        String s1="Merhaba";
        String s2="Merhaba";

       Assert.assertNotEquals(s1,s2,"Oluşan ile beklenen farklı değil.");

    }

    @Test
    public void TrueOrnek(){
        String s1="Merhaba";
        String s2="Merhaba";

        Assert.assertTrue(s1.equals(s2),"Oluşan ile beklenen aynı değil.");
    }

    @Test
    public void TrueOrnek2(){
        String s1="Merhaba";
        String s2="Merhaba";

        Assert.assertTrue(s1==s2,"Oluşan ile beklenen aynı değil.");
    }

    @Test
    public void NullOrnek(){
        String s="Null";

        Assert.assertNull(s,"Değer null değil.");
    }

    @Test
    public void DirekFail(){
        int a=56;
       if (a!=56)
           Assert.fail();
    }

    @Test
    public void FalseOrnek(){
        int s1=5;
        int s2=7;

        Assert.assertFalse(s1==s2,"Oluşan ile beklenen aynı değil.");
    }

}


