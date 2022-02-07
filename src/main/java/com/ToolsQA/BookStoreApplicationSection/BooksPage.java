package com.ToolsQA.BookStoreApplicationSection;

import com.ToolsQA.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksPage extends BasePage {

    public BooksPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Learning JavaScript Design Patterns')]")
    WebElement bookToAdd;
    @FindBy(xpath = "//button[contains(text(),'Add To Your Collection')]")
    WebElement addToUrCollectionButton;
    @FindBy(xpath = "//button[contains(text(),'Back To Book Store')]")
    WebElement backToBookStoreButton;
    @FindBy(id = "delete-record-undefined")
    WebElement deleteBookButton;
    @FindBy(id = "closeSmallModal-ok")
    WebElement deleteBookOkButton;
    @FindBy(xpath = "//button[contains(text(),'Delete All Books')]")
    WebElement deleteAllBooks;
    @FindBy(id = "closeSmallModal-ok")
    WebElement deleteAllBooksOkButton;

    @FindBy(className = "rt-tr")
    public WebElement booksInProfile;

    /**
     * This method adds a book to your collection
     * @throws InterruptedException
     */
    public void addBookToCollection() throws InterruptedException {
        elementControl.clickOnHoveredElement(bookToAdd);
        elementControl.clickElement(addToUrCollectionButton);
        Thread.sleep(3000);
        elementControl.acceptAlert();
    }

    /**
     *  This method brings you back to the store
     */
    public void backToBookStore() {
        elementControl.clickElement(backToBookStoreButton);
    }

    /**
     * This method deletes a book from your collection and accept alert that pops out.
     * @throws InterruptedException
     */
    public void deleteBook() throws InterruptedException {
        elementControl.clickElement(deleteBookButton);
        elementControl.clickElement(deleteBookOkButton);
        Thread.sleep(3000);
        elementControl.acceptAlert();
    }

    /**
     * This method deletes all the books from your collection and accept alert that pops out
     * @throws InterruptedException
     */
    public void deleteAllBooks() throws InterruptedException {
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", deleteAllBooks);
        elementControl.clickElement(deleteAllBooks);
        elementControl.clickElement(deleteAllBooksOkButton);
        Thread.sleep(3000);
    }
}
