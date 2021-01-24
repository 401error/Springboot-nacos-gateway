package com.read_account.demo.pojo;

import java.sql.Timestamp;

public class Book {

    private long id;
    private long authorId;
    private long dicCategory;
    private long dicChannel;
    private long dicSerialStatus;
    private String onlineStatus;
    private String bookId;
    private String bookName;
    private long bookScore;
    private String keyWord;
    private String imgUrl;
    private String authorName;
    private String introduction;
    private String isbn;
    private long wordCount;
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

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public long getDicCategory() {
        return dicCategory;
    }

    public void setDicCategory(long dicCategory) {
        this.dicCategory = dicCategory;
    }

    public long getDicChannel() {
        return dicChannel;
    }

    public void setDicChannel(long dicChannel) {
        this.dicChannel = dicChannel;
    }

    public long getDicSerialStatus() {
        return dicSerialStatus;
    }

    public void setDicSerialStatus(long dicSerialStatus) {
        this.dicSerialStatus = dicSerialStatus;
    }

    public String getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(String onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public long getBookScore() {
        return bookScore;
    }

    public void setBookScore(long bookScore) {
        this.bookScore = bookScore;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public long getWordCount() {
        return wordCount;
    }

    public void setWordCount(long wordCount) {
        this.wordCount = wordCount;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }
}
