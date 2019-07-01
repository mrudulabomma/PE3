package com.stackroute.pe3;
/*class which replaces the vowels with spaces*/
public class VowelsRemover {
    public String[] check(String [] words){
        for(int i=0;i<words.length;i++){
            words[i]= words[i].replaceAll("[aeiouAEIOU]", "");
        }
        return words;
    }
}
