package com.iwhalecloud.chinatower.dataqualitymonitor.service.interfaces;

import java.util.List;

public interface IUserRoleService {
    List<Integer> queryRoles(long userId);
}
