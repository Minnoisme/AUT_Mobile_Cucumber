package stepDefinitionl;

import core.AppiumBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.net.MalformedURLException;

public class ServiceHooks extends AppiumBase {
    // khởi tạo giá trị ban đầu
    @Before
    public void beforeHook() throws MalformedURLException, InterruptedException {
        System.out.println("this is steps : beforeHooks");
        setup();
    }

    @After
    public void afterHook(Scenario scenario){
        System.out.println("this is steps : afterHooks");
        if(scenario.isFailed()){
            System.out.println("this is steps : scenario.isFailed");
            scenario.attach(((TakesScreenshot)AppiumBase.driver).getScreenshotAs(OutputType.BYTES),"image/png", "image");
        }
        tearDown();
    }
}
