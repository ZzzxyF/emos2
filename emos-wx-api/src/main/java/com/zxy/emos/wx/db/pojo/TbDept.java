package com.zxy.emos.wx.db.pojo;

import java.io.Serializable;

/**
 * (TbDept)实体类
 *
 * @author makejava
 * @since 2024-03-13 14:57:26
 */
public class TbDept implements Serializable {
    private static final long serialVersionUID = 153819480173644277L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 部门名称
     */
    private String deptName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

}

