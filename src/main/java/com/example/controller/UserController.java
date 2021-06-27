package com.example.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 *用户接口
 */
@RestController
@RequestMapping("/api/user/")
public class UserController {

    /**
     * 查询用户数据
     * @param user  传入一个user对象
     * @return  返回List集合
     */
    @RequestMapping("/select")
    public List<String> select(String user) {
        if (StringUtils.isEmpty(user)) return null;
        return Arrays.asList("allen bobo".split(" "));
    }

    /**
     * 插入或者修改用户数据
     * @param user 传入一个user对象
     * @return 更新成功返回true，否则返回false
     */
    @RequestMapping("/submit")
    public Boolean update(String user) {
        if (StringUtils.isEmpty(user)) return false;
        return true;
    }


}
