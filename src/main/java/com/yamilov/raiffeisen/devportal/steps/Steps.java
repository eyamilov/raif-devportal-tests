package com.yamilov.raiffeisen.devportal.steps;

import io.cucumber.java.ru.Дано;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Log4j
public class Steps {
    @Дано("^открываем песочницу курьерской доставки$")
    public void openExchangeCourierSandbox() {
        open("https://api.raiffeisen.ru/");
        $(By.xpath("//a[contains(text(),'Посмотреть API продукты')]")).click();
        $(By.xpath("//div[@class='col']//h3//a[contains(text(),'Курьерская доставка')]")).click();
        $(By.xpath("//a[contains(text(),'API18-EXCHANGE-COURIER')]")).click();
        $(By.xpath("//a[contains(text(),'Песочница')]")).click();
    }
}
