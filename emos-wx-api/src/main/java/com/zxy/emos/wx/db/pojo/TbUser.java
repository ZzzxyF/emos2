package com.zxy.emos.wx.db.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户表(TbUser)实体类
 *
 * @author makejava
 * @since 2024-03-13 15:17:51
 */
public class TbUser implements Serializable {
    private static final long serialVersionUID = -69617900926193268L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 长期授权字符串
     */
    private String openId;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 头像网址
     */
    private String photo;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private Object sex;
    /**
     * 手机号码
     */
    private String tel;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 入职日期
     */
    private Date hiredate;
    /**
     * 角色
     */
    private String role;
    /**
     * 是否是超级管理员
     */
    private Integer root;
    /**
     * 部门编号
     */
    private Integer deptId;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 创建时间
     */
    private Date createTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getSex() {
        return sex;
    }

    public void setSex(Object sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getRoot() {
        return root;
    }

    public void setRoot(Integer root) {
        this.root = root;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}

