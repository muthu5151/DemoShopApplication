package com.test.cucumber.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.cucumber.utilities.ReusableOperations;

public class HomePageobjects extends ReusableOperations {

	public HomePageobjects(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[text()='Add to wishlist']")
	public List<WebElement> btnAddWishlist;

	@FindBy(xpath="//*[@class='cc-btn cc-accept-all cc-btn-no-href']")
	public WebElement btnAcceptAll;

	@FindBy(xpath="//*[contains(@class,'product-type')]//h2")
	public List<WebElement> lblProductType;

	@FindBy(xpath="(//*[@class='lar la-heart'])[1]")
	public WebElement btnWishListIcon;

	@FindBy(xpath="//*[@class='products columns-5']//*[@class='woocommerce-Price-currencySymbol']/..")
	public List<WebElement> lblPrices;

	@FindBy(xpath="//*[text()='Add to cart']")
	public List<WebElement> btnAddtoCart;

	@FindBy(xpath="//*[text()='Add to cart']/..//bdi")
	public List<WebElement> lstPriceCart;

	@FindBy(xpath="//*[text()='Add to cart']/..//h2")
	public List<WebElement> lstAddtoCartHeader;

	@FindBy(xpath="//*[@class='added_to_cart wc-forward']")
	public WebElement btnViewCard;

	@FindBy(xpath="//div[@class='yith-wcwl-wishlistaddedbrowse']")
	public WebElement btnAddedWishList;

	public boolean AddedWishListDisplayed() {
		return btnAddedWishList.isDisplayed();
	}

	public boolean viewCartDisplayed() {
		return btnViewCard.isDisplayed();
	}

	public List<WebElement> AddtoCartHeader() {
		return lstAddtoCartHeader;
	}

	public List<WebElement> listbtnAddtoCart() {
		return btnAddtoCart;
	}

	public List<WebElement> addToCartPriceList() {
		return lstPriceCart;
	}

	public List<WebElement> priceList() {
		return lblPrices;
	}

	public void clickAcceptAll() {
		clickOnElement(btnAcceptAll);
	}

	public List<WebElement> lstAddWishList() {
		return btnAddWishlist;
	}

	public List<WebElement> lstProductType() {
		return lblProductType;
	}

	public void clickWishListIcon() {
		clickOnElement(btnWishListIcon);
	}

}
