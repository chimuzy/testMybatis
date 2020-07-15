package com.zyigeek.d1_mapper;

import com.zyigeek.pojo.User;

/*
* Mapper接口与Mapper映射文件遵循规范，才可以为Mapper接口生成代理对象
* 1.Mapper接口与Mapper映射文件 同名，且在同包下
* 2.Mapper映射文件中namespace属性必须是Mapper接口的全类名
* 3.Mapper接口中的方法名必须与Mapper映射文件中的statement语句的id一致
* 4.Mapper接口中的方法形式参数类型必须与Mapper映射文件中的statement语句的parameterType一致
* 5.Mapper接口中的方法返回值类型必须与Mapper映射文件中的statement语句的resultType一致
* 6.在mybatis的核心配置文件中，加载Mapper映射文件
* */
public interface UserMapper {

    //通过id查询用户信息
    public User findOne(Integer id);

    public User findByName(String username);

}
