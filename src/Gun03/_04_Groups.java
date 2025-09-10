package Gun03;

import org.testng.annotations.Test;

public class _04_Groups {
    @Test(groups = {"Smoke Test"})  //Grup etiketi verildi.
    public void Test1(){System.out.println("Test 1");}

    @Test(groups = {"Regression Test"})
    public void Test2(){System.out.println("Test 2");}

    @Test(groups = {"Regression Test"})
    public void Test3(){System.out.println("Test 3");}

    @Test(groups = {"Regression Test"})
    public void Test4(){System.out.println("Test 4");}

    @Test(groups = {"Smoke Test"})
    public void Test5(){System.out.println("Test 5");}

    @Test(groups = {"Smoke Test"})
    public void Test6(){System.out.println("Test 6");}

    @Test
    public void Test7(){System.out.println("Test 7");}
}
