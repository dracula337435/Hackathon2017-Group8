package org.dracula.ht2017g8.po.mybatis;

import java.util.ArrayList;
import java.util.List;

public class WebTimelineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WebTimelineExample() {
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

        public Criteria andCustdateIsNull() {
            addCriterion("custdate is null");
            return (Criteria) this;
        }

        public Criteria andCustdateIsNotNull() {
            addCriterion("custdate is not null");
            return (Criteria) this;
        }

        public Criteria andCustdateEqualTo(String value) {
            addCriterion("custdate =", value, "custdate");
            return (Criteria) this;
        }

        public Criteria andCustdateNotEqualTo(String value) {
            addCriterion("custdate <>", value, "custdate");
            return (Criteria) this;
        }

        public Criteria andCustdateGreaterThan(String value) {
            addCriterion("custdate >", value, "custdate");
            return (Criteria) this;
        }

        public Criteria andCustdateGreaterThanOrEqualTo(String value) {
            addCriterion("custdate >=", value, "custdate");
            return (Criteria) this;
        }

        public Criteria andCustdateLessThan(String value) {
            addCriterion("custdate <", value, "custdate");
            return (Criteria) this;
        }

        public Criteria andCustdateLessThanOrEqualTo(String value) {
            addCriterion("custdate <=", value, "custdate");
            return (Criteria) this;
        }

        public Criteria andCustdateLike(String value) {
            addCriterion("custdate like", value, "custdate");
            return (Criteria) this;
        }

        public Criteria andCustdateNotLike(String value) {
            addCriterion("custdate not like", value, "custdate");
            return (Criteria) this;
        }

        public Criteria andCustdateIn(List<String> values) {
            addCriterion("custdate in", values, "custdate");
            return (Criteria) this;
        }

        public Criteria andCustdateNotIn(List<String> values) {
            addCriterion("custdate not in", values, "custdate");
            return (Criteria) this;
        }

        public Criteria andCustdateBetween(String value1, String value2) {
            addCriterion("custdate between", value1, value2, "custdate");
            return (Criteria) this;
        }

        public Criteria andCustdateNotBetween(String value1, String value2) {
            addCriterion("custdate not between", value1, value2, "custdate");
            return (Criteria) this;
        }

        public Criteria andCarddateIsNull() {
            addCriterion("carddate is null");
            return (Criteria) this;
        }

        public Criteria andCarddateIsNotNull() {
            addCriterion("carddate is not null");
            return (Criteria) this;
        }

        public Criteria andCarddateEqualTo(String value) {
            addCriterion("carddate =", value, "carddate");
            return (Criteria) this;
        }

        public Criteria andCarddateNotEqualTo(String value) {
            addCriterion("carddate <>", value, "carddate");
            return (Criteria) this;
        }

        public Criteria andCarddateGreaterThan(String value) {
            addCriterion("carddate >", value, "carddate");
            return (Criteria) this;
        }

        public Criteria andCarddateGreaterThanOrEqualTo(String value) {
            addCriterion("carddate >=", value, "carddate");
            return (Criteria) this;
        }

        public Criteria andCarddateLessThan(String value) {
            addCriterion("carddate <", value, "carddate");
            return (Criteria) this;
        }

        public Criteria andCarddateLessThanOrEqualTo(String value) {
            addCriterion("carddate <=", value, "carddate");
            return (Criteria) this;
        }

        public Criteria andCarddateLike(String value) {
            addCriterion("carddate like", value, "carddate");
            return (Criteria) this;
        }

        public Criteria andCarddateNotLike(String value) {
            addCriterion("carddate not like", value, "carddate");
            return (Criteria) this;
        }

        public Criteria andCarddateIn(List<String> values) {
            addCriterion("carddate in", values, "carddate");
            return (Criteria) this;
        }

        public Criteria andCarddateNotIn(List<String> values) {
            addCriterion("carddate not in", values, "carddate");
            return (Criteria) this;
        }

        public Criteria andCarddateBetween(String value1, String value2) {
            addCriterion("carddate between", value1, value2, "carddate");
            return (Criteria) this;
        }

        public Criteria andCarddateNotBetween(String value1, String value2) {
            addCriterion("carddate not between", value1, value2, "carddate");
            return (Criteria) this;
        }

        public Criteria andCcarddateIsNull() {
            addCriterion("ccarddate is null");
            return (Criteria) this;
        }

        public Criteria andCcarddateIsNotNull() {
            addCriterion("ccarddate is not null");
            return (Criteria) this;
        }

