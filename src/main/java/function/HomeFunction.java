package function;

import Utils.Tab;
import core.AppiumBase;
import pages.HomePage;

public class HomeFunction extends AppiumBase {
    CommonFunction commonFunction = new CommonFunction();
    HomePage homePage = new HomePage();

    public void click_danh_muc_san_pham(){
        commonFunction.click(homePage.menuBar(Tab.HomePage.CATEGORY));
    }

    public void click_laptop_may_vi_tinh(){
        commonFunction.swipeMobileToClick(homePage.latopCategory, 1001, 2114, 1001, 366);
        commonFunction.click(homePage.latopCategory);
    }

    public void scroll_and_click_to_hàng_mới(int number){
        commonFunction.swipeMobileToClick(homePage.dropDown, 1001, 2114, 1001, 366);
        commonFunction.click(homePage.dropDown);
        commonFunction.click(homePage.dropDownList(number));
    }

    // Exercise 2
    public void click_điện_thoại_máy_tính_bảng(String text){
//        commonFunction.click(homePage.category(text));
        commonFunction.click(homePage.phone);
    }

    public void scroll_to_bộ_lọc_phổ_biến_and_click_thương_hiệu(String text){
        commonFunction.swipeMobileToClick(homePage.filter, 1001, 2001, 1001, 366);
        commonFunction.click(homePage.filter);
        commonFunction.swipeMobileToClick(homePage.categoryOfFilter(text), 1001, 2001, 1001, 366);
        commonFunction.click(homePage.categoryOfFilter(text));
    }

    public void verify_button_xem_sản_phẩm_should_be_displayed(){
        commonFunction.getText(homePage.btnDone);
    }

    public void click_xem_sản_phẩm(){
        commonFunction.click(homePage.btnDone);
    }

}
