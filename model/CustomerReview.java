package RestaurantProject.model;

public class CustomerReview {

  private int review_id;
  private int customer_id;
  private int order_id;
  private int restaurant_id;
  private String review;
  private int rating;
  private String feedback_date;

  // Setter methods
  public void setReview_id(int review_id) {
    this.review_id = review_id;
  }

  public void setCustomer_id(int customer_id) {
    this.customer_id = customer_id;
  }

  public void setOrder_id(int order_id) {
    this.order_id = order_id;
  }

  public void setRestaurant_id(int restaurant_id) {
    this.restaurant_id = restaurant_id;
  }

  public void setReview(String review) {
    this.review = review;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

  public void setFeedback_date(String feedback_date) {
    this.feedback_date = feedback_date;
  }

  // Getter methods
  public int getReview_id() {
    return review_id;
  }

  public int getCustomer_id() {
    return customer_id;
  }

  public int getOrder_id() {
    return order_id;
  }

  public int getRestaurant_id() {
    return restaurant_id;
  }

  public String getReview() {
    return review;
  }

  public int getRating() {
    return rating;
  }

  public String getFeedback_date() {
    return feedback_date;
  }

}