        public Criteria andCcarddateEqualTo(String value) {
            addCriterion("ccarddate =", value, "ccarddate");
            return (Criteria) this;
        }

        public Criteria andCcarddateNotEqualTo(String value) {
            addCriterion("ccarddate <>", value, "ccarddate");
            return (Criteria) this;
        }

        public Criteria andCcarddateGreaterThan(String value) {
            addCriterion("ccarddate >", value, "ccarddate");
            return (Criteria) this;
        }

        public Criteria andCcarddateGreaterThanOrEqualTo(String value) {
            addCriterion("ccarddate >=", value, "ccarddate");
            return (Criteria) this;
        }

        public Criteria andCcarddateLessThan(String value) {
            addCriterion("ccarddate <", value, "ccarddate");
            return (Criteria) this;
        }

        public Criteria andCcarddateLessThanOrEqualTo(String value) {
            addCriterion("ccarddate <=", value, "ccarddate");
            return (Criteria) this;
        }

        public Criteria andCcarddateLike(String value) {
            addCriterion("ccarddate like", value, "ccarddate");
            return (Criteria) this;
        }

        public Criteria andCcarddateNotLike(String value) {
            addCriterion("ccarddate not like", value, "ccarddate");
            return (Criteria) this;
        }

        public Criteria andCcarddateIn(List<String> values) {
            addCriterion("ccarddate in", values, "ccarddate");
            return (Criteria) this;
        }

        public Criteria andCcarddateNotIn(List<String> values) {
            addCriterion("ccarddate not in", values, "ccarddate");
            return (Criteria) this;
        }

        public Criteria andCcarddateBetween(String value1, String value2) {
            addCriterion("ccarddate between", value1, value2, "ccarddate");
            return (Criteria) this;
        }

        public Criteria andCcarddateNotBetween(String value1, String value2) {
            addCriterion("ccarddate not between", value1, value2, "ccarddate");
            return (Criteria) this;
        }

        public Criteria andTrandateIsNull() {
            addCriterion("trandate is null");
            return (Criteria) this;
        }

        public Criteria andTrandateIsNotNull() {
            addCriterion("trandate is not null");
            return (Criteria) this;
        }

        public Criteria andTrandateEqualTo(String value) {
            addCriterion("trandate =", value, "trandate");
            return (Criteria) this;
        }

        public Criteria andTrandateNotEqualTo(String value) {
            addCriterion("trandate <>", value, "trandate");
            return (Criteria) this;
        }

        public Criteria andTrandateGreaterThan(String value) {
            addCriterion("trandate >", value, "trandate");
            return (Criteria) this;
        }

        public Criteria andTrandateGreaterThanOrEqualTo(String value) {
            addCriterion("trandate >=", value, "trandate");
            return (Criteria) this;
        }

        public Criteria andTrandateLessThan(String value) {
            addCriterion("trandate <", value, "trandate");
            return (Criteria) this;
        }

        public Criteria andTrandateLessThanOrEqualTo(String value) {
            addCriterion("trandate <=", value, "trandate");
            return (Criteria) this;
        }

        public Criteria andTrandateLike(String value) {
            addCriterion("trandate like", value, "trandate");
            return (Criteria) this;
        }

        public Criteria andTrandateNotLike(String value) {
            addCriterion("trandate not like", value, "trandate");
            return (Criteria) this;
        }

        public Criteria andTrandateIn(List<String> values) {
            addCriterion("trandate in", values, "trandate");
            return (Criteria) this;
        }

        public Criteria andTrandateNotIn(List<String> values) {
            addCriterion("trandate not in", values, "trandate");
            return (Criteria) this;
        }

        public Criteria andTrandateBetween(String value1, String value2) {
            addCriterion("trandate between", value1, value2, "trandate");
            return (Criteria) this;
        }

        public Criteria andTrandateNotBetween(String value1, String value2) {
            addCriterion("trandate not between", value1, value2, "trandate");
            return (Criteria) this;
        }

        public Criteria andTottranIsNull() {
            addCriterion("tottran is null");
            return (Criteria) this;
        }

        public Criteria andTottranIsNotNull() {
            addCriterion("tottran is not null");
            return (Criteria) this;
        }

        public Criteria andTottranEqualTo(String value) {
            addCriterion("tottran =", value, "tottran");
            return (Criteria) this;
        }

        public Criteria andTottranNotEqualTo(String value) {
            addCriterion("tottran <>", value, "tottran");
            return (Criteria) this;
        }

        public Criteria andTottranGreaterThan(String value) {
            addCriterion("tottran >", value, "tottran");
            return (Criteria) this;
        }

