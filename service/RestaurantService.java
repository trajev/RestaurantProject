package RestaurantProject.service;

import java.util.List;
import java.util.logging.Logger;

import RestaurantProject.model.Restaurant;
import RestaurantProject.repository.RestaurantRepo;

public class RestaurantService {

  private static final Logger logger = Logger.getLogger(RestaurantService.class.getName());
  public static void main(String[] args) {

    try {

      // List<Restaurant> al = getRestaurants();

      // Restaurant robj = al.get(0);

      // createRestaurant( robj );

      // deleteRestaurant(13, "spice villa");

      // updateRestaurant(14, "Pullareddy Sweets", "Hyderabad", "GST123", "2020-01-01");

      logger.info("Restaurant Service Started");

      List<Restaurant> al2 = getRestaurants();
      for (Restaurant r : al2) {
        logger.info(r.getId() + "  " + r.getName() + "  " + r.getLocation() + "  " + r.getGstNo() + "  " + r.getDate());
      }

    } catch (Exception e) {
      logger.severe("Error occurred: " + e.getMessage());
    }

  }

  // get Restaurant
  public static List<Restaurant> getRestaurants() throws Exception {

    List<Restaurant> al = RestaurantRepo.getRestaurants();

    // for (Restaurant res : al) {
    // System.out.println(res.getId() + " " + res.getName());
    // }


    return al;

  }

  // create restaurant
  public static void createRestaurant(Restaurant robj) throws Exception {
    RestaurantRepo.createRestaurant(robj);
  }


  // delete restaurant
  public static void deleteRestaurant(int restaurant_id, String restaurant_name) throws Exception {
    RestaurantRepo.deleteRestaurantByIdAndName(restaurant_id, restaurant_name);
  }

  // update restaurant
  public static void updateRestaurant(int restaurant_id, String restaurant_name, String location, String gst_no,
      String established_date) throws Exception {
    RestaurantRepo.updateRestaurantById(restaurant_id, restaurant_name, location, gst_no, established_date);
  }

}
