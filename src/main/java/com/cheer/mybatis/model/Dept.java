package com.cheer.mybatis.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Dept {
    private int deptNo;
    private String dName;
    private String loc;

    public Dept(int deptNo, String dName, String loc) {
        this.deptNo = deptNo;
        this.dName = dName;
        this.loc = loc;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public String getDName() {
        return dName;
    }

    public void setDName(String dName) {
        this.dName = dName;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("deptNo", deptNo)
                .append("dName", dName)
                .append("loc", loc)
                .toString();
    }
}
