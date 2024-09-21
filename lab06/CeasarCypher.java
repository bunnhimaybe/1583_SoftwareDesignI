// Lab 6
// Problem 7
// due 10/26 Thu

public class CeasarCypher {
    static String encrypt(String message, int key){
        String newM = "";
        char m[] = message.toCharArray();
        for (int i = 0; i < m.length; i++){
            newM += (char) (m[i] + key);
        }
        return newM;
    }

    static String decrypt(String message, int key){
        String newM = "";
        char m[] = message.toCharArray();
        for (int i = 0; i < m.length; i++){
            newM += (char) (m[i] - key);
        }
        return newM;
    }
}