package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   List<User> listUsers();
   List<User> findByCarModelAndSeries(String model, int series); // Измените возвращаемый тип на List<User>
}
