package part2.com.shanks.tests.products;

import com.saucedemo.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.shanks.base.BaseTest;

public class ProductsTest extends BaseTest {
    @Test
    public void testProductsHeaderIsDisplayed(){
        ProductsPage productsPage = loginPage.loginToApplication("standard_user","secret_sauce");
        //can also use var here

        Assert.assertTrue(productsPage.isProductsHeaderDisplayed(),"\n products header is displayed \n");

    }
}
