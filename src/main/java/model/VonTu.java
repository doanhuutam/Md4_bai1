package model;

public class VonTu {
    private String english;
    private String meaning;

    public VonTu() {
    }

    public VonTu(String english, String meaning) {
        this.english = english;
        this.meaning = meaning;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
}
