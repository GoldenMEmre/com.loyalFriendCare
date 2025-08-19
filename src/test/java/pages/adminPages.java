package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class adminPages {

    public adminPages(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
@FindBy (xpath = "(//*[@class='btn_add'])[1]")
    public WebElement signinButton;

}
