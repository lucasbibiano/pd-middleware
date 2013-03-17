package utils;

import java.util.Random;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class Encrypter
{

  private static byte[] salt;
  private static int iterations;
  
  static 
  {
    salt = new byte[20];
    new Random().nextBytes(salt);
    iterations = 1000;
  }
  
  public static byte[] calculatePasswordDigest(char[] pass)
  {
    try
    {
      SecretKeyFactory kf = SecretKeyFactory.getInstance("PBEWITHHMACSHA1",
          "BC");
      PBEKeySpec ks = new PBEKeySpec(pass, salt, iterations, 160);
      SecretKey digest = kf.generateSecret(ks);
      return digest.getEncoded();
    }
    catch (Exception e)
    {
    }

    return null;
  }
}
