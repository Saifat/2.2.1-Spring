package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.CarsService;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);


      User user1 = new User("Ivan", "Vizgalin", "ivan@gmai.com");
      User user2 = new User("Vova", "Vizgalin", "vova@gmaol.com");
      User user3 = new User("Kolya", "Pupkin", "kolya@gmail.com");

      Car car1 = new Car("Ferari", 12);
      Car car2 = new Car("Oka", 10);
      Car car3 = new Car("Lada", 1);

      user1.setCar(car1);
      user2.setCar(car2);
      user3.setCar(car3);

      userService.add(user1);
      userService.add(user2);
      userService.add(user3);

      for (User us : userService.listUsers()){
         System.out.println(us);
      }


      CarsService carService = context.getBean(CarsService.class);
      List<Car> cars = carService.listCars();
      for (Car car : cars) {
         System.out.println(carService.getUser(car.getModel(), car.getSeries()));
      }








      context.close();
   }
}
