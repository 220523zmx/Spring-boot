package com.datangedu.cn.model.serviceproduct;

import java.util.Date;

public class Serviceproduct {
    private String servProductid;

    private String servProviderid;

    private String servProductimg;

    private String servProductname;

    private String servInstructions;

    private Integer servPrice;

    private Date servStarttime;

    private Integer servState;

    private Integer servBumber;

    private String servProvidername;

    private Integer servRecommended;

    private Integer servNecessary;

    public String getServProductid() {
        return servProductid;
    }

    public void setServProductid(String servProductid) {
        this.servProductid = servProductid == null ? null : servProductid.trim();
    }

    public String getServProviderid() {
        return servProviderid;
    }

    public void setServProviderid(String servProviderid) {
        this.servProviderid = servProviderid == null ? null : servProviderid.trim();
    }

    public String getServProductimg() {
        return servProductimg;
    }

    public void setServProductimg(String servProductimg) {
        this.servProductimg = servProductimg == null ? null : servProductimg.trim();
    }

    public String getServProductname() {
        return servProductname;
    }

    public void setServProductname(String servProductname) {
        this.servProductname = servProductname == null ? null : servProductname.trim();
    }

    public String getServInstructions() {
        return servInstructions;
    }

    public void setServInstructions(String servInstructions) {
        this.servInstructions = servInstructions == null ? null : servInstructions.trim();
    }

    public Integer getServPrice() {
        return servPrice;
    }

    public void setServPrice(Integer servPrice) {
        this.servPrice = servPrice;
    }

    public Date getServStarttime() {
        return servStarttime;
    }

    public void setServStarttime(Date servStarttime) {
        this.servStarttime = servStarttime;
    }

    public Integer getServState() {
        return servState;
    }

    public void setServState(Integer servState) {
        this.servState = servState;
    }

    public Integer getServBumber() {
        return servBumber;
    }

    public void setServBumber(Integer servBumber) {
        this.servBumber = servBumber;
    }

    public String getServProvidername() {
        return servProvidername;
    }

    public void setServProvidername(String servProvidername) {
        this.servProvidername = servProvidername == null ? null : servProvidername.trim();
    }

    public Integer getServRecommended() {
        return servRecommended;
    }

    public void setServRecommended(Integer servRecommended) {
        this.servRecommended = servRecommended;
    }

    public Integer getServNecessary() {
        return servNecessary;
    }

    public void setServNecessary(Integer servNecessary) {
        this.servNecessary = servNecessary;
    }
}