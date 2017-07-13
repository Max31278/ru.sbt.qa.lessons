package ru.sbt.lesson5.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * Created by dmitriy on 22.06.17.
 */
@DefaultUrl("https://mail.ru/")
public class Ya extends PageObject {

    @FindBy(id = "text")
    public WebElementFacade inputText;

    @FindBy(id = "mailbox__login")
    public WebElementFacade inputLogin;

    @FindBy(id = "mailbox__password")
    public WebElementFacade inputPassword;

    @FindBy(xpath = "//button/span[text()='Войти']/..")
    public WebElementFacade btnSearch;

}
