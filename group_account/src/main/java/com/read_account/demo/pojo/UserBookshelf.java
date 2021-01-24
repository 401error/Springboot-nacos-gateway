package com.read_account.demo.pojo;



public class UserBookshelf {

  private long id;
  private long userId;
  private String bookId;
  private long lastChapterId;
  private long lastReadTime;
  private java.sql.Timestamp createTime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getBookId() {
    return bookId;
  }

  public void setBookId(String bookId) {
    this.bookId = bookId;
  }


  public long getLastChapterId() {
    return lastChapterId;
  }

  public void setLastChapterId(long lastChapterId) {
    this.lastChapterId = lastChapterId;
  }


  public long getLastReadTime() {
    return lastReadTime;
  }

  public void setLastReadTime(long lastReadTime) {
    this.lastReadTime = lastReadTime;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }

}
