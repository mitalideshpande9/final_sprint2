package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
    private WebDriver driver;

    public Homepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getSearchBox() {
        return searchBox;
    }

    //public WebElement getSearchResult() {
    //return searchResult;
    @FindBy(xpath = "//input[@class='searchInput form-controls']")
    WebElement searchBox;
    @FindBy(xpath = "//input[@class='searchInput form-controls']")
    WebElement box;

    public WebElement getBox() {
        return box;
    }

//    public WebElement getResult() {
//        return Result;

    public WebElement getSearch() {
        return Search;
    }

    @FindBy(xpath = "//input[@type='text']")
    WebElement Search;

    @FindBy(xpath = "//input[@class='searchInput form-controls']")
    WebElement InvalidSearch;

    public WebElement getInvalidSearch() {
        return InvalidSearch;
    }

    @FindBy(xpath = "//input[@placeholder='Search by product, category or collection']")
    WebElement UpperCase;

    public WebElement getUpperCase() {
        return UpperCase;
    }

//    public WebElement getOutline() {
//        return outline;
//    }
//
//    @FindBy(xpath = "//input[@class='searchInput form-controls']")
//    WebElement outline;
}
