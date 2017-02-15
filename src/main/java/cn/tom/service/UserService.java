package cn.tom.service;

import cn.tom.bean.BO.User;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * Created by tom on 2017/2/14.
 */
public interface UserService {

    /**
     * 获取User Page
     * @return
     */
    Page<User> getUsers();

    Integer addUser(User user);
}
