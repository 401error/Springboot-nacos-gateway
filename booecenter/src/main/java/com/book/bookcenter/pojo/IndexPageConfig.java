package com.book.bookcenter.pojo;


public class IndexPageConfig {

  private long id;
  private long pageType;
  private long itemType;
  private long itemId;
  private java.sql.Timestamp startDate;
  private java.sql.Timestamp endDate;
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


  public long getPageType() {
    return pageType;
  }

  public void setPageType(long pageType) {
    this.pageType = pageType;
  }


  public long getItemType() {
    return itemType;
  }

  public void setItemType(long itemType) {
    this.itemType = itemType;
  }


  public long getItemId() {
    return itemId;
  }

  public void setItemId(long itemId) {
    this.itemId = itemId;
  }


  public java.sql.Timestamp getStartDate() {
    return startDate;
  }

  public void setStartDate(java.sql.Timestamp startDate) {
    this.startDate = startDate;
  }


  public java.sql.Timestamp getEndDate() {
    return endDate;
  }

  public void setEndDate(java.sql.Timestamp endDate) {
    this.endDate = endDate;
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
