package com.csdn.respository.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author: ittzg
 * @CreateDate: 2018/12/8 23:31
 * @Description:
 */
/*@Table(name = "user")
@Entity*/
public class User implements Serializable{
   /* @Id
    @Column(name = "id")
    @GeneratedValue*/
    private int id;
  /*  @Column(name = "name")*/
    private String name;
//    @Column(name = "age")
    private int age;
    private Date modifyTime;

    public User(int id, String name, int age, Date modifyTime) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.modifyTime = modifyTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", modifyTime=" + modifyTime +
                '}';
    }
}
