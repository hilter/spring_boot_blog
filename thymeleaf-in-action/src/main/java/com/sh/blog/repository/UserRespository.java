package com.sh.blog.repository;

import com.sh.blog.domain.User;

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
}
