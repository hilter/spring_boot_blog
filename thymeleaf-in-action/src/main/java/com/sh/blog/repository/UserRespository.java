package com.sh.blog.repository;

import com.sh.blog.domain.User;

import java.util.List;

/**
 * @author 麦客子
 * @ UserRespository接口
 * @email leeshuhua@163.com
 * @create 2018/08/05 0:57
 **/
public interface UserRespository {

    /**
     * 创建或者修改一个用户
     * @param user
     * @return
     */
    User saveOrUpdate(User user);

    /**
     * 删除用户
     * @param id
     */
    void deleteUser(Long id);

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User getUserById(Long id);

    /**
     * 获取用户列表
     * @return
     */
    List<User> listUser();
}
