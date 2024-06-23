package org.Lumu;

import org.Lumu.Pages.HomePage;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.Assert.assertEquals;


public class AppTest extends Hooks {

    @Test
    @DisplayName("Smallest word counter test")
    public void CountWordsOfSmallestWordTest(){
        String wordCount = "1";
        HomePage homePage = new HomePage(driver);

        homePage.typeSmallestSentenceInTheBox();
        assertEquals(homePage.getWordCount(), wordCount);
    }

    @Test
    @DisplayName("Simple sentence word counter test")
    public void CountWordsOfSimpleSentenceTest(){
        String wordCount = "10";
        HomePage homePage = new HomePage(driver);

        homePage.typeSimpleSentenceInTheBox();
        assertEquals(homePage.getWordCount(), wordCount);
    }

    @Test
    @DisplayName("Sentence with signs word counter test")
    public void CountWordsWithSignsTest(){
        String wordCount = "27";
        HomePage homePage = new HomePage(driver);

        homePage.typeSentenceWithSignInTheBox();
        assertEquals(homePage.getWordCount(), wordCount);
    }

    @Test
    @DisplayName("Only special characters word counter test")
    public void CountWordsOfOnlySpecialCharactersTest(){
        String wordCount = "0";
        HomePage homePage = new HomePage(driver);

        homePage.typeOnlySpecialCharactersInTheBox();
        assertEquals(homePage.getWordCount(), wordCount);
    }

    @Test
    @DisplayName("Smallest character counter test")
    public void CountCharacterOfSmallestWordTest(){
        String characterCount = "1";
        HomePage homePage = new HomePage(driver);

        homePage.typeSmallestSentenceInTheBox();
        assertEquals(homePage.getCharacterCount(), characterCount);
    }

    @Test
    @DisplayName("Simple sentence character counter test")
    public void CountCharacterOfSimpleSentenceTest(){
        String characterCount = "62";
        HomePage homePage = new HomePage(driver);

        homePage.typeSimpleSentenceInTheBox();
        assertEquals(homePage.getCharacterCount(), characterCount);
    }

    @Test
    @DisplayName("Sentence with signs character counter test")
    public void CountCharacterWithSignsTest(){
        String characterCount = "131";
        HomePage homePage = new HomePage(driver);

        homePage.typeSentenceWithSignInTheBox();
        assertEquals(homePage.getCharacterCount(), characterCount);
    }

    @Test
    @DisplayName("Only special characters character counter test")
    public void CountCharactersOfOnlySpecialCharactersTest(){
        String characterCount = "20";
        HomePage homePage = new HomePage(driver);

        homePage.typeOnlySpecialCharactersInTheBox();
        assertEquals(homePage.getCharacterCount(), characterCount);
    }

    @Test
    @DisplayName("Smallest word and character counter test")
    public void CountWordAndCharacterOfSmallestWordTest(){
        String wordCharacterCount = "1 word 1 character";
        HomePage homePage = new HomePage(driver);

        homePage.typeSmallestSentenceInTheBox();
        assertEquals(homePage.getWordsAndCharactersCount(), wordCharacterCount);
    }

    @Test
    @DisplayName("Simple sentence word and character counter test")
    public void CountWordCharacterOfSimpleSentenceTest(){
        String wordCharacterCount = "10 words 62 characters";
        HomePage homePage = new HomePage(driver);

        homePage.typeSimpleSentenceInTheBox();
        assertEquals(homePage.getWordsAndCharactersCount(), wordCharacterCount);
    }

    @Test
    @DisplayName("Sentence with signs word and character counter test")
    public void CountWordCharacterWithSignsTest(){
        String wordCharacterCount = "27 words 131 characters";
        HomePage homePage = new HomePage(driver);

        homePage.typeSentenceWithSignInTheBox();
        assertEquals(homePage.getWordsAndCharactersCount(), wordCharacterCount);
    }

    @Test
    @DisplayName("Only special characters word and character counter test")
    public void CountWordCharactersOfOnlySpecialCharactersTest(){
        String wordCharacterCount = "0 words 20 characters";
        HomePage homePage = new HomePage(driver);

        homePage.typeOnlySpecialCharactersInTheBox();
        assertEquals(homePage.getWordsAndCharactersCount(), wordCharacterCount);
    }

    @Test
    @DisplayName("The most repeated word test")
    public void MostRepeatedWordTest(){
        String mostRepeatedWord = "gato";
        HomePage homePage = new HomePage(driver);

        homePage.typeKeywordDensityInTheBox();
        assertEquals(homePage.getMostRepeatedWord(), mostRepeatedWord);
    }

    @Test
    @DisplayName("The counter of the most repeated word test")
    public void CounterOfMostRepeatedWordTest(){
        String countMostRepeatedWord = "16 (21%)";
        HomePage homePage = new HomePage(driver);

        homePage.typeKeywordDensityInTheBox();
        assertEquals(homePage.getCounterMostRepeatedWord(), countMostRepeatedWord);
    }

    @Test
    @DisplayName("The second most repeated word test")
    public void MostSecondRepeatedWordTest(){
        String secondMostRepeatedWord = "profundamente";
        HomePage homePage = new HomePage(driver);

        homePage.typeKeywordDensityInTheBox();
        assertEquals(homePage.getSecondMostRepeatedWord(), secondMostRepeatedWord);
    }

    @Test
    @DisplayName("The counter of the second most repeated word test")
    public void CounterOfSecondMostRepeatedWordTest(){
        String countSecondMostRepeatedWord = "11 (14%)";
        HomePage homePage = new HomePage(driver);

        homePage.typeKeywordDensityInTheBox();
        assertEquals(homePage.getCounterSecondMostRepeatedWord(), countSecondMostRepeatedWord);
    }

    @Test
    @DisplayName("The third most repeated word test")
    public void ThirdMostRepeatedWordTest(){
        String thirdMostRepeatedWord = "cat";
        HomePage homePage = new HomePage(driver);

        homePage.typeKeywordDensityInTheBox();
        assertEquals(homePage.getThirdMostRepeatedWord(), thirdMostRepeatedWord);
    }

    @Test
    @DisplayName("The counter of the third most repeated word test")
    public void CounterOfThirdMostRepeatedWordTest(){
        String countThirdMostRepeatedWord = "8 (10%)";
        HomePage homePage = new HomePage(driver);

        homePage.typeKeywordDensityInTheBox();
        assertEquals(homePage.getCounterThirdMostRepeatedWord(), countThirdMostRepeatedWord);
    }

    @Test
    @DisplayName("Not count keyword density with a vowel")
    public void NotCountKeywordDensityWithAVowel(){
        String message = "Start typing your document to get a list of most used keywords";
        HomePage homePage = new HomePage(driver);

        homePage.typeSmallestSentenceInTheBox();
        assertEquals(homePage.getEmptyMessageKeywordDensity(), message);
    }

    @Test
    @DisplayName("X2 keyword density test")
    public void X2KeywordDensityTest(){
        String mostRepeatedWordInX2 = "profundamente profundamente";
        HomePage homePage = new HomePage(driver);

        homePage.typeKeywordDensityInTheBox()
                .clickOnX2Button();

        assertEquals(homePage.getMostRepeatedWord(), mostRepeatedWordInX2);
    }

    @Test
    @DisplayName("X3 keyword density test")
    public void X3KeywordDensityTest(){
        String mostRepeatedWordInX3 = "cat chased cat";
        HomePage homePage = new HomePage(driver);

        homePage.typeKeywordDensityInTheBox()
                .clickOnX3Button();

        assertEquals(homePage.getMostRepeatedWord(), mostRepeatedWordInX3);
    }

    @Test
    @DisplayName("remove a keyword density test")
    public void remove1stKeywordTest(){
        String mostRepeatedWord = "profundamente";
        HomePage homePage = new HomePage(driver);

        homePage.typeKeywordDensityInTheBox()
                .clickOnMostRepeatedWord()
                .clickOnRemove1stButton();

        assertEquals(homePage.getMostRepeatedWord(),mostRepeatedWord);
    }

    @Test
    @Ignore
    @DisplayName("remove a keyword density in x2 test")
    public void remove2stKeywordInX2Test(){
        String secondMostRepeatedWord = "cat chased";
        HomePage homePage = new HomePage(driver);

        homePage.typeKeywordDensityInTheBox()
                .clickOnX2Button()
                .clickOnSecondMostRepeatedWord()
                .clickOnRemove2ndButton();

        assertEquals(homePage.getSecondMostRepeatedWord(),secondMostRepeatedWord);
    }


}