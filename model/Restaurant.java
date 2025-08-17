package RestaurantProject.model;

public class Restaurant {

  private int restaurant_id;
  private String name;
  private String location;
  private String restaurant_type;
  private String gst_no;
  private String date;


  // setter methods
  public void setId( int id ){
    this.restaurant_id = id;
  }

  public void setName( String name ){
    this.name = name;
  }

  public void setLocation( String location ){
    this.location = location;
  }

  public void setRestaurantType( String restaurant_type ){
    this.restaurant_type = restaurant_type;
  }

  public void setGstNo( String gst_no ){
    this.gst_no = gst_no;
  }

  public void setDate( String date ) {
    this.date = date;
  }


  // getter methods
  public int getId(){
    return this.restaurant_id;
  }

  public String getName(){
    return this.name;
  }

  public String getLocation(){
    return this.location;
  }

  public String getRestaurantType(){
    return this.restaurant_type;
  }

  public String getGstNo(){
    return this.gst_no;
  }

  public String getDate(){
    return this.date;
  }

}
