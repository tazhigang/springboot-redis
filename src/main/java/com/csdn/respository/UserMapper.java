package com.csdn.respository;

import com.csdn.respository.entity.User;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: ittzg
 * @CreateDate: 2018/12/8 23:30
 * @Description:
 */
@Repository
public interface UserMapper{

//    @Query(value = "select count(id) from user",nativeQuery = true)
//    public int sum();
//
////    public List<User> findAll(PageRequest pageRequest,Sort sort);
//
//    public List<User> findAll();
//
//    @Query(value = "SELECT * from user order by id DESC limit ?1,?2",nativeQuery = true)
//    public List<User> queryAllByPage(int begin,int end);
//

    void saveOrUpdate(List<User> list);

    List<User> findAll();


}
