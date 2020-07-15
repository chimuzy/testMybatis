package com.zyigeek.d1_mapper;

import com.zyigeek.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

public class UserMapperTest {

    //管理会话工厂对象
    private SqlSessionFactory factory;

    //在启动测试方法之前做一些准备工作
    @Before
    public void setUp() throws Exception {
        //加载mybatis的核心配置文件，产生流对象
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建会话工厂对象
        factory =new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void findOne() {
        //创建会话对象
        SqlSession sqlSession = factory.openSession();
        //获得代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //测试通过id查询用户信息方法
        User user = userMapper.findOne(10);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void findByName() {
    }
}
