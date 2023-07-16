Feature: verify product name and product price
  Background: open TiKi app
    Given open TiKi app

  @smokeTest
  Scenario: Verify the product name, product price
    Given Click Danh Muc San Pham
    When Click Laptop – May Vi Tinh
    And Scroll and click to “Hàng mới”
    Then Click first the product
    And  The product name, product price should be displayed

    @regressionTest
    Scenario: Verify the product name, product price
      Given Click Danh Muc San Pham
      When Click “Điện thoại – Máy tính bảng"
      And  Scroll to “Bộ lọc Phổ Biến” and click “Thương Hiệu”
      And  Verify button “Xem ## Sản Phẩm” should be displayed
      And  Click “Xem ## sản phẩm”
      Then Click first the product
      And  The product name, product price should be displayed