package com.ssx.entity;


public class Specificationsoptions {

  private long specificationsoptionsid;
  private String specificationsoptionsname;
  private long specificationsid;
  private long specificationsoptionsparent;
  private long goodsId;
  private double goodsprice;
  private long count;


  public long getSpecificationsoptionsid() {
    return specificationsoptionsid;
  }

  public void setSpecificationsoptionsid(long specificationsoptionsid) {
    this.specificationsoptionsid = specificationsoptionsid;
  }


  public String getSpecificationsoptionsname() {
    return specificationsoptionsname;
  }

  public void setSpecificationsoptionsname(String specificationsoptionsname) {
    this.specificationsoptionsname = specificationsoptionsname;
  }


  public long getSpecificationsid() {
    return specificationsid;
  }

  public void setSpecificationsid(long specificationsid) {
    this.specificationsid = specificationsid;
  }


  public long getSpecificationsoptionsparent() {
    return specificationsoptionsparent;
  }

  public void setSpecificationsoptionsparent(long specificationsoptionsparent) {
    this.specificationsoptionsparent = specificationsoptionsparent;
  }


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public double getGoodsprice() {
    return goodsprice;
  }

  public void setGoodsprice(double goodsprice) {
    this.goodsprice = goodsprice;
  }


  public long getCount() {
    return count;
  }

  public void setCount(long count) {
    this.count = count;
  }

}
