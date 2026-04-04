package Lab.Lab10;

public interface MessageEncoder {
    void encode();
    void decode();
    void encode(String plainText);
    void decode(String cipherText);
}
