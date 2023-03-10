package hiber.service;

import hiber.dao.UserDao;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service
public class UserServiceImp implements UserService {

   @Autowired
   private UserDao userDao;


   @Override
   public void add(User user) {
      userDao.add(user);
   }

   @Override
   public List<User> getlistUsers() {
      return userDao.getlistUsers();
   }

   @Override
   public User getMyCar(String model, Integer series) {
      return userDao.getMyCar(model,series);
   }

}
