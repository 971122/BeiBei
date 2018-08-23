package com.my.db;

public class Specificationsoptions {
  private Long specificationsoptionsid;
  private String specificationsoptionsname;
  private Long specificationsid;
  private Long specificationsoptionsparent;
  private Long goodsid;
  private Double goodsprice;
  private Long count;

  public Long getSpecificationsoptionsid() {
    return specificationsoptionsid;
  }

  public void setSpecificationsoptionsid(Long specificationsoptionsid) {
    this.specificationsoptionsid = specificationsoptionsid;
  }

  public String getSpecificationsoptionsname() {
    return specificationsoptionsname;
  }

  public void setSpecificationsoptionsname(String specificationsoptionsname) {
    this.specificationsoptionsname = specificationsoptionsname;
  }

  public Long getSpecificationsid() {
    return specificationsid;
  }

  public void setSpecificationsid(Long specificationsid) {
    this.specificationsid = specificationsid;
  }

  public Long getSpecificationsoptionsparent() {
    return specificationsoptionsparent;
  }

  public void setSpecificationsoptionsparent(Long specificationsoptionsparent) {
    this.specificationsoptionsparent = specificationsoptionsparent;
  }

  public Long getGoodsid() {
    return goodsid;
  }

  public void setGoodsid(Long goodsid) {
    this.goodsid = goodsid;
  }

  public Double getGoodsprice() {
    return goodsprice;
  }

  public void setGoodsprice(Double goodsprice) {
    this.goodsprice = goodsprice;
  }

  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }
}
