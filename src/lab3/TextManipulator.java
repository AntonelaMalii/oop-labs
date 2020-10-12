package lab3;

public class TextManipulator {
    private String text;
    private String[] tokens;
    private String[] sentence;


    public String getText() {
        return text;
    }
    public void setText(){
        this.text=text;
    }

    public void getNrVowels(String text){
        this.tokens=text.split(" ");
        this.sentence=text.split(".");

        System.out.println(tokens.length);
        System.out.println(sentence.length);

    }
}
