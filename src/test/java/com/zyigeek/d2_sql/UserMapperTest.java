package com.zyigeek.d2_sql;

import com.zyigeek.pojo.UserCustom;
import com.zyigeek.pojo.UserQueryVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class UserMapperTest {

    private SqlSessionFactory factory;

    @Before
    public void setUp() throws Exception {
        factory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
    }

    @Test
    public void findList() {
        SqlSession sqlSession=factory.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

        UserCustom userCustom=new UserCustom();
        userCustom.setSex("1");
        userCustom.setUsername("明");
        UserQueryVO vo=new UserQueryVO();
        vo.setUserCustom(userCustom);

        List<UserCustom> list =userMapper.findList(vo);
        for(UserCustom user:list){
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void findCount() {
        SqlSession sqlSession=factory.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

        UserCustom userCustom=new UserCustom();
        userCustom.setSex("1");
        userCustom.setUsername("明");
        UserQueryVO vo=new UserQueryVO();
        vo.setUserCustom(userCustom);

        Integer count =userMapper.findCount(vo);
        System.out.println(count);
        sqlSession.close();
    }

    @Test
    public void findListByIds() {
        SqlSession sqlSession=factory.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

        UserCustom userCustom=new UserCustom();
        userCustom.setSex("1");
        userCustom.setUsername("明");
        List<Integer> ids = Arrays.asList(15,20,25);

        UserQueryVO vo=new UserQueryVO();
        vo.setUserCustom(userCustom);
        vo.setIds(ids);

        List<UserCustom> list =userMapper.findListByIds(vo);
        for(UserCustom user:list){
            System.out.println(user);
        }
        sqlSession.close();
    }
}
