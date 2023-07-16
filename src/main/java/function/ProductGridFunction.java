package function;

import core.AppiumBase;
import pages.ProductGirdPage;

public class ProductGridFunction extends AppiumBase {
    CommonFunction commonFunction = new CommonFunction();
    ProductGirdPage productGirdPage = new ProductGirdPage();

    public void click_first_the_product(int number){
        commonFunction.click(productGirdPage.products(number));
    }

}
