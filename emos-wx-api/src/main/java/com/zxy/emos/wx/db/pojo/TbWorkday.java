package com.zxy.emos.wx.db.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (TbWorkday)实体类
 *
 * @author makejava
 * @since 2024-03-13 15:14:42
 */
public class TbWorkday implements Serializable {
    private static final long serialVersionUID = 563826231231178397L;
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

