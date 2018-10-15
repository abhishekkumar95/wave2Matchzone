package com.matchzone.service;

import java.util.ArrayList;
import java.util.List;

public class Tagging {
    
//POS Tagger is a piece of software that reads text in some language and assigns parts of speech to each word (other token)	

    public List<String> tagFunction(List<String> list, List<String> file)
    {
        List<String> taggedList=new ArrayList<>();
        for(String str:list) {
            if(file.indexOf(str)!=-1)
            {
                taggedList.add(str);
            }
        }
        return taggedList;
    }
    
    //Tagging in terms of year of experiences
    
     public List<String> tagYears(List<String> list, List<String> file)
    {
        List<String> taggedList=new ArrayList<>();
        for(String str:list) {
            if(file.indexOf(str)!=-1)
            {
                String[] str1=str.split("");
                taggedList.add(str1[0]);
            }
        }
        return taggedList;
    }
}
