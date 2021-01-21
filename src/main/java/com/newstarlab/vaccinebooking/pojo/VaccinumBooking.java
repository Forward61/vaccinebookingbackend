package com.newstarlab.vaccinebooking.pojo;

public class VaccinumBooking {
    private String id;

    private String name;

    private Integer sex;

    private String medicarecard;

    private String credentialstype;

    private String credentialsno;

    private String phoneno;

    private String homeaddress;

    private String workaddress;

    private String doctorname;

    private String injectdate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getMedicarecard() {
        return medicarecard;
    }

    public void setMedicarecard(String medicarecard) {
        this.medicarecard = medicarecard == null ? null : medicarecard.trim();
    }

    public String getCredentialstype() {
        return credentialstype;
    }

    public void setCredentialstype(String credentialstype) {
        this.credentialstype = credentialstype == null ? null : credentialstype.trim();
    }

    public String getCredentialsno() {
        return credentialsno;
    }

    public void setCredentialsno(String credentialsno) {
        this.credentialsno = credentialsno == null ? null : credentialsno.trim();
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno == null ? null : phoneno.trim();
    }

    public String getHomeaddress() {
        return homeaddress;
    }

    public void setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress == null ? null : homeaddress.trim();
    }

    public String getWorkaddress() {
        return workaddress;
    }

    public void setWorkaddress(String workaddress) {
        this.workaddress = workaddress == null ? null : workaddress.trim();
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname == null ? null : doctorname.trim();
    }

    public String getInjectdate() {
        return injectdate;
    }

    public void setInjectdate(String injectdate) {
        this.injectdate = injectdate == null ? null : injectdate.trim();
    }
}