package com.happy.video.pojo;

import java.util.Date;

public class SkinQuestion {
    private Integer id;

    private Integer skinid;

    private String question;

    private String options;

    private Short answer;

    private Integer popupsec;

    private Double x;

    private Double y;

    private Date createtime;

    private Date updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSkinid() {
        return skinid;
    }

    public void setSkinid(Integer skinid) {
        this.skinid = skinid;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options == null ? null : options.trim();
    }

    public Short getAnswer() {
        return answer;
    }

    public void setAnswer(Short answer) {
        this.answer = answer;
    }

    public Integer getPopupsec() {
        return popupsec;
    }

    public void setPopupsec(Integer popupsec) {
        this.popupsec = popupsec;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}