package hiber.service;

import hiber.dao.UserDao;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {


   private UserDao userDao;
   @Autowired
   public UserServiceImp(UserDao userDao) {
      this.userDao = userDao;
   }

   @Transactional
   @Override
   public void add(User user) {
      userDao.add(user);
   }
   @Transactional(readOnly = true)
   @Override
   public List<User> getlistUsers() {
      return userDao.getlistUsers();
   }

   @Transactional(readOnly = true)
   @Override
   public User getMyCar(String model, Integer series) {
      return userDao.getMyCar(model,series);
   }

}
