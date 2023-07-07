package com.leguan.domain;

import java.io.Serializable;

/**
 * 测试是否自增
 * @TableName look_test
 */
public class LookTest implements Serializable {
    /**
     * 自增id
     */
    private Integer id;

    /**
     * 年纪
     */
    private Integer age;

    private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 自增id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 年纪
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 年纪
     */
    public void setAge(Integer age) {
        this.age = age;
    }
}