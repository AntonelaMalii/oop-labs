package lab3;


public class Main {
    public static void main(String[] args) {


TextManipulator tx= new TextManipulator();
tx.createText();
String text=tx.getText();
        System.out.println("Nr de cuvinte in text:");
        System.out.println(tx.countWords(text));
        System.out.println("Nr de propozitii in text:");
        System.out.println(tx.nrOfSequences(text));
        System.out.println("Nr de vocale in text:");
        System.out.println(tx.countVowels(text));
        System.out.println("Nr de consoane in text:");
        System.out.println(tx.countConsonants(text));
        System.out.println("Top 5 cuvinte cele mai frecvente: ");
        tx.occurenceCount(tx.getText());


    }
}
