package pages;

import org.openqa.selenium.By;

public class ProductGirdPage {
    public By products(int position){
        return By.xpath("//android.view.ViewGroup[" + position + "]/android.view.View");
    }
}
