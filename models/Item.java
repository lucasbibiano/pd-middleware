package models;

public class Item
{
  private String name;
  private double price;

  private User belongsTo;

  public Item(String name, double price, User belongsTo)
  {
    this.name = name;
    this.price = price;
    this.belongsTo = belongsTo;
  }
  
  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public double getPrice()
  {
    return price;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }

  public User getBelongsTo()
  {
    return belongsTo;
  }

  public void setBelongsTo(User belongsTo)
  {
    this.belongsTo = belongsTo;
  }
  
  @Override
  public String toString()
  {
    return name + " - " + price + " - " + belongsTo.toString();
  }
}
