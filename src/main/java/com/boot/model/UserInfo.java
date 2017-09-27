package com.boot.model;

import javax.persistence.*;

/**
 * 类似userName会从数据库中查询user_name字段（尚未明白）
 * 全小写不符合java编码规范，所以加上了Column注解
 * Created by mr on 2017/8/22.
 */
@Entity
@Table(name = "userinfo")
public class UserInfo {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    @Column(name = "username")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "realname")
    private String realName;
    @Column(name = "workno")
    private String workNo;
    @Column(name = "department")
    private String department;
    @Column(name = "openid")
    private String openId;

    /**
     * 获取
     *
     * @return
     */
    public long getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置
     *
     * @param realName
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getWorkNo() {
        return workNo;
    }

    /**
     * 设置
     *
     * @param workNo
     */
    public void setWorkNo(String workNo) {
        this.workNo = workNo;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置
     *
     * @param department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 设置
     *
     * @param openId
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }
}
