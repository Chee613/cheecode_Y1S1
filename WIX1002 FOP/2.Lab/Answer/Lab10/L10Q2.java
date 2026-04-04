package Lab.Lab10;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

class SubstitutionCiper implements MessageEncoder{
    private String inputFileName;
    private String outputFileName;
    private int shift;

    public SubstitutionCiper(String inputFileName, String outputFileName, int shift) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
        this.shift = shift;
    }
    
    public String readFile(){
        String text = "";
        try(BufferedReader in = new BufferedReader(new FileReader("Lab/Lab10/" + inputFileName))){
            text = in.readLine();
            System.out.println("Text: " + text);
            return text;
        } catch (FileNotFoundException e){
            System.out.println("File Not Found");
        } catch (IOException e){
            System.out.println("Problem with input");
        }
        
        return text;
    }
    
    public void writeFile(String text){
        try(BufferedWriter out = new BufferedWriter(new FileWriter("Lab/Lab10/" + outputFileName))){
            out.write(text);
            System.out.println("File Written Successfully");
        } catch (FileNotFoundException e){
            System.out.println("File Not Found");
        } catch (IOException e){
            System.out.println("Problem with input");
        }
    }
    
    public void encode(){
        String text = readFile();
        //System.out.println("Text: " + text);
        encode(text);
    }
    
    public void encode(String plainText){
        if (plainText == null) {
            System.out.println("Nothing to encode");
            return;
        }
        System.out.println("Plain Text: " + plainText);
        StringBuilder encryptedMessage = new StringBuilder();
        for(int i = 0; i < plainText.length(); i++){
            char c = plainText.charAt(i);
            if (c == ' '){
                encryptedMessage.append(' '); // keep spaces unencrypted
            } else if (c >= 'a' && c <= 'z'){
                encryptedMessage.append((char)((c - 'a' + shift) % 26 + 'a'));
            } else if (c >= 'A' && c <= 'Z'){
                encryptedMessage.append((char)((c - 'A' + shift) % 26 + 'A'));
            } else {
                encryptedMessage.append(c); // leave other chars unchanged
            }
        }
        System.out.println("Encrypted Text: " + encryptedMessage.toString());
        writeFile(encryptedMessage.toString());
    }
    
    public void decode(){
        String text = readFile();
        decode(text);
    }
    
    public void decode(String cipherText){
        if (cipherText == null) {
            System.out.println("Nothing to decode");
            return;
        }
        System.out.println("Cipher Text: " + cipherText);
        StringBuilder decryptedMessage = new StringBuilder();
        for(int i = 0; i < cipherText.length(); i++){
            char c = cipherText.charAt(i);
            if (c == ' '){
                decryptedMessage.append(' ');
            } else if (c >= 'a' && c <= 'z'){
                decryptedMessage.append((char)((c - 'a' + (26 - shift)) % 26 + 'a'));
            } else if (c >= 'A' && c <= 'Z'){
                decryptedMessage.append((char)((c - 'A' + (26 - shift)) % 26 + 'A'));
            } else {
                decryptedMessage.append(c);
            }
        }
        
        System.out.println("Decrypted Text: " + decryptedMessage.toString());
        writeFile(decryptedMessage.toString());
        
    }
}

public class L10Q2 {
    public static void main(String[] args) {
        MessageEncoder encrypt = new SubstitutionCiper("messageSend.txt", "messageReceived.txt", 3);
        encrypt.encode();
        System.out.println("");
        MessageEncoder decrypt = new SubstitutionCiper("messageReceived.txt", "messageSend.txt", 3);
        decrypt.decode();
    }
}
