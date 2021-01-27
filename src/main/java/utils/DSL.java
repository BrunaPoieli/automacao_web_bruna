package utils;

import org.junit.Assert;
import org.openqa.selenium.*;

import java.util.List;

public class DSL {

    private final WebDriver driver;

    public DSL(WebDriver driver){
        this.driver = driver;
    }

    public void clickById(String text){
        driver.findElement(By.id(text)).click();
    }

    public void sendTextById(String element, String text){
        driver.findElement(By.id(element)).sendKeys(text);
    }

    public void enterClick(String element){
        driver.findElement(By.id(element)).sendKeys(Keys.ENTER);
    }

    public void validateById(String element){
        boolean validacao = false;
        if(driver.findElement(By.id(element)).isDisplayed()){
            validacao = true;
        }
        Assert.assertTrue(validacao);
    }

    public void validateByLinkText(String element){
       boolean validacao = false;
       if(driver.findElement(By.linkText(element)).isDisplayed()){
           validacao = true;
       }
       Assert.assertTrue(validacao);
    }

    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
    }

    public void clickByPositionClassName(String element, int index) {
        driver.findElements(By.className(element)).get(index).click();
    }

    public void fielValidateByList(String classe, String texto) {
        boolean validacao = false;
        List<WebElement> classText = (List<WebElement>) driver.findElements(By.className(classe));
        for(WebElement element : classText){
            if(element.getText().equalsIgnoreCase(texto)){
                validacao = true;
                break;
            }
        }
        Assert.assertTrue(validacao);
    }

    public void validateByClassName(String element){
        boolean validacao = false;

        if (driver.findElement(By.className(element)).isDisplayed()){
            validacao = true;
        }

        Assert.assertTrue(validacao);
    }



}
