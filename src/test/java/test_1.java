import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class test_1 {
 HomePage homePage ;
 ProductsPage productsPage;
ProductDetailPage productDetailPage
    CartPage cartPage





    @Test
public void search_product(){
    homePage.searchBox().search("ceket");
Assertion.assertTrue(productsPage.isOnProductPage(),
       "Ürün sayfasında değil!* " );
}

    @Test
    public void select_product(){
        productsPage.selectProduct(1);
        Assertion.assertTrue(productDetailPage.isonprductDetailPage,
                "Ürünün detay sayfası değil!*");
    }

    @Test
    public void add_product_to_cart(){
productDetailPage.addToCart();
    }

    @Test
    public void go_to_cart(){
homePage.goToCart();
        Assertion.assertTrue(cartPage.chechifproductAdded
        "Ürün sepete eklenmedi");
    }



}
