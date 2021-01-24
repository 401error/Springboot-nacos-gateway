package com.book.bookcenter.pojo;


public class IndexBannerItem {

  private long id;
  private long bannerId;
  private String name;
  private String imgUrl;
  private String url;
  private long sortNumber;
  private String creater;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private String updater;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getBannerId() {
    return bannerId;
  }

  public void setBannerId(long bannerId) {
    this.bannerId = bannerId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getImgUrl() {
    return imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public long getSortNumber() {
    return sortNumber;
  }

  public void setSortNumber(long sortNumber) {
    this.sortNumber = sortNumber;
  }


  public String getCreater() {
    return creater;
  }

  public void setCreater(String creater) {
    this.creater = creater;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }


  public String getUpdater() {
    return updater;
  }

  public void setUpdater(String updater) {
    this.updater = updater;
  }

}
