package com.iwhalecloud.chinatower.dataqualitymonitor.mapper;

import com.iwhalecloud.chinatower.dataqualitymonitor.entity.UserRoleEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRoleMapper {
    List<Integer> queryRoles(@Param("userId") Long userId);
}