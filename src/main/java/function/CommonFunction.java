package function;

import core.AppiumBase;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class CommonFunction extends AppiumBase {
    public void click(By locator){
        WebElement element = AppiumBase.wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }

    public String getText(By locator){
        WebElement element = AppiumBase.wait.until(ExpectedConditions.elementToBeClickable(locator));
        String text = element.getText();
        return text;
    }

    public void click(By locator, int position){
        List<WebElement> elementList = AppiumBase.wait.until(ExpectedConditions.visibilityOfAllElements(AppiumBase.driver.findElement(locator)));
        elementList.get(position - 1).click();
    }

    public void verifyText(By locator){
        WebElement element = AppiumBase.wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        System.out.println(element.getText());
    }

    public void elementIsDisplayed(By locator){
        WebElement element = AppiumBase.wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
        Assert.assertTrue(element.isDisplayed());
    }

    public void imageDisplayed(By locator){
        WebElement element = AppiumBase.wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Assert.assertTrue(element.isDisplayed());
    }

    public void swipeMobileToClick(By locator, int startX, int startY, int endX, int endY) {
        for (int i = 0; i <= 10; i++){
            if (AppiumBase.driver.findElements(locator).size() != 0)
                break;
            swipe(startX, startY, endX, endY);
        }
    }

    public void swipe(int startx, int starty, int endx, int endy) {
        new TouchAction(AppiumBase.driver).longPress(PointOption.point(startx, starty))
                .moveTo(PointOption.point(endx, endy))
                .release().perform();
    }

}
