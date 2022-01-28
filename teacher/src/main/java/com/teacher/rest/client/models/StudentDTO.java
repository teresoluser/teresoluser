package com.teacher.rest.client.models;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class StudentDTO {
    private long id;
    private String stuName;
    private String stuRoll;
    private String stuPhone;
    private String stuAddress;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuRoll() {
        return stuRoll;
    }

    public void setStuRoll(String stuRoll) {
        this.stuRoll = stuRoll;
    }

    public String getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }
}
