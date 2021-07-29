package com.test.cucumber.steps;

import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.test.cucumber.pageobjects.CartPageobjects;
import com.test.cucumber.pageobjects.HomePageobjects;
import com.test.cucumber.pageobjects.MyWishlistPageObjects;
import com.test.cucumber.utilities.ReadProperties;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoshopSteps {

	private WebDriver driver = Hooks.driver;
	private WebDriverWait wait;
	ArrayList<Double> prodRate = new ArrayList<Double>();
	ArrayList<String> wishlist = new ArrayList<String>();
	double lowestPriceProduct=0;
	String cartHeader = null;


	public DemoshopSteps() throws Exception {
		ReadProperties propertiesReader = new ReadProperties();
		this.wait = new WebDriverWait(driver, propertiesReader.getTimeout());
	}

	@Given("^I add \"([^\"]*)\" different product to my wish list$")
	public void i_add_different_product_to_my_wish_list(String count) {
		HomePageobjects home = new HomePageobjects(driver, wait);
		home.clickAcceptAll();
		int wishCount = Integer.parseInt(count);
		if(home.lstAddWishList().size()>0) {
			home.moveToElement(home.lstAddWishList().get(0));
			for (int productCount = 0; productCount < wishCount; productCount++) {
				wishlist.add(home.getTextFromElement(home.lstProductType().get(productCount)));
				home.clickOnElement(home.lstAddWishList().get(0));
				if (home.AddedWishListDisplayed())
					System.out.println("Added to wishlist successfully - " + productCount);
			}
		}
	}

	@When("^I view my wishlist table$")
	public void i_view_my_wishlist_table() {
		HomePageobjects home = new HomePageobjects(driver, wait);
		home.clickWishListIcon();
	}

	@Then("^I find total \"([^\"]*)\" selected items in my Wishlist$")
	public void i_find_total_selected_items_in_my_Wishlist(String arg1) {
		MyWishlistPageObjects mywishlist = new MyWishlistPageObjects(driver, wait);
		for(int listcount = 0; listcount < mywishlist.productwishlistSize(); listcount++) {
			String actualValue = mywishlist.getTextFromElement(mywishlist.productWishList().get(listcount));
			String arraywishValue = wishlist.get(mywishlist.productwishlistSize()-(listcount+1));
			Assert.assertTrue(actualValue.equals(arraywishValue));
		}
	}

	@Given("^I search for \"([^\"]*)\" price product$")
	public void i_search_for_price_product(String arg1)  {
		HomePageobjects home = new HomePageobjects(driver, wait);
		home.clickAcceptAll();
		for(int priceCount=0;priceCount<home.priceList().size();priceCount++) {
			String act = home.getTextFromElement(home.priceList().get(priceCount)).replace("£", "");
			prodRate.add(Double.parseDouble(act));
		}
		int amountElement=0;
		for(int amountValue=1;amountValue<prodRate.size();amountValue++) {
			if(prodRate.get(amountElement)<prodRate.get(amountValue)) 
				lowestPriceProduct = prodRate.get(amountElement);
			else
				amountElement=amountValue;
			if(amountValue==prodRate.size())
				break;
		}
		System.out.println(lowestPriceProduct);
	}

	@When("^I am able to add the \"([^\"]*)\" price item to my cart$")
	public void i_am_able_to_add_the_price_item_to_my_cart(String arg1)  {
		HomePageobjects home = new HomePageobjects(driver, wait);
		for(int i=0;i<home.addToCartPriceList().size();i++) {
			String rate = lowestPriceProduct+"";
			if(home.getTextFromElement(home.addToCartPriceList().get(i)).contains(rate)) {
				home.moveToElement(home.listbtnAddtoCart().get(i));
				home.clickOnElement(home.listbtnAddtoCart().get(i));
				cartHeader = home.getTextFromElement(home.AddtoCartHeader().get(i));
				if (home.viewCartDisplayed()) 
					System.out.println("Lowest price item is added to card successfully");
				break;
			}
		}
	}

	@Then("^I am able to verify the item in my cart$")
	public void i_am_able_to_verify_the_item_in_my_cart()  {
		CartPageobjects cartPage = new CartPageobjects(driver, wait);
		cartPage.clickCart();
		Assert.assertTrue(cartHeader.equals(cartPage.getlblCart()));;
	}

}
