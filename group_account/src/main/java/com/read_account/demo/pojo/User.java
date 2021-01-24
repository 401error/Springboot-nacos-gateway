package com.read_account.demo.pojo;


import lombok.Data;
import lombok.AllArgsConstructor;
import  lombok.NoArgsConstructor;

import java.sql.Timestamp;


@AllArgsConstructor
@NoArgsConstructor
public class User {

  private long id;
  private String uuid;
  private String userPwd;
  private String loginName;
  private String nickName;
  private String phoneNumber;
  private String headImgUrl;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;

  public void setId(long id) {
    this.id = id;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public void setUserPwd(String userPwd) {
    this.userPwd = userPwd;
  }

  public void setLoginName(String loginName) {
    this.loginName = loginName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void setHeadImgUrl(String headImgUrl) {
    this.headImgUrl = headImgUrl;
  }

  public void setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
  }

  public void setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
  }

  public long getId() {
    return id;
  }

  public String getUuid() {
    return uuid;
  }

  public String getUserPwd() {
    return userPwd;
  }

  public String getLoginName() {
    return loginName;
  }

  public String getNickName() {
    return nickName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public String getHeadImgUrl() {
    return headImgUrl;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", uuid='" + uuid + '\'' +
            ", userPwd='" + userPwd + '\'' +
            ", loginName='" + loginName + '\'' +
            ", nickName='" + nickName + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            ", headImgUrl='" + headImgUrl + '\'' +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            '}';
  }
}
