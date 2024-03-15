package com.zxy.emos.wx.db.pojo;

import java.io.Serializable;

/**
 * 模块资源表(TbModule)实体类
 *
 * @author makejava
 * @since 2024-03-13 15:10:39
 */
public class TbModule implements Serializable {
    private static final long serialVersionUID = -50006316674026980L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 模块编号
     */
    private String moduleCode;
    /**
     * 模块名称
     */
    private String moduleName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

}

