package com.ssx.entity;


import java.util.Date;

public class User {

  private String userid;
  private String userpassword;
  private String nickname;
  private long userGender;
  private String babyname;
  private long babyGender;
  private Date babycq;
  private String usertext;
  private String moblie;
  private Date lasttime;


  public String getUserid() {
    return userid;
  }

  public void setUserid(String userid) {
    this.userid = userid;
  }


  public String getUserpassword() {
    return userpassword;
  }

  public void setUserpassword(String userpassword) {
    this.userpassword = userpassword;
  }


  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public long getUserGender() {
    return userGender;
  }

  public void setUserGender(long userGender) {
    this.userGender = userGender;
  }


  public String getBabyname() {
    return babyname;
  }

  public void setBabyname(String babyname) {
    this.babyname = babyname;
  }


  public long getBabyGender() {
    return babyGender;
  }

  public void setBabyGender(long babyGender) {
    this.babyGender = babyGender;
  }


  public Date getBabycq() {
    return babycq;
  }

  public void setBabycq(Date babycq) {
    this.babycq = babycq;
  }


  public String getUsertext() {
    return usertext;
  }

  public void setUsertext(String usertext) {
    this.usertext = usertext;
  }


  public String getMoblie() {
    return moblie;
  }

  public void setMoblie(String moblie) {
    this.moblie = moblie;
  }


  public Date getLasttime() {
    return lasttime;
  }

  public void setLasttime(Date lasttime) {
    this.lasttime = lasttime;
  }

}
