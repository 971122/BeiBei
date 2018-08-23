package com.ssx.entity;

import java.util.Date;

public class Evaluation {
  private Long evaluationid;
  private String evaluationtext;
  private Long evaluationstar;
  private String userid;
  private Date evaluationtime;

  public Long getEvaluationid() {
    return evaluationid;
  }

  public void setEvaluationid(Long evaluationid) {
    this.evaluationid = evaluationid;
  }

  public String getEvaluationtext() {
    return evaluationtext;
  }

  public void setEvaluationtext(String evaluationtext) {
    this.evaluationtext = evaluationtext;
  }

  public Long getEvaluationstar() {
    return evaluationstar;
  }

  public void setEvaluationstar(Long evaluationstar) {
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