        public Criteria andTottranGreaterThanOrEqualTo(String value) {
            addCriterion("tottran >=", value, "tottran");
            return (Criteria) this;
        }

        public Criteria andTottranLessThan(String value) {
            addCriterion("tottran <", value, "tottran");
            return (Criteria) this;
        }

        public Criteria andTottranLessThanOrEqualTo(String value) {
            addCriterion("tottran <=", value, "tottran");
            return (Criteria) this;
        }

        public Criteria andTottranLike(String value) {
            addCriterion("tottran like", value, "tottran");
            return (Criteria) this;
        }

        public Criteria andTottranNotLike(String value) {
            addCriterion("tottran not like", value, "tottran");
            return (Criteria) this;
        }

        public Criteria andTottranIn(List<String> values) {
            addCriterion("tottran in", values, "tottran");
            return (Criteria) this;
        }

        public Criteria andTottranNotIn(List<String> values) {
            addCriterion("tottran not in", values, "tottran");
            return (Criteria) this;
        }

        public Criteria andTottranBetween(String value1, String value2) {
            addCriterion("tottran between", value1, value2, "tottran");
            return (Criteria) this;
        }

        public Criteria andTottranNotBetween(String value1, String value2) {
            addCriterion("tottran not between", value1, value2, "tottran");
            return (Criteria) this;
        }

        public Criteria andTotinIsNull() {
            addCriterion("totin is null");
            return (Criteria) this;
        }

        public Criteria andTotinIsNotNull() {
            addCriterion("totin is not null");
            return (Criteria) this;
        }

        public Criteria andTotinEqualTo(String value) {
            addCriterion("totin =", value, "totin");
            return (Criteria) this;
        }

        public Criteria andTotinNotEqualTo(String value) {
            addCriterion("totin <>", value, "totin");
            return (Criteria) this;
        }

        public Criteria andTotinGreaterThan(String value) {
            addCriterion("totin >", value, "totin");
            return (Criteria) this;
        }

        public Criteria andTotinGreaterThanOrEqualTo(String value) {
            addCriterion("totin >=", value, "totin");
            return (Criteria) this;
        }

        public Criteria andTotinLessThan(String value) {
            addCriterion("totin <", value, "totin");
            return (Criteria) this;
        }

        public Criteria andTotinLessThanOrEqualTo(String value) {
            addCriterion("totin <=", value, "totin");
            return (Criteria) this;
        }

        public Criteria andTotinLike(String value) {
            addCriterion("totin like", value, "totin");
            return (Criteria) this;
        }

        public Criteria andTotinNotLike(String value) {
            addCriterion("totin not like", value, "totin");
            return (Criteria) this;
        }

        public Criteria andTotinIn(List<String> values) {
            addCriterion("totin in", values, "totin");
            return (Criteria) this;
        }

        public Criteria andTotinNotIn(List<String> values) {
            addCriterion("totin not in", values, "totin");
            return (Criteria) this;
        }

        public Criteria andTotinBetween(String value1, String value2) {
            addCriterion("totin between", value1, value2, "totin");
            return (Criteria) this;
        }

        public Criteria andTotinNotBetween(String value1, String value2) {
            addCriterion("totin not between", value1, value2, "totin");
            return (Criteria) this;
        }

        public Criteria andTotoutIsNull() {
            addCriterion("totout is null");
            return (Criteria) this;
        }

        public Criteria andTotoutIsNotNull() {
            addCriterion("totout is not null");
            return (Criteria) this;
        }

        public Criteria andTotoutEqualTo(String value) {
            addCriterion("totout =", value, "totout");
            return (Criteria) this;
        }

        public Criteria andTotoutNotEqualTo(String value) {
            addCriterion("totout <>", value, "totout");
            return (Criteria) this;
        }

        public Criteria andTotoutGreaterThan(String value) {
            addCriterion("totout >", value, "totout");
            return (Criteria) this;
        }

        public Criteria andTotoutGreaterThanOrEqualTo(String value) {
            addCriterion("totout >=", value, "totout");
            return (Criteria) this;
        }

        public Criteria andTotoutLessThan(String value) {
            addCriterion("totout <", value, "totout");
            return (Criteria) this;
        }

        public Criteria andTotoutLessThanOrEqualTo(String value) {
            addCriterion("totout <=", value, "totout");
            return (Criteria) this;
        }

        public Criteria andTotoutLike(String value) {
            addCriterion("totout like", value, "totout");
            return (Criteria) this;
        }

        public Criteria andTotoutNotLike(String value) {
            addCriterion("totout not like", value, "totout");
            return (Criteria) this;
        }

