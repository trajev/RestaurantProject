package RestaurantProject;

import java.util.List;
import java.util.logging.Logger;

import RestaurantProject.model.Restaurant;
import RestaurantProject.service.RestaurantService;

public class Main {

  private static final Logger logger = Logger.getLogger(Main.class.getName());
  public static void main(String[] args) {

    try {

      // List<Restaurant> al = getRestaurants();

      // Restaurant robj = al.get(0);

      // createRestaurant( robj );

      // deleteRestaurant(13, "spice villa");

      // updateRestaurantById(14, "Pullareddy Sweets", "Hyderabad", "GST123", "2020-01-01");

      RestaurantService.updateRestaurantGstNoByType( "Indian", "GSTIN0987654321IN");

      // logger.info("Restaurant Service Started");

      List<Restaurant> al2 = RestaurantService.getRestaurants();
      for (Restaurant r : al2) {
          logger.info(r.getId() + "  " + r.getName() + "  " + r.getLocation() + "  " + r.getGstNo() + "  " + r.getDate() + " " + r.getRestaurantType() );
      }

    } catch (Exception e) {
      logger.severe("Error occurred: " + e.getMessage());
    }

  }

}
