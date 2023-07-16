package function;

import core.AppiumBase;
import pages.ProductViewPage;

public class ProductViewFunction extends AppiumBase {
    CommonFunction commonFunction = new CommonFunction();
    ProductViewPage productViewPage = new ProductViewPage();

    public void verify_the_product_name_product_price(){
        commonFunction.getText(productViewPage.name);
        commonFunction.getText(productViewPage.price);
    }

}
