package ru.yandex.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage extends BasePage {

    public OrderPage(WebDriver webDriver) {
        super(webDriver);
    }

    // "Имя"
    private By inputName = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Имя']");
    // "Фамилия"
    private By inputSurname = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Фамилия']");
    // "Адрес"
    private By inputAdress = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Адрес: куда привезти заказ']");
    // "Метро"
    private By inputUnderground = By.xpath(".//div[@class='select-search__value']/input[@placeholder='* Станция метро']");
    // "Бульвар Рокоссовского"
    protected By UdergroundRokossovskyBoulevard = By.xpath(".//button[@value='1']");
    // "Свиблово"
    protected By UdergroundSviblovo = By.xpath(".//button[@value='94']");
    // "Телефон"
    private By inputPhone = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@placeholder='* Телефон: на него позвонит курьер']");
    // "Далее"
    private By buttonFurther = By.xpath(".//div[@class='Order_NextButton__1_rCA']/button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    // "Когда привезти самокат"
    private By inputDateDelivety = By.xpath(".//div[@class='react-datepicker__input-container']/input[@placeholder='* Когда привезти самокат']");
    // "Срок аренды"
    private By inputRentalPeriod = By.xpath(".//div[@class='Dropdown-control']/div[@class='Dropdown-placeholder']");
    //"двое суток"
    private By checkBoxTwoDay = By.xpath(".//div[@class='Dropdown-menu']/div[2]");
    // "Трое суток"
    private By checkBoxThreeDay = By.xpath(".//div[@class='Dropdown-menu']/div[3]");
    // "Про аренду"
    private By headingSamokat = By.xpath(".//div[@class='Order_Header__BZXOb']");
    // Чекбокс "Черный жемчуг"
    private By checkboxBlackPearl = By.xpath(".//label[@class='Checkbox_Label__3wxSf']/input[@id='black']");
    // "Серая безысходность"
    private By checkboxGrayHopelessness = By.xpath(".//label[@class='Checkbox_Label__3wxSf']/input[@id='grey']");
    // "Комментарий курьеру"
    private By commentСourier = By.xpath(".//div[@class='Input_InputContainer__3NykH']/input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']");
    // "Заказать"
    private By buttonOrderMiddle = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    // "Да" в подтверждении заказа
    private By yesButtonConfirmButton = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text() ='Да']");
    // "Посмотреть статус"
    protected By buttonViewOrder = By.xpath(".//div[@class='Order_NextButton__1_rCA']/button[text()='Посмотреть статус']");

    public void inputName(String text) {
        webDriver.findElement(inputName).sendKeys(text);
    }
    public void inputSurname(String text) {
        webDriver.findElement(inputSurname).sendKeys(text);
    }
    public void inputAdress(String text) {
        webDriver.findElement(inputAdress).sendKeys(text);
    }
    public void inputUnderground(String text) {
        webDriver.findElement(inputUnderground).sendKeys(text);
    }
    public void clickUnderground(By metro) {
        webDriver.findElement(metro).click();
    }
    public void inputPhone(String phone) {
        webDriver.findElement(inputPhone).sendKeys(phone);
    }
    public void clickButtonFurther() {
        webDriver.findElement(buttonFurther).click();
    }
    public void insertDates (String text) {
        webDriver.findElement(inputDateDelivety).sendKeys(text);
    }

    public void clickRentalPeriod () {
        webDriver.findElement(inputRentalPeriod).click();
    }
    public void clickThreeDay () {
        webDriver.findElement(checkBoxThreeDay).click();
    }

    public void clickTwoDay() {
        webDriver.findElement(checkBoxTwoDay).click();
    }

    public void clickEmptySpace() {
        webDriver.findElement(headingSamokat).click();
    }

    public void clickBlackPearl() {
        webDriver.findElement(checkboxBlackPearl).click();
    }

    public void clickGrayHopelessness() {
        webDriver.findElement(checkboxGrayHopelessness).click();
    }

    public void clickButtonOrderMiddle() {
        webDriver.findElement(buttonOrderMiddle).click();
    }

    public void clickYesButtonConfirmOrder() {
        webDriver.findElement(yesButtonConfirmButton).click();
    }

    public boolean displayingButtonViewOrder () {
        return webDriver.findElement(buttonViewOrder).isDisplayed();
    }

    public  void writeCommentСourier(String text) {
        webDriver.findElement(commentСourier).sendKeys(text);
    }

}