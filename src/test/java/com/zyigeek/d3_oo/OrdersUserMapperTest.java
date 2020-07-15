package com.zyigeek.d3_oo;

import com.zyigeek.pojo.OrdersCustom;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class OrdersUserMapperTest {
    private SqlSessionFactory factory;

    @Before
    public void setUp() throws Exception {
        factory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
    }

    @Test
    public void find() {
        SqlSession sqlSession=factory.openSession();
        OrdersUserMapper ordersUserMapper=sqlSession.getMapper(OrdersUserMapper.class);

        List<OrdersCustom> list=ordersUserMapper.find();
        for(OrdersCustom ordersCustom : list){
            System.out.println(ordersCustom);
        }
        sqlSession.close();
    }
}
