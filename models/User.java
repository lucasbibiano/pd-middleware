package models;

import java.util.Arrays;

import utils.Encrypter;

import behavior.Authenticable;

public class User implements Authenticable
{
  private String name;
  private byte[] encryptedPassword;

  public User(String name, String password)
  {
    this.name = name;
    this.encryptedPassword = Encrypter.calculatePasswordDigest(password.toCharArray());
  }
  
  @Override
  public boolean authenticate(String password)
  {
    byte[] digest = Encrypter.calculatePasswordDigest(password.toCharArray());
   
    return Arrays.equals(digest, encryptedPassword);
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }
  
  @Override
  public String toString()
  {
    return name;
  }
}
