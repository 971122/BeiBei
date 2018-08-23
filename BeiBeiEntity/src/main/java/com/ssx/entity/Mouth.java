package com.my.db;

public class Mouth {
  private Long mouthid;
  private String mouthsatisfaction;
  private Long goodsid;

  public Long getMouthid() {
    return mouthid;
  }

  public void setMouthid(Long mouthid) {
    this.mouthid = mouthid;
  }

  public String getMouthsatisfaction() {
    return mouthsatisfaction;
  }

  public void setMouthsatisfaction(String mouthsatisfaction) {
    this.mouthsatisfaction = mouthsatisfaction;
  }

  public Long getGoodsid() {
    return goodsid;
  }

  public void setGoodsid(Long goodsid) {
    this.goodsid = goodsid;
  }
}
