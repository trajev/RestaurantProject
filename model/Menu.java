package RestaurantProject.model;

public class Menu {

  private int menu_id;
  private String name;
  private String description;
  private String category;
  private double price;
  private String image_url;
  private String preparation_time;
  private String spice_level;
  private int restaurant_id;

  // Setter methods
  public void setMenu_id(int menu_id) {
    this.menu_id = menu_id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setImage_url(String image_url) {
    this.image_url = image_url;
  }

  public void setPreparation_time(String preparation_time) {
    this.preparation_time = preparation_time;
  }

  public void setSpice_level(String spice_level) {
    this.spice_level = spice_level;
  }

  public void setRestaurant_id(int restaurant_id) {
    this.restaurant_id = restaurant_id;
  }

  // Getter methods
  public int getMenu_id() {
    return menu_id;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public String getCategory() {
    return category;
  }

  public double getPrice() {
    return price;
  }

  public String getImage_url() {
    return image_url;
  }

  public String getPreparation_time() {
    return preparation_time;
  }

  public String getSpice_level() {
    return spice_level;
  }

  public int getRestaurant_id() {
    return restaurant_id;
  }

}
