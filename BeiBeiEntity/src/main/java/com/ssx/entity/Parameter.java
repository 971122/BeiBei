package com.ssx.entity;


public class Parameter {

  private long parameterId;
  private String parameterKey;
  private String parameterValues;
  private long goodsId;


  public long getParameterId() {
    return parameterId;
  }

  public void setParameterId(long parameterId) {
    this.parameterId = parameterId;
  }


  public String getParameterKey() {
    return parameterKey;
  }

  public void setParameterKey(String parameterKey) {
    this.parameterKey = parameterKey;
  }


  public String getParameterValues() {
    return parameterValues;
  }

  public void setParameterValues(String parameterValues) {
    this.parameterValues = parameterValues;
  }


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }

}
