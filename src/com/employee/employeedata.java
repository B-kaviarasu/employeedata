package com.employee;

public class employeedata {
    private  int employeeid;
    private String employeename;
    private String position;
    private String joineddate;


    public employeedata(int employeeid, String employeename, String position, String joineddate) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.position = position;
        this.joineddate = joineddate;

    }

    public int getEmployeeid() {
        return employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public String getPosition() {
        return position;
    }

    public String getJoineddate() {
        return joineddate;
    }

    @Override
    public String toString() {
        return "employee{" +
                "employeeid=" + employeeid +
                ", employeename='" + employeename + '\'' +
                ", position='" + position + '\'' +
                ", joineddate=" + joineddate +
                '}';
    }
}


