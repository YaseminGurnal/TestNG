package Gun02;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_Dependency {
    @Test
    public void StartCar(){
        System.out.println("Start car");
        //Assert.fail();
    }
    @Test(dependsOnMethods = {"StartCar"})
    public void DriveCar() {System.out.println("Drive car");}

    @Test(dependsOnMethods = {"StartCar","DriveCar"})//Bağımlılık birden fazla verilebilir.
    public void ParkCar() {System.out.println("Park car");}

    @Test(dependsOnMethods = {"ParkCar"},alwaysRun = true) //Hatalı olsada çalışmaya devam et.
    public void StopCar() {System.out.println("Stop car");}
}
