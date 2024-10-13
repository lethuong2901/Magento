package PageUIs;

public class ProductPageUIs {

    public static final String PRODUCT_NAME ="xpath= //a[text()='%s']" ;
    public static final String PRODUCT_PRICE = "xpath=//a[text()='%s']//parent::h2//following-sibling::div[@class='price-box']//span[@class='price']";
    public static final String ADD_CART_BUTTON = "xpath=//a[text()='%s']//parent::h2//following-sibling::div[@class='actions']//span[text()='Add to Cart']" ;
}