        public Criteria andTotoutIn(List<String> values) {
            addCriterion("totout in", values, "totout");
            return (Criteria) this;
        }

        public Criteria andTotoutNotIn(List<String> values) {
            addCriterion("totout not in", values, "totout");
            return (Criteria) this;
        }

        public Criteria andTotoutBetween(String value1, String value2) {
            addCriterion("totout between", value1, value2, "totout");
            return (Criteria) this;
        }

        public Criteria andTotoutNotBetween(String value1, String value2) {
            addCriterion("totout not between", value1, value2, "totout");
            return (Criteria) this;
        }

        public Criteria andTotfee1IsNull() {
            addCriterion("totfee1 is null");
            return (Criteria) this;
        }

        public Criteria andTotfee1IsNotNull() {
            addCriterion("totfee1 is not null");
            return (Criteria) this;
        }

        public Criteria andTotfee1EqualTo(String value) {
            addCriterion("totfee1 =", value, "totfee1");
            return (Criteria) this;
        }

        public Criteria andTotfee1NotEqualTo(String value) {
            addCriterion("totfee1 <>", value, "totfee1");
            return (Criteria) this;
        }

        public Criteria andTotfee1GreaterThan(String value) {
            addCriterion("totfee1 >", value, "totfee1");
            return (Criteria) this;
        }

        public Criteria andTotfee1GreaterThanOrEqualTo(String value) {
            addCriterion("totfee1 >=", value, "totfee1");
            return (Criteria) this;
        }

        public Criteria andTotfee1LessThan(String value) {
            addCriterion("totfee1 <", value, "totfee1");
            return (Criteria) this;
        }

        public Criteria andTotfee1LessThanOrEqualTo(String value) {
            addCriterion("totfee1 <=", value, "totfee1");
            return (Criteria) this;
        }

        public Criteria andTotfee1Like(String value) {
            addCriterion("totfee1 like", value, "totfee1");
            return (Criteria) this;
        }

        public Criteria andTotfee1NotLike(String value) {
            addCriterion("totfee1 not like", value, "totfee1");
            return (Criteria) this;
        }

        public Criteria andTotfee1In(List<String> values) {
            addCriterion("totfee1 in", values, "totfee1");
            return (Criteria) this;
        }

        public Criteria andTotfee1NotIn(List<String> values) {
            addCriterion("totfee1 not in", values, "totfee1");
            return (Criteria) this;
        }

        public Criteria andTotfee1Between(String value1, String value2) {
            addCriterion("totfee1 between", value1, value2, "totfee1");
            return (Criteria) this;
        }

        public Criteria andTotfee1NotBetween(String value1, String value2) {
            addCriterion("totfee1 not between", value1, value2, "totfee1");
            return (Criteria) this;
        }

        public Criteria andTotfee2IsNull() {
            addCriterion("totfee2 is null");
            return (Criteria) this;
        }

        public Criteria andTotfee2IsNotNull() {
            addCriterion("totfee2 is not null");
            return (Criteria) this;
        }

        public Criteria andTotfee2EqualTo(String value) {
            addCriterion("totfee2 =", value, "totfee2");
            return (Criteria) this;
        }

        public Criteria andTotfee2NotEqualTo(String value) {
            addCriterion("totfee2 <>", value, "totfee2");
            return (Criteria) this;
        }

        public Criteria andTotfee2GreaterThan(String value) {
            addCriterion("totfee2 >", value, "totfee2");
            return (Criteria) this;
        }

        public Criteria andTotfee2GreaterThanOrEqualTo(String value) {
            addCriterion("totfee2 >=", value, "totfee2");
            return (Criteria) this;
        }

        public Criteria andTotfee2LessThan(String value) {
            addCriterion("totfee2 <", value, "totfee2");
            return (Criteria) this;
        }

        public Criteria andTotfee2LessThanOrEqualTo(String value) {
            addCriterion("totfee2 <=", value, "totfee2");
            return (Criteria) this;
        }

        public Criteria andTotfee2Like(String value) {
            addCriterion("totfee2 like", value, "totfee2");
            return (Criteria) this;
        }

        public Criteria andTotfee2NotLike(String value) {
            addCriterion("totfee2 not like", value, "totfee2");
            return (Criteria) this;
        }

        public Criteria andTotfee2In(List<String> values) {
            addCriterion("totfee2 in", values, "totfee2");
            return (Criteria) this;
        }

        public Criteria andTotfee2NotIn(List<String> values) {
            addCriterion("totfee2 not in", values, "totfee2");
            return (Criteria) this;
        }

