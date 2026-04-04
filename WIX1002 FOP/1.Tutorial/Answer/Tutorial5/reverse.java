package WIX1002.Tutorial.Tutorial5;

public class reverse {
    public static void main(String[] args) {
        String sentence = "The most delicious food is the pizza";
        String[] arrSentence = sentence.split(" ");

        for (int i = arrSentence.length - 1; i >= 0; i--) {
            for (int j = arrSentence[i].length() - 1; j >= 0; j--) {
                System.out.print(arrSentence[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}