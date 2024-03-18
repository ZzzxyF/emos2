package com.zxy.emos.wx.db.entity;

import java.io.Serializable;

/**
 * (TbFaceModel)实体类
 *
 * @author makejava
 * @since 2024-03-16 21:03:26
 */
public class TbFaceModel implements Serializable {
    private static final long serialVersionUID = 213347410883328955L;
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

