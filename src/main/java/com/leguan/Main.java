package com.leguan;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @Description：
 * @Author：ZhangHui
 * @Package：org.example
 * @Date: ${DATE}
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        // 将xml配置文件构建成为Configuration配置类
        Reader resourceAsReader = Resources.getResourceAsReader(resource);
        // 通过加载配置文件构建一个SqlSessionFactory 解析xml文件1
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);


        // 数据源 执行器 DefaultSqlSession 2
        SqlSession sqlSession = sessionFactory.openSession();
        System.out.println("Hello world!");
    }
}