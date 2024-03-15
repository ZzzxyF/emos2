package com.zxy.emos.wx.db.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * 节假日表(TbHolidays)实体类
 *
 * @author makejava
 * @since 2024-03-13 14:58:23
 */
public class TbHolidays implements Serializable {
    private static final long serialVersionUID = -64827809356765547L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 日期
     */
    private Date date;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}

