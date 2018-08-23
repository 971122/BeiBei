package com.ssx.entity;

import java.util.Date;

public class Cashvolume {
  private Long cashvolumeid;
  private String cashvolumename;
  private Long cashvolumecount;
  private Double cashvolumesxjg;
  private Double cashvolumeds;
  private Date cashvolumebegintime;
  private Date cashvolumefinishtime;
  private Long merchantsid;
  private String cashvolumerule;

  public Long getCashvolumeid() {
    return cashvolumeid;
  }

  public void setCashvolumeid(Long cashvolumeid) {
    this.cashvolumeid = cashvolumeid;
  }

  public String getCashvolumename() {
    return cashvolumename;
  }

  public void setCashvolumename(String cashvolumename) {
    this.cashvolumename = cashvolumename;
  }

  public Long getCashvolumecount() {
    return cashvolumecount;
  }

  public void setCashvolumecount(Long cashvolumecount) {
    this.cashvolumecount = cashvolumecount;
  }

  public Double getCashvolumesxjg() {
    return cashvolumesxjg;
  }

  public void setCashvolumesxjg(Double cashvolumesxjg) {
    this.cashvolumesxjg = cashvolumesxjg;
  }

  public Double getCashvolumeds() {
    return cashvolumeds;
  }

  public void setCashvolumeds(Double cashvolumeds) {
    this.cashvolumeds = cashvolumeds;
  }

  public Date getCashvolumebegintime() {
    return cashvolumebegintime;
  }

  public void setCashvolumebegintime(Date cashvolumebegintime) {
    this.cashvolumebegintime = cashvolumebegintime;
  }

  public Date getCashvolumefinishtime() {
    return cashvolumefinishtime;
  }

  public void setCashvolumefinishtime(java.sql.Timestamp cashvolumefinishtime) {
    this.cashvolumefinishtime = cashvolumefinishtime;
  }

  public Long getMerchantsid() {
    return merchantsid;
  }

  public void setMerchantsid(Long merchantsid) {
    this.merchantsid = merchantsid;
  }

  public String getCashvolumerule() {
    return cashvolumerule;
  }

  public void setCashvolumerule(String cashvolumerule) {
    this.cashvolumerule = cashvolumerule;
  }
}
