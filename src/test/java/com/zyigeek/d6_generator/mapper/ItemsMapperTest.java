package com.zyigeek.d6_generator.mapper;

import com.zyigeek.d6_generator.pojo.Items;
import com.zyigeek.d6_generator.pojo.ItemsExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class ItemsMapperTest {

    private SqlSessionFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
    }

    @Test
    public void selectByExample() {
        SqlSession sqlSession=factory.openSession();
        ItemsExample example=new ItemsExample();
        ItemsExample.Criteria c=example.createCriteria();
        c.andNameLike("%机%");
        ItemsMapper itemsMapper=sqlSession.getMapper(ItemsMapper.class);
        List<Items> list = itemsMapper.selectByExample(example);
        for(Items item:list ){
            System.out.println(item);
            System.out.println(item.getName());
        }
        sqlSession.close();
    }
}
