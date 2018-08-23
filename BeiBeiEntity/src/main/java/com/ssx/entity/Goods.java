package com.ssx.entity;


public class Goods {

  private long goodsId;
  private String goodsname;
  private String goodssummary;
  private double goodsoriginalPrice;
  private String goodsImgs;
  private String goodstjImgs;
  private long merchantsid;
  private java.sql.Date lasttime;


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public String getGoodsname() {
    return goodsname;
  }

  public void setGoodsname(String goodsname) {
    this.goodsname = goodsname;
  }


  public String getGoodssummary() {
    return goodssummary;
  }

  public void setGoodssummary(String goodssummary) {
    this.goodssummary = goodssummary;
  }


  public double getGoodsoriginalPrice() {
    return goodsoriginalPrice;
  }

  public void setGoodsoriginalPrice(double goodsoriginalPrice) {
    this.goodsoriginalPrice = goodsoriginalPrice;
  }


  public String getGoodsImgs() {
    return goodsImgs;
  }

  public void setGoodsImgs(String goodsImgs) {
    this.goodsImgs = goodsImgs;
  }


  public String getGoodstjImgs() {
    return goodstjImgs;
  }

  public void setGoodstjImgs(String goodstjImgs) {
    this.goodstjImgs = goodstjImgs;
  }


  public long getMerchantsid() {
    return merchantsid;
  }

  public void setMerchantsid(long merchantsid) {
    this.merchantsid = merchantsid;
  }


  public java.sql.Date getLasttime() {
    return lasttime;
  }

  public void setLasttime(java.sql.Date lasttime) {
    this.lasttime = lasttime;
  }

}
