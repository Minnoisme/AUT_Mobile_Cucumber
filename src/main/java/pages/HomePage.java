package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class HomePage {
    public By menuBar(String tabName){
        return new AppiumBy.ByAccessibilityId(tabName);
    }

    // At Category
    public By category(String text){
        return By.xpath("//android.widget.TextView[@text='" + text + "' and @resource-id='vn.tiki.app.tikiandroid.category2:id/tvContent']");
    }

    public By leftCategory(String text){
        return By.xpath("//android.widget.TextView[@text='" + text + "' and @resource-id='vn.tiki.app.tikiandroid.category2:id/tvContent']");
    }

    public By dropDown = By.id("vn.tiki.app.tikiandroid.productList:id/ivSortToggle");

    public By dropDownList(int position){
        return  By.xpath("//android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/" +
                "android.view.ViewGroup[" + position + "]");
    }

    public By phone = By.xpath("//android.widget.TextView[@text='Điện Thoại - Máy Tính Bảng' and @resource-id='vn.tiki.app.tikiandroid.category2:id/tvName']");
    public By latopCategory = By.xpath("//android.widget.TextView[@text='Laptop - Máy Vi Tính - Linh kiện' and @resource-id='vn.tiki.app.tikiandroid.category2:id/tvName']");
    public By crossBorder = By.xpath("//android.widget.TextView[@text='Cross Border - Hàng Quốc Tế' and @resource-id='vn.tiki.app.tikiandroid.category2:id/tvContent']");

    // filter
    public By filter = By.id("vn.tiki.app.tikiandroid.productList:id/vFilterOverlay");
    public By categoryOfFilter(String text){
        return By.xpath("//android.widget.TextView[@text='" + text + "']");
    }
    public By btnDone = By.id("vn.tiki.app.tikiandroid.productList:id/btn_done");
}
