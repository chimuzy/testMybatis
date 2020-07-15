package com.zyigeek.d5_mm;

import com.zyigeek.pojo.UserCustom;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class UserItemsMapperTest {

    private SqlSessionFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
    }

    @Test
    public void find() {
        SqlSession sqlSession = factory.openSession();
        UserItemsMapper mapper = sqlSession.getMapper(UserItemsMapper.class);
        List<UserCustom> list = mapper.find();
        for(UserCustom user : list){
            System.out.println(user);
        }
        sqlSession.close();
    }
}
