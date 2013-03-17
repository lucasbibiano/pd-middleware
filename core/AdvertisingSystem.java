package core;

import java.util.ArrayList;

import models.Item;
import models.User;

public class AdvertisingSystem
{
  private ArrayList<User> users = new ArrayList<User>();
  private ArrayList<Item> itens = new ArrayList<Item>();
  
  public void createNewUser(User user)
  {
    users.add(user);
  }

  public void saveUserItem(Item item)
  {
    for (int i = 0; i < itens.size(); i++)
    {
      Item it = itens.get(i);
      
      if (item.equals(it))
      {
        it.setName(item.getName());
        it.setPrice(item.getPrice());
        it.setBelongsTo(item.getBelongsTo());
        
        return;
      }
    }
    
    itens.add(item);
  }

  public void removeUserItem(User user, String item)
  {   
    for (int i = 0; i < itens.size(); i++)
    {
      Item it = itens.get(i);

      if (it.getName().equals(item) && user.equals(it.getBelongsTo()))
      {
        itens.remove(i);
        
        return;
      }
    }
  }

  public Item[] getItensFromUser(User user)
  {
    ArrayList<Item> result = new ArrayList<Item>();
    
    for (int i = 0; i < itens.size(); i++)
    {
      Item it = itens.get(i);
      
      if (user.equals(it.getBelongsTo()))
      {
        result.add(it);
      }
    }  
    
    return result.toArray(new Item[result.size()]);
  }

  public Item[] searchItens(String str)
  {
    ArrayList<Item> result = new ArrayList<Item>();
    
    for (int i = 0; i < itens.size(); i++)
    {
      Item it = itens.get(i);
      
      if (str.contains(it.getName()))
      {
        result.add(it);
      }
    }
    
    return result.toArray(new Item[result.size()]);
  }
  
  public User getUserByName(String name)
  {
    for (int i = 0; i < users.size(); i++)
    {
      User user = users.get(i);
      
      if (user.getName().equals(name))
      {
        return user;
      }
    }
    
    return null;
  }
  
  public ArrayList<Item> allItens() 
  {
    return itens;
  }
  
  public ArrayList<User> allUsers()
  {
    return users;
  }
}