        public Criteria andTotfee2Between(String value1, String value2) {
            addCriterion("totfee2 between", value1, value2, "totfee2");
            return (Criteria) this;
        }

        public Criteria andTotfee2NotBetween(String value1, String value2) {
            addCriterion("totfee2 not between", value1, value2, "totfee2");
            return (Criteria) this;
        }

        public Criteria andTotfee3IsNull() {
            addCriterion("totfee3 is null");
            return (Criteria) this;
        }

        public Criteria andTotfee3IsNotNull() {
            addCriterion("totfee3 is not null");
            return (Criteria) this;
        }

        public Criteria andTotfee3EqualTo(String value) {
            addCriterion("totfee3 =", value, "totfee3");
            return (Criteria) this;
        }

        public Criteria andTotfee3NotEqualTo(String value) {
            addCriterion("totfee3 <>", value, "totfee3");
            return (Criteria) this;
        }

        public Criteria andTotfee3GreaterThan(String value) {
            addCriterion("totfee3 >", value, "totfee3");
            return (Criteria) this;
        }

        public Criteria andTotfee3GreaterThanOrEqualTo(String value) {
            addCriterion("totfee3 >=", value, "totfee3");
            return (Criteria) this;
        }

        public Criteria andTotfee3LessThan(String value) {
            addCriterion("totfee3 <", value, "totfee3");
            return (Criteria) this;
        }

        public Criteria andTotfee3LessThanOrEqualTo(String value) {
            addCriterion("totfee3 <=", value, "totfee3");
            return (Criteria) this;
        }

        public Criteria andTotfee3Like(String value) {
            addCriterion("totfee3 like", value, "totfee3");
            return (Criteria) this;
        }

        public Criteria andTotfee3NotLike(String value) {
            addCriterion("totfee3 not like", value, "totfee3");
            return (Criteria) this;
        }

        public Criteria andTotfee3In(List<String> values) {
            addCriterion("totfee3 in", values, "totfee3");
            return (Criteria) this;
        }

        public Criteria andTotfee3NotIn(List<String> values) {
            addCriterion("totfee3 not in", values, "totfee3");
            return (Criteria) this;
        }

        public Criteria andTotfee3Between(String value1, String value2) {
            addCriterion("totfee3 between", value1, value2, "totfee3");
            return (Criteria) this;
        }

        public Criteria andTotfee3NotBetween(String value1, String value2) {
            addCriterion("totfee3 not between", value1, value2, "totfee3");
            return (Criteria) this;
        }

        public Criteria andTotfee4IsNull() {
            addCriterion("totfee4 is null");
            return (Criteria) this;
        }

        public Criteria andTotfee4IsNotNull() {
            addCriterion("totfee4 is not null");
            return (Criteria) this;
        }

        public Criteria andTotfee4EqualTo(String value) {
            addCriterion("totfee4 =", value, "totfee4");
            return (Criteria) this;
        }

        public Criteria andTotfee4NotEqualTo(String value) {
            addCriterion("totfee4 <>", value, "totfee4");
            return (Criteria) this;
        }

        public Criteria andTotfee4GreaterThan(String value) {
            addCriterion("totfee4 >", value, "totfee4");
            return (Criteria) this;
        }

        public Criteria andTotfee4GreaterThanOrEqualTo(String value) {
            addCriterion("totfee4 >=", value, "totfee4");
            return (Criteria) this;
        }

        public Criteria andTotfee4LessThan(String value) {
            addCriterion("totfee4 <", value, "totfee4");
            return (Criteria) this;
        }

        public Criteria andTotfee4LessThanOrEqualTo(String value) {
            addCriterion("totfee4 <=", value, "totfee4");
            return (Criteria) this;
        }

        public Criteria andTotfee4Like(String value) {
            addCriterion("totfee4 like", value, "totfee4");
            return (Criteria) this;
        }

        public Criteria andTotfee4NotLike(String value) {
            addCriterion("totfee4 not like", value, "totfee4");
            return (Criteria) this;
        }

        public Criteria andTotfee4In(List<String> values) {
            addCriterion("totfee4 in", values, "totfee4");
            return (Criteria) this;
        }

        public Criteria andTotfee4NotIn(List<String> values) {
            addCriterion("totfee4 not in", values, "totfee4");
            return (Criteria) this;
        }

        public Criteria andTotfee4Between(String value1, String value2) {
            addCriterion("totfee4 between", value1, value2, "totfee4");
            return (Criteria) this;
        }

        public Criteria andTotfee4NotBetween(String value1, String value2) {
            addCriterion("totfee4 not between", value1, value2, "totfee4");
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