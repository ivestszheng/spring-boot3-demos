package com.ivestszheng.boot3.ssm.mapper;

import com.ivestszheng.boot3.ssm.bean.TUser;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * 每个方法都在 mapper 文件中有一个 sql 标签对应
     * 所以参数都应该用 @Param 进行签名，以后使用指定的名字在 SQL 中进行聚会
     * @param id
     * @return
     */
     TUser getUserById(@Param("id") Long id);
}
