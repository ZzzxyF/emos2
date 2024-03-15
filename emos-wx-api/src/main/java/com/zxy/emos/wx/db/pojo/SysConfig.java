package com.zxy.emos.wx.db.pojo;

import java.io.Serializable;

/**
 * (SysConfig)实体类
 *
 * @author makejava
 * @since 2024-03-13 14:30:36
 */
public class SysConfig implements Serializable {
    private static final long serialVersionUID = 165323927178863097L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 参数名
     */
    private String paramKey;
    /**
     * 参数值
     */
    private String paramValue;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 备注
     */
    private String remark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParamKey() {
        return paramKey;
    }

    public void setParamKey(String paramKey) {
        this.paramKey = paramKey;
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}

