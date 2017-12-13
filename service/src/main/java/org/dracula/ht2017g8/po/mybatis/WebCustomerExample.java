package org.dracula.ht2017g8.po.mybatis;

import java.util.ArrayList;
import java.util.List;

public class WebCustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WebCustomerExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCustidIsNull() {
            addCriterion("custid is null");
            return (Criteria) this;
        }

        public Criteria andCustidIsNotNull() {
            addCriterion("custid is not null");
            return (Criteria) this;
        }

        public Criteria andCustidEqualTo(String value) {
            addCriterion("custid =", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidNotEqualTo(String value) {
            addCriterion("custid <>", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidGreaterThan(String value) {
            addCriterion("custid >", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidGreaterThanOrEqualTo(String value) {
            addCriterion("custid >=", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidLessThan(String value) {
            addCriterion("custid <", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidLessThanOrEqualTo(String value) {
            addCriterion("custid <=", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidLike(String value) {
            addCriterion("custid like", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidNotLike(String value) {
            addCriterion("custid not like", value, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidIn(List<String> values) {
            addCriterion("custid in", values, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidNotIn(List<String> values) {
            addCriterion("custid not in", values, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidBetween(String value1, String value2) {
            addCriterion("custid between", value1, value2, "custid");
            return (Criteria) this;
        }

        public Criteria andCustidNotBetween(String value1, String value2) {
            addCriterion("custid not between", value1, value2, "custid");
            return (Criteria) this;
        }

        public Criteria andCustnmIsNull() {
            addCriterion("custnm is null");
            return (Criteria) this;
        }

        public Criteria andCustnmIsNotNull() {
            addCriterion("custnm is not null");
            return (Criteria) this;
        }

        public Criteria andCustnmEqualTo(String value) {
            addCriterion("custnm =", value, "custnm");
            return (Criteria) this;
        }

        public Criteria andCustnmNotEqualTo(String value) {
            addCriterion("custnm <>", value, "custnm");
            return (Criteria) this;
        }

        public Criteria andCustnmGreaterThan(String value) {
            addCriterion("custnm >", value, "custnm");
            return (Criteria) this;
        }

        public Criteria andCustnmGreaterThanOrEqualTo(String value) {
            addCriterion("custnm >=", value, "custnm");
            return (Criteria) this;
        }

        public Criteria andCustnmLessThan(String value) {
            addCriterion("custnm <", value, "custnm");
            return (Criteria) this;
        }

        public Criteria andCustnmLessThanOrEqualTo(String value) {
            addCriterion("custnm <=", value, "custnm");
            return (Criteria) this;
        }

        public Criteria andCustnmLike(String value) {
            addCriterion("custnm like", value, "custnm");
            return (Criteria) this;
        }

        public Criteria andCustnmNotLike(String value) {
            addCriterion("custnm not like", value, "custnm");
            return (Criteria) this;
        }

        public Criteria andCustnmIn(List<String> values) {
            addCriterion("custnm in", values, "custnm");
            return (Criteria) this;
        }

        public Criteria andCustnmNotIn(List<String> values) {
            addCriterion("custnm not in", values, "custnm");
            return (Criteria) this;
        }

        public Criteria andCustnmBetween(String value1, String value2) {
            addCriterion("custnm between", value1, value2, "custnm");
            return (Criteria) this;
        }

        public Criteria andCustnmNotBetween(String value1, String value2) {
            addCriterion("custnm not between", value1, value2, "custnm");
            return (Criteria) this;
        }

        public Criteria andCustnm1IsNull() {
            addCriterion("custnm1 is null");
            return (Criteria) this;
        }

        public Criteria andCustnm1IsNotNull() {
            addCriterion("custnm1 is not null");
            return (Criteria) this;
        }

        public Criteria andCustnm1EqualTo(String value) {
            addCriterion("custnm1 =", value, "custnm1");
            return (Criteria) this;
        }

        public Criteria andCustnm1NotEqualTo(String value) {
            addCriterion("custnm1 <>", value, "custnm1");
            return (Criteria) this;
        }

        public Criteria andCustnm1GreaterThan(String value) {
            addCriterion("custnm1 >", value, "custnm1");
            return (Criteria) this;
        }

        public Criteria andCustnm1GreaterThanOrEqualTo(String value) {
            addCriterion("custnm1 >=", value, "custnm1");
            return (Criteria) this;
        }

        public Criteria andCustnm1LessThan(String value) {
            addCriterion("custnm1 <", value, "custnm1");
            return (Criteria) this;
        }

        public Criteria andCustnm1LessThanOrEqualTo(String value) {
            addCriterion("custnm1 <=", value, "custnm1");
            return (Criteria) this;
        }

        public Criteria andCustnm1Like(String value) {
            addCriterion("custnm1 like", value, "custnm1");
            return (Criteria) this;
        }

        public Criteria andCustnm1NotLike(String value) {
            addCriterion("custnm1 not like", value, "custnm1");
            return (Criteria) this;
        }

        public Criteria andCustnm1In(List<String> values) {
            addCriterion("custnm1 in", values, "custnm1");
            return (Criteria) this;
        }

        public Criteria andCustnm1NotIn(List<String> values) {
            addCriterion("custnm1 not in", values, "custnm1");
            return (Criteria) this;
        }

        public Criteria andCustnm1Between(String value1, String value2) {
            addCriterion("custnm1 between", value1, value2, "custnm1");
            return (Criteria) this;
        }

        public Criteria andCustnm1NotBetween(String value1, String value2) {
            addCriterion("custnm1 not between", value1, value2, "custnm1");
            return (Criteria) this;
        }

        public Criteria andCustnm2IsNull() {
            addCriterion("custnm2 is null");
            return (Criteria) this;
        }

        public Criteria andCustnm2IsNotNull() {
            addCriterion("custnm2 is not null");
            return (Criteria) this;
        }

        public Criteria andCustnm2EqualTo(String value) {
            addCriterion("custnm2 =", value, "custnm2");
            return (Criteria) this;
        }

        public Criteria andCustnm2NotEqualTo(String value) {
            addCriterion("custnm2 <>", value, "custnm2");
            return (Criteria) this;
        }

        public Criteria andCustnm2GreaterThan(String value) {
            addCriterion("custnm2 >", value, "custnm2");
            return (Criteria) this;
        }

        public Criteria andCustnm2GreaterThanOrEqualTo(String value) {
            addCriterion("custnm2 >=", value, "custnm2");
            return (Criteria) this;
        }

        public Criteria andCustnm2LessThan(String value) {
            addCriterion("custnm2 <", value, "custnm2");
            return (Criteria) this;
        }

        public Criteria andCustnm2LessThanOrEqualTo(String value) {
            addCriterion("custnm2 <=", value, "custnm2");
            return (Criteria) this;
        }

        public Criteria andCustnm2Like(String value) {
            addCriterion("custnm2 like", value, "custnm2");
            return (Criteria) this;
        }

        public Criteria andCustnm2NotLike(String value) {
            addCriterion("custnm2 not like", value, "custnm2");
            return (Criteria) this;
        }

        public Criteria andCustnm2In(List<String> values) {
            addCriterion("custnm2 in", values, "custnm2");
            return (Criteria) this;
        }

        public Criteria andCustnm2NotIn(List<String> values) {
            addCriterion("custnm2 not in", values, "custnm2");
            return (Criteria) this;
        }

        public Criteria andCustnm2Between(String value1, String value2) {
            addCriterion("custnm2 between", value1, value2, "custnm2");
            return (Criteria) this;
        }

        public Criteria andCustnm2NotBetween(String value1, String value2) {
            addCriterion("custnm2 not between", value1, value2, "custnm2");
            return (Criteria) this;
        }

        public Criteria andPinyin1IsNull() {
            addCriterion("pinyin1 is null");
            return (Criteria) this;
        }

        public Criteria andPinyin1IsNotNull() {
            addCriterion("pinyin1 is not null");
            return (Criteria) this;
        }

        public Criteria andPinyin1EqualTo(String value) {
            addCriterion("pinyin1 =", value, "pinyin1");
            return (Criteria) this;
        }

        public Criteria andPinyin1NotEqualTo(String value) {
            addCriterion("pinyin1 <>", value, "pinyin1");
            return (Criteria) this;
        }

        public Criteria andPinyin1GreaterThan(String value) {
            addCriterion("pinyin1 >", value, "pinyin1");
            return (Criteria) this;
        }

        public Criteria andPinyin1GreaterThanOrEqualTo(String value) {
            addCriterion("pinyin1 >=", value, "pinyin1");
            return (Criteria) this;
        }

        public Criteria andPinyin1LessThan(String value) {
            addCriterion("pinyin1 <", value, "pinyin1");
            return (Criteria) this;
        }

        public Criteria andPinyin1LessThanOrEqualTo(String value) {
            addCriterion("pinyin1 <=", value, "pinyin1");
            return (Criteria) this;
        }

        public Criteria andPinyin1Like(String value) {
            addCriterion("pinyin1 like", value, "pinyin1");
            return (Criteria) this;
        }

        public Criteria andPinyin1NotLike(String value) {
            addCriterion("pinyin1 not like", value, "pinyin1");
            return (Criteria) this;
        }

        public Criteria andPinyin1In(List<String> values) {
            addCriterion("pinyin1 in", values, "pinyin1");
            return (Criteria) this;
        }

        public Criteria andPinyin1NotIn(List<String> values) {
            addCriterion("pinyin1 not in", values, "pinyin1");
            return (Criteria) this;
        }

        public Criteria andPinyin1Between(String value1, String value2) {
            addCriterion("pinyin1 between", value1, value2, "pinyin1");
            return (Criteria) this;
        }

        public Criteria andPinyin1NotBetween(String value1, String value2) {
            addCriterion("pinyin1 not between", value1, value2, "pinyin1");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andIdnoIsNull() {
            addCriterion("idno is null");
            return (Criteria) this;
        }

        public Criteria andIdnoIsNotNull() {
            addCriterion("idno is not null");
            return (Criteria) this;
        }

        public Criteria andIdnoEqualTo(String value) {
            addCriterion("idno =", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotEqualTo(String value) {
            addCriterion("idno <>", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoGreaterThan(String value) {
            addCriterion("idno >", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoGreaterThanOrEqualTo(String value) {
            addCriterion("idno >=", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLessThan(String value) {
            addCriterion("idno <", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLessThanOrEqualTo(String value) {
            addCriterion("idno <=", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLike(String value) {
            addCriterion("idno like", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotLike(String value) {
            addCriterion("idno not like", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoIn(List<String> values) {
            addCriterion("idno in", values, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotIn(List<String> values) {
            addCriterion("idno not in", values, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoBetween(String value1, String value2) {
            addCriterion("idno between", value1, value2, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotBetween(String value1, String value2) {
            addCriterion("idno not between", value1, value2, "idno");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andHmaddr1IsNull() {
            addCriterion("hmaddr1 is null");
            return (Criteria) this;
        }

        public Criteria andHmaddr1IsNotNull() {
            addCriterion("hmaddr1 is not null");
            return (Criteria) this;
        }

        public Criteria andHmaddr1EqualTo(String value) {
            addCriterion("hmaddr1 =", value, "hmaddr1");
            return (Criteria) this;
        }

        public Criteria andHmaddr1NotEqualTo(String value) {
            addCriterion("hmaddr1 <>", value, "hmaddr1");
            return (Criteria) this;
        }

        public Criteria andHmaddr1GreaterThan(String value) {
            addCriterion("hmaddr1 >", value, "hmaddr1");
            return (Criteria) this;
        }

        public Criteria andHmaddr1GreaterThanOrEqualTo(String value) {
            addCriterion("hmaddr1 >=", value, "hmaddr1");
            return (Criteria) this;
        }

        public Criteria andHmaddr1LessThan(String value) {
            addCriterion("hmaddr1 <", value, "hmaddr1");
            return (Criteria) this;
        }

        public Criteria andHmaddr1LessThanOrEqualTo(String value) {
            addCriterion("hmaddr1 <=", value, "hmaddr1");
            return (Criteria) this;
        }

        public Criteria andHmaddr1Like(String value) {
            addCriterion("hmaddr1 like", value, "hmaddr1");
            return (Criteria) this;
        }

        public Criteria andHmaddr1NotLike(String value) {
            addCriterion("hmaddr1 not like", value, "hmaddr1");
            return (Criteria) this;
        }

        public Criteria andHmaddr1In(List<String> values) {
            addCriterion("hmaddr1 in", values, "hmaddr1");
            return (Criteria) this;
        }

        public Criteria andHmaddr1NotIn(List<String> values) {
            addCriterion("hmaddr1 not in", values, "hmaddr1");
            return (Criteria) this;
        }

        public Criteria andHmaddr1Between(String value1, String value2) {
            addCriterion("hmaddr1 between", value1, value2, "hmaddr1");
            return (Criteria) this;
        }

        public Criteria andHmaddr1NotBetween(String value1, String value2) {
            addCriterion("hmaddr1 not between", value1, value2, "hmaddr1");
            return (Criteria) this;
        }

        public Criteria andHmaddr2IsNull() {
            addCriterion("hmaddr2 is null");
            return (Criteria) this;
        }

        public Criteria andHmaddr2IsNotNull() {
            addCriterion("hmaddr2 is not null");
            return (Criteria) this;
        }

        public Criteria andHmaddr2EqualTo(String value) {
            addCriterion("hmaddr2 =", value, "hmaddr2");
            return (Criteria) this;
        }

        public Criteria andHmaddr2NotEqualTo(String value) {
            addCriterion("hmaddr2 <>", value, "hmaddr2");
            return (Criteria) this;
        }

        public Criteria andHmaddr2GreaterThan(String value) {
            addCriterion("hmaddr2 >", value, "hmaddr2");
            return (Criteria) this;
        }

        public Criteria andHmaddr2GreaterThanOrEqualTo(String value) {
            addCriterion("hmaddr2 >=", value, "hmaddr2");
            return (Criteria) this;
        }

        public Criteria andHmaddr2LessThan(String value) {
            addCriterion("hmaddr2 <", value, "hmaddr2");
            return (Criteria) this;
        }

        public Criteria andHmaddr2LessThanOrEqualTo(String value) {
            addCriterion("hmaddr2 <=", value, "hmaddr2");
            return (Criteria) this;
        }

        public Criteria andHmaddr2Like(String value) {
            addCriterion("hmaddr2 like", value, "hmaddr2");
            return (Criteria) this;
        }

        public Criteria andHmaddr2NotLike(String value) {
            addCriterion("hmaddr2 not like", value, "hmaddr2");
            return (Criteria) this;
        }

        public Criteria andHmaddr2In(List<String> values) {
            addCriterion("hmaddr2 in", values, "hmaddr2");
            return (Criteria) this;
        }

        public Criteria andHmaddr2NotIn(List<String> values) {
            addCriterion("hmaddr2 not in", values, "hmaddr2");
            return (Criteria) this;
        }

        public Criteria andHmaddr2Between(String value1, String value2) {
            addCriterion("hmaddr2 between", value1, value2, "hmaddr2");
            return (Criteria) this;
        }

        public Criteria andHmaddr2NotBetween(String value1, String value2) {
            addCriterion("hmaddr2 not between", value1, value2, "hmaddr2");
            return (Criteria) this;
        }

        public Criteria andHmaddr3IsNull() {
            addCriterion("hmaddr3 is null");
            return (Criteria) this;
        }

        public Criteria andHmaddr3IsNotNull() {
            addCriterion("hmaddr3 is not null");
            return (Criteria) this;
        }

        public Criteria andHmaddr3EqualTo(String value) {
            addCriterion("hmaddr3 =", value, "hmaddr3");
            return (Criteria) this;
        }

        public Criteria andHmaddr3NotEqualTo(String value) {
            addCriterion("hmaddr3 <>", value, "hmaddr3");
            return (Criteria) this;
        }

        public Criteria andHmaddr3GreaterThan(String value) {
            addCriterion("hmaddr3 >", value, "hmaddr3");
            return (Criteria) this;
        }

        public Criteria andHmaddr3GreaterThanOrEqualTo(String value) {
            addCriterion("hmaddr3 >=", value, "hmaddr3");
            return (Criteria) this;
        }

        public Criteria andHmaddr3LessThan(String value) {
            addCriterion("hmaddr3 <", value, "hmaddr3");
            return (Criteria) this;
        }

        public Criteria andHmaddr3LessThanOrEqualTo(String value) {
            addCriterion("hmaddr3 <=", value, "hmaddr3");
            return (Criteria) this;
        }

        public Criteria andHmaddr3Like(String value) {
            addCriterion("hmaddr3 like", value, "hmaddr3");
            return (Criteria) this;
        }

        public Criteria andHmaddr3NotLike(String value) {
            addCriterion("hmaddr3 not like", value, "hmaddr3");
            return (Criteria) this;
        }

        public Criteria andHmaddr3In(List<String> values) {
            addCriterion("hmaddr3 in", values, "hmaddr3");
            return (Criteria) this;
        }

        public Criteria andHmaddr3NotIn(List<String> values) {
            addCriterion("hmaddr3 not in", values, "hmaddr3");
            return (Criteria) this;
        }

        public Criteria andHmaddr3Between(String value1, String value2) {
            addCriterion("hmaddr3 between", value1, value2, "hmaddr3");
            return (Criteria) this;
        }

        public Criteria andHmaddr3NotBetween(String value1, String value2) {
            addCriterion("hmaddr3 not between", value1, value2, "hmaddr3");
            return (Criteria) this;
        }

        public Criteria andHmaddr4IsNull() {
            addCriterion("hmaddr4 is null");
            return (Criteria) this;
        }

        public Criteria andHmaddr4IsNotNull() {
            addCriterion("hmaddr4 is not null");
            return (Criteria) this;
        }

        public Criteria andHmaddr4EqualTo(String value) {
            addCriterion("hmaddr4 =", value, "hmaddr4");
            return (Criteria) this;
        }

        public Criteria andHmaddr4NotEqualTo(String value) {
            addCriterion("hmaddr4 <>", value, "hmaddr4");
            return (Criteria) this;
        }

        public Criteria andHmaddr4GreaterThan(String value) {
            addCriterion("hmaddr4 >", value, "hmaddr4");
            return (Criteria) this;
        }

        public Criteria andHmaddr4GreaterThanOrEqualTo(String value) {
            addCriterion("hmaddr4 >=", value, "hmaddr4");
            return (Criteria) this;
        }

        public Criteria andHmaddr4LessThan(String value) {
            addCriterion("hmaddr4 <", value, "hmaddr4");
            return (Criteria) this;
        }

        public Criteria andHmaddr4LessThanOrEqualTo(String value) {
            addCriterion("hmaddr4 <=", value, "hmaddr4");
            return (Criteria) this;
        }

        public Criteria andHmaddr4Like(String value) {
            addCriterion("hmaddr4 like", value, "hmaddr4");
            return (Criteria) this;
        }

        public Criteria andHmaddr4NotLike(String value) {
            addCriterion("hmaddr4 not like", value, "hmaddr4");
            return (Criteria) this;
        }

        public Criteria andHmaddr4In(List<String> values) {
            addCriterion("hmaddr4 in", values, "hmaddr4");
            return (Criteria) this;
        }

        public Criteria andHmaddr4NotIn(List<String> values) {
            addCriterion("hmaddr4 not in", values, "hmaddr4");
            return (Criteria) this;
        }

        public Criteria andHmaddr4Between(String value1, String value2) {
            addCriterion("hmaddr4 between", value1, value2, "hmaddr4");
            return (Criteria) this;
        }

        public Criteria andHmaddr4NotBetween(String value1, String value2) {
            addCriterion("hmaddr4 not between", value1, value2, "hmaddr4");
            return (Criteria) this;
        }

        public Criteria andHmpostIsNull() {
            addCriterion("hmpost is null");
            return (Criteria) this;
        }

        public Criteria andHmpostIsNotNull() {
            addCriterion("hmpost is not null");
            return (Criteria) this;
        }

        public Criteria andHmpostEqualTo(String value) {
            addCriterion("hmpost =", value, "hmpost");
            return (Criteria) this;
        }

        public Criteria andHmpostNotEqualTo(String value) {
            addCriterion("hmpost <>", value, "hmpost");
            return (Criteria) this;
        }

        public Criteria andHmpostGreaterThan(String value) {
            addCriterion("hmpost >", value, "hmpost");
            return (Criteria) this;
        }

        public Criteria andHmpostGreaterThanOrEqualTo(String value) {
            addCriterion("hmpost >=", value, "hmpost");
            return (Criteria) this;
        }

        public Criteria andHmpostLessThan(String value) {
            addCriterion("hmpost <", value, "hmpost");
            return (Criteria) this;
        }

        public Criteria andHmpostLessThanOrEqualTo(String value) {
            addCriterion("hmpost <=", value, "hmpost");
            return (Criteria) this;
        }

        public Criteria andHmpostLike(String value) {
            addCriterion("hmpost like", value, "hmpost");
            return (Criteria) this;
        }

        public Criteria andHmpostNotLike(String value) {
            addCriterion("hmpost not like", value, "hmpost");
            return (Criteria) this;
        }

        public Criteria andHmpostIn(List<String> values) {
            addCriterion("hmpost in", values, "hmpost");
            return (Criteria) this;
        }

        public Criteria andHmpostNotIn(List<String> values) {
            addCriterion("hmpost not in", values, "hmpost");
            return (Criteria) this;
        }

        public Criteria andHmpostBetween(String value1, String value2) {
            addCriterion("hmpost between", value1, value2, "hmpost");
            return (Criteria) this;
        }

        public Criteria andHmpostNotBetween(String value1, String value2) {
            addCriterion("hmpost not between", value1, value2, "hmpost");
            return (Criteria) this;
        }

        public Criteria andHmphoneIsNull() {
            addCriterion("hmphone is null");
            return (Criteria) this;
        }

        public Criteria andHmphoneIsNotNull() {
            addCriterion("hmphone is not null");
            return (Criteria) this;
        }

        public Criteria andHmphoneEqualTo(String value) {
            addCriterion("hmphone =", value, "hmphone");
            return (Criteria) this;
        }

        public Criteria andHmphoneNotEqualTo(String value) {
            addCriterion("hmphone <>", value, "hmphone");
            return (Criteria) this;
        }

        public Criteria andHmphoneGreaterThan(String value) {
            addCriterion("hmphone >", value, "hmphone");
            return (Criteria) this;
        }

        public Criteria andHmphoneGreaterThanOrEqualTo(String value) {
            addCriterion("hmphone >=", value, "hmphone");
            return (Criteria) this;
        }

        public Criteria andHmphoneLessThan(String value) {
            addCriterion("hmphone <", value, "hmphone");
            return (Criteria) this;
        }

        public Criteria andHmphoneLessThanOrEqualTo(String value) {
            addCriterion("hmphone <=", value, "hmphone");
            return (Criteria) this;
        }

        public Criteria andHmphoneLike(String value) {
            addCriterion("hmphone like", value, "hmphone");
            return (Criteria) this;
        }

        public Criteria andHmphoneNotLike(String value) {
            addCriterion("hmphone not like", value, "hmphone");
            return (Criteria) this;
        }

        public Criteria andHmphoneIn(List<String> values) {
            addCriterion("hmphone in", values, "hmphone");
            return (Criteria) this;
        }

        public Criteria andHmphoneNotIn(List<String> values) {
            addCriterion("hmphone not in", values, "hmphone");
            return (Criteria) this;
        }

        public Criteria andHmphoneBetween(String value1, String value2) {
            addCriterion("hmphone between", value1, value2, "hmphone");
            return (Criteria) this;
        }

        public Criteria andHmphoneNotBetween(String value1, String value2) {
            addCriterion("hmphone not between", value1, value2, "hmphone");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andWknameIsNull() {
            addCriterion("wkname is null");
            return (Criteria) this;
        }

        public Criteria andWknameIsNotNull() {
            addCriterion("wkname is not null");
            return (Criteria) this;
        }

        public Criteria andWknameEqualTo(String value) {
            addCriterion("wkname =", value, "wkname");
            return (Criteria) this;
        }

        public Criteria andWknameNotEqualTo(String value) {
            addCriterion("wkname <>", value, "wkname");
            return (Criteria) this;
        }

        public Criteria andWknameGreaterThan(String value) {
            addCriterion("wkname >", value, "wkname");
            return (Criteria) this;
        }

        public Criteria andWknameGreaterThanOrEqualTo(String value) {
            addCriterion("wkname >=", value, "wkname");
            return (Criteria) this;
        }

        public Criteria andWknameLessThan(String value) {
            addCriterion("wkname <", value, "wkname");
            return (Criteria) this;
        }

        public Criteria andWknameLessThanOrEqualTo(String value) {
            addCriterion("wkname <=", value, "wkname");
            return (Criteria) this;
        }

        public Criteria andWknameLike(String value) {
            addCriterion("wkname like", value, "wkname");
            return (Criteria) this;
        }

        public Criteria andWknameNotLike(String value) {
            addCriterion("wkname not like", value, "wkname");
            return (Criteria) this;
        }

        public Criteria andWknameIn(List<String> values) {
            addCriterion("wkname in", values, "wkname");
            return (Criteria) this;
        }

        public Criteria andWknameNotIn(List<String> values) {
            addCriterion("wkname not in", values, "wkname");
            return (Criteria) this;
        }

        public Criteria andWknameBetween(String value1, String value2) {
            addCriterion("wkname between", value1, value2, "wkname");
            return (Criteria) this;
        }

        public Criteria andWknameNotBetween(String value1, String value2) {
            addCriterion("wkname not between", value1, value2, "wkname");
            return (Criteria) this;
        }

        public Criteria andWkadd1IsNull() {
            addCriterion("wkadd1 is null");
            return (Criteria) this;
        }

        public Criteria andWkadd1IsNotNull() {
            addCriterion("wkadd1 is not null");
            return (Criteria) this;
        }

        public Criteria andWkadd1EqualTo(String value) {
            addCriterion("wkadd1 =", value, "wkadd1");
            return (Criteria) this;
        }

        public Criteria andWkadd1NotEqualTo(String value) {
            addCriterion("wkadd1 <>", value, "wkadd1");
            return (Criteria) this;
        }

        public Criteria andWkadd1GreaterThan(String value) {
            addCriterion("wkadd1 >", value, "wkadd1");
            return (Criteria) this;
        }

        public Criteria andWkadd1GreaterThanOrEqualTo(String value) {
            addCriterion("wkadd1 >=", value, "wkadd1");
            return (Criteria) this;
        }

        public Criteria andWkadd1LessThan(String value) {
            addCriterion("wkadd1 <", value, "wkadd1");
            return (Criteria) this;
        }

        public Criteria andWkadd1LessThanOrEqualTo(String value) {
            addCriterion("wkadd1 <=", value, "wkadd1");
            return (Criteria) this;
        }

        public Criteria andWkadd1Like(String value) {
            addCriterion("wkadd1 like", value, "wkadd1");
            return (Criteria) this;
        }

        public Criteria andWkadd1NotLike(String value) {
            addCriterion("wkadd1 not like", value, "wkadd1");
            return (Criteria) this;
        }

        public Criteria andWkadd1In(List<String> values) {
            addCriterion("wkadd1 in", values, "wkadd1");
            return (Criteria) this;
        }

        public Criteria andWkadd1NotIn(List<String> values) {
            addCriterion("wkadd1 not in", values, "wkadd1");
            return (Criteria) this;
        }

        public Criteria andWkadd1Between(String value1, String value2) {
            addCriterion("wkadd1 between", value1, value2, "wkadd1");
            return (Criteria) this;
        }

        public Criteria andWkadd1NotBetween(String value1, String value2) {
            addCriterion("wkadd1 not between", value1, value2, "wkadd1");
            return (Criteria) this;
        }

        public Criteria andWkadd2IsNull() {
            addCriterion("wkadd2 is null");
            return (Criteria) this;
        }

        public Criteria andWkadd2IsNotNull() {
            addCriterion("wkadd2 is not null");
            return (Criteria) this;
        }

        public Criteria andWkadd2EqualTo(String value) {
            addCriterion("wkadd2 =", value, "wkadd2");
            return (Criteria) this;
        }

        public Criteria andWkadd2NotEqualTo(String value) {
            addCriterion("wkadd2 <>", value, "wkadd2");
            return (Criteria) this;
        }

        public Criteria andWkadd2GreaterThan(String value) {
            addCriterion("wkadd2 >", value, "wkadd2");
            return (Criteria) this;
        }

        public Criteria andWkadd2GreaterThanOrEqualTo(String value) {
            addCriterion("wkadd2 >=", value, "wkadd2");
            return (Criteria) this;
        }

        public Criteria andWkadd2LessThan(String value) {
            addCriterion("wkadd2 <", value, "wkadd2");
            return (Criteria) this;
        }

        public Criteria andWkadd2LessThanOrEqualTo(String value) {
            addCriterion("wkadd2 <=", value, "wkadd2");
            return (Criteria) this;
        }

        public Criteria andWkadd2Like(String value) {
            addCriterion("wkadd2 like", value, "wkadd2");
            return (Criteria) this;
        }

        public Criteria andWkadd2NotLike(String value) {
            addCriterion("wkadd2 not like", value, "wkadd2");
            return (Criteria) this;
        }

        public Criteria andWkadd2In(List<String> values) {
            addCriterion("wkadd2 in", values, "wkadd2");
            return (Criteria) this;
        }

        public Criteria andWkadd2NotIn(List<String> values) {
            addCriterion("wkadd2 not in", values, "wkadd2");
            return (Criteria) this;
        }

        public Criteria andWkadd2Between(String value1, String value2) {
            addCriterion("wkadd2 between", value1, value2, "wkadd2");
            return (Criteria) this;
        }

        public Criteria andWkadd2NotBetween(String value1, String value2) {
            addCriterion("wkadd2 not between", value1, value2, "wkadd2");
            return (Criteria) this;
        }

        public Criteria andWkadd3IsNull() {
            addCriterion("wkadd3 is null");
            return (Criteria) this;
        }

        public Criteria andWkadd3IsNotNull() {
            addCriterion("wkadd3 is not null");
            return (Criteria) this;
        }

        public Criteria andWkadd3EqualTo(String value) {
            addCriterion("wkadd3 =", value, "wkadd3");
            return (Criteria) this;
        }

        public Criteria andWkadd3NotEqualTo(String value) {
            addCriterion("wkadd3 <>", value, "wkadd3");
            return (Criteria) this;
        }

        public Criteria andWkadd3GreaterThan(String value) {
            addCriterion("wkadd3 >", value, "wkadd3");
            return (Criteria) this;
        }

        public Criteria andWkadd3GreaterThanOrEqualTo(String value) {
            addCriterion("wkadd3 >=", value, "wkadd3");
            return (Criteria) this;
        }

        public Criteria andWkadd3LessThan(String value) {
            addCriterion("wkadd3 <", value, "wkadd3");
            return (Criteria) this;
        }

        public Criteria andWkadd3LessThanOrEqualTo(String value) {
            addCriterion("wkadd3 <=", value, "wkadd3");
            return (Criteria) this;
        }

        public Criteria andWkadd3Like(String value) {
            addCriterion("wkadd3 like", value, "wkadd3");
            return (Criteria) this;
        }

        public Criteria andWkadd3NotLike(String value) {
            addCriterion("wkadd3 not like", value, "wkadd3");
            return (Criteria) this;
        }

        public Criteria andWkadd3In(List<String> values) {
            addCriterion("wkadd3 in", values, "wkadd3");
            return (Criteria) this;
        }

        public Criteria andWkadd3NotIn(List<String> values) {
            addCriterion("wkadd3 not in", values, "wkadd3");
            return (Criteria) this;
        }

        public Criteria andWkadd3Between(String value1, String value2) {
            addCriterion("wkadd3 between", value1, value2, "wkadd3");
            return (Criteria) this;
        }

        public Criteria andWkadd3NotBetween(String value1, String value2) {
            addCriterion("wkadd3 not between", value1, value2, "wkadd3");
            return (Criteria) this;
        }

        public Criteria andWkadd4IsNull() {
            addCriterion("wkadd4 is null");
            return (Criteria) this;
        }

        public Criteria andWkadd4IsNotNull() {
            addCriterion("wkadd4 is not null");
            return (Criteria) this;
        }

        public Criteria andWkadd4EqualTo(String value) {
            addCriterion("wkadd4 =", value, "wkadd4");
            return (Criteria) this;
        }

        public Criteria andWkadd4NotEqualTo(String value) {
            addCriterion("wkadd4 <>", value, "wkadd4");
            return (Criteria) this;
        }

        public Criteria andWkadd4GreaterThan(String value) {
            addCriterion("wkadd4 >", value, "wkadd4");
            return (Criteria) this;
        }

        public Criteria andWkadd4GreaterThanOrEqualTo(String value) {
            addCriterion("wkadd4 >=", value, "wkadd4");
            return (Criteria) this;
        }

        public Criteria andWkadd4LessThan(String value) {
            addCriterion("wkadd4 <", value, "wkadd4");
            return (Criteria) this;
        }

        public Criteria andWkadd4LessThanOrEqualTo(String value) {
            addCriterion("wkadd4 <=", value, "wkadd4");
            return (Criteria) this;
        }

        public Criteria andWkadd4Like(String value) {
            addCriterion("wkadd4 like", value, "wkadd4");
            return (Criteria) this;
        }

        public Criteria andWkadd4NotLike(String value) {
            addCriterion("wkadd4 not like", value, "wkadd4");
            return (Criteria) this;
        }

        public Criteria andWkadd4In(List<String> values) {
            addCriterion("wkadd4 in", values, "wkadd4");
            return (Criteria) this;
        }

        public Criteria andWkadd4NotIn(List<String> values) {
            addCriterion("wkadd4 not in", values, "wkadd4");
            return (Criteria) this;
        }

        public Criteria andWkadd4Between(String value1, String value2) {
            addCriterion("wkadd4 between", value1, value2, "wkadd4");
            return (Criteria) this;
        }

        public Criteria andWkadd4NotBetween(String value1, String value2) {
            addCriterion("wkadd4 not between", value1, value2, "wkadd4");
            return (Criteria) this;
        }

        public Criteria andWkpostIsNull() {
            addCriterion("wkpost is null");
            return (Criteria) this;
        }

        public Criteria andWkpostIsNotNull() {
            addCriterion("wkpost is not null");
            return (Criteria) this;
        }

        public Criteria andWkpostEqualTo(String value) {
            addCriterion("wkpost =", value, "wkpost");
            return (Criteria) this;
        }

        public Criteria andWkpostNotEqualTo(String value) {
            addCriterion("wkpost <>", value, "wkpost");
            return (Criteria) this;
        }

        public Criteria andWkpostGreaterThan(String value) {
            addCriterion("wkpost >", value, "wkpost");
            return (Criteria) this;
        }

        public Criteria andWkpostGreaterThanOrEqualTo(String value) {
            addCriterion("wkpost >=", value, "wkpost");
            return (Criteria) this;
        }

        public Criteria andWkpostLessThan(String value) {
            addCriterion("wkpost <", value, "wkpost");
            return (Criteria) this;
        }

        public Criteria andWkpostLessThanOrEqualTo(String value) {
            addCriterion("wkpost <=", value, "wkpost");
            return (Criteria) this;
        }

        public Criteria andWkpostLike(String value) {
            addCriterion("wkpost like", value, "wkpost");
            return (Criteria) this;
        }

        public Criteria andWkpostNotLike(String value) {
            addCriterion("wkpost not like", value, "wkpost");
            return (Criteria) this;
        }

        public Criteria andWkpostIn(List<String> values) {
            addCriterion("wkpost in", values, "wkpost");
            return (Criteria) this;
        }

        public Criteria andWkpostNotIn(List<String> values) {
            addCriterion("wkpost not in", values, "wkpost");
            return (Criteria) this;
        }

        public Criteria andWkpostBetween(String value1, String value2) {
            addCriterion("wkpost between", value1, value2, "wkpost");
            return (Criteria) this;
        }

        public Criteria andWkpostNotBetween(String value1, String value2) {
            addCriterion("wkpost not between", value1, value2, "wkpost");
            return (Criteria) this;
        }

        public Criteria andWkphoneIsNull() {
            addCriterion("wkphone is null");
            return (Criteria) this;
        }

        public Criteria andWkphoneIsNotNull() {
            addCriterion("wkphone is not null");
            return (Criteria) this;
        }

        public Criteria andWkphoneEqualTo(String value) {
            addCriterion("wkphone =", value, "wkphone");
            return (Criteria) this;
        }

        public Criteria andWkphoneNotEqualTo(String value) {
            addCriterion("wkphone <>", value, "wkphone");
            return (Criteria) this;
        }

        public Criteria andWkphoneGreaterThan(String value) {
            addCriterion("wkphone >", value, "wkphone");
            return (Criteria) this;
        }

        public Criteria andWkphoneGreaterThanOrEqualTo(String value) {
            addCriterion("wkphone >=", value, "wkphone");
            return (Criteria) this;
        }

        public Criteria andWkphoneLessThan(String value) {
            addCriterion("wkphone <", value, "wkphone");
            return (Criteria) this;
        }

        public Criteria andWkphoneLessThanOrEqualTo(String value) {
            addCriterion("wkphone <=", value, "wkphone");
            return (Criteria) this;
        }

        public Criteria andWkphoneLike(String value) {
            addCriterion("wkphone like", value, "wkphone");
            return (Criteria) this;
        }

        public Criteria andWkphoneNotLike(String value) {
            addCriterion("wkphone not like", value, "wkphone");
            return (Criteria) this;
        }

        public Criteria andWkphoneIn(List<String> values) {
            addCriterion("wkphone in", values, "wkphone");
            return (Criteria) this;
        }

        public Criteria andWkphoneNotIn(List<String> values) {
            addCriterion("wkphone not in", values, "wkphone");
            return (Criteria) this;
        }

        public Criteria andWkphoneBetween(String value1, String value2) {
            addCriterion("wkphone between", value1, value2, "wkphone");
            return (Criteria) this;
        }

        public Criteria andWkphoneNotBetween(String value1, String value2) {
            addCriterion("wkphone not between", value1, value2, "wkphone");
            return (Criteria) this;
        }

        public Criteria andWktypeIsNull() {
            addCriterion("wktype is null");
            return (Criteria) this;
        }

        public Criteria andWktypeIsNotNull() {
            addCriterion("wktype is not null");
            return (Criteria) this;
        }

        public Criteria andWktypeEqualTo(String value) {
            addCriterion("wktype =", value, "wktype");
            return (Criteria) this;
        }

        public Criteria andWktypeNotEqualTo(String value) {
            addCriterion("wktype <>", value, "wktype");
            return (Criteria) this;
        }

        public Criteria andWktypeGreaterThan(String value) {
            addCriterion("wktype >", value, "wktype");
            return (Criteria) this;
        }

        public Criteria andWktypeGreaterThanOrEqualTo(String value) {
            addCriterion("wktype >=", value, "wktype");
            return (Criteria) this;
        }

        public Criteria andWktypeLessThan(String value) {
            addCriterion("wktype <", value, "wktype");
            return (Criteria) this;
        }

        public Criteria andWktypeLessThanOrEqualTo(String value) {
            addCriterion("wktype <=", value, "wktype");
            return (Criteria) this;
        }

        public Criteria andWktypeLike(String value) {
            addCriterion("wktype like", value, "wktype");
            return (Criteria) this;
        }

        public Criteria andWktypeNotLike(String value) {
            addCriterion("wktype not like", value, "wktype");
            return (Criteria) this;
        }

        public Criteria andWktypeIn(List<String> values) {
            addCriterion("wktype in", values, "wktype");
            return (Criteria) this;
        }

        public Criteria andWktypeNotIn(List<String> values) {
            addCriterion("wktype not in", values, "wktype");
            return (Criteria) this;
        }

        public Criteria andWktypeBetween(String value1, String value2) {
            addCriterion("wktype between", value1, value2, "wktype");
            return (Criteria) this;
        }

        public Criteria andWktypeNotBetween(String value1, String value2) {
            addCriterion("wktype not between", value1, value2, "wktype");
            return (Criteria) this;
        }

        public Criteria andEctypeIsNull() {
            addCriterion("ectype is null");
            return (Criteria) this;
        }

        public Criteria andEctypeIsNotNull() {
            addCriterion("ectype is not null");
            return (Criteria) this;
        }

        public Criteria andEctypeEqualTo(String value) {
            addCriterion("ectype =", value, "ectype");
            return (Criteria) this;
        }

        public Criteria andEctypeNotEqualTo(String value) {
            addCriterion("ectype <>", value, "ectype");
            return (Criteria) this;
        }

        public Criteria andEctypeGreaterThan(String value) {
            addCriterion("ectype >", value, "ectype");
            return (Criteria) this;
        }

        public Criteria andEctypeGreaterThanOrEqualTo(String value) {
            addCriterion("ectype >=", value, "ectype");
            return (Criteria) this;
        }

        public Criteria andEctypeLessThan(String value) {
            addCriterion("ectype <", value, "ectype");
            return (Criteria) this;
        }

        public Criteria andEctypeLessThanOrEqualTo(String value) {
            addCriterion("ectype <=", value, "ectype");
            return (Criteria) this;
        }

        public Criteria andEctypeLike(String value) {
            addCriterion("ectype like", value, "ectype");
            return (Criteria) this;
        }

        public Criteria andEctypeNotLike(String value) {
            addCriterion("ectype not like", value, "ectype");
            return (Criteria) this;
        }

        public Criteria andEctypeIn(List<String> values) {
            addCriterion("ectype in", values, "ectype");
            return (Criteria) this;
        }

        public Criteria andEctypeNotIn(List<String> values) {
            addCriterion("ectype not in", values, "ectype");
            return (Criteria) this;
        }

        public Criteria andEctypeBetween(String value1, String value2) {
            addCriterion("ectype between", value1, value2, "ectype");
            return (Criteria) this;
        }

        public Criteria andEctypeNotBetween(String value1, String value2) {
            addCriterion("ectype not between", value1, value2, "ectype");
            return (Criteria) this;
        }

        public Criteria andProlvlIsNull() {
            addCriterion("prolvl is null");
            return (Criteria) this;
        }

        public Criteria andProlvlIsNotNull() {
            addCriterion("prolvl is not null");
            return (Criteria) this;
        }

        public Criteria andProlvlEqualTo(String value) {
            addCriterion("prolvl =", value, "prolvl");
            return (Criteria) this;
        }

        public Criteria andProlvlNotEqualTo(String value) {
            addCriterion("prolvl <>", value, "prolvl");
            return (Criteria) this;
        }

        public Criteria andProlvlGreaterThan(String value) {
            addCriterion("prolvl >", value, "prolvl");
            return (Criteria) this;
        }

        public Criteria andProlvlGreaterThanOrEqualTo(String value) {
            addCriterion("prolvl >=", value, "prolvl");
            return (Criteria) this;
        }

        public Criteria andProlvlLessThan(String value) {
            addCriterion("prolvl <", value, "prolvl");
            return (Criteria) this;
        }

        public Criteria andProlvlLessThanOrEqualTo(String value) {
            addCriterion("prolvl <=", value, "prolvl");
            return (Criteria) this;
        }

        public Criteria andProlvlLike(String value) {
            addCriterion("prolvl like", value, "prolvl");
            return (Criteria) this;
        }

        public Criteria andProlvlNotLike(String value) {
            addCriterion("prolvl not like", value, "prolvl");
            return (Criteria) this;
        }

        public Criteria andProlvlIn(List<String> values) {
            addCriterion("prolvl in", values, "prolvl");
            return (Criteria) this;
        }

        public Criteria andProlvlNotIn(List<String> values) {
            addCriterion("prolvl not in", values, "prolvl");
            return (Criteria) this;
        }

        public Criteria andProlvlBetween(String value1, String value2) {
            addCriterion("prolvl between", value1, value2, "prolvl");
            return (Criteria) this;
        }

        public Criteria andProlvlNotBetween(String value1, String value2) {
            addCriterion("prolvl not between", value1, value2, "prolvl");
            return (Criteria) this;
        }

        public Criteria andWkyearIsNull() {
            addCriterion("wkyear is null");
            return (Criteria) this;
        }

        public Criteria andWkyearIsNotNull() {
            addCriterion("wkyear is not null");
            return (Criteria) this;
        }

        public Criteria andWkyearEqualTo(String value) {
            addCriterion("wkyear =", value, "wkyear");
            return (Criteria) this;
        }

        public Criteria andWkyearNotEqualTo(String value) {
            addCriterion("wkyear <>", value, "wkyear");
            return (Criteria) this;
        }

        public Criteria andWkyearGreaterThan(String value) {
            addCriterion("wkyear >", value, "wkyear");
            return (Criteria) this;
        }

        public Criteria andWkyearGreaterThanOrEqualTo(String value) {
            addCriterion("wkyear >=", value, "wkyear");
            return (Criteria) this;
        }

        public Criteria andWkyearLessThan(String value) {
            addCriterion("wkyear <", value, "wkyear");
            return (Criteria) this;
        }

        public Criteria andWkyearLessThanOrEqualTo(String value) {
            addCriterion("wkyear <=", value, "wkyear");
            return (Criteria) this;
        }

        public Criteria andWkyearLike(String value) {
            addCriterion("wkyear like", value, "wkyear");
            return (Criteria) this;
        }

        public Criteria andWkyearNotLike(String value) {
            addCriterion("wkyear not like", value, "wkyear");
            return (Criteria) this;
        }

        public Criteria andWkyearIn(List<String> values) {
            addCriterion("wkyear in", values, "wkyear");
            return (Criteria) this;
        }

        public Criteria andWkyearNotIn(List<String> values) {
            addCriterion("wkyear not in", values, "wkyear");
            return (Criteria) this;
        }

        public Criteria andWkyearBetween(String value1, String value2) {
            addCriterion("wkyear between", value1, value2, "wkyear");
            return (Criteria) this;
        }

        public Criteria andWkyearNotBetween(String value1, String value2) {
            addCriterion("wkyear not between", value1, value2, "wkyear");
            return (Criteria) this;
        }

        public Criteria andIncomIsNull() {
            addCriterion("incom is null");
            return (Criteria) this;
        }

        public Criteria andIncomIsNotNull() {
            addCriterion("incom is not null");
            return (Criteria) this;
        }

        public Criteria andIncomEqualTo(String value) {
            addCriterion("incom =", value, "incom");
            return (Criteria) this;
        }

        public Criteria andIncomNotEqualTo(String value) {
            addCriterion("incom <>", value, "incom");
            return (Criteria) this;
        }

        public Criteria andIncomGreaterThan(String value) {
            addCriterion("incom >", value, "incom");
            return (Criteria) this;
        }

        public Criteria andIncomGreaterThanOrEqualTo(String value) {
            addCriterion("incom >=", value, "incom");
            return (Criteria) this;
        }

        public Criteria andIncomLessThan(String value) {
            addCriterion("incom <", value, "incom");
            return (Criteria) this;
        }

        public Criteria andIncomLessThanOrEqualTo(String value) {
            addCriterion("incom <=", value, "incom");
            return (Criteria) this;
        }

        public Criteria andIncomLike(String value) {
            addCriterion("incom like", value, "incom");
            return (Criteria) this;
        }

        public Criteria andIncomNotLike(String value) {
            addCriterion("incom not like", value, "incom");
            return (Criteria) this;
        }

        public Criteria andIncomIn(List<String> values) {
            addCriterion("incom in", values, "incom");
            return (Criteria) this;
        }

        public Criteria andIncomNotIn(List<String> values) {
            addCriterion("incom not in", values, "incom");
            return (Criteria) this;
        }

        public Criteria andIncomBetween(String value1, String value2) {
            addCriterion("incom between", value1, value2, "incom");
            return (Criteria) this;
        }

        public Criteria andIncomNotBetween(String value1, String value2) {
            addCriterion("incom not between", value1, value2, "incom");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLike(String value) {
            addCriterion("age like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotLike(String value) {
            addCriterion("age not like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<String> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andChildrensIsNull() {
            addCriterion("childrens is null");
            return (Criteria) this;
        }

        public Criteria andChildrensIsNotNull() {
            addCriterion("childrens is not null");
            return (Criteria) this;
        }

        public Criteria andChildrensEqualTo(String value) {
            addCriterion("childrens =", value, "childrens");
            return (Criteria) this;
        }

        public Criteria andChildrensNotEqualTo(String value) {
            addCriterion("childrens <>", value, "childrens");
            return (Criteria) this;
        }

        public Criteria andChildrensGreaterThan(String value) {
            addCriterion("childrens >", value, "childrens");
            return (Criteria) this;
        }

        public Criteria andChildrensGreaterThanOrEqualTo(String value) {
            addCriterion("childrens >=", value, "childrens");
            return (Criteria) this;
        }

        public Criteria andChildrensLessThan(String value) {
            addCriterion("childrens <", value, "childrens");
            return (Criteria) this;
        }

        public Criteria andChildrensLessThanOrEqualTo(String value) {
            addCriterion("childrens <=", value, "childrens");
            return (Criteria) this;
        }

        public Criteria andChildrensLike(String value) {
            addCriterion("childrens like", value, "childrens");
            return (Criteria) this;
        }

        public Criteria andChildrensNotLike(String value) {
            addCriterion("childrens not like", value, "childrens");
            return (Criteria) this;
        }

        public Criteria andChildrensIn(List<String> values) {
            addCriterion("childrens in", values, "childrens");
            return (Criteria) this;
        }

        public Criteria andChildrensNotIn(List<String> values) {
            addCriterion("childrens not in", values, "childrens");
            return (Criteria) this;
        }

        public Criteria andChildrensBetween(String value1, String value2) {
            addCriterion("childrens between", value1, value2, "childrens");
            return (Criteria) this;
        }

        public Criteria andChildrensNotBetween(String value1, String value2) {
            addCriterion("childrens not between", value1, value2, "childrens");
            return (Criteria) this;
        }

        public Criteria andPronumIsNull() {
            addCriterion("pronum is null");
            return (Criteria) this;
        }

        public Criteria andPronumIsNotNull() {
            addCriterion("pronum is not null");
            return (Criteria) this;
        }

        public Criteria andPronumEqualTo(String value) {
            addCriterion("pronum =", value, "pronum");
            return (Criteria) this;
        }

        public Criteria andPronumNotEqualTo(String value) {
            addCriterion("pronum <>", value, "pronum");
            return (Criteria) this;
        }

        public Criteria andPronumGreaterThan(String value) {
            addCriterion("pronum >", value, "pronum");
            return (Criteria) this;
        }

        public Criteria andPronumGreaterThanOrEqualTo(String value) {
            addCriterion("pronum >=", value, "pronum");
            return (Criteria) this;
        }

        public Criteria andPronumLessThan(String value) {
            addCriterion("pronum <", value, "pronum");
            return (Criteria) this;
        }

        public Criteria andPronumLessThanOrEqualTo(String value) {
            addCriterion("pronum <=", value, "pronum");
            return (Criteria) this;
        }

        public Criteria andPronumLike(String value) {
            addCriterion("pronum like", value, "pronum");
            return (Criteria) this;
        }

        public Criteria andPronumNotLike(String value) {
            addCriterion("pronum not like", value, "pronum");
            return (Criteria) this;
        }

        public Criteria andPronumIn(List<String> values) {
            addCriterion("pronum in", values, "pronum");
            return (Criteria) this;
        }

        public Criteria andPronumNotIn(List<String> values) {
            addCriterion("pronum not in", values, "pronum");
            return (Criteria) this;
        }

        public Criteria andPronumBetween(String value1, String value2) {
            addCriterion("pronum between", value1, value2, "pronum");
            return (Criteria) this;
        }

        public Criteria andPronumNotBetween(String value1, String value2) {
            addCriterion("pronum not between", value1, value2, "pronum");
            return (Criteria) this;
        }

        public Criteria andCcardIsNull() {
            addCriterion("ccard is null");
            return (Criteria) this;
        }

        public Criteria andCcardIsNotNull() {
            addCriterion("ccard is not null");
            return (Criteria) this;
        }

        public Criteria andCcardEqualTo(String value) {
            addCriterion("ccard =", value, "ccard");
            return (Criteria) this;
        }

        public Criteria andCcardNotEqualTo(String value) {
            addCriterion("ccard <>", value, "ccard");
            return (Criteria) this;
        }

        public Criteria andCcardGreaterThan(String value) {
            addCriterion("ccard >", value, "ccard");
            return (Criteria) this;
        }

        public Criteria andCcardGreaterThanOrEqualTo(String value) {
            addCriterion("ccard >=", value, "ccard");
            return (Criteria) this;
        }

        public Criteria andCcardLessThan(String value) {
            addCriterion("ccard <", value, "ccard");
            return (Criteria) this;
        }

        public Criteria andCcardLessThanOrEqualTo(String value) {
            addCriterion("ccard <=", value, "ccard");
            return (Criteria) this;
        }

        public Criteria andCcardLike(String value) {
            addCriterion("ccard like", value, "ccard");
            return (Criteria) this;
        }

        public Criteria andCcardNotLike(String value) {
            addCriterion("ccard not like", value, "ccard");
            return (Criteria) this;
        }

        public Criteria andCcardIn(List<String> values) {
            addCriterion("ccard in", values, "ccard");
            return (Criteria) this;
        }

        public Criteria andCcardNotIn(List<String> values) {
            addCriterion("ccard not in", values, "ccard");
            return (Criteria) this;
        }

        public Criteria andCcardBetween(String value1, String value2) {
            addCriterion("ccard between", value1, value2, "ccard");
            return (Criteria) this;
        }

        public Criteria andCcardNotBetween(String value1, String value2) {
            addCriterion("ccard not between", value1, value2, "ccard");
            return (Criteria) this;
        }

        public Criteria andXpadIsNull() {
            addCriterion("xpad is null");
            return (Criteria) this;
        }

        public Criteria andXpadIsNotNull() {
            addCriterion("xpad is not null");
            return (Criteria) this;
        }

        public Criteria andXpadEqualTo(String value) {
            addCriterion("xpad =", value, "xpad");
            return (Criteria) this;
        }

        public Criteria andXpadNotEqualTo(String value) {
            addCriterion("xpad <>", value, "xpad");
            return (Criteria) this;
        }

        public Criteria andXpadGreaterThan(String value) {
            addCriterion("xpad >", value, "xpad");
            return (Criteria) this;
        }

        public Criteria andXpadGreaterThanOrEqualTo(String value) {
            addCriterion("xpad >=", value, "xpad");
            return (Criteria) this;
        }

        public Criteria andXpadLessThan(String value) {
            addCriterion("xpad <", value, "xpad");
            return (Criteria) this;
        }

        public Criteria andXpadLessThanOrEqualTo(String value) {
            addCriterion("xpad <=", value, "xpad");
            return (Criteria) this;
        }

        public Criteria andXpadLike(String value) {
            addCriterion("xpad like", value, "xpad");
            return (Criteria) this;
        }

        public Criteria andXpadNotLike(String value) {
            addCriterion("xpad not like", value, "xpad");
            return (Criteria) this;
        }

        public Criteria andXpadIn(List<String> values) {
            addCriterion("xpad in", values, "xpad");
            return (Criteria) this;
        }

        public Criteria andXpadNotIn(List<String> values) {
            addCriterion("xpad not in", values, "xpad");
            return (Criteria) this;
        }

        public Criteria andXpadBetween(String value1, String value2) {
            addCriterion("xpad between", value1, value2, "xpad");
            return (Criteria) this;
        }

        public Criteria andXpadNotBetween(String value1, String value2) {
            addCriterion("xpad not between", value1, value2, "xpad");
            return (Criteria) this;
        }

        public Criteria andFundIsNull() {
            addCriterion("fund is null");
            return (Criteria) this;
        }

        public Criteria andFundIsNotNull() {
            addCriterion("fund is not null");
            return (Criteria) this;
        }

        public Criteria andFundEqualTo(String value) {
            addCriterion("fund =", value, "fund");
            return (Criteria) this;
        }

        public Criteria andFundNotEqualTo(String value) {
            addCriterion("fund <>", value, "fund");
            return (Criteria) this;
        }

        public Criteria andFundGreaterThan(String value) {
            addCriterion("fund >", value, "fund");
            return (Criteria) this;
        }

        public Criteria andFundGreaterThanOrEqualTo(String value) {
            addCriterion("fund >=", value, "fund");
            return (Criteria) this;
        }

        public Criteria andFundLessThan(String value) {
            addCriterion("fund <", value, "fund");
            return (Criteria) this;
        }

        public Criteria andFundLessThanOrEqualTo(String value) {
            addCriterion("fund <=", value, "fund");
            return (Criteria) this;
        }

        public Criteria andFundLike(String value) {
            addCriterion("fund like", value, "fund");
            return (Criteria) this;
        }

        public Criteria andFundNotLike(String value) {
            addCriterion("fund not like", value, "fund");
            return (Criteria) this;
        }

        public Criteria andFundIn(List<String> values) {
            addCriterion("fund in", values, "fund");
            return (Criteria) this;
        }

        public Criteria andFundNotIn(List<String> values) {
            addCriterion("fund not in", values, "fund");
            return (Criteria) this;
        }

        public Criteria andFundBetween(String value1, String value2) {
            addCriterion("fund between", value1, value2, "fund");
            return (Criteria) this;
        }

        public Criteria andFundNotBetween(String value1, String value2) {
            addCriterion("fund not between", value1, value2, "fund");
            return (Criteria) this;
        }

        public Criteria andInvmIsNull() {
            addCriterion("invm is null");
            return (Criteria) this;
        }

        public Criteria andInvmIsNotNull() {
            addCriterion("invm is not null");
            return (Criteria) this;
        }

        public Criteria andInvmEqualTo(String value) {
            addCriterion("invm =", value, "invm");
            return (Criteria) this;
        }

        public Criteria andInvmNotEqualTo(String value) {
            addCriterion("invm <>", value, "invm");
            return (Criteria) this;
        }

        public Criteria andInvmGreaterThan(String value) {
            addCriterion("invm >", value, "invm");
            return (Criteria) this;
        }

        public Criteria andInvmGreaterThanOrEqualTo(String value) {
            addCriterion("invm >=", value, "invm");
            return (Criteria) this;
        }

        public Criteria andInvmLessThan(String value) {
            addCriterion("invm <", value, "invm");
            return (Criteria) this;
        }

        public Criteria andInvmLessThanOrEqualTo(String value) {
            addCriterion("invm <=", value, "invm");
            return (Criteria) this;
        }

        public Criteria andInvmLike(String value) {
            addCriterion("invm like", value, "invm");
            return (Criteria) this;
        }

        public Criteria andInvmNotLike(String value) {
            addCriterion("invm not like", value, "invm");
            return (Criteria) this;
        }

        public Criteria andInvmIn(List<String> values) {
            addCriterion("invm in", values, "invm");
            return (Criteria) this;
        }

        public Criteria andInvmNotIn(List<String> values) {
            addCriterion("invm not in", values, "invm");
            return (Criteria) this;
        }

        public Criteria andInvmBetween(String value1, String value2) {
            addCriterion("invm between", value1, value2, "invm");
            return (Criteria) this;
        }

        public Criteria andInvmNotBetween(String value1, String value2) {
            addCriterion("invm not between", value1, value2, "invm");
            return (Criteria) this;
        }

        public Criteria andTpccIsNull() {
            addCriterion("tpcc is null");
            return (Criteria) this;
        }

        public Criteria andTpccIsNotNull() {
            addCriterion("tpcc is not null");
            return (Criteria) this;
        }

        public Criteria andTpccEqualTo(String value) {
            addCriterion("tpcc =", value, "tpcc");
            return (Criteria) this;
        }

        public Criteria andTpccNotEqualTo(String value) {
            addCriterion("tpcc <>", value, "tpcc");
            return (Criteria) this;
        }

        public Criteria andTpccGreaterThan(String value) {
            addCriterion("tpcc >", value, "tpcc");
            return (Criteria) this;
        }

        public Criteria andTpccGreaterThanOrEqualTo(String value) {
            addCriterion("tpcc >=", value, "tpcc");
            return (Criteria) this;
        }

        public Criteria andTpccLessThan(String value) {
            addCriterion("tpcc <", value, "tpcc");
            return (Criteria) this;
        }

        public Criteria andTpccLessThanOrEqualTo(String value) {
            addCriterion("tpcc <=", value, "tpcc");
            return (Criteria) this;
        }

        public Criteria andTpccLike(String value) {
            addCriterion("tpcc like", value, "tpcc");
            return (Criteria) this;
        }

        public Criteria andTpccNotLike(String value) {
            addCriterion("tpcc not like", value, "tpcc");
            return (Criteria) this;
        }

        public Criteria andTpccIn(List<String> values) {
            addCriterion("tpcc in", values, "tpcc");
            return (Criteria) this;
        }

        public Criteria andTpccNotIn(List<String> values) {
            addCriterion("tpcc not in", values, "tpcc");
            return (Criteria) this;
        }

        public Criteria andTpccBetween(String value1, String value2) {
            addCriterion("tpcc between", value1, value2, "tpcc");
            return (Criteria) this;
        }

        public Criteria andTpccNotBetween(String value1, String value2) {
            addCriterion("tpcc not between", value1, value2, "tpcc");
            return (Criteria) this;
        }

        public Criteria andBondIsNull() {
            addCriterion("bond is null");
            return (Criteria) this;
        }

        public Criteria andBondIsNotNull() {
            addCriterion("bond is not null");
            return (Criteria) this;
        }

        public Criteria andBondEqualTo(String value) {
            addCriterion("bond =", value, "bond");
            return (Criteria) this;
        }

        public Criteria andBondNotEqualTo(String value) {
            addCriterion("bond <>", value, "bond");
            return (Criteria) this;
        }

        public Criteria andBondGreaterThan(String value) {
            addCriterion("bond >", value, "bond");
            return (Criteria) this;
        }

        public Criteria andBondGreaterThanOrEqualTo(String value) {
            addCriterion("bond >=", value, "bond");
            return (Criteria) this;
        }

        public Criteria andBondLessThan(String value) {
            addCriterion("bond <", value, "bond");
            return (Criteria) this;
        }

        public Criteria andBondLessThanOrEqualTo(String value) {
            addCriterion("bond <=", value, "bond");
            return (Criteria) this;
        }

        public Criteria andBondLike(String value) {
            addCriterion("bond like", value, "bond");
            return (Criteria) this;
        }

        public Criteria andBondNotLike(String value) {
            addCriterion("bond not like", value, "bond");
            return (Criteria) this;
        }

        public Criteria andBondIn(List<String> values) {
            addCriterion("bond in", values, "bond");
            return (Criteria) this;
        }

        public Criteria andBondNotIn(List<String> values) {
            addCriterion("bond not in", values, "bond");
            return (Criteria) this;
        }

        public Criteria andBondBetween(String value1, String value2) {
            addCriterion("bond between", value1, value2, "bond");
            return (Criteria) this;
        }

        public Criteria andBondNotBetween(String value1, String value2) {
            addCriterion("bond not between", value1, value2, "bond");
            return (Criteria) this;
        }

        public Criteria andInsureIsNull() {
            addCriterion("insure is null");
            return (Criteria) this;
        }

        public Criteria andInsureIsNotNull() {
            addCriterion("insure is not null");
            return (Criteria) this;
        }

        public Criteria andInsureEqualTo(String value) {
            addCriterion("insure =", value, "insure");
            return (Criteria) this;
        }

        public Criteria andInsureNotEqualTo(String value) {
            addCriterion("insure <>", value, "insure");
            return (Criteria) this;
        }

        public Criteria andInsureGreaterThan(String value) {
            addCriterion("insure >", value, "insure");
            return (Criteria) this;
        }

        public Criteria andInsureGreaterThanOrEqualTo(String value) {
            addCriterion("insure >=", value, "insure");
            return (Criteria) this;
        }

        public Criteria andInsureLessThan(String value) {
            addCriterion("insure <", value, "insure");
            return (Criteria) this;
        }

        public Criteria andInsureLessThanOrEqualTo(String value) {
            addCriterion("insure <=", value, "insure");
            return (Criteria) this;
        }

        public Criteria andInsureLike(String value) {
            addCriterion("insure like", value, "insure");
            return (Criteria) this;
        }

        public Criteria andInsureNotLike(String value) {
            addCriterion("insure not like", value, "insure");
            return (Criteria) this;
        }

        public Criteria andInsureIn(List<String> values) {
            addCriterion("insure in", values, "insure");
            return (Criteria) this;
        }

        public Criteria andInsureNotIn(List<String> values) {
            addCriterion("insure not in", values, "insure");
            return (Criteria) this;
        }

        public Criteria andInsureBetween(String value1, String value2) {
            addCriterion("insure between", value1, value2, "insure");
            return (Criteria) this;
        }

        public Criteria andInsureNotBetween(String value1, String value2) {
            addCriterion("insure not between", value1, value2, "insure");
            return (Criteria) this;
        }

        public Criteria andJcjIsNull() {
            addCriterion("jcj is null");
            return (Criteria) this;
        }

        public Criteria andJcjIsNotNull() {
            addCriterion("jcj is not null");
            return (Criteria) this;
        }

        public Criteria andJcjEqualTo(String value) {
            addCriterion("jcj =", value, "jcj");
            return (Criteria) this;
        }

        public Criteria andJcjNotEqualTo(String value) {
            addCriterion("jcj <>", value, "jcj");
            return (Criteria) this;
        }

        public Criteria andJcjGreaterThan(String value) {
            addCriterion("jcj >", value, "jcj");
            return (Criteria) this;
        }

        public Criteria andJcjGreaterThanOrEqualTo(String value) {
            addCriterion("jcj >=", value, "jcj");
            return (Criteria) this;
        }

        public Criteria andJcjLessThan(String value) {
            addCriterion("jcj <", value, "jcj");
            return (Criteria) this;
        }

        public Criteria andJcjLessThanOrEqualTo(String value) {
            addCriterion("jcj <=", value, "jcj");
            return (Criteria) this;
        }

        public Criteria andJcjLike(String value) {
            addCriterion("jcj like", value, "jcj");
            return (Criteria) this;
        }

        public Criteria andJcjNotLike(String value) {
            addCriterion("jcj not like", value, "jcj");
            return (Criteria) this;
        }

        public Criteria andJcjIn(List<String> values) {
            addCriterion("jcj in", values, "jcj");
            return (Criteria) this;
        }

        public Criteria andJcjNotIn(List<String> values) {
            addCriterion("jcj not in", values, "jcj");
            return (Criteria) this;
        }

        public Criteria andJcjBetween(String value1, String value2) {
            addCriterion("jcj between", value1, value2, "jcj");
            return (Criteria) this;
        }

        public Criteria andJcjNotBetween(String value1, String value2) {
            addCriterion("jcj not between", value1, value2, "jcj");
            return (Criteria) this;
        }

        public Criteria andCardIsNull() {
            addCriterion("card is null");
            return (Criteria) this;
        }

        public Criteria andCardIsNotNull() {
            addCriterion("card is not null");
            return (Criteria) this;
        }

        public Criteria andCardEqualTo(String value) {
            addCriterion("card =", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotEqualTo(String value) {
            addCriterion("card <>", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardGreaterThan(String value) {
            addCriterion("card >", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardGreaterThanOrEqualTo(String value) {
            addCriterion("card >=", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLessThan(String value) {
            addCriterion("card <", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLessThanOrEqualTo(String value) {
            addCriterion("card <=", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLike(String value) {
            addCriterion("card like", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotLike(String value) {
            addCriterion("card not like", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardIn(List<String> values) {
            addCriterion("card in", values, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotIn(List<String> values) {
            addCriterion("card not in", values, "card");
            return (Criteria) this;
        }

        public Criteria andCardBetween(String value1, String value2) {
            addCriterion("card between", value1, value2, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotBetween(String value1, String value2) {
            addCriterion("card not between", value1, value2, "card");
            return (Criteria) this;
        }

        public Criteria andBormIsNull() {
            addCriterion("borm is null");
            return (Criteria) this;
        }

        public Criteria andBormIsNotNull() {
            addCriterion("borm is not null");
            return (Criteria) this;
        }

        public Criteria andBormEqualTo(String value) {
            addCriterion("borm =", value, "borm");
            return (Criteria) this;
        }

        public Criteria andBormNotEqualTo(String value) {
            addCriterion("borm <>", value, "borm");
            return (Criteria) this;
        }

        public Criteria andBormGreaterThan(String value) {
            addCriterion("borm >", value, "borm");
            return (Criteria) this;
        }

        public Criteria andBormGreaterThanOrEqualTo(String value) {
            addCriterion("borm >=", value, "borm");
            return (Criteria) this;
        }

        public Criteria andBormLessThan(String value) {
            addCriterion("borm <", value, "borm");
            return (Criteria) this;
        }

        public Criteria andBormLessThanOrEqualTo(String value) {
            addCriterion("borm <=", value, "borm");
            return (Criteria) this;
        }

        public Criteria andBormLike(String value) {
            addCriterion("borm like", value, "borm");
            return (Criteria) this;
        }

        public Criteria andBormNotLike(String value) {
            addCriterion("borm not like", value, "borm");
            return (Criteria) this;
        }

        public Criteria andBormIn(List<String> values) {
            addCriterion("borm in", values, "borm");
            return (Criteria) this;
        }

        public Criteria andBormNotIn(List<String> values) {
            addCriterion("borm not in", values, "borm");
            return (Criteria) this;
        }

        public Criteria andBormBetween(String value1, String value2) {
            addCriterion("borm between", value1, value2, "borm");
            return (Criteria) this;
        }

        public Criteria andBormNotBetween(String value1, String value2) {
            addCriterion("borm not between", value1, value2, "borm");
            return (Criteria) this;
        }

        public Criteria andBocnetIsNull() {
            addCriterion("bocnet is null");
            return (Criteria) this;
        }

        public Criteria andBocnetIsNotNull() {
            addCriterion("bocnet is not null");
            return (Criteria) this;
        }

        public Criteria andBocnetEqualTo(String value) {
            addCriterion("bocnet =", value, "bocnet");
            return (Criteria) this;
        }

        public Criteria andBocnetNotEqualTo(String value) {
            addCriterion("bocnet <>", value, "bocnet");
            return (Criteria) this;
        }

        public Criteria andBocnetGreaterThan(String value) {
            addCriterion("bocnet >", value, "bocnet");
            return (Criteria) this;
        }

        public Criteria andBocnetGreaterThanOrEqualTo(String value) {
            addCriterion("bocnet >=", value, "bocnet");
            return (Criteria) this;
        }

        public Criteria andBocnetLessThan(String value) {
            addCriterion("bocnet <", value, "bocnet");
            return (Criteria) this;
        }

        public Criteria andBocnetLessThanOrEqualTo(String value) {
            addCriterion("bocnet <=", value, "bocnet");
            return (Criteria) this;
        }

        public Criteria andBocnetLike(String value) {
            addCriterion("bocnet like", value, "bocnet");
            return (Criteria) this;
        }

        public Criteria andBocnetNotLike(String value) {
            addCriterion("bocnet not like", value, "bocnet");
            return (Criteria) this;
        }

        public Criteria andBocnetIn(List<String> values) {
            addCriterion("bocnet in", values, "bocnet");
            return (Criteria) this;
        }

        public Criteria andBocnetNotIn(List<String> values) {
            addCriterion("bocnet not in", values, "bocnet");
            return (Criteria) this;
        }

        public Criteria andBocnetBetween(String value1, String value2) {
            addCriterion("bocnet between", value1, value2, "bocnet");
            return (Criteria) this;
        }

        public Criteria andBocnetNotBetween(String value1, String value2) {
            addCriterion("bocnet not between", value1, value2, "bocnet");
            return (Criteria) this;
        }

        public Criteria andMobnetIsNull() {
            addCriterion("mobnet is null");
            return (Criteria) this;
        }

        public Criteria andMobnetIsNotNull() {
            addCriterion("mobnet is not null");
            return (Criteria) this;
        }

        public Criteria andMobnetEqualTo(String value) {
            addCriterion("mobnet =", value, "mobnet");
            return (Criteria) this;
        }

        public Criteria andMobnetNotEqualTo(String value) {
            addCriterion("mobnet <>", value, "mobnet");
            return (Criteria) this;
        }

        public Criteria andMobnetGreaterThan(String value) {
            addCriterion("mobnet >", value, "mobnet");
            return (Criteria) this;
        }

        public Criteria andMobnetGreaterThanOrEqualTo(String value) {
            addCriterion("mobnet >=", value, "mobnet");
            return (Criteria) this;
        }

        public Criteria andMobnetLessThan(String value) {
            addCriterion("mobnet <", value, "mobnet");
            return (Criteria) this;
        }

        public Criteria andMobnetLessThanOrEqualTo(String value) {
            addCriterion("mobnet <=", value, "mobnet");
            return (Criteria) this;
        }

        public Criteria andMobnetLike(String value) {
            addCriterion("mobnet like", value, "mobnet");
            return (Criteria) this;
        }

        public Criteria andMobnetNotLike(String value) {
            addCriterion("mobnet not like", value, "mobnet");
            return (Criteria) this;
        }

        public Criteria andMobnetIn(List<String> values) {
            addCriterion("mobnet in", values, "mobnet");
            return (Criteria) this;
        }

        public Criteria andMobnetNotIn(List<String> values) {
            addCriterion("mobnet not in", values, "mobnet");
            return (Criteria) this;
        }

        public Criteria andMobnetBetween(String value1, String value2) {
            addCriterion("mobnet between", value1, value2, "mobnet");
            return (Criteria) this;
        }

        public Criteria andMobnetNotBetween(String value1, String value2) {
            addCriterion("mobnet not between", value1, value2, "mobnet");
            return (Criteria) this;
        }

        public Criteria andXpadgIsNull() {
            addCriterion("xpadg is null");
            return (Criteria) this;
        }

        public Criteria andXpadgIsNotNull() {
            addCriterion("xpadg is not null");
            return (Criteria) this;
        }

        public Criteria andXpadgEqualTo(String value) {
            addCriterion("xpadg =", value, "xpadg");
            return (Criteria) this;
        }

        public Criteria andXpadgNotEqualTo(String value) {
            addCriterion("xpadg <>", value, "xpadg");
            return (Criteria) this;
        }

        public Criteria andXpadgGreaterThan(String value) {
            addCriterion("xpadg >", value, "xpadg");
            return (Criteria) this;
        }

        public Criteria andXpadgGreaterThanOrEqualTo(String value) {
            addCriterion("xpadg >=", value, "xpadg");
            return (Criteria) this;
        }

        public Criteria andXpadgLessThan(String value) {
            addCriterion("xpadg <", value, "xpadg");
            return (Criteria) this;
        }

        public Criteria andXpadgLessThanOrEqualTo(String value) {
            addCriterion("xpadg <=", value, "xpadg");
            return (Criteria) this;
        }

        public Criteria andXpadgLike(String value) {
            addCriterion("xpadg like", value, "xpadg");
            return (Criteria) this;
        }

        public Criteria andXpadgNotLike(String value) {
            addCriterion("xpadg not like", value, "xpadg");
            return (Criteria) this;
        }

        public Criteria andXpadgIn(List<String> values) {
            addCriterion("xpadg in", values, "xpadg");
            return (Criteria) this;
        }

        public Criteria andXpadgNotIn(List<String> values) {
            addCriterion("xpadg not in", values, "xpadg");
            return (Criteria) this;
        }

        public Criteria andXpadgBetween(String value1, String value2) {
            addCriterion("xpadg between", value1, value2, "xpadg");
            return (Criteria) this;
        }

        public Criteria andXpadgNotBetween(String value1, String value2) {
            addCriterion("xpadg not between", value1, value2, "xpadg");
            return (Criteria) this;
        }

        public Criteria andCarsIsNull() {
            addCriterion("cars is null");
            return (Criteria) this;
        }

        public Criteria andCarsIsNotNull() {
            addCriterion("cars is not null");
            return (Criteria) this;
        }

        public Criteria andCarsEqualTo(String value) {
            addCriterion("cars =", value, "cars");
            return (Criteria) this;
        }

        public Criteria andCarsNotEqualTo(String value) {
            addCriterion("cars <>", value, "cars");
            return (Criteria) this;
        }

        public Criteria andCarsGreaterThan(String value) {
            addCriterion("cars >", value, "cars");
            return (Criteria) this;
        }

        public Criteria andCarsGreaterThanOrEqualTo(String value) {
            addCriterion("cars >=", value, "cars");
            return (Criteria) this;
        }

        public Criteria andCarsLessThan(String value) {
            addCriterion("cars <", value, "cars");
            return (Criteria) this;
        }

        public Criteria andCarsLessThanOrEqualTo(String value) {
            addCriterion("cars <=", value, "cars");
            return (Criteria) this;
        }

        public Criteria andCarsLike(String value) {
            addCriterion("cars like", value, "cars");
            return (Criteria) this;
        }

        public Criteria andCarsNotLike(String value) {
            addCriterion("cars not like", value, "cars");
            return (Criteria) this;
        }

        public Criteria andCarsIn(List<String> values) {
            addCriterion("cars in", values, "cars");
            return (Criteria) this;
        }

        public Criteria andCarsNotIn(List<String> values) {
            addCriterion("cars not in", values, "cars");
            return (Criteria) this;
        }

        public Criteria andCarsBetween(String value1, String value2) {
            addCriterion("cars between", value1, value2, "cars");
            return (Criteria) this;
        }

        public Criteria andCarsNotBetween(String value1, String value2) {
            addCriterion("cars not between", value1, value2, "cars");
            return (Criteria) this;
        }

        public Criteria andHouseIsNull() {
            addCriterion("house is null");
            return (Criteria) this;
        }

        public Criteria andHouseIsNotNull() {
            addCriterion("house is not null");
            return (Criteria) this;
        }

        public Criteria andHouseEqualTo(String value) {
            addCriterion("house =", value, "house");
            return (Criteria) this;
        }

        public Criteria andHouseNotEqualTo(String value) {
            addCriterion("house <>", value, "house");
            return (Criteria) this;
        }

        public Criteria andHouseGreaterThan(String value) {
            addCriterion("house >", value, "house");
            return (Criteria) this;
        }

        public Criteria andHouseGreaterThanOrEqualTo(String value) {
            addCriterion("house >=", value, "house");
            return (Criteria) this;
        }

        public Criteria andHouseLessThan(String value) {
            addCriterion("house <", value, "house");
            return (Criteria) this;
        }

        public Criteria andHouseLessThanOrEqualTo(String value) {
            addCriterion("house <=", value, "house");
            return (Criteria) this;
        }

        public Criteria andHouseLike(String value) {
            addCriterion("house like", value, "house");
            return (Criteria) this;
        }

        public Criteria andHouseNotLike(String value) {
            addCriterion("house not like", value, "house");
            return (Criteria) this;
        }

        public Criteria andHouseIn(List<String> values) {
            addCriterion("house in", values, "house");
            return (Criteria) this;
        }

        public Criteria andHouseNotIn(List<String> values) {
            addCriterion("house not in", values, "house");
            return (Criteria) this;
        }

        public Criteria andHouseBetween(String value1, String value2) {
            addCriterion("house between", value1, value2, "house");
            return (Criteria) this;
        }

        public Criteria andHouseNotBetween(String value1, String value2) {
            addCriterion("house not between", value1, value2, "house");
            return (Criteria) this;
        }

        public Criteria andCustlvlIsNull() {
            addCriterion("custlvl is null");
            return (Criteria) this;
        }

        public Criteria andCustlvlIsNotNull() {
            addCriterion("custlvl is not null");
            return (Criteria) this;
        }

        public Criteria andCustlvlEqualTo(String value) {
            addCriterion("custlvl =", value, "custlvl");
            return (Criteria) this;
        }

        public Criteria andCustlvlNotEqualTo(String value) {
            addCriterion("custlvl <>", value, "custlvl");
            return (Criteria) this;
        }

        public Criteria andCustlvlGreaterThan(String value) {
            addCriterion("custlvl >", value, "custlvl");
            return (Criteria) this;
        }

        public Criteria andCustlvlGreaterThanOrEqualTo(String value) {
            addCriterion("custlvl >=", value, "custlvl");
            return (Criteria) this;
        }

        public Criteria andCustlvlLessThan(String value) {
            addCriterion("custlvl <", value, "custlvl");
            return (Criteria) this;
        }

        public Criteria andCustlvlLessThanOrEqualTo(String value) {
            addCriterion("custlvl <=", value, "custlvl");
            return (Criteria) this;
        }

        public Criteria andCustlvlLike(String value) {
            addCriterion("custlvl like", value, "custlvl");
            return (Criteria) this;
        }

        public Criteria andCustlvlNotLike(String value) {
            addCriterion("custlvl not like", value, "custlvl");
            return (Criteria) this;
        }

        public Criteria andCustlvlIn(List<String> values) {
            addCriterion("custlvl in", values, "custlvl");
            return (Criteria) this;
        }

        public Criteria andCustlvlNotIn(List<String> values) {
            addCriterion("custlvl not in", values, "custlvl");
            return (Criteria) this;
        }

        public Criteria andCustlvlBetween(String value1, String value2) {
            addCriterion("custlvl between", value1, value2, "custlvl");
            return (Criteria) this;
        }

        public Criteria andCustlvlNotBetween(String value1, String value2) {
            addCriterion("custlvl not between", value1, value2, "custlvl");
            return (Criteria) this;
        }

        public Criteria andTotassetIsNull() {
            addCriterion("totasset is null");
            return (Criteria) this;
        }

        public Criteria andTotassetIsNotNull() {
            addCriterion("totasset is not null");
            return (Criteria) this;
        }

        public Criteria andTotassetEqualTo(String value) {
            addCriterion("totasset =", value, "totasset");
            return (Criteria) this;
        }

        public Criteria andTotassetNotEqualTo(String value) {
            addCriterion("totasset <>", value, "totasset");
            return (Criteria) this;
        }

        public Criteria andTotassetGreaterThan(String value) {
            addCriterion("totasset >", value, "totasset");
            return (Criteria) this;
        }

        public Criteria andTotassetGreaterThanOrEqualTo(String value) {
            addCriterion("totasset >=", value, "totasset");
            return (Criteria) this;
        }

        public Criteria andTotassetLessThan(String value) {
            addCriterion("totasset <", value, "totasset");
            return (Criteria) this;
        }

        public Criteria andTotassetLessThanOrEqualTo(String value) {
            addCriterion("totasset <=", value, "totasset");
            return (Criteria) this;
        }

        public Criteria andTotassetLike(String value) {
            addCriterion("totasset like", value, "totasset");
            return (Criteria) this;
        }

        public Criteria andTotassetNotLike(String value) {
            addCriterion("totasset not like", value, "totasset");
            return (Criteria) this;
        }

        public Criteria andTotassetIn(List<String> values) {
            addCriterion("totasset in", values, "totasset");
            return (Criteria) this;
        }

        public Criteria andTotassetNotIn(List<String> values) {
            addCriterion("totasset not in", values, "totasset");
            return (Criteria) this;
        }

        public Criteria andTotassetBetween(String value1, String value2) {
            addCriterion("totasset between", value1, value2, "totasset");
            return (Criteria) this;
        }

        public Criteria andTotassetNotBetween(String value1, String value2) {
            addCriterion("totasset not between", value1, value2, "totasset");
            return (Criteria) this;
        }

        public Criteria andPinyin2IsNull() {
            addCriterion("pinyin2 is null");
            return (Criteria) this;
        }

        public Criteria andPinyin2IsNotNull() {
            addCriterion("pinyin2 is not null");
            return (Criteria) this;
        }

        public Criteria andPinyin2EqualTo(String value) {
            addCriterion("pinyin2 =", value, "pinyin2");
            return (Criteria) this;
        }

        public Criteria andPinyin2NotEqualTo(String value) {
            addCriterion("pinyin2 <>", value, "pinyin2");
            return (Criteria) this;
        }

        public Criteria andPinyin2GreaterThan(String value) {
            addCriterion("pinyin2 >", value, "pinyin2");
            return (Criteria) this;
        }

        public Criteria andPinyin2GreaterThanOrEqualTo(String value) {
            addCriterion("pinyin2 >=", value, "pinyin2");
            return (Criteria) this;
        }

        public Criteria andPinyin2LessThan(String value) {
            addCriterion("pinyin2 <", value, "pinyin2");
            return (Criteria) this;
        }

        public Criteria andPinyin2LessThanOrEqualTo(String value) {
            addCriterion("pinyin2 <=", value, "pinyin2");
            return (Criteria) this;
        }

        public Criteria andPinyin2Like(String value) {
            addCriterion("pinyin2 like", value, "pinyin2");
            return (Criteria) this;
        }

        public Criteria andPinyin2NotLike(String value) {
            addCriterion("pinyin2 not like", value, "pinyin2");
            return (Criteria) this;
        }

        public Criteria andPinyin2In(List<String> values) {
            addCriterion("pinyin2 in", values, "pinyin2");
            return (Criteria) this;
        }

        public Criteria andPinyin2NotIn(List<String> values) {
            addCriterion("pinyin2 not in", values, "pinyin2");
            return (Criteria) this;
        }

        public Criteria andPinyin2Between(String value1, String value2) {
            addCriterion("pinyin2 between", value1, value2, "pinyin2");
            return (Criteria) this;
        }

        public Criteria andPinyin2NotBetween(String value1, String value2) {
            addCriterion("pinyin2 not between", value1, value2, "pinyin2");
            return (Criteria) this;
        }

        public Criteria andYearsIsNull() {
            addCriterion("years is null");
            return (Criteria) this;
        }

        public Criteria andYearsIsNotNull() {
            addCriterion("years is not null");
            return (Criteria) this;
        }

        public Criteria andYearsEqualTo(String value) {
            addCriterion("years =", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotEqualTo(String value) {
            addCriterion("years <>", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsGreaterThan(String value) {
            addCriterion("years >", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsGreaterThanOrEqualTo(String value) {
            addCriterion("years >=", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsLessThan(String value) {
            addCriterion("years <", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsLessThanOrEqualTo(String value) {
            addCriterion("years <=", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsLike(String value) {
            addCriterion("years like", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotLike(String value) {
            addCriterion("years not like", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsIn(List<String> values) {
            addCriterion("years in", values, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotIn(List<String> values) {
            addCriterion("years not in", values, "years");
            return (Criteria) this;
        }

        public Criteria andYearsBetween(String value1, String value2) {
            addCriterion("years between", value1, value2, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotBetween(String value1, String value2) {
            addCriterion("years not between", value1, value2, "years");
            return (Criteria) this;
        }

        public Criteria andIntotIsNull() {
            addCriterion("intot is null");
            return (Criteria) this;
        }

        public Criteria andIntotIsNotNull() {
            addCriterion("intot is not null");
            return (Criteria) this;
        }

        public Criteria andIntotEqualTo(String value) {
            addCriterion("intot =", value, "intot");
            return (Criteria) this;
        }

        public Criteria andIntotNotEqualTo(String value) {
            addCriterion("intot <>", value, "intot");
            return (Criteria) this;
        }

        public Criteria andIntotGreaterThan(String value) {
            addCriterion("intot >", value, "intot");
            return (Criteria) this;
        }

        public Criteria andIntotGreaterThanOrEqualTo(String value) {
            addCriterion("intot >=", value, "intot");
            return (Criteria) this;
        }

        public Criteria andIntotLessThan(String value) {
            addCriterion("intot <", value, "intot");
            return (Criteria) this;
        }

        public Criteria andIntotLessThanOrEqualTo(String value) {
            addCriterion("intot <=", value, "intot");
            return (Criteria) this;
        }

        public Criteria andIntotLike(String value) {
            addCriterion("intot like", value, "intot");
            return (Criteria) this;
        }

        public Criteria andIntotNotLike(String value) {
            addCriterion("intot not like", value, "intot");
            return (Criteria) this;
        }

        public Criteria andIntotIn(List<String> values) {
            addCriterion("intot in", values, "intot");
            return (Criteria) this;
        }

        public Criteria andIntotNotIn(List<String> values) {
            addCriterion("intot not in", values, "intot");
            return (Criteria) this;
        }

        public Criteria andIntotBetween(String value1, String value2) {
            addCriterion("intot between", value1, value2, "intot");
            return (Criteria) this;
        }

        public Criteria andIntotNotBetween(String value1, String value2) {
            addCriterion("intot not between", value1, value2, "intot");
            return (Criteria) this;
        }

        public Criteria andOuttotIsNull() {
            addCriterion("outtot is null");
            return (Criteria) this;
        }

        public Criteria andOuttotIsNotNull() {
            addCriterion("outtot is not null");
            return (Criteria) this;
        }

        public Criteria andOuttotEqualTo(String value) {
            addCriterion("outtot =", value, "outtot");
            return (Criteria) this;
        }

        public Criteria andOuttotNotEqualTo(String value) {
            addCriterion("outtot <>", value, "outtot");
            return (Criteria) this;
        }

        public Criteria andOuttotGreaterThan(String value) {
            addCriterion("outtot >", value, "outtot");
            return (Criteria) this;
        }

        public Criteria andOuttotGreaterThanOrEqualTo(String value) {
            addCriterion("outtot >=", value, "outtot");
            return (Criteria) this;
        }

        public Criteria andOuttotLessThan(String value) {
            addCriterion("outtot <", value, "outtot");
            return (Criteria) this;
        }

        public Criteria andOuttotLessThanOrEqualTo(String value) {
            addCriterion("outtot <=", value, "outtot");
            return (Criteria) this;
        }

        public Criteria andOuttotLike(String value) {
            addCriterion("outtot like", value, "outtot");
            return (Criteria) this;
        }

        public Criteria andOuttotNotLike(String value) {
            addCriterion("outtot not like", value, "outtot");
            return (Criteria) this;
        }

        public Criteria andOuttotIn(List<String> values) {
            addCriterion("outtot in", values, "outtot");
            return (Criteria) this;
        }

        public Criteria andOuttotNotIn(List<String> values) {
            addCriterion("outtot not in", values, "outtot");
            return (Criteria) this;
        }

        public Criteria andOuttotBetween(String value1, String value2) {
            addCriterion("outtot between", value1, value2, "outtot");
            return (Criteria) this;
        }

        public Criteria andOuttotNotBetween(String value1, String value2) {
            addCriterion("outtot not between", value1, value2, "outtot");
            return (Criteria) this;
        }

        public Criteria andOthcustIsNull() {
            addCriterion("othcust is null");
            return (Criteria) this;
        }

        public Criteria andOthcustIsNotNull() {
            addCriterion("othcust is not null");
            return (Criteria) this;
        }

        public Criteria andOthcustEqualTo(String value) {
            addCriterion("othcust =", value, "othcust");
            return (Criteria) this;
        }

        public Criteria andOthcustNotEqualTo(String value) {
            addCriterion("othcust <>", value, "othcust");
            return (Criteria) this;
        }

        public Criteria andOthcustGreaterThan(String value) {
            addCriterion("othcust >", value, "othcust");
            return (Criteria) this;
        }

        public Criteria andOthcustGreaterThanOrEqualTo(String value) {
            addCriterion("othcust >=", value, "othcust");
            return (Criteria) this;
        }

        public Criteria andOthcustLessThan(String value) {
            addCriterion("othcust <", value, "othcust");
            return (Criteria) this;
        }

        public Criteria andOthcustLessThanOrEqualTo(String value) {
            addCriterion("othcust <=", value, "othcust");
            return (Criteria) this;
        }

        public Criteria andOthcustLike(String value) {
            addCriterion("othcust like", value, "othcust");
            return (Criteria) this;
        }

        public Criteria andOthcustNotLike(String value) {
            addCriterion("othcust not like", value, "othcust");
            return (Criteria) this;
        }

        public Criteria andOthcustIn(List<String> values) {
            addCriterion("othcust in", values, "othcust");
            return (Criteria) this;
        }

        public Criteria andOthcustNotIn(List<String> values) {
            addCriterion("othcust not in", values, "othcust");
            return (Criteria) this;
        }

        public Criteria andOthcustBetween(String value1, String value2) {
            addCriterion("othcust between", value1, value2, "othcust");
            return (Criteria) this;
        }

        public Criteria andOthcustNotBetween(String value1, String value2) {
            addCriterion("othcust not between", value1, value2, "othcust");
            return (Criteria) this;
        }

        public Criteria andDaifaIsNull() {
            addCriterion("daifa is null");
            return (Criteria) this;
        }

        public Criteria andDaifaIsNotNull() {
            addCriterion("daifa is not null");
            return (Criteria) this;
        }

        public Criteria andDaifaEqualTo(String value) {
            addCriterion("daifa =", value, "daifa");
            return (Criteria) this;
        }

        public Criteria andDaifaNotEqualTo(String value) {
            addCriterion("daifa <>", value, "daifa");
            return (Criteria) this;
        }

        public Criteria andDaifaGreaterThan(String value) {
            addCriterion("daifa >", value, "daifa");
            return (Criteria) this;
        }

        public Criteria andDaifaGreaterThanOrEqualTo(String value) {
            addCriterion("daifa >=", value, "daifa");
            return (Criteria) this;
        }

        public Criteria andDaifaLessThan(String value) {
            addCriterion("daifa <", value, "daifa");
            return (Criteria) this;
        }

        public Criteria andDaifaLessThanOrEqualTo(String value) {
            addCriterion("daifa <=", value, "daifa");
            return (Criteria) this;
        }

        public Criteria andDaifaLike(String value) {
            addCriterion("daifa like", value, "daifa");
            return (Criteria) this;
        }

        public Criteria andDaifaNotLike(String value) {
            addCriterion("daifa not like", value, "daifa");
            return (Criteria) this;
        }

        public Criteria andDaifaIn(List<String> values) {
            addCriterion("daifa in", values, "daifa");
            return (Criteria) this;
        }

        public Criteria andDaifaNotIn(List<String> values) {
            addCriterion("daifa not in", values, "daifa");
            return (Criteria) this;
        }

        public Criteria andDaifaBetween(String value1, String value2) {
            addCriterion("daifa between", value1, value2, "daifa");
            return (Criteria) this;
        }

        public Criteria andDaifaNotBetween(String value1, String value2) {
            addCriterion("daifa not between", value1, value2, "daifa");
            return (Criteria) this;
        }

        public Criteria andNianxIsNull() {
            addCriterion("nianx is null");
            return (Criteria) this;
        }

        public Criteria andNianxIsNotNull() {
            addCriterion("nianx is not null");
            return (Criteria) this;
        }

        public Criteria andNianxEqualTo(String value) {
            addCriterion("nianx =", value, "nianx");
            return (Criteria) this;
        }

        public Criteria andNianxNotEqualTo(String value) {
            addCriterion("nianx <>", value, "nianx");
            return (Criteria) this;
        }

        public Criteria andNianxGreaterThan(String value) {
            addCriterion("nianx >", value, "nianx");
            return (Criteria) this;
        }

        public Criteria andNianxGreaterThanOrEqualTo(String value) {
            addCriterion("nianx >=", value, "nianx");
            return (Criteria) this;
        }

        public Criteria andNianxLessThan(String value) {
            addCriterion("nianx <", value, "nianx");
            return (Criteria) this;
        }

        public Criteria andNianxLessThanOrEqualTo(String value) {
            addCriterion("nianx <=", value, "nianx");
            return (Criteria) this;
        }

        public Criteria andNianxLike(String value) {
            addCriterion("nianx like", value, "nianx");
            return (Criteria) this;
        }

        public Criteria andNianxNotLike(String value) {
            addCriterion("nianx not like", value, "nianx");
            return (Criteria) this;
        }

        public Criteria andNianxIn(List<String> values) {
            addCriterion("nianx in", values, "nianx");
            return (Criteria) this;
        }

        public Criteria andNianxNotIn(List<String> values) {
            addCriterion("nianx not in", values, "nianx");
            return (Criteria) this;
        }

        public Criteria andNianxBetween(String value1, String value2) {
            addCriterion("nianx between", value1, value2, "nianx");
            return (Criteria) this;
        }

        public Criteria andNianxNotBetween(String value1, String value2) {
            addCriterion("nianx not between", value1, value2, "nianx");
            return (Criteria) this;
        }

        public Criteria andZhongcdIsNull() {
            addCriterion("zhongcd is null");
            return (Criteria) this;
        }

        public Criteria andZhongcdIsNotNull() {
            addCriterion("zhongcd is not null");
            return (Criteria) this;
        }

        public Criteria andZhongcdEqualTo(String value) {
            addCriterion("zhongcd =", value, "zhongcd");
            return (Criteria) this;
        }

        public Criteria andZhongcdNotEqualTo(String value) {
            addCriterion("zhongcd <>", value, "zhongcd");
            return (Criteria) this;
        }

        public Criteria andZhongcdGreaterThan(String value) {
            addCriterion("zhongcd >", value, "zhongcd");
            return (Criteria) this;
        }

        public Criteria andZhongcdGreaterThanOrEqualTo(String value) {
            addCriterion("zhongcd >=", value, "zhongcd");
            return (Criteria) this;
        }

        public Criteria andZhongcdLessThan(String value) {
            addCriterion("zhongcd <", value, "zhongcd");
            return (Criteria) this;
        }

        public Criteria andZhongcdLessThanOrEqualTo(String value) {
            addCriterion("zhongcd <=", value, "zhongcd");
            return (Criteria) this;
        }

        public Criteria andZhongcdLike(String value) {
            addCriterion("zhongcd like", value, "zhongcd");
            return (Criteria) this;
        }

        public Criteria andZhongcdNotLike(String value) {
            addCriterion("zhongcd not like", value, "zhongcd");
            return (Criteria) this;
        }

        public Criteria andZhongcdIn(List<String> values) {
            addCriterion("zhongcd in", values, "zhongcd");
            return (Criteria) this;
        }

        public Criteria andZhongcdNotIn(List<String> values) {
            addCriterion("zhongcd not in", values, "zhongcd");
            return (Criteria) this;
        }

        public Criteria andZhongcdBetween(String value1, String value2) {
            addCriterion("zhongcd between", value1, value2, "zhongcd");
            return (Criteria) this;
        }

        public Criteria andZhongcdNotBetween(String value1, String value2) {
            addCriterion("zhongcd not between", value1, value2, "zhongcd");
            return (Criteria) this;
        }

        public Criteria andQianliIsNull() {
            addCriterion("qianli is null");
            return (Criteria) this;
        }

        public Criteria andQianliIsNotNull() {
            addCriterion("qianli is not null");
            return (Criteria) this;
        }

        public Criteria andQianliEqualTo(String value) {
            addCriterion("qianli =", value, "qianli");
            return (Criteria) this;
        }

        public Criteria andQianliNotEqualTo(String value) {
            addCriterion("qianli <>", value, "qianli");
            return (Criteria) this;
        }

        public Criteria andQianliGreaterThan(String value) {
            addCriterion("qianli >", value, "qianli");
            return (Criteria) this;
        }

        public Criteria andQianliGreaterThanOrEqualTo(String value) {
            addCriterion("qianli >=", value, "qianli");
            return (Criteria) this;
        }

        public Criteria andQianliLessThan(String value) {
            addCriterion("qianli <", value, "qianli");
            return (Criteria) this;
        }

        public Criteria andQianliLessThanOrEqualTo(String value) {
            addCriterion("qianli <=", value, "qianli");
            return (Criteria) this;
        }

        public Criteria andQianliLike(String value) {
            addCriterion("qianli like", value, "qianli");
            return (Criteria) this;
        }

        public Criteria andQianliNotLike(String value) {
            addCriterion("qianli not like", value, "qianli");
            return (Criteria) this;
        }

        public Criteria andQianliIn(List<String> values) {
            addCriterion("qianli in", values, "qianli");
            return (Criteria) this;
        }

        public Criteria andQianliNotIn(List<String> values) {
            addCriterion("qianli not in", values, "qianli");
            return (Criteria) this;
        }

        public Criteria andQianliBetween(String value1, String value2) {
            addCriterion("qianli between", value1, value2, "qianli");
            return (Criteria) this;
        }

        public Criteria andQianliNotBetween(String value1, String value2) {
            addCriterion("qianli not between", value1, value2, "qianli");
            return (Criteria) this;
        }

        public Criteria andCustpaIsNull() {
            addCriterion("custpa is null");
            return (Criteria) this;
        }

        public Criteria andCustpaIsNotNull() {
            addCriterion("custpa is not null");
            return (Criteria) this;
        }

        public Criteria andCustpaEqualTo(String value) {
            addCriterion("custpa =", value, "custpa");
            return (Criteria) this;
        }

        public Criteria andCustpaNotEqualTo(String value) {
            addCriterion("custpa <>", value, "custpa");
            return (Criteria) this;
        }

        public Criteria andCustpaGreaterThan(String value) {
            addCriterion("custpa >", value, "custpa");
            return (Criteria) this;
        }

        public Criteria andCustpaGreaterThanOrEqualTo(String value) {
            addCriterion("custpa >=", value, "custpa");
            return (Criteria) this;
        }

        public Criteria andCustpaLessThan(String value) {
            addCriterion("custpa <", value, "custpa");
            return (Criteria) this;
        }

        public Criteria andCustpaLessThanOrEqualTo(String value) {
            addCriterion("custpa <=", value, "custpa");
            return (Criteria) this;
        }

        public Criteria andCustpaLike(String value) {
            addCriterion("custpa like", value, "custpa");
            return (Criteria) this;
        }

        public Criteria andCustpaNotLike(String value) {
            addCriterion("custpa not like", value, "custpa");
            return (Criteria) this;
        }

        public Criteria andCustpaIn(List<String> values) {
            addCriterion("custpa in", values, "custpa");
            return (Criteria) this;
        }

        public Criteria andCustpaNotIn(List<String> values) {
            addCriterion("custpa not in", values, "custpa");
            return (Criteria) this;
        }

        public Criteria andCustpaBetween(String value1, String value2) {
            addCriterion("custpa between", value1, value2, "custpa");
            return (Criteria) this;
        }

        public Criteria andCustpaNotBetween(String value1, String value2) {
            addCriterion("custpa not between", value1, value2, "custpa");
            return (Criteria) this;
        }

        public Criteria andPinyinIsNull() {
            addCriterion("pinyin is null");
            return (Criteria) this;
        }

        public Criteria andPinyinIsNotNull() {
            addCriterion("pinyin is not null");
            return (Criteria) this;
        }

        public Criteria andPinyinEqualTo(String value) {
            addCriterion("pinyin =", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotEqualTo(String value) {
            addCriterion("pinyin <>", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinGreaterThan(String value) {
            addCriterion("pinyin >", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinGreaterThanOrEqualTo(String value) {
            addCriterion("pinyin >=", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinLessThan(String value) {
            addCriterion("pinyin <", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinLessThanOrEqualTo(String value) {
            addCriterion("pinyin <=", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinLike(String value) {
            addCriterion("pinyin like", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotLike(String value) {
            addCriterion("pinyin not like", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinIn(List<String> values) {
            addCriterion("pinyin in", values, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotIn(List<String> values) {
            addCriterion("pinyin not in", values, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinBetween(String value1, String value2) {
            addCriterion("pinyin between", value1, value2, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotBetween(String value1, String value2) {
            addCriterion("pinyin not between", value1, value2, "pinyin");
            return (Criteria) this;
        }

        public Criteria andProdetialIsNull() {
            addCriterion("prodetial is null");
            return (Criteria) this;
        }

        public Criteria andProdetialIsNotNull() {
            addCriterion("prodetial is not null");
            return (Criteria) this;
        }

        public Criteria andProdetialEqualTo(String value) {
            addCriterion("prodetial =", value, "prodetial");
            return (Criteria) this;
        }

        public Criteria andProdetialNotEqualTo(String value) {
            addCriterion("prodetial <>", value, "prodetial");
            return (Criteria) this;
        }

        public Criteria andProdetialGreaterThan(String value) {
            addCriterion("prodetial >", value, "prodetial");
            return (Criteria) this;
        }

        public Criteria andProdetialGreaterThanOrEqualTo(String value) {
            addCriterion("prodetial >=", value, "prodetial");
            return (Criteria) this;
        }

        public Criteria andProdetialLessThan(String value) {
            addCriterion("prodetial <", value, "prodetial");
            return (Criteria) this;
        }

        public Criteria andProdetialLessThanOrEqualTo(String value) {
            addCriterion("prodetial <=", value, "prodetial");
            return (Criteria) this;
        }

        public Criteria andProdetialLike(String value) {
            addCriterion("prodetial like", value, "prodetial");
            return (Criteria) this;
        }

        public Criteria andProdetialNotLike(String value) {
            addCriterion("prodetial not like", value, "prodetial");
            return (Criteria) this;
        }

        public Criteria andProdetialIn(List<String> values) {
            addCriterion("prodetial in", values, "prodetial");
            return (Criteria) this;
        }

        public Criteria andProdetialNotIn(List<String> values) {
            addCriterion("prodetial not in", values, "prodetial");
            return (Criteria) this;
        }

        public Criteria andProdetialBetween(String value1, String value2) {
            addCriterion("prodetial between", value1, value2, "prodetial");
            return (Criteria) this;
        }

        public Criteria andProdetialNotBetween(String value1, String value2) {
            addCriterion("prodetial not between", value1, value2, "prodetial");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
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