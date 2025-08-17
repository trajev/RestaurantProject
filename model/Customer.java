package RestaurantProject.model;

public class Customer {

  private int customer_id;
  private String first_name;
  private String last_name;
  private String gender;
  private String mobile_no;
  private String address;
  private String email_id;
  private String signup_date;
  private String date_of_birth;
  private String food_preference;


  //setter methods
  public void setId(int id){
    this.customer_id = id;
  }

  public void setFirstName( String firstName ){
    this.first_name = firstName;
  }

  public void setLastName( String lastName ){
    this.last_name = lastName;
  }

  public void setGender(String gender){
    this.gender = gender;
  }

  public void setMobileNo( String mobileNo){
    this.mobile_no = mobileNo;
  }

  public void setAddress( String address ){
    this.address = address;
  }

  public void setEmailId( String emailId ){
    this.email_id = emailId;
  }

  public void setSignupDate(String signupDate ){
    this.signup_date = signupDate;
  }

  public void setDateOfBirth( String dateOfBirth ){
    this.date_of_birth = dateOfBirth;
  }

  public void setFoodPreference( String foodPreference ){
    this.food_preference = foodPreference;
  }


  // getter methods
  public int getId(){
    return this.customer_id;
  }

  public String getFirstName(){
    return this.first_name;
  }

  public String getLastName(){
    return this.last_name;
  }

  public String getGender(){
    return this.gender;
  }

  public String getMobileNo(){
    return this.mobile_no;
  }

  public String getAddress(){
    return this.address;
  }

  public String getEmailId(){
    return this.email_id;
  }

  public String getSignupDate(){
    return this.signup_date;
  }

  public String getDateOfBirth(){
    return this.date_of_birth;
  }

  public String getFoodPreference(){
    return this.food_preference;
  }


}
