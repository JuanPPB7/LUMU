package org.Lumu.Pages;

import org.Lumu.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class HomePage {
    private final WebDriver driver;
    private final Helpers helpers;
    private static final Logger log = LogManager.getLogger(HomePage.class);
    private final By textBox = By.id("box");
    private final By wordsCount = By.id("word_count");
    private final By charactersCount = By.id("character_count");
    private final By wordsCharactersCount = By.xpath("//span[@class='counted']");
    private final By mostRepeatedWord = By.xpath("(//a[@class='list-group-item']/span[@class='word'])[1]");
    private final By secondMostRepeatedWord = By.xpath("(//a[@class='list-group-item']/span[@class='word'])[2]");
    private final By thirdMostRepeatedWord = By.xpath("(//a[@class='list-group-item']/span[@class='word'])[3]");
    private final By counterMostRepeatedWord = By.xpath("(//a[@class='list-group-item']/span[@class='badge'])[1]");
    private final By counterSecondMostRepeatedWord = By.xpath("(//a[@class='list-group-item']/span[@class='badge'])[2]");
    private final By counterThirdMostRepeatedWord = By.xpath("(//a[@class='list-group-item']/span[@class='badge'])[3]");
    private final By emptyMessageKeywordDensity = By.xpath("//li[@class='list-group-item']/p[@class='message_for_empty_panel']");
    private final By x2Button = By.id("consecutive-2-link");
    private final By x3Button = By.id("consecutive-3-link");
    private final By remove1stButton = By.id("ignore_word_tooltip_0");
    private final By remove2ndButton = By.id("ignore_word_tooltip_1");
    private final By remove3rdButton = By.id("ignore_word_tooltip_2");


    String smallestWordPath = "../resources/texts/smallest_word";
    String simpleSentencePath = "../resources/texts/simple_sentence";
    String sentenceWithSignPath = "../resources/texts/sentence_with_signs";
    String onlySpecialCharactersPath = "../resources/texts/only_special_characters";
    String keywordDensityPath = "../resources/texts/keyword_density";

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.helpers = new Helpers(driver);
    }

    public HomePage typeSmallestSentenceInTheBox(){
        log.debug("Getting the text of smallest_word...");
        String smallestWord = Helpers.readerFile(smallestWordPath);

        driver.findElement(textBox).sendKeys(smallestWord);
        log.debug("Typing the text of smallest_word...");
        return new HomePage(driver);
    }
    public HomePage typeSimpleSentenceInTheBox() {
        log.debug("Getting the text of simple_sentences...");
        String simpleSentence = Helpers.readerFile(simpleSentencePath);

        driver.findElement(textBox).sendKeys(simpleSentence);
        log.debug("Typing the text of simple_sentences...");
        return new HomePage(driver);
    }

    public HomePage typeSentenceWithSignInTheBox(){
        log.debug("Getting the text of sentence_with_signs...");
        String simpleSentence = Helpers.readerFile(sentenceWithSignPath);

        driver.findElement(textBox).sendKeys(simpleSentence);
        log.debug("Typing the text of sentence_with_signs...");
        return new HomePage(driver);
    }

    public HomePage typeOnlySpecialCharactersInTheBox(){
        log.debug("Getting the text of only_special_characters...");
        String onlySpecialCharactersSentence = Helpers.readerFile(onlySpecialCharactersPath);

        driver.findElement(textBox).sendKeys(onlySpecialCharactersSentence);
        log.debug("Typing the text of only_special_characters...");
        return new HomePage(driver);
    }

    public HomePage typeKeywordDensityInTheBox(){
        log.debug("Getting the text of keyword_density...");
        String keywordDensityText = Helpers.readerFile(keywordDensityPath);

        driver.findElement(textBox).sendKeys(keywordDensityText);
        log.debug("Typing the text of keyword_density...");
        return new HomePage(driver);
    }

    public String getWordCount (){
        log.debug("Getting the word count...");
        helpers.waitForElementToBeRefreshed();
        return driver.findElement(wordsCount).getText();
    }

    public String getCharacterCount(){
        log.debug("Getting the characters count...");
        helpers.waitForElementToBeRefreshed();
        return driver.findElement(charactersCount).getText();
    }

    public String getWordsAndCharactersCount(){
        log.debug("Getting the words and characters count...");
        helpers.waitForElementToBeRefreshed();
        return driver.findElement(wordsCharactersCount).getText();
    }

    public String getMostRepeatedWord(){
        log.debug("Getting the most repeated word...");
        helpers.waitForElementToBeRefreshed();
        return driver.findElement(mostRepeatedWord).getText();
    }

    public String getCounterMostRepeatedWord(){
        log.debug("Getting the counter of the most repeated word...");
        helpers.waitForElementToBeRefreshed();
        return driver.findElement(counterMostRepeatedWord).getText();
    }

    public String getSecondMostRepeatedWord(){
        log.debug("Getting the second most repeated word...");
        helpers.waitForElementToBeRefreshed();
        return driver.findElement(secondMostRepeatedWord).getText();
    }

    public String getCounterSecondMostRepeatedWord(){
        log.debug("Getting the counter of the second most repeated word...");
        helpers.waitForElementToBeRefreshed();
        return driver.findElement(counterSecondMostRepeatedWord).getText();
    }

    public String getThirdMostRepeatedWord(){
        log.debug("Getting the third most repeated word...");
        helpers.waitForElementToBeRefreshed();
        return driver.findElement(thirdMostRepeatedWord).getText();
    }

    public String getCounterThirdMostRepeatedWord(){
        log.debug("Getting the counter of the third most repeated word...");
        helpers.waitForElementToBeRefreshed();
        return driver.findElement(counterThirdMostRepeatedWord).getText();
    }

    public String getEmptyMessageKeywordDensity(){
        log.debug("Getting the empty message keyword density...");
        helpers.waitForElementToBeRefreshed();
        return driver.findElement(emptyMessageKeywordDensity).getText();
    }

    public HomePage clickOnX2Button(){
        log.debug("Clicking th X2 button...");
        driver.findElement(x2Button).click();
        return new HomePage(driver);
    }

    public HomePage clickOnX3Button(){
        log.debug("Clicking the X3 button...");
        driver.findElement(x3Button).click();
        return new HomePage(driver);
    }

    public HomePage clickOnMostRepeatedWord(){
        log.debug("Clicking the most repeated word...");
        driver.findElement(mostRepeatedWord).click();
        return new HomePage(driver);
    }

    public HomePage clickOnSecondMostRepeatedWord(){
        log.debug("Clicking the Second most repeated word...");
        driver.findElement(secondMostRepeatedWord).click();
        return new HomePage(driver);
    }

    public HomePage clickOnThirdMostRepeatedWord(){
        log.debug("Clicking the third most repeated word...");
        driver.findElement(thirdMostRepeatedWord).click();
        return new HomePage(driver);
    }

    public HomePage clickOnRemove1stButton(){
        log.debug("Clicking first remove button...");
        driver.findElement(remove1stButton).click();
        return new HomePage(driver);
    }

    public HomePage clickOnRemove2ndButton(){
        log.debug("Clicking second remove button...");
        driver.findElement(remove2ndButton).click();
        return new HomePage(driver);
    }

    public HomePage clickOnRemove3rdButton(){
        log.debug("Clicking third remove button...");
        driver.findElement(remove3rdButton).click();
        return new HomePage(driver);
    }
}
