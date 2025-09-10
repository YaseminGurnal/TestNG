package Gun03;

import org.testng.annotations.*;

public class _02_Intro {

    @BeforeSuite
    public  void BeforeSuite(){  System.out.println("Before Suite");}

    @BeforeTest
    public  void BeforeTest(){  System.out.println("Before Test");}

    @BeforeGroups
    public  void BeforeGroups(){  System.out.println("Before Groups");}

    @BeforeClass
    public  void BeforeClass(){  System.out.println("Before Class");}

    @BeforeMethod
    public  void BeforeMethod(){  System.out.println("Before Method");}

    @Test
    public  void Intro02_Test1(){  System.out.println("_02_Intro Test 1");}

    @Test
    public  void Intro02_Test2(){  System.out.println("_02_Intro Test 2");}

    @AfterMethod
    public  void AfterMethod(){  System.out.println("After Method");}

    @AfterClass
    public  void AfterClass(){  System.out.println("After Class");}

    @AfterTest
    public  void AfterTest(){  System.out.println("After Test");}

    @AfterSuite
    public  void AfterSuite(){  System.out.println("After Suite");}

}
