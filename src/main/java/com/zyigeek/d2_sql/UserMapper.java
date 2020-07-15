package com.zyigeek.d2_sql;

import com.zyigeek.pojo.UserCustom;
import com.zyigeek.pojo.UserQueryVO;

import java.util.List;

public interface UserMapper {

    //1.通过用户性别和姓名查询用户列表，不允许性别或姓名为null或空串
    public List<UserCustom> findList(UserQueryVO vo);
    //2.通过用户性别和姓名查询用户列表，不允许性别或姓名为null或空串
    public Integer findCount(UserQueryVO vo);
    //3.通过用户性别和姓名查询用户列表，且id为15或20或25；不允许性别或姓名为null或空串
    public List<UserCustom> findListByIds(UserQueryVO vo);
}
