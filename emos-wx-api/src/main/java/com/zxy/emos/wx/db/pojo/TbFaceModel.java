package com.zxy.emos.wx.db.pojo;

import java.io.Serializable;

/**
 * (TbFaceModel)实体类
 *
 * @author makejava
 * @since 2024-03-13 14:58:00
 */
public class TbFaceModel implements Serializable {
    private static final long serialVersionUID = 504601297560961086L;
    /**
     * 主键值
     */
    private Integer id;
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 用户人脸模型
     */
    private String faceModel;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFaceModel() {
        return faceModel;
    }

    public void setFaceModel(String faceModel) {
        this.faceModel = faceModel;
    }

}

