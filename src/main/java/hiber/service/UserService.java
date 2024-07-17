package hiber.service;

import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
    List<User> findByCarModelAndSeries(String model, int series); // Возвращаемый тип List<User>
}
