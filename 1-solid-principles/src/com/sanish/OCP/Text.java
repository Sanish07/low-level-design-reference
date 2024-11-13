package com.sanish.OCP;

public class Text implements File{

    Integer noOfCharacters;
    Double sizeInKBytes;

    public Text(Integer noOfCharacters, Double sizeInKBytes) {
        this.noOfCharacters = noOfCharacters;
        this.sizeInKBytes = sizeInKBytes;
    }

    @Override
    public String printFileMetaData() {
        return "Text file metadata --- "+"No of characters : "+noOfCharacters+", size(KBs) : "+sizeInKBytes;
    }
}
