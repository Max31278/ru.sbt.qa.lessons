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

    @Step("Выполнить вход в почту")
    public void init(String login, String password) {
        yaPage.inputLogin.type(login);
        yaPage.inputPassword.type(password);
        yaPage.btnSearch.click();
    }

    @Step("Отправить письмо")
    public void send(String whom, String topic, String text){
        yaPage.inputWhoom.type(whom);
        yaPage.inputTopic.type(topic);
        yaPage.inputText.type(text);
        yaPage.btnSend.click();
    }

    @Step("Проверить отправку письма")
    public String check(){
        return yaPage.getResult.getText();
    }


}
