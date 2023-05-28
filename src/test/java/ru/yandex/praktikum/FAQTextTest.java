package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class orderPositiveTest {

    @Test
    public void checkOrderUpButton() {
        ru.yandex.practicum.MainPage mainPage = new ru.yandex.practicum.MainPage(webDriver);
        mainPage.clickOrderUpButton();
        OrderPage orderPage = new OrderPage(webDriver);
        mainPage.clickCookieButton();
        orderPage.inputName("Петр");
        orderPage.inputSurname("Петров");
        orderPage.inputAdress("Халтуринская улица, 20");
        orderPage.inputUnderground("Бульвар Рокоссовского");
        orderPage.clickUnderground(orderPage.UdergroundRokossovskyBoulevard);
        orderPage.inputPhone("87779998877");
        orderPage.clickButtonFurther(); // Кнопка Далее
        orderPage.insertDates("29.05.2023");
        orderPage.clickEmptySpace();
        orderPage.clickRentalPeriod();
        orderPage.clickThreeDay(); // 3 дня
        orderPage.clickBlackPearl(); // Черный жемчуг
        orderPage.clickButtonOrderMiddle(); // Заказать
        orderPage.clickYesButtonConfirmOrder(); // Кнопка ДА
        boolean isDisplayed = orderPage.displayingButtonViewOrder();
        Assert.assertTrue("Кнопка 'Посмотреть статус' не найдена", isDisplayed);
    }

    @Test
    public void checkOrderMiddleButton() {
        ru.yandex.practicum.MainPage mainPage = new ru.yandex.practicum.MainPage(webDriver);
        mainPage.clickCookieButton();
        mainPage.clickOrderMiddleButton();
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.inputName("Иван");
        orderPage.inputSurname("Иванов");
        orderPage.inputAdress("улица Амундсена, 12");
        orderPage.inputUnderground("Свиблово");
        orderPage.clickUnderground(orderPage.UdergroundSviblovo);
        orderPage.inputPhone("89997779977");
        orderPage.clickButtonFurther();
        orderPage.insertDates("29.05.2023");
        orderPage.clickEmptySpace();
        orderPage.clickRentalPeriod();
        orderPage.clickTwoDay(); // 2 дня
        orderPage.clickGrayHopelessness(); // Серая безысходность
        orderPage.writeCommentСourier("Код домофона - 1111");
        orderPage.clickButtonOrderMiddle(); // Заказать
        orderPage.clickYesButtonConfirmOrder(); // Кнопка ДА
        boolean isDisplayed = orderPage.displayingButtonViewOrder();
        Assert.assertTrue("Кнопка 'Посмотреть статус' не найдена", isDisplayed);
    }

}