package com.ToolsQA.TestPackages.BookStoreTests;

import com.ToolsQA.TestSetupPackages.BookStoreSetup.BooksPageSetup;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BooksPageTest extends BooksPageSetup {

    /**
     * Happy path test
     * This test checks if added book is in the collection
     * Steps to reproduce:
     * 1. Open url "https://demoqa.com/profile"
     * 2. Delete all the booksPage
     * 3. Go to "https://demoqa.com/books"
     * 4. Add book to collection
     * 5. Go to profile
     * 6. Assert that book is in the collection section
     *
     * Expected results: book is added to collection
     */
    @Test(priority = 0)
    public void addBookToCollection() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/books");
        booksPage.addBookToCollection();
        booksPage.backToBookStore();
        driver.navigate().to("https://demoqa.com/profile");
        Assert.assertTrue(driver.getPageSource().contains("Learning JavaScript Design Patterns"));
    }

    /**
     * Happy path test
     * This test checks if the book is deleted from the collection after adding it
     * Steps to reproduce:
     * 1. Navigate to "https://demoqa.com/books"
     * 2. Add 1 book to collection
     * 3. Navigate to profile
     * 4. Delete added book
     * 5. Assert that book is not in the collection
     *
     * Expected results: book is deleted from the collection
     * @throws InterruptedException Thread sleep because sometime while I run test, alert message is not clicked
     */
    @Test(priority = 1)
    public void removeBookFromCollection() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/books");
        booksPage.addBookToCollection();
        driver.navigate().to("https://demoqa.com/profile");
        booksPage.deleteBook();
        Assert.assertFalse(driver.getPageSource().contains("Learning JavaScript Design Patterns"));
    }

    /**
     * Happy path test
     * This test checks if all the booksPage are deleted from the collection
     * Steps to reproduce:
     * 1. Navigate to "https://demoqa.com/books"
     * 2. Add 1 book to collection just to be sure there are booksPage in collection
     * 3. Navigate to profile
     * 4. Click delete all the booksPage button
     * 5. Assert that booksPage are deleted from the collection
     *
     * Expected results: BooksPage are deleted from the collection
     * @throws InterruptedException Thread sleep to be sure that alert message is clicked
     */
    @Test(priority = 2)
    public void removeAllBooksFromCollection() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/books");
        booksPage.addBookToCollection();
        driver.navigate().to("https://demoqa.com/profile");
        booksPage.deleteAllBooks();
        Assert.assertEquals(elementControl.getTextFromAlert(), "All Books deleted.");
        elementControl.acceptAlert();
    }
}
