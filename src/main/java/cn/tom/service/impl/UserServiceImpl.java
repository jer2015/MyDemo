package cn.tom.service.impl;

import cn.tom.bean.BO.User;
import cn.tom.dao.UserMapper;
import cn.tom.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public Page<User> getUsers() {
        logger.info("log info getUser()");
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
