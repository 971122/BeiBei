package com.ssx.entity;


import java.util.Date;

public class Evaluation {

  private long evaluationid;
  private String evaluationtext;
  private long evaluationstar;
  private String userid;
  private Date evaluationtime;


  public long getEvaluationid() {
    return evaluationid;
  }

  public void setEvaluationid(long evaluationid) {
    this.evaluationid = evaluationid;
  }


  public String getEvaluationtext() {
    return evaluationtext;
  }

  public void setEvaluationtext(String evaluationtext) {
    this.evaluationtext = evaluationtext;
  }


  public long getEvaluationstar() {
    return evaluationstar;
  }

  public void setEvaluationstar(long evaluationstar) {
    this.evaluationstar = evaluationstar;
  }


  public String getUserid() {
    return userid;
  }

  public void setUserid(String userid) {
    this.userid = userid;
  }


  public Date getEvaluationtime() {
    return evaluationtime;
  }

  public void setEvaluationtime(Date evaluationtime) {
    this.evaluationtime = evaluationtime;
  }

}
