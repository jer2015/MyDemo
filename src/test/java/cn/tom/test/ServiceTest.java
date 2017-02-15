package cn.tom.test;

import cn.tom.bean.BO.User;
import cn.tom.service.UserService;
import com.github.pagehelper.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Random;

/**
 * Created by tom on 2017/2/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
public class ServiceTest {

    @Autowired
    private UserService userService;
    /**
     * userService测试:获取user集合
     */
    @Test
    public void getUsersTest() {
        Page<User> users = userService.getUsers();
        System.out.println(users);
        System.out.println(users.getPageNum());
        System.out.println(users.getTotal());
        List<User> result = users.getResult();
        System.out.println(result.size());
    }

    /**
     * userService测试:插入user对象
     */
    @Test
    public void addUserTest() {
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        User user = new User();
        for (int i = 1; i < 101; i++) {
            Random random = new Random();
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < 6; j++) {
                int number = random.nextInt(base.length());
                sb.append(base.charAt(number));
            }
            user.setUserName("name" + i);
            user.setPassword(sb.toString());
            user.setSalt("salt");
            Integer integer = userService.addUser(user);
            System.out.println(integer);
        }
    }
}
