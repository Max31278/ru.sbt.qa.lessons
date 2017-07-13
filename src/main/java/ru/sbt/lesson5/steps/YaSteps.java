package ru.sbt.lesson5.steps;

import net.thucydides.core.annotations.Step;
import ru.sbt.lesson5.pages.Ya;

/**
 * Created by dmitriy on 22.06.17.
 */
public class YaSteps {
    public Ya yaPage;

    @Step("Открыта страница Ya")
    public void openYa() {
        yaPage.open();
    }

    @Step("Выполнен поиск по тексту {0}")
    public void init(String login, String password) {
        yaPage.inputLogin.type(login);
        yaPage.inputPassword.type(password);
        yaPage.btnSearch.click();
    }

    @Step("Успешно открыта страница с результатом")
    public boolean isContainsResult(){
        return yaPage.containsElements("[class = 'serp-list']");
    }
}
