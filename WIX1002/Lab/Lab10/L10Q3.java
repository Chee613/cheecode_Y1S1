package Lab.Lab10;

import java.io.*;

class ShuffleCipher implements MessageEncoder {

    private String inputFileName;
    private String outputFileName;
    private int N;

    public ShuffleCipher(String inputFileName, String outputFileName, int N) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
        this.N = N;
    }

    // ===== READ FILE =====
    private String readFile(String fileName) {
        String text = "";
        try (BufferedReader in = new BufferedReader(new FileReader("Lab/Lab10/" + fileName))) {
            text = in.readLine();
        } catch (IOException e) {
            System.out.println("Error reading file: " + fileName);
        }
        return text;
    }

    // ===== WRITE FILE =====
    private void writeFile(String text) {
        try (BufferedWriter out = new BufferedWriter(new FileWriter("Lab/Lab10/" + outputFileName))) {
            out.write(text);
            System.out.println("File Written Successfully: " + outputFileName);
        } catch (IOException e) {
            System.out.println("Error writing file: " + outputFileName);
        }
    }

    // ===== SHUFFLE ONCE =====
    private String shuffleOnce(String text) {
        if (text.length() <= 1) return text;

        int mid = text.length() / 2;
        String first = text.substring(0, mid);
        String second = text.substring(mid);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < first.length(); i++) {
            result.append(first.charAt(i));
            if (i < second.length()) result.append(second.charAt(i));
        }

        return result.toString();
    }

    // ===== CYCLE LENGTH =====
    private int cycleLength(int length) {
        return Math.max(1, (length / 2) - 1); // avoid zero
    }

    // ===== ENCODE =====
    @Override
    public void encode(String plainText) {
        String text = plainText;
        int cycle = cycleLength(text.length());
        int effectiveN = N % cycle;

        for (int i = 0; i < effectiveN; i++) {
            text = shuffleOnce(text);
        }

        writeFile(text);
        System.out.println("Encrypted Message: " + text);
    }

    @Override
    public void encode() {
        String text = readFile(inputFileName);
        encode(text);
    }

    // ===== DECODE =====
    @Override
    public void decode(String cipherText) {
        String text = cipherText;
        int cycle = cycleLength(text.length());
        int effectiveN = N % cycle;
        int decodeTimes = (cycle - effectiveN) % cycle;

        for (int i = 0; i < decodeTimes; i++) {
            text = shuffleOnce(text);
        }

        writeFile(text);
        System.out.println("Decrypted Message: " + text);
    }

    @Override
    public void decode() {
        String text = readFile(inputFileName);
        decode(text);
    }
}

public class L10Q3 {
    public static void main(String[] args) {

        int N = 10; // number of shuffles

        // ==== ENCODE ====
        MessageEncoder encoder = new ShuffleCipher("messageSend.txt", "messageReceived.txt", N);
        encoder.encode();

        // ==== DECODE ====
        MessageEncoder decoder = new ShuffleCipher("messageReceived.txt", "messageSend.txt", N);
        decoder.decode();

        System.out.println("Encoding and decoding completed successfully!");
    }
}
