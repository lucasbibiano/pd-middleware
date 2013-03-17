package main;

import java.util.Arrays;

import core.AdvertisingSystem;

import models.Item;
import models.User;

public class Main
{

  /**
   * @param args
   */
  public static void main(String[] args)
  {
    AdvertisingSystem system = new AdvertisingSystem();
    
    User user = new User("user", "123");
    
    system.createNewUser(user);
    system.createNewUser(new User("user2", "hue"));
    
    system.saveUserItem(new Item("bola", 2.50, user));
    
    System.out.println(Arrays.toString(system.allUsers().toArray(new User[system.allUsers().size()])));
    System.out.println(Arrays.toString(system.allItens().toArray(new Item[system.allItens().size()])));
  }

}
