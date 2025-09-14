package Gun05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_DataProvider {

    @Test(dataProvider = "datalarım")
    public void userNameTest(String username){
        System.out.println(username);

    }
    @DataProvider
   Object[] datalarım(){
    Object [] userlar={"Ummuhan","Merve","Yasemin"};
            return userlar;
   }

    @Test(dataProvider = "datalarım2")
    public void userIDler(int username){
        System.out.println(username);

    }
    @DataProvider
    Object[] datalarım2(){
        Object [] userlar={1001,1002,1003};
        return userlar;
    }
}
