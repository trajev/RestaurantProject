package RestaurantProject.model;

public class Employee {

  private int employee_id;
  private String name;
  private String designation;
  private int restaurant_id;
  private String email_id;
  private String mobile_no;
  private String gender;
  private double salary;
  private String shift_time;
  private int years_of_experience;
  private String employment_type;

  // Setter methods
  public void setEmployee_id(int employee_id) {
    this.employee_id = employee_id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public void setRestaurant_id(int restaurant_id) {
    this.restaurant_id = restaurant_id;
  }

  public void setEmail_id(String email_id) {
    this.email_id = email_id;
  }

  public void setMobile_no(String mobile_no) {
    this.mobile_no = mobile_no;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public void setShift_time(String shift_time) {
    this.shift_time = shift_time;
  }

  public void setYears_of_experience(int years_of_experience) {
    this.years_of_experience = years_of_experience;
  }

  public void setEmployment_type(String employment_type) {
    this.employment_type = employment_type;
  }

  // Getter methods
  public int getEmployee_id() {
    return employee_id;
  }

  public String getName() {
    return name;
  }

  public String getDesignation() {
    return designation;
  }

  public int getRestaurant_id() {
    return restaurant_id;
  }

  public String getEmail_id() {
    return email_id;
  }

  public String getMobile_no() {
    return mobile_no;
  }

  public String getGender() {
    return gender;
  }

  public double getSalary() {
    return salary;
  }

  public String getShift_time() {
    return shift_time;
  }

  public int getYears_of_experience() {
    return years_of_experience;
  }

  public String getEmployment_type() {
    return employment_type;
  }

}
