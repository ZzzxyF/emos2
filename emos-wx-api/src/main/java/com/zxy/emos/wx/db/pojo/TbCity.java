package com.zxy.emos.wx.db.pojo;

import java.io.Serializable;

/**
 * 疫情城市列表(TbCity)实体类
 *
 * @author makejava
 * @since 2024-03-13 14:57:12
 */
public class TbCity implements Serializable {
    private static final long serialVersionUID = -26003730745337472L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 城市名称
     */
    private String city;
    /**
     * 拼音简称
     */
    private String code;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}

