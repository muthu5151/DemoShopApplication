package com.test.cucumber.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.cucumber.utilities.ReusableOperations;

public class CartPageobjects extends ReusableOperations {


	public CartPageobjects(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//td[@class='product-name']/a")
	public WebElement lblCart;

	@FindBy(xpath="(//*[@class='la la-shopping-bag'])[1]")
	public WebElement btnCart;

	public void clickCart() {
		clickOnElement(btnCart);
	}

	public String getlblCart() {
		return getTextFromElement(lblCart);
	}
}
