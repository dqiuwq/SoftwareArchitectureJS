package sample;
import java.util.Random;

public class RandomCipher
{
    private static final String letterSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String cipherKey;

    public RandomCipher()
    {
        createKey();
    }
    public String encrypt(String message)
    {
        StringBuilder cipherText = new StringBuilder();
        for (int i = 0; i < message.length(); i++)
        {
            int index = letterSet.indexOf(message.charAt(i));
            if (index == -1)
                cipherText.append(message.charAt(i));
            else
                cipherText.append(cipherKey.charAt(index));
        }
        return cipherText.toString();
    }
    public String decrypt(String message)
    {
        StringBuilder plainText = new StringBuilder(message.length());
        for (int i = 0; i < message.length(); i++)
        {
            int index = cipherKey.indexOf(message.charAt(i));
            if (index == -1)
                plainText.append(message.charAt(i));
            else
                plainText.append(letterSet.charAt(index));
        }
        return plainText.toString();
    }
    public void changeKey()
    {
        createKey();
    }
    private void createKey()
    {
        Random rand = new Random();
        StringBuilder temp = new StringBuilder(letterSet);
        StringBuilder key  = new StringBuilder();
        while (temp.length() > 0)
        {
            int randomIdx = rand.nextInt(temp.length());
            key.append(temp.charAt(randomIdx));
            temp.deleteCharAt(randomIdx);
        }
        cipherKey = key.toString();
        System.out.println("Key = " + cipherKey);
    }
}
