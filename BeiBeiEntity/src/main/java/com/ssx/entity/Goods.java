package com.my.db;

public class Goods {
  private Long goodsid;
  private String goodsname;
  private String goodssummary;
  private Double goodsoriginalprice;
  private String goodsimgs;
  private String goodstjimgs;
  private Long merchantsid;
  private java.sql.Date lasttime;

  public Long getGoodsid() {
    return goodsid;
  }

  public void setGoodsid(Long goodsid) {
    this.goodsid = goodsid;
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

  public Double getGoodsoriginalprice() {
    return goodsoriginalprice;
  }

  public void setGoodsoriginalprice(Double goodsoriginalprice) {
    this.goodsoriginalprice = goodsoriginalprice;
  }

  public String getGoodsimgs() {
    return goodsimgs;
  }

  public void setGoodsimgs(String goodsimgs) {
    this.goodsimgs = goodsimgs;
  }

  public String getGoodstjimgs() {
    return goodstjimgs;
  }

  public void setGoodstjimgs(String goodstjimgs) {
    this.goodstjimgs = goodstjimgs;
  }

  public Long getMerchantsid() {
    return merchantsid;
  }

  public void setMerchantsid(Long merchantsid) {
    this.merchantsid = merchantsid;
  }

  public java.sql.Date getLasttime() {
    return lasttime;
  }

  public void setLasttime(java.sql.Date lasttime) {
    this.lasttime = lasttime;
  }
}
