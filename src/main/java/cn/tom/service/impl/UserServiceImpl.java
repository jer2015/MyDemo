package cn.tom.service.impl;

import cn.tom.bean.BO.User;
import cn.tom.dao.UserMapper;
import cn.tom.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by tom on 2017/2/14.
 */
@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Page<User> getUsers() {
        PageHelper.startPage(7, 5);
        List<User> users = userMapper.getUsers();
        return (Page<User>) users;
    }

    @Transactional
    @Override
    public Integer addUser(User user) {
        return userMapper.insertSelective(user);
    }
}
