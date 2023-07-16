package stepDefinitionl;

import core.AppiumBase;
import function.HomeFunction;
import function.ProductGridFunction;
import function.ProductViewFunction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TikiApp extends AppiumBase {
    HomeFunction homeFunction = new HomeFunction();
    ProductGridFunction productGridFunction = new ProductGridFunction();
    ProductViewFunction productViewFunction = new ProductViewFunction();

    // Exercise 1
    @Given("open TiKi app")
    public void open_ti_ki_app() {
        System.out.println("this is steps : open_ti_ki_app");
    }

    @Given("Click Danh Muc San Pham")
    public void click_danh_muc_san_pham() {
        System.out.println("this is steps : click_danh_muc_san_pham");
        homeFunction.click_danh_muc_san_pham();
    }
    @When("Click Laptop – May Vi Tinh")
    public void click_laptop_may_vi_tinh() {
        System.out.println("this is steps : click_laptop_may_vi_tinh");
        homeFunction.click_laptop_may_vi_tinh();
    }
    @When("Scroll and click to “Hàng mới”")
    public void scroll_and_click_to_hàng_mới() {
        System.out.println("this is steps : scroll_and_click_to_hàng_mới");
        homeFunction.scroll_and_click_to_hàng_mới(2);
    }
    @Then("Click first the product")
    public void click_first_the_product() {
        System.out.println("this is steps : click_first_the_product");
        productGridFunction.click_first_the_product(3);
    }
    @Then("The product name, product price should be displayed")
    public void the_product_name_product_price_should_be_displayed() {
        System.out.println("this is steps : the_product_name_product_price_should_be_displayed");
        productViewFunction.verify_the_product_name_product_price();
    }

    // Exercise 2

    @When("Click “Điện thoại – Máy tính bảng\"")
    public void click_điện_thoại_máy_tính_bảng() {
        System.out.println("this is steps : click_điện_thoại_máy_tính_bảng");
        homeFunction.click_điện_thoại_máy_tính_bảng("Điện Thoại - Máy Tính Bảng");
    }

    @When("Scroll to “Bộ lọc Phổ Biến” and click “Thương Hiệu”")
    public void scroll_to_bộ_lọc_phổ_biến_and_click_thương_hiệu() {
        System.out.println("this is steps : scroll_to_bộ_lọc_phổ_biến_and_click_thương_hiệu");
        homeFunction.scroll_to_bộ_lọc_phổ_biến_and_click_thương_hiệu("Panasonic");
    }
    @When("Verify button “Xem ## Sản Phẩm” should be displayed")
    public void verify_button_xem_sản_phẩm_should_be_displayed() {
        System.out.println("this is steps : verify_button_xem_sản_phẩm_should_be_displayed");
        homeFunction.verify_button_xem_sản_phẩm_should_be_displayed();
    }
    @When("Click “Xem ## sản phẩm”")
    public void click_xem_sản_phẩm() {
        System.out.println("this is steps : click_xem_sản_phẩm");
        homeFunction.click_xem_sản_phẩm();
    }

}
