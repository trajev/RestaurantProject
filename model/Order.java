package RestaurantProject.model;

public class Order {

  private int order_id;
  private int customer_id;
  private int restaurant_id;
  private int menu_item_id;
  private String order_type;
  private String order_date;
  private double total_amount;
  private String order_status;

  // Setter methods
  public void setOrder_id(int order_id) {
    this.order_id = order_id;
  }

  public void setCustomer_id(int customer_id) {
    this.customer_id = customer_id;
  }

  public void setRestaurant_id(int restaurant_id) {
    this.restaurant_id = restaurant_id;
  }

  public void setMenu_item_id(int menu_item_id) {
    this.menu_item_id = menu_item_id;
  }

  public void setOrder_type(String order_type) {
    this.order_type = order_type;
  }

  public void setOrder_date(String order_date) {
    this.order_date = order_date;
  }

  public void setTotal_amount(double total_amount) {
    this.total_amount = total_amount;
  }

  public void setOrder_status(String order_status) {
    this.order_status = order_status;
  }

  // Getter methods
  public int getOrder_id() {
    return order_id;
  }

  public int getCustomer_id() {
    return customer_id;
  }

  public int getRestaurant_id() {
    return restaurant_id;
  }

  public int getMenu_item_id() {
    return menu_item_id;
  }

  public String getOrder_type() {
    return order_type;
  }

  public String getOrder_date() {
    return order_date;
  }

  public double getTotal_amount() {
    return total_amount;
  }

  public String getOrder_status() {
    return order_status;
  }

}
