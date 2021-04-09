package com.iwhalecloud.chinatower.dataqualitymonitor.service.impl;

import com.iwhalecloud.chinatower.dataqualitymonitor.entity.UserRoleEntity;
import com.iwhalecloud.chinatower.dataqualitymonitor.mapper.UserRoleMapper;
import com.iwhalecloud.chinatower.dataqualitymonitor.service.interfaces.IUserRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserRoleServiceImpl implements IUserRoleService {
    private static final Logger logger = LoggerFactory.getLogger(UserRoleServiceImpl.class.getName());
    private final UserRoleMapper userRoleMapper;

    public UserRoleServiceImpl(UserRoleMapper userRoleMapper) {
        this.userRoleMapper = userRoleMapper;
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<Integer> queryRoles(long userId) {
        return userRoleMapper.queryRoles(userId);
    }
}
