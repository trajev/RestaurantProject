package RestaurantProject.service;

import java.util.List;

import RestaurantProject.model.Restaurant;
import RestaurantProject.repository.RestaurantRepo;

public class RestaurantService {

  // get Restaurant
  public static List<Restaurant> getRestaurants() throws Exception {
    List<Restaurant> al = RestaurantRepo.getRestaurants();
    return al;
  }

  // get Restaurant by id
  public static Restaurant getRestaurantById( int restaurant_id ) throws Exception {
    Restaurant robj = RestaurantRepo.getRestaurantById( restaurant_id );
    return robj;
  }

  // create restaurant
  public static void createRestaurant(Restaurant robj) throws Exception {
    RestaurantRepo.createRestaurant(robj);
  }

  // delete restaurant
  public static void deleteRestaurant(int restaurant_id, String restaurant_name) throws Exception {
    RestaurantRepo.deleteRestaurantByIdAndName(restaurant_id, restaurant_name);
  }

  // update restaurant by id
  public static void updateRestaurantById(int restaurant_id, String restaurant_name, String location, String gst_no,
      String established_date) throws Exception {

    Restaurant robj = new Restaurant();
    robj.setName(restaurant_name);
    robj.setLocation(location);
    robj.setGstNo(gst_no);
    robj.setDate(established_date);

    RestaurantRepo.updateRestaurantById(restaurant_id, robj);
  }

  // update restaurant gst_no by its type
  public static void updateRestaurantGstNoByType(String type, String gst_no) throws Exception {
    RestaurantRepo.updateRestaurantGSTNoByType(type, gst_no);
  }

}
