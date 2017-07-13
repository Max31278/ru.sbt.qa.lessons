package lesson5;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import ru.sbt.lesson5.steps.YaSteps;

/**
 * Created by dmitriy on 22.06.17.
 */

public class StepDefs {
    @Steps
    YaSteps yaSteps;

    @Дано("открыта страница быстрого поиска Яндекс")
    public void openPageYa(){
        yaSteps.openYa();
    }



    @Тогда("выполен поиск")
    public void thenYa() {
        Assert.assertTrue(yaSteps.isContainsResult());
    }
}
