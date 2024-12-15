package CodingQuestions_Practice;

import java.util.HashMap;
import java.util.Map;

public class CountryCounter {
    public static void main(String[] args){
        String input = "US, US, US, UK, UK, JPN, USA";
        String[] countries=input.split(",");
        Map<String,Integer> countryCount=new HashMap<>();
        for(String country :countries){
            countryCount.put(country,countryCount.getOrDefault(country,0)+1);
        }
 for(Map.Entry<String,Integer> entry : countryCount.entrySet()){
     System.out.println(entry.getKey()+"="+entry.getValue());
 }
    }
}
