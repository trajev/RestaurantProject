package RestaurantProject.repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import RestaurantProject.model.Restaurant;
import RestaurantProject.lib.RestaurantConstants;

public class RestaurantRepo {

  private static final Logger logger = Logger.getLogger(RestaurantRepo.class.getName());

  private static final String URL = RestaurantConstants.URL;
  private static final String USER = RestaurantConstants.USER;
  private static final String PASSWORD = RestaurantConstants.PASSWORD;

  public static Connection connectDB() {
    Connection conn = null;
    try {

      Class.forName(RestaurantConstants.DRIVER_CLASS);

      conn = DriverManager.getConnection(URL, USER, PASSWORD);
      logger.info("DB Connection Successful");
      return conn;

    } catch (Exception e) {
      logger.severe("DB Connection Failed: " + e.getMessage());
      return null;
    }

    // finally {
    // try {
    // if (conn != null)
    // conn.close();
    // } catch (SQLException se) {
    // se.printStackTrace();
    // }
    // }

  }

  public static List<Restaurant> getRestaurants() throws SQLException {

    Connection c = null;
    Statement st = null;
    ResultSet rs = null;

    try {
      c = connectDB();
      st = c.createStatement();

      rs = st.executeQuery("SELECT restaurant_id, name, location, restaurant_type, gst_no, established_date FROM restaurant;");

      ArrayList<Restaurant> al = new ArrayList<>();

      while (rs.next()) {
        Restaurant robj = new Restaurant();

        String res_name = rs.getString("name");
        // System.out.println("Restaurant: " + res_name);
        int res_id = rs.getInt("restaurant_id");
        String location = rs.getString("location");
        String est_date = rs.getString("established_date");
        String gst_no = rs.getString("gst_no");
        String restaurant_type = rs.getString("restaurant_type");

        robj.setId(res_id);
        robj.setName(res_name);
        robj.setLocation(location);
        robj.setDate(est_date);
        robj.setGstNo(gst_no);
        robj.setRestaurantType(restaurant_type);

        al.add(robj);
      }


      return al;

    } catch (Exception e) {
      e.printStackTrace();
      return null;
    } finally {
      st.close();
      rs.close();
      c.close();
    }
  }

  public static Restaurant getRestaurantById( int restaurant_id ) throws SQLException {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    try{

      con = connectDB();
      pst = con.prepareStatement("select restaurant_id, name, location, restaurant_type, gst_no, established_date from restaurant where restaurant_id=?");
      pst.setInt(1, restaurant_id);
      rs = pst.executeQuery();

      if( rs.next() ){
        Restaurant robj = new Restaurant();
        robj.setId(rs.getInt("restaurant_id"));
        robj.setName(rs.getString("name"));
        robj.setLocation(rs.getString("location"));
        robj.setRestaurantType(rs.getString("restaurant_type"));
        robj.setGstNo(rs.getString("gst_no"));
        robj.setDate(rs.getString("established_date"));
        return robj;
      }
      else {
        System.out.println("No restaurant found with id - " + restaurant_id);
        return null;
      }


    } catch(Exception e){
      e.printStackTrace();
      return null;
    } finally {
      rs.close();
      pst.close();
      con.close();
    }
  }

  public static void createRestaurant(Restaurant resturant) throws SQLException {

    Connection con = null;
    PreparedStatement st = null;

    try {

      con = connectDB();
      st = con.prepareStatement(
          "INSERT INTO restaurant ( name, location, gst_no, established_date) VALUES (?, ?, ?, ?)");
      // st.setInt(1, resturant.getId());
      st.setString(1, resturant.getName());
      st.setString(2, resturant.getLocation());
      st.setString(3, resturant.getGstNo());
      st.setString(4, resturant.getDate());

      st.executeUpdate();

      System.out.println("Rows Inserted to Restaurant Successfully");

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      con.close();
      st.close();
    }
  }

  public static void deleteRestaurantById(int restaurant_id) throws SQLException {
    Connection con = null;
    PreparedStatement pst = null;
    try {
      con = connectDB();
      pst = con.prepareStatement("delete from restaurant where restaurant_id=?");
      pst.setInt(1, restaurant_id);
      pst.executeUpdate();
      System.out.println("Restaurant with id - " + restaurant_id + " deleted successfully");
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      pst.close();
      con.close();
    }
  }

  public static void deleteRestaurantByIdAndName(int restaurant_id, String restaurant_name) throws SQLException {
    Connection con = null;
    PreparedStatement pst = null;
    try {
      con = connectDB();
      pst = con.prepareStatement("delete from restaurant where restaurant_id=? and name=?");
      pst.setInt(1, restaurant_id);
      pst.setString(2, restaurant_name);
      int count = pst.executeUpdate();
      if( count==0 ){
        System.out.println("No Records deleted");
      } else {
        System.out.println("Restaurant with id - " + restaurant_id + " and restaurant name  - " + restaurant_name
        + " deleted successfully");
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      pst.close();
      con.close();
    }
  }

  public static void updateRestaurantById( int restaurant_id, Restaurant robj ) throws SQLException {

    Connection con = null;
    PreparedStatement pst = null;

    try {
      con = connectDB();
      pst = con.prepareStatement("update restaurant set name=?, location=?, gst_no=?, established_date=? where restaurant_id=?");
      pst.setString(1, robj.getName() );
      pst.setString(2, robj.getLocation() );
      pst.setString(3, robj.getGstNo() );
      pst.setString(4, robj.getDate() );
      pst.setInt(5, restaurant_id);

      int count = pst.executeUpdate();
      if( count==0 ){
        System.out.println("No Records updated");
      } else {
        System.out.println("Restaurant with id - " + restaurant_id + " updated successfully");
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      pst.close();
      con.close();
    }

  }

  // update restaurant by type using gst no.
  public static void updateRestaurantGSTNoByType(String restaurant_type, String gst_no ) throws Exception {

    Connection con = null;
    PreparedStatement pst = null;
    try{
      con = connectDB();
      pst = con.prepareStatement("update restaurant set gst_no=? where restaurant_type=?" );
      pst.setString(1, gst_no);
      pst.setString(2, restaurant_type);

      int count = pst.executeUpdate();

      if( count==0 ){
        logger.info("No records updated");
      } else {
        logger.info("Updated "+ count + " restaurants by type - " + restaurant_type + " successfully" );
      }

    } catch(Exception e){
      e.printStackTrace();
    } finally {
      pst.close();
      con.close();
    }

  }




}
