package com.ssx.entity;

public class Parameter {
  private Long parameterid;
  private String parameterkey;
  private String parametervalues;
  private Long goodsid;

  public Long getParameterid() {
    return parameterid;
  }

  public void setParameterid(Long parameterid) {
    this.parameterid = parameterid;
  }

  public String getParameterkey() {
    return parameterkey;
  }

  public void setParameterkey(String parameterkey) {
    this.parameterkey = parameterkey;
  }

  public String getParametervalues() {
    return parametervalues;
  }

  public void setParametervalues(String parametervalues) {
    this.parametervalues = parametervalues;
  }

  public Long getGoodsid() {
    return goodsid;
  }

  public void setGoodsid(Long goodsid) {
    this.goodsid = goodsid;
  }
}
