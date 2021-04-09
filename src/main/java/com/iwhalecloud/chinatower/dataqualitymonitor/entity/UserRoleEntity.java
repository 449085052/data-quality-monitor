package com.iwhalecloud.chinatower.dataqualitymonitor.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
public class UserRoleEntity implements Serializable {
    private static final long serialVersionUID = 3965184634203444904L;
    
    /**
     * 用户id
     */
    private Long userId;
    
    /**
     * 角色id
     */
    private Integer roleId;
    
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
}