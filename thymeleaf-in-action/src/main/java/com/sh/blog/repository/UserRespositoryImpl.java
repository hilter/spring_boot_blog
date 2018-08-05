package com.sh.blog.repository;

import com.sh.blog.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author 麦客子
 * @desc
 * @email leeshuhua@163.com
 * @create 2018/08/05 22:59
 **/
@Repository
public class UserRespositoryImpl implements UserRespository{

    private static AtomicLong counter = new AtomicLong();
    private final ConcurrentMap<Long,User> userMap = new ConcurrentHashMap<>();

    @Override
    public User saveOrUpdate(User user) {
        Long id = user.getId();
        if(id == null){
            id = counter.incrementAndGet();
            user.setId(id);
        }
        this.userMap.put(id,user);
        return user;
    }

    @Override
    public void deleteUser(Long id) {
        this.userMap.remove(id);
    }

    @Override
    public User getUserById(Long id) {
        return this.userMap.get(id);
    }

    @Override
    public List<User> listUser() {
        return (List<User>) this.userMap.values();
    }
}
