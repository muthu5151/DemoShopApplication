package com.test.cucumber.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.cucumber.utilities.ReusableOperations;

public class MyWishlistPageObjects extends ReusableOperations {

	public MyWishlistPageObjects(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//td[@class='product-name']/a")
	public List<WebElement> lstProductwishlist;

	public int productwishlistSize() {
		return lstProductwishlist.size();
	}

	public List<WebElement> productWishList() {
		return lstProductwishlist;
	}
}
