package lab3;

import javafx.util.Pair;
import java.util.*;
import java.util.stream.Collectors;


public class TextManipulator {
public String str;

Scanner scanner1=new Scanner(System.in);

    public void createText() {
        System.out.println("Give the text:");
            this.str =scanner1.nextLine();

    }

    public String getText() {
        return this.str;
    }



public void occurenceCount(String text) {
    LinkedHashMap<String,Integer> words = new LinkedHashMap<String,Integer>();
    String str1 [] = text.split("[\\s.,?!:]");
    for (String s : str1){
        int count=0;
        if(words.containsKey(s)){
            count = words.get(s);
        }
        words.put(s,count+1);
    }

    List<Pair<String,Integer>> mostFrequent=
            words.entrySet()
                  .stream()
                  .sorted(Comparator.comparing(e->-e.getValue()))
                   .map(e->new Pair<>(e.getKey(),e.getValue()))
                   .collect(Collectors.toList());
int c=0;
for(Pair<String,Integer> e : mostFrequent){

    if(c++>=5) break;
    System.out.println(e.getKey() + " : " + e.getValue());

}

}


    public static int countWords(String text){
        if(text == null || text.isEmpty()){
            return 0;
        }else {
            String[] tokens= text.split("[\\s.,?!:]+");
            return tokens.length;
        }
}
    public static int nrOfSequences(String text){
        if(text == null || text.isEmpty()){
            return 0;
        }else {
            String[] tokens= text.split("[!?.:]+");
            return tokens.length;
        }
    }
    public static int countVowels(String text)
    {
        int count = 0;
        text=text.toLowerCase();
        for (int i = 0; i < text.length(); i++)
        {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i'
                    || text.charAt(i) == 'o' || text.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
    public static int countConsonants(String text)
    {
        int countv = 0;
        int countc=0;
        text=text.toLowerCase();
        for (int i = 0; i < text.length(); i++)
        {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i'
                    || text.charAt(i) == 'o' || text.charAt(i) == 'u')
            {
                countv++;
            }else if(text.charAt(i)>='a' && text.charAt(i)<='z'){
                countc++;
            }
        }
        return countc;
    }






}
