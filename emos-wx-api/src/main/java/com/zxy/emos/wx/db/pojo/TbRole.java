package com.zxy.emos.wx.db.pojo;

import java.io.Serializable;

/**
 * 角色表(TbRole)实体类
 *
 * @author makejava
 * @since 2024-03-13 15:14:07
 */
public class TbRole implements Serializable {
    private static final long serialVersionUID = -65242120099584567L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 角色名称
     */
    private String roleName;
    /**
     * 权限集合
     */
    private String permissions;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

}

