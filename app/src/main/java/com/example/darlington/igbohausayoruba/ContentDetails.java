package com.example.darlington.igbohausayoruba;

/**
 * Created by Darlington on 5/16/2017.
 */

public class ContentDetails {
    int icon1;
    String englishWord;
    String langTranslation;
    int icon2;
    int audioResourceIgbo;

    ContentDetails(int icon1, String englishWord, String langTranslation, int icon2, int audioResourceIgbo){
        this.icon1 = icon1;
        this.icon2 = icon2;
        this.englishWord = englishWord;
        this.langTranslation = langTranslation;
        this.audioResourceIgbo = audioResourceIgbo;
    }

    ContentDetails(String englishWord, String langTranslation, int icon2, int audioResourceIgbo){
        this.icon2 = icon2;
        this.englishWord = englishWord;
        this.langTranslation = langTranslation;
        this.audioResourceIgbo = audioResourceIgbo;

    }

    ContentDetails(int icon1, String englishWord, String langTranslation, int icon2){
        this.icon1 = icon1;
        this.icon2 = icon2;
        this.englishWord = englishWord;
        this.langTranslation = langTranslation;
    }

    ContentDetails(String englishWord, String langTranslation, int icon2){
        this.icon2 = icon2;
        this.englishWord = englishWord;
        this.langTranslation = langTranslation;

    }

    public int getIcon1(){
        return icon1;
    }

    public String getEnglishWord(){
        return englishWord;
    }

    public int getIcon2() {
        return icon2;
    }

    public String getLangTranslation(){
        return  langTranslation;
    }

    public int getAudioResourceIgbo() { return audioResourceIgbo; }

}
