package com.krafttech.pages;


import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {


        @FindBy(xpath = "//h1[.='Dashboard']")
        public WebElement dashboardPageTitle;

        @FindBy(xpath = "(//span[.='</aFm>'])[1]")
        public WebElement aFmTitle;

        @FindBy(xpath = "//span[@class='d-none d-md-block dropdown-toggle ps-2']")
        public WebElement userPupUp;



        @FindBy(xpath = "//a[.='Home']")
        public WebElement homeLink;

        @FindBy(xpath = "//span[.='Sign Out']")
        public WebElement signOut;

        @FindBy(xpath = "//div[@class='copyright']")
        public WebElement copyRight;

        @FindBy(xpath = "//h3[.='isa akyuz']")
        public WebElement usernameLocator;

        @FindBy(xpath = "//span[.='JavaScript']")
        public WebElement tabLocator;

        @FindBy(xpath = "//span[.='Modal']")
        public WebElement moduleLocator;


        @FindBy(xpath = "//a[@class='nav-link nav-profile d-flex align-items-center pe-0']")
        public WebElement getUserName_loc;



       public String DashboardPageTitle(String title){

            String Title=dashboardPageTitle.getText();
            return Title;
        }


        public String UsersNames(String name){
               String usernameLocator="//h3[.='"+name+"']";

                BrowserUtils.waitForPresenceOfElement(By.xpath(usernameLocator),5);

                WebElement UserName= Driver.get().findElement(By.xpath(usernameLocator));

                String actualName= UserName.getText();

                return actualName;
        }

        public String getUserName(){

           BrowserUtils.waitForVisibility(getUserName_loc,5);

           return getUserName_loc.getText();
        }
        public String getHomeName(String homeName){
           BrowserUtils.waitFor(3);
           return Driver.get().findElement(By.xpath("//li[text()='"+homeName+"']")).getText();
        }





}
