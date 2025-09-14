package Gun05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _03_DataProvider_ÇokBoyutlu {

    @Test(dataProvider = "UserData")
    void UserNamePassWordTest(String username, String Password) {
        System.out.println(username + " " + Password);

    }

    @DataProvider
    Object[][] UserData() {

        Object[][] userPass = {
                {"Yasemin", "12345"},
                {"Merve", "Wekl3z"},
                {"Kübra", "xcvm7@"}

        };
        return userPass;
    }
}
