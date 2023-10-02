package com.example.signuploginfirebase;

public class DataClass {

    private String dataTitle;
    private String dataDesc;
    private String dataPrice;
    private String dataImage;

    public DataClass(String dataTitle, String dataDesc, String dataPrice, String dataImage) {
        this.dataTitle = dataTitle;
        this.dataDesc = dataDesc;
        this.dataPrice = dataPrice;
        this.dataImage = dataImage;
    }
    public String getDataTitle() {
        return dataTitle;
    }

    public String getDataDesc() {
        return dataDesc;
    }

    public String getDataPrice() {
        return dataPrice;
    }

    public String getDataImage() {
        return dataImage;
    }

    public DataClass(){

    }

}
