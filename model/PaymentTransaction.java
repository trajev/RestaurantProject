package RestaurantProject.model;

public class PaymentTransaction {

  private int transaction_id;
  private String reference_no;
  private int customer_id;
  private int order_id;
  private String payment_type;
  private String transaction_status;

  // Setter methods
  public void setTransaction_id(int transaction_id) {
    this.transaction_id = transaction_id;
  }

  public void setReference_no(String reference_no) {
    this.reference_no = reference_no;
  }

  public void setCustomer_id(int customer_id) {
    this.customer_id = customer_id;
  }

  public void setOrder_id(int order_id) {
    this.order_id = order_id;
  }

  public void setPayment_type(String payment_type) {
    this.payment_type = payment_type;
  }

  public void setTransaction_status(String transaction_status) {
    this.transaction_status = transaction_status;
  }

  // Getter methods
  public int getTransaction_id() {
    return transaction_id;
  }

  public String getReference_no() {
    return reference_no;
  }

  public int getCustomer_id() {
    return customer_id;
  }

  public int getOrder_id() {
    return order_id;
  }

  public String getPayment_type() {
    return payment_type;
  }

  public String getTransaction_status() {
    return transaction_status;
  }

}
