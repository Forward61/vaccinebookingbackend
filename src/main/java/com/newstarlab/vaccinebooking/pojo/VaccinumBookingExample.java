package com.newstarlab.vaccinebooking.pojo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VaccinumBookingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VaccinumBookingExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }


    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andMedicarecardIsNull() {
            addCriterion("medicarecard is null");
            return (Criteria) this;
        }

        public Criteria andMedicarecardIsNotNull() {
            addCriterion("medicarecard is not null");
            return (Criteria) this;
        }

        public Criteria andMedicarecardEqualTo(String value) {
            addCriterion("medicarecard =", value, "medicarecard");
            return (Criteria) this;
        }

        public Criteria andMedicarecardNotEqualTo(String value) {
            addCriterion("medicarecard <>", value, "medicarecard");
            return (Criteria) this;
        }

        public Criteria andMedicarecardGreaterThan(String value) {
            addCriterion("medicarecard >", value, "medicarecard");
            return (Criteria) this;
        }

        public Criteria andMedicarecardGreaterThanOrEqualTo(String value) {
            addCriterion("medicarecard >=", value, "medicarecard");
            return (Criteria) this;
        }

        public Criteria andMedicarecardLessThan(String value) {
            addCriterion("medicarecard <", value, "medicarecard");
            return (Criteria) this;
        }

        public Criteria andMedicarecardLessThanOrEqualTo(String value) {
            addCriterion("medicarecard <=", value, "medicarecard");
            return (Criteria) this;
        }

        public Criteria andMedicarecardLike(String value) {
            addCriterion("medicarecard like", value, "medicarecard");
            return (Criteria) this;
        }

        public Criteria andMedicarecardNotLike(String value) {
            addCriterion("medicarecard not like", value, "medicarecard");
            return (Criteria) this;
        }

        public Criteria andMedicarecardIn(List<String> values) {
            addCriterion("medicarecard in", values, "medicarecard");
            return (Criteria) this;
        }

        public Criteria andMedicarecardNotIn(List<String> values) {
            addCriterion("medicarecard not in", values, "medicarecard");
            return (Criteria) this;
        }

        public Criteria andMedicarecardBetween(String value1, String value2) {
            addCriterion("medicarecard between", value1, value2, "medicarecard");
            return (Criteria) this;
        }

        public Criteria andMedicarecardNotBetween(String value1, String value2) {
            addCriterion("medicarecard not between", value1, value2, "medicarecard");
            return (Criteria) this;
        }

        public Criteria andCredentialstypeIsNull() {
            addCriterion("credentialstype is null");
            return (Criteria) this;
        }

        public Criteria andCredentialstypeIsNotNull() {
            addCriterion("credentialstype is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialstypeEqualTo(String value) {
            addCriterion("credentialstype =", value, "credentialstype");
            return (Criteria) this;
        }

        public Criteria andCredentialstypeNotEqualTo(String value) {
            addCriterion("credentialstype <>", value, "credentialstype");
            return (Criteria) this;
        }

        public Criteria andCredentialstypeGreaterThan(String value) {
            addCriterion("credentialstype >", value, "credentialstype");
            return (Criteria) this;
        }

        public Criteria andCredentialstypeGreaterThanOrEqualTo(String value) {
            addCriterion("credentialstype >=", value, "credentialstype");
            return (Criteria) this;
        }

        public Criteria andCredentialstypeLessThan(String value) {
            addCriterion("credentialstype <", value, "credentialstype");
            return (Criteria) this;
        }

        public Criteria andCredentialstypeLessThanOrEqualTo(String value) {
            addCriterion("credentialstype <=", value, "credentialstype");
            return (Criteria) this;
        }

        public Criteria andCredentialstypeLike(String value) {
            addCriterion("credentialstype like", value, "credentialstype");
            return (Criteria) this;
        }

        public Criteria andCredentialstypeNotLike(String value) {
            addCriterion("credentialstype not like", value, "credentialstype");
            return (Criteria) this;
        }

        public Criteria andCredentialstypeIn(List<String> values) {
            addCriterion("credentialstype in", values, "credentialstype");
            return (Criteria) this;
        }

        public Criteria andCredentialstypeNotIn(List<String> values) {
            addCriterion("credentialstype not in", values, "credentialstype");
            return (Criteria) this;
        }

        public Criteria andCredentialstypeBetween(String value1, String value2) {
            addCriterion("credentialstype between", value1, value2, "credentialstype");
            return (Criteria) this;
        }

        public Criteria andCredentialstypeNotBetween(String value1, String value2) {
            addCriterion("credentialstype not between", value1, value2, "credentialstype");
            return (Criteria) this;
        }

        public Criteria andCredentialsnoIsNull() {
            addCriterion("credentialsno is null");
            return (Criteria) this;
        }

        public Criteria andCredentialsnoIsNotNull() {
            addCriterion("credentialsno is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialsnoEqualTo(String value) {
            addCriterion("credentialsno =", value, "credentialsno");
            return (Criteria) this;
        }

        public Criteria andCredentialsnoNotEqualTo(String value) {
            addCriterion("credentialsno <>", value, "credentialsno");
            return (Criteria) this;
        }

        public Criteria andCredentialsnoGreaterThan(String value) {
            addCriterion("credentialsno >", value, "credentialsno");
            return (Criteria) this;
        }

        public Criteria andCredentialsnoGreaterThanOrEqualTo(String value) {
            addCriterion("credentialsno >=", value, "credentialsno");
            return (Criteria) this;
        }

        public Criteria andCredentialsnoLessThan(String value) {
            addCriterion("credentialsno <", value, "credentialsno");
            return (Criteria) this;
        }

        public Criteria andCredentialsnoLessThanOrEqualTo(String value) {
            addCriterion("credentialsno <=", value, "credentialsno");
            return (Criteria) this;
        }

        public Criteria andCredentialsnoLike(String value) {
            addCriterion("credentialsno like", value, "credentialsno");
            return (Criteria) this;
        }

        public Criteria andCredentialsnoNotLike(String value) {
            addCriterion("credentialsno not like", value, "credentialsno");
            return (Criteria) this;
        }

        public Criteria andCredentialsnoIn(List<String> values) {
            addCriterion("credentialsno in", values, "credentialsno");
            return (Criteria) this;
        }

        public Criteria andCredentialsnoNotIn(List<String> values) {
            addCriterion("credentialsno not in", values, "credentialsno");
            return (Criteria) this;
        }

        public Criteria andCredentialsnoBetween(String value1, String value2) {
            addCriterion("credentialsno between", value1, value2, "credentialsno");
            return (Criteria) this;
        }

        public Criteria andCredentialsnoNotBetween(String value1, String value2) {
            addCriterion("credentialsno not between", value1, value2, "credentialsno");
            return (Criteria) this;
        }

        public Criteria andPhonenoIsNull() {
            addCriterion("phoneno is null");
            return (Criteria) this;
        }

        public Criteria andPhonenoIsNotNull() {
            addCriterion("phoneno is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenoEqualTo(String value) {
            addCriterion("phoneno =", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoNotEqualTo(String value) {
            addCriterion("phoneno <>", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoGreaterThan(String value) {
            addCriterion("phoneno >", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoGreaterThanOrEqualTo(String value) {
            addCriterion("phoneno >=", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoLessThan(String value) {
            addCriterion("phoneno <", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoLessThanOrEqualTo(String value) {
            addCriterion("phoneno <=", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoLike(String value) {
            addCriterion("phoneno like", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoNotLike(String value) {
            addCriterion("phoneno not like", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoIn(List<String> values) {
            addCriterion("phoneno in", values, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoNotIn(List<String> values) {
            addCriterion("phoneno not in", values, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoBetween(String value1, String value2) {
            addCriterion("phoneno between", value1, value2, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoNotBetween(String value1, String value2) {
            addCriterion("phoneno not between", value1, value2, "phoneno");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIsNull() {
            addCriterion("homeaddress is null");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIsNotNull() {
            addCriterion("homeaddress is not null");
            return (Criteria) this;
        }

        public Criteria andHomeaddressEqualTo(String value) {
            addCriterion("homeaddress =", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotEqualTo(String value) {
            addCriterion("homeaddress <>", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressGreaterThan(String value) {
            addCriterion("homeaddress >", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressGreaterThanOrEqualTo(String value) {
            addCriterion("homeaddress >=", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLessThan(String value) {
            addCriterion("homeaddress <", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLessThanOrEqualTo(String value) {
            addCriterion("homeaddress <=", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLike(String value) {
            addCriterion("homeaddress like", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotLike(String value) {
            addCriterion("homeaddress not like", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIn(List<String> values) {
            addCriterion("homeaddress in", values, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotIn(List<String> values) {
            addCriterion("homeaddress not in", values, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressBetween(String value1, String value2) {
            addCriterion("homeaddress between", value1, value2, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotBetween(String value1, String value2) {
            addCriterion("homeaddress not between", value1, value2, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andWorkaddressIsNull() {
            addCriterion("workaddress is null");
            return (Criteria) this;
        }

        public Criteria andWorkaddressIsNotNull() {
            addCriterion("workaddress is not null");
            return (Criteria) this;
        }

        public Criteria andWorkaddressEqualTo(String value) {
            addCriterion("workaddress =", value, "workaddress");
            return (Criteria) this;
        }

        public Criteria andWorkaddressNotEqualTo(String value) {
            addCriterion("workaddress <>", value, "workaddress");
            return (Criteria) this;
        }

        public Criteria andWorkaddressGreaterThan(String value) {
            addCriterion("workaddress >", value, "workaddress");
            return (Criteria) this;
        }

        public Criteria andWorkaddressGreaterThanOrEqualTo(String value) {
            addCriterion("workaddress >=", value, "workaddress");
            return (Criteria) this;
        }

        public Criteria andWorkaddressLessThan(String value) {
            addCriterion("workaddress <", value, "workaddress");
            return (Criteria) this;
        }

        public Criteria andWorkaddressLessThanOrEqualTo(String value) {
            addCriterion("workaddress <=", value, "workaddress");
            return (Criteria) this;
        }

        public Criteria andWorkaddressLike(String value) {
            addCriterion("workaddress like", value, "workaddress");
            return (Criteria) this;
        }

        public Criteria andWorkaddressNotLike(String value) {
            addCriterion("workaddress not like", value, "workaddress");
            return (Criteria) this;
        }

        public Criteria andWorkaddressIn(List<String> values) {
            addCriterion("workaddress in", values, "workaddress");
            return (Criteria) this;
        }

        public Criteria andWorkaddressNotIn(List<String> values) {
            addCriterion("workaddress not in", values, "workaddress");
            return (Criteria) this;
        }

        public Criteria andWorkaddressBetween(String value1, String value2) {
            addCriterion("workaddress between", value1, value2, "workaddress");
            return (Criteria) this;
        }

        public Criteria andWorkaddressNotBetween(String value1, String value2) {
            addCriterion("workaddress not between", value1, value2, "workaddress");
            return (Criteria) this;
        }

        public Criteria andDoctornameIsNull() {
            addCriterion("doctorname is null");
            return (Criteria) this;
        }

        public Criteria andDoctornameIsNotNull() {
            addCriterion("doctorname is not null");
            return (Criteria) this;
        }

        public Criteria andDoctornameEqualTo(String value) {
            addCriterion("doctorname =", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameNotEqualTo(String value) {
            addCriterion("doctorname <>", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameGreaterThan(String value) {
            addCriterion("doctorname >", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameGreaterThanOrEqualTo(String value) {
            addCriterion("doctorname >=", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameLessThan(String value) {
            addCriterion("doctorname <", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameLessThanOrEqualTo(String value) {
            addCriterion("doctorname <=", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameLike(String value) {
            addCriterion("doctorname like", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameNotLike(String value) {
            addCriterion("doctorname not like", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameIn(List<String> values) {
            addCriterion("doctorname in", values, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameNotIn(List<String> values) {
            addCriterion("doctorname not in", values, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameBetween(String value1, String value2) {
            addCriterion("doctorname between", value1, value2, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameNotBetween(String value1, String value2) {
            addCriterion("doctorname not between", value1, value2, "doctorname");
            return (Criteria) this;
        }

        public Criteria andInjectdateIsNull() {
            addCriterion("injectdate is null");
            return (Criteria) this;
        }

        public Criteria andInjectdateIsNotNull() {
            addCriterion("injectdate is not null");
            return (Criteria) this;
        }

        public Criteria andInjectdateEqualTo(String value) {
            addCriterion("injectdate =", value, "injectdate");
            return (Criteria) this;
        }

        public Criteria andInjectdateNotEqualTo(String value) {
            addCriterion("injectdate <>", value, "injectdate");
            return (Criteria) this;
        }

        public Criteria andInjectdateGreaterThan(String value) {
            addCriterion("injectdate >", value, "injectdate");
            return (Criteria) this;
        }

        public Criteria andInjectdateGreaterThanOrEqualTo(String value) {
            addCriterion("injectdate >=", value, "injectdate");
            return (Criteria) this;
        }

        public Criteria andInjectdateLessThan(String value) {
            addCriterion("injectdate <", value, "injectdate");
            return (Criteria) this;
        }

        public Criteria andInjectdateLessThanOrEqualTo(String value) {
            addCriterion("injectdate <=", value, "injectdate");
            return (Criteria) this;
        }

        public Criteria andInjectdateLike(String value) {
            addCriterion("injectdate like", value, "injectdate");
            return (Criteria) this;
        }

        public Criteria andInjectdateNotLike(String value) {
            addCriterion("injectdate not like", value, "injectdate");
            return (Criteria) this;
        }

        public Criteria andInjectdateIn(List<String> values) {
            addCriterion("injectdate in", values, "injectdate");
            return (Criteria) this;
        }

        public Criteria andInjectdateNotIn(List<String> values) {
            addCriterion("injectdate not in", values, "injectdate");
            return (Criteria) this;
        }

        public Criteria andInjectdateBetween(String value1, String value2) {
            addCriterion("injectdate between", value1, value2, "injectdate");
            return (Criteria) this;
        }

        public Criteria andInjectdateNotBetween(String value1, String value2) {
            addCriterion("injectdate not between", value1, value2, "injectdate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}