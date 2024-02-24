import javax.crypto.*;
public class RC4
{
public static void main(String[] args) throws Exception
{
KeyGenerator kg=KeyGenerator.getInstance("RC4");
SecretKey skey=kg.generateKey();

Cipher c=Cipher.getInstance("RC4");
c.init(Cipher.ENCRYPT_MODE,skey);
String inputText="Hello World";
byte[] encrypted=c.doFinal(inputText.getBytes());
c.init(Cipher.DECRYPT_MODE,skey);
byte[] decrypted=c.doFinal(encrypted);
System.out.println("Original String: "+inputText);
System.out.println("Encrypted: "+new String(encrypted));
System.out.println("Decrypted: "+new String(decrypted));
}
}
