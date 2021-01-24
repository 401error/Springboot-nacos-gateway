package com.book.bookcenter.pojo;


public class DataDictionary {

  private long id;
  private String dicType;
  private String dicTypeName;
  private long code;
  private String name;
  private long sortNumber;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getDicType() {
    return dicType;
  }

  public void setDicType(String dicType) {
    this.dicType = dicType;
  }


  public String getDicTypeName() {
    return dicTypeName;
  }

  public void setDicTypeName(String dicTypeName) {
    this.dicTypeName = dicTypeName;
  }


  public long getCode() {
    return code;
  }

  public void setCode(long code) {
    this.code = code;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getSortNumber() {
    return sortNumber;
  }

  public void setSortNumber(long sortNumber) {
    this.sortNumber = sortNumber;
  }

}
