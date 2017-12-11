package org.dracula.ht2017g8.po.mybatis;

import java.util.ArrayList;
import java.util.List;

public class WebCardapplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WebCardapplyExample() {
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

        public Criteria andName1IsNull() {
            addCriterion("name1 is null");
            return (Criteria) this;
        }

        public Criteria andName1IsNotNull() {
            addCriterion("name1 is not null");
            return (Criteria) this;
        }

        public Criteria andName1EqualTo(String value) {
            addCriterion("name1 =", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1NotEqualTo(String value) {
            addCriterion("name1 <>", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1GreaterThan(String value) {
            addCriterion("name1 >", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1GreaterThanOrEqualTo(String value) {
            addCriterion("name1 >=", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1LessThan(String value) {
            addCriterion("name1 <", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1LessThanOrEqualTo(String value) {
            addCriterion("name1 <=", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1Like(String value) {
            addCriterion("name1 like", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1NotLike(String value) {
            addCriterion("name1 not like", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1In(List<String> values) {
            addCriterion("name1 in", values, "name1");
            return (Criteria) this;
        }

        public Criteria andName1NotIn(List<String> values) {
            addCriterion("name1 not in", values, "name1");
            return (Criteria) this;
        }

        public Criteria andName1Between(String value1, String value2) {
            addCriterion("name1 between", value1, value2, "name1");
            return (Criteria) this;
        }

        public Criteria andName1NotBetween(String value1, String value2) {
            addCriterion("name1 not between", value1, value2, "name1");
            return (Criteria) this;
        }

        public Criteria andName2IsNull() {
            addCriterion("name2 is null");
            return (Criteria) this;
        }

        public Criteria andName2IsNotNull() {
            addCriterion("name2 is not null");
            return (Criteria) this;
        }

        public Criteria andName2EqualTo(String value) {
            addCriterion("name2 =", value, "name2");
            return (Criteria) this;
        }

        public Criteria andName2NotEqualTo(String value) {
            addCriterion("name2 <>", value, "name2");
            return (Criteria) this;
        }

        public Criteria andName2GreaterThan(String value) {
            addCriterion("name2 >", value, "name2");
            return (Criteria) this;
        }

        public Criteria andName2GreaterThanOrEqualTo(String value) {
            addCriterion("name2 >=", value, "name2");
            return (Criteria) this;
        }

        public Criteria andName2LessThan(String value) {
            addCriterion("name2 <", value, "name2");
            return (Criteria) this;
        }

        public Criteria andName2LessThanOrEqualTo(String value) {
            addCriterion("name2 <=", value, "name2");
            return (Criteria) this;
        }

        public Criteria andName2Like(String value) {
            addCriterion("name2 like", value, "name2");
            return (Criteria) this;
        }

        public Criteria andName2NotLike(String value) {
            addCriterion("name2 not like", value, "name2");
            return (Criteria) this;
        }

        public Criteria andName2In(List<String> values) {
            addCriterion("name2 in", values, "name2");
            return (Criteria) this;
        }

        public Criteria andName2NotIn(List<String> values) {
            addCriterion("name2 not in", values, "name2");
            return (Criteria) this;
        }

        public Criteria andName2Between(String value1, String value2) {
            addCriterion("name2 between", value1, value2, "name2");
            return (Criteria) this;
        }

        public Criteria andName2NotBetween(String value1, String value2) {
            addCriterion("name2 not between", value1, value2, "name2");
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

        public Criteria andAppellationIsNull() {
            addCriterion("appellation is null");
            return (Criteria) this;
        }

        public Criteria andAppellationIsNotNull() {
            addCriterion("appellation is not null");
            return (Criteria) this;
        }

        public Criteria andAppellationEqualTo(String value) {
            addCriterion("appellation =", value, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationNotEqualTo(String value) {
            addCriterion("appellation <>", value, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationGreaterThan(String value) {
            addCriterion("appellation >", value, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationGreaterThanOrEqualTo(String value) {
            addCriterion("appellation >=", value, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationLessThan(String value) {
            addCriterion("appellation <", value, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationLessThanOrEqualTo(String value) {
            addCriterion("appellation <=", value, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationLike(String value) {
            addCriterion("appellation like", value, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationNotLike(String value) {
            addCriterion("appellation not like", value, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationIn(List<String> values) {
            addCriterion("appellation in", values, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationNotIn(List<String> values) {
            addCriterion("appellation not in", values, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationBetween(String value1, String value2) {
            addCriterion("appellation between", value1, value2, "appellation");
            return (Criteria) this;
        }

        public Criteria andAppellationNotBetween(String value1, String value2) {
            addCriterion("appellation not between", value1, value2, "appellation");
            return (Criteria) this;
        }

        public Criteria andPassnoIsNull() {
            addCriterion("passno is null");
            return (Criteria) this;
        }

        public Criteria andPassnoIsNotNull() {
            addCriterion("passno is not null");
            return (Criteria) this;
        }

        public Criteria andPassnoEqualTo(String value) {
            addCriterion("passno =", value, "passno");
            return (Criteria) this;
        }

        public Criteria andPassnoNotEqualTo(String value) {
            addCriterion("passno <>", value, "passno");
            return (Criteria) this;
        }

        public Criteria andPassnoGreaterThan(String value) {
            addCriterion("passno >", value, "passno");
            return (Criteria) this;
        }

        public Criteria andPassnoGreaterThanOrEqualTo(String value) {
            addCriterion("passno >=", value, "passno");
            return (Criteria) this;
        }

        public Criteria andPassnoLessThan(String value) {
            addCriterion("passno <", value, "passno");
            return (Criteria) this;
        }

        public Criteria andPassnoLessThanOrEqualTo(String value) {
            addCriterion("passno <=", value, "passno");
            return (Criteria) this;
        }

        public Criteria andPassnoLike(String value) {
            addCriterion("passno like", value, "passno");
            return (Criteria) this;
        }

        public Criteria andPassnoNotLike(String value) {
            addCriterion("passno not like", value, "passno");
            return (Criteria) this;
        }

        public Criteria andPassnoIn(List<String> values) {
            addCriterion("passno in", values, "passno");
            return (Criteria) this;
        }

        public Criteria andPassnoNotIn(List<String> values) {
            addCriterion("passno not in", values, "passno");
            return (Criteria) this;
        }

        public Criteria andPassnoBetween(String value1, String value2) {
            addCriterion("passno between", value1, value2, "passno");
            return (Criteria) this;
        }

        public Criteria andPassnoNotBetween(String value1, String value2) {
            addCriterion("passno not between", value1, value2, "passno");
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

        public Criteria andHomeAddress1IsNull() {
            addCriterion("home_address1 is null");
            return (Criteria) this;
        }

        public Criteria andHomeAddress1IsNotNull() {
            addCriterion("home_address1 is not null");
            return (Criteria) this;
        }

        public Criteria andHomeAddress1EqualTo(String value) {
            addCriterion("home_address1 =", value, "homeAddress1");
            return (Criteria) this;
        }

        public Criteria andHomeAddress1NotEqualTo(String value) {
            addCriterion("home_address1 <>", value, "homeAddress1");
            return (Criteria) this;
        }

        public Criteria andHomeAddress1GreaterThan(String value) {
            addCriterion("home_address1 >", value, "homeAddress1");
            return (Criteria) this;
        }

        public Criteria andHomeAddress1GreaterThanOrEqualTo(String value) {
            addCriterion("home_address1 >=", value, "homeAddress1");
            return (Criteria) this;
        }

        public Criteria andHomeAddress1LessThan(String value) {
            addCriterion("home_address1 <", value, "homeAddress1");
            return (Criteria) this;
        }

        public Criteria andHomeAddress1LessThanOrEqualTo(String value) {
            addCriterion("home_address1 <=", value, "homeAddress1");
            return (Criteria) this;
        }

        public Criteria andHomeAddress1Like(String value) {
            addCriterion("home_address1 like", value, "homeAddress1");
            return (Criteria) this;
        }

        public Criteria andHomeAddress1NotLike(String value) {
            addCriterion("home_address1 not like", value, "homeAddress1");
            return (Criteria) this;
        }

        public Criteria andHomeAddress1In(List<String> values) {
            addCriterion("home_address1 in", values, "homeAddress1");
            return (Criteria) this;
        }

        public Criteria andHomeAddress1NotIn(List<String> values) {
            addCriterion("home_address1 not in", values, "homeAddress1");
            return (Criteria) this;
        }

        public Criteria andHomeAddress1Between(String value1, String value2) {
            addCriterion("home_address1 between", value1, value2, "homeAddress1");
            return (Criteria) this;
        }

        public Criteria andHomeAddress1NotBetween(String value1, String value2) {
            addCriterion("home_address1 not between", value1, value2, "homeAddress1");
            return (Criteria) this;
        }

        public Criteria andHomeAddress2IsNull() {
            addCriterion("home_address2 is null");
            return (Criteria) this;
        }

        public Criteria andHomeAddress2IsNotNull() {
            addCriterion("home_address2 is not null");
            return (Criteria) this;
        }

        public Criteria andHomeAddress2EqualTo(String value) {
            addCriterion("home_address2 =", value, "homeAddress2");
            return (Criteria) this;
        }

        public Criteria andHomeAddress2NotEqualTo(String value) {
            addCriterion("home_address2 <>", value, "homeAddress2");
            return (Criteria) this;
        }

        public Criteria andHomeAddress2GreaterThan(String value) {
            addCriterion("home_address2 >", value, "homeAddress2");
            return (Criteria) this;
        }

        public Criteria andHomeAddress2GreaterThanOrEqualTo(String value) {
            addCriterion("home_address2 >=", value, "homeAddress2");
            return (Criteria) this;
        }

        public Criteria andHomeAddress2LessThan(String value) {
            addCriterion("home_address2 <", value, "homeAddress2");
            return (Criteria) this;
        }

        public Criteria andHomeAddress2LessThanOrEqualTo(String value) {
            addCriterion("home_address2 <=", value, "homeAddress2");
            return (Criteria) this;
        }

        public Criteria andHomeAddress2Like(String value) {
            addCriterion("home_address2 like", value, "homeAddress2");
            return (Criteria) this;
        }

        public Criteria andHomeAddress2NotLike(String value) {
            addCriterion("home_address2 not like", value, "homeAddress2");
            return (Criteria) this;
        }

        public Criteria andHomeAddress2In(List<String> values) {
            addCriterion("home_address2 in", values, "homeAddress2");
            return (Criteria) this;
        }

        public Criteria andHomeAddress2NotIn(List<String> values) {
            addCriterion("home_address2 not in", values, "homeAddress2");
            return (Criteria) this;
        }

        public Criteria andHomeAddress2Between(String value1, String value2) {
            addCriterion("home_address2 between", value1, value2, "homeAddress2");
            return (Criteria) this;
        }

        public Criteria andHomeAddress2NotBetween(String value1, String value2) {
            addCriterion("home_address2 not between", value1, value2, "homeAddress2");
            return (Criteria) this;
        }

        public Criteria andDetailAddIsNull() {
            addCriterion("detail_add is null");
            return (Criteria) this;
        }

        public Criteria andDetailAddIsNotNull() {
            addCriterion("detail_add is not null");
            return (Criteria) this;
        }

        public Criteria andDetailAddEqualTo(String value) {
            addCriterion("detail_add =", value, "detailAdd");
            return (Criteria) this;
        }

        public Criteria andDetailAddNotEqualTo(String value) {
            addCriterion("detail_add <>", value, "detailAdd");
            return (Criteria) this;
        }

        public Criteria andDetailAddGreaterThan(String value) {
            addCriterion("detail_add >", value, "detailAdd");
            return (Criteria) this;
        }

        public Criteria andDetailAddGreaterThanOrEqualTo(String value) {
            addCriterion("detail_add >=", value, "detailAdd");
            return (Criteria) this;
        }

        public Criteria andDetailAddLessThan(String value) {
            addCriterion("detail_add <", value, "detailAdd");
            return (Criteria) this;
        }

        public Criteria andDetailAddLessThanOrEqualTo(String value) {
            addCriterion("detail_add <=", value, "detailAdd");
            return (Criteria) this;
        }

        public Criteria andDetailAddLike(String value) {
            addCriterion("detail_add like", value, "detailAdd");
            return (Criteria) this;
        }

        public Criteria andDetailAddNotLike(String value) {
            addCriterion("detail_add not like", value, "detailAdd");
            return (Criteria) this;
        }

        public Criteria andDetailAddIn(List<String> values) {
            addCriterion("detail_add in", values, "detailAdd");
            return (Criteria) this;
        }

        public Criteria andDetailAddNotIn(List<String> values) {
            addCriterion("detail_add not in", values, "detailAdd");
            return (Criteria) this;
        }

        public Criteria andDetailAddBetween(String value1, String value2) {
            addCriterion("detail_add between", value1, value2, "detailAdd");
            return (Criteria) this;
        }

        public Criteria andDetailAddNotBetween(String value1, String value2) {
            addCriterion("detail_add not between", value1, value2, "detailAdd");
            return (Criteria) this;
        }

        public Criteria andHomePostIsNull() {
            addCriterion("home_post is null");
            return (Criteria) this;
        }

        public Criteria andHomePostIsNotNull() {
            addCriterion("home_post is not null");
            return (Criteria) this;
        }

        public Criteria andHomePostEqualTo(String value) {
            addCriterion("home_post =", value, "homePost");
            return (Criteria) this;
        }

        public Criteria andHomePostNotEqualTo(String value) {
            addCriterion("home_post <>", value, "homePost");
            return (Criteria) this;
        }

        public Criteria andHomePostGreaterThan(String value) {
            addCriterion("home_post >", value, "homePost");
            return (Criteria) this;
        }

        public Criteria andHomePostGreaterThanOrEqualTo(String value) {
            addCriterion("home_post >=", value, "homePost");
            return (Criteria) this;
        }

        public Criteria andHomePostLessThan(String value) {
            addCriterion("home_post <", value, "homePost");
            return (Criteria) this;
        }

        public Criteria andHomePostLessThanOrEqualTo(String value) {
            addCriterion("home_post <=", value, "homePost");
            return (Criteria) this;
        }

        public Criteria andHomePostLike(String value) {
            addCriterion("home_post like", value, "homePost");
            return (Criteria) this;
        }

        public Criteria andHomePostNotLike(String value) {
            addCriterion("home_post not like", value, "homePost");
            return (Criteria) this;
        }

        public Criteria andHomePostIn(List<String> values) {
            addCriterion("home_post in", values, "homePost");
            return (Criteria) this;
        }

        public Criteria andHomePostNotIn(List<String> values) {
            addCriterion("home_post not in", values, "homePost");
            return (Criteria) this;
        }

        public Criteria andHomePostBetween(String value1, String value2) {
            addCriterion("home_post between", value1, value2, "homePost");
            return (Criteria) this;
        }

        public Criteria andHomePostNotBetween(String value1, String value2) {
            addCriterion("home_post not between", value1, value2, "homePost");
            return (Criteria) this;
        }

        public Criteria andResidenceYearIsNull() {
            addCriterion("residence_year is null");
            return (Criteria) this;
        }

        public Criteria andResidenceYearIsNotNull() {
            addCriterion("residence_year is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceYearEqualTo(String value) {
            addCriterion("residence_year =", value, "residenceYear");
            return (Criteria) this;
        }

        public Criteria andResidenceYearNotEqualTo(String value) {
            addCriterion("residence_year <>", value, "residenceYear");
            return (Criteria) this;
        }

        public Criteria andResidenceYearGreaterThan(String value) {
            addCriterion("residence_year >", value, "residenceYear");
            return (Criteria) this;
        }

        public Criteria andResidenceYearGreaterThanOrEqualTo(String value) {
            addCriterion("residence_year >=", value, "residenceYear");
            return (Criteria) this;
        }

        public Criteria andResidenceYearLessThan(String value) {
            addCriterion("residence_year <", value, "residenceYear");
            return (Criteria) this;
        }

        public Criteria andResidenceYearLessThanOrEqualTo(String value) {
            addCriterion("residence_year <=", value, "residenceYear");
            return (Criteria) this;
        }

        public Criteria andResidenceYearLike(String value) {
            addCriterion("residence_year like", value, "residenceYear");
            return (Criteria) this;
        }

        public Criteria andResidenceYearNotLike(String value) {
            addCriterion("residence_year not like", value, "residenceYear");
            return (Criteria) this;
        }

        public Criteria andResidenceYearIn(List<String> values) {
            addCriterion("residence_year in", values, "residenceYear");
            return (Criteria) this;
        }

        public Criteria andResidenceYearNotIn(List<String> values) {
            addCriterion("residence_year not in", values, "residenceYear");
            return (Criteria) this;
        }

        public Criteria andResidenceYearBetween(String value1, String value2) {
            addCriterion("residence_year between", value1, value2, "residenceYear");
            return (Criteria) this;
        }

        public Criteria andResidenceYearNotBetween(String value1, String value2) {
            addCriterion("residence_year not between", value1, value2, "residenceYear");
            return (Criteria) this;
        }

        public Criteria andResidenceTypeIsNull() {
            addCriterion("residence_type is null");
            return (Criteria) this;
        }

        public Criteria andResidenceTypeIsNotNull() {
            addCriterion("residence_type is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceTypeEqualTo(String value) {
            addCriterion("residence_type =", value, "residenceType");
            return (Criteria) this;
        }

        public Criteria andResidenceTypeNotEqualTo(String value) {
            addCriterion("residence_type <>", value, "residenceType");
            return (Criteria) this;
        }

        public Criteria andResidenceTypeGreaterThan(String value) {
            addCriterion("residence_type >", value, "residenceType");
            return (Criteria) this;
        }

        public Criteria andResidenceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("residence_type >=", value, "residenceType");
            return (Criteria) this;
        }

        public Criteria andResidenceTypeLessThan(String value) {
            addCriterion("residence_type <", value, "residenceType");
            return (Criteria) this;
        }

        public Criteria andResidenceTypeLessThanOrEqualTo(String value) {
            addCriterion("residence_type <=", value, "residenceType");
            return (Criteria) this;
        }

        public Criteria andResidenceTypeLike(String value) {
            addCriterion("residence_type like", value, "residenceType");
            return (Criteria) this;
        }

        public Criteria andResidenceTypeNotLike(String value) {
            addCriterion("residence_type not like", value, "residenceType");
            return (Criteria) this;
        }

        public Criteria andResidenceTypeIn(List<String> values) {
            addCriterion("residence_type in", values, "residenceType");
            return (Criteria) this;
        }

        public Criteria andResidenceTypeNotIn(List<String> values) {
            addCriterion("residence_type not in", values, "residenceType");
            return (Criteria) this;
        }

        public Criteria andResidenceTypeBetween(String value1, String value2) {
            addCriterion("residence_type between", value1, value2, "residenceType");
            return (Criteria) this;
        }

        public Criteria andResidenceTypeNotBetween(String value1, String value2) {
            addCriterion("residence_type not between", value1, value2, "residenceType");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNull() {
            addCriterion("mobile_phone is null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNotNull() {
            addCriterion("mobile_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneEqualTo(String value) {
            addCriterion("mobile_phone =", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotEqualTo(String value) {
            addCriterion("mobile_phone <>", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThan(String value) {
            addCriterion("mobile_phone >", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_phone >=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThan(String value) {
            addCriterion("mobile_phone <", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("mobile_phone <=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLike(String value) {
            addCriterion("mobile_phone like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotLike(String value) {
            addCriterion("mobile_phone not like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIn(List<String> values) {
            addCriterion("mobile_phone in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotIn(List<String> values) {
            addCriterion("mobile_phone not in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneBetween(String value1, String value2) {
            addCriterion("mobile_phone between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("mobile_phone not between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andFamilyNameMumIsNull() {
            addCriterion("family_name_mum is null");
            return (Criteria) this;
        }

        public Criteria andFamilyNameMumIsNotNull() {
            addCriterion("family_name_mum is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyNameMumEqualTo(String value) {
            addCriterion("family_name_mum =", value, "familyNameMum");
            return (Criteria) this;
        }

        public Criteria andFamilyNameMumNotEqualTo(String value) {
            addCriterion("family_name_mum <>", value, "familyNameMum");
            return (Criteria) this;
        }

        public Criteria andFamilyNameMumGreaterThan(String value) {
            addCriterion("family_name_mum >", value, "familyNameMum");
            return (Criteria) this;
        }

        public Criteria andFamilyNameMumGreaterThanOrEqualTo(String value) {
            addCriterion("family_name_mum >=", value, "familyNameMum");
            return (Criteria) this;
        }

        public Criteria andFamilyNameMumLessThan(String value) {
            addCriterion("family_name_mum <", value, "familyNameMum");
            return (Criteria) this;
        }

        public Criteria andFamilyNameMumLessThanOrEqualTo(String value) {
            addCriterion("family_name_mum <=", value, "familyNameMum");
            return (Criteria) this;
        }

        public Criteria andFamilyNameMumLike(String value) {
            addCriterion("family_name_mum like", value, "familyNameMum");
            return (Criteria) this;
        }

        public Criteria andFamilyNameMumNotLike(String value) {
            addCriterion("family_name_mum not like", value, "familyNameMum");
            return (Criteria) this;
        }

        public Criteria andFamilyNameMumIn(List<String> values) {
            addCriterion("family_name_mum in", values, "familyNameMum");
            return (Criteria) this;
        }

        public Criteria andFamilyNameMumNotIn(List<String> values) {
            addCriterion("family_name_mum not in", values, "familyNameMum");
            return (Criteria) this;
        }

        public Criteria andFamilyNameMumBetween(String value1, String value2) {
            addCriterion("family_name_mum between", value1, value2, "familyNameMum");
            return (Criteria) this;
        }

        public Criteria andFamilyNameMumNotBetween(String value1, String value2) {
            addCriterion("family_name_mum not between", value1, value2, "familyNameMum");
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

        public Criteria andWkAddress1IsNull() {
            addCriterion("wk_address1 is null");
            return (Criteria) this;
        }

        public Criteria andWkAddress1IsNotNull() {
            addCriterion("wk_address1 is not null");
            return (Criteria) this;
        }

        public Criteria andWkAddress1EqualTo(String value) {
            addCriterion("wk_address1 =", value, "wkAddress1");
            return (Criteria) this;
        }

        public Criteria andWkAddress1NotEqualTo(String value) {
            addCriterion("wk_address1 <>", value, "wkAddress1");
            return (Criteria) this;
        }

        public Criteria andWkAddress1GreaterThan(String value) {
            addCriterion("wk_address1 >", value, "wkAddress1");
            return (Criteria) this;
        }

        public Criteria andWkAddress1GreaterThanOrEqualTo(String value) {
            addCriterion("wk_address1 >=", value, "wkAddress1");
            return (Criteria) this;
        }

        public Criteria andWkAddress1LessThan(String value) {
            addCriterion("wk_address1 <", value, "wkAddress1");
            return (Criteria) this;
        }

        public Criteria andWkAddress1LessThanOrEqualTo(String value) {
            addCriterion("wk_address1 <=", value, "wkAddress1");
            return (Criteria) this;
        }

        public Criteria andWkAddress1Like(String value) {
            addCriterion("wk_address1 like", value, "wkAddress1");
            return (Criteria) this;
        }

        public Criteria andWkAddress1NotLike(String value) {
            addCriterion("wk_address1 not like", value, "wkAddress1");
            return (Criteria) this;
        }

        public Criteria andWkAddress1In(List<String> values) {
            addCriterion("wk_address1 in", values, "wkAddress1");
            return (Criteria) this;
        }

        public Criteria andWkAddress1NotIn(List<String> values) {
            addCriterion("wk_address1 not in", values, "wkAddress1");
            return (Criteria) this;
        }

        public Criteria andWkAddress1Between(String value1, String value2) {
            addCriterion("wk_address1 between", value1, value2, "wkAddress1");
            return (Criteria) this;
        }

        public Criteria andWkAddress1NotBetween(String value1, String value2) {
            addCriterion("wk_address1 not between", value1, value2, "wkAddress1");
            return (Criteria) this;
        }

        public Criteria andWkAddress2IsNull() {
            addCriterion("wk_address2 is null");
            return (Criteria) this;
        }

        public Criteria andWkAddress2IsNotNull() {
            addCriterion("wk_address2 is not null");
            return (Criteria) this;
        }

        public Criteria andWkAddress2EqualTo(String value) {
            addCriterion("wk_address2 =", value, "wkAddress2");
            return (Criteria) this;
        }

        public Criteria andWkAddress2NotEqualTo(String value) {
            addCriterion("wk_address2 <>", value, "wkAddress2");
            return (Criteria) this;
        }

        public Criteria andWkAddress2GreaterThan(String value) {
            addCriterion("wk_address2 >", value, "wkAddress2");
            return (Criteria) this;
        }

        public Criteria andWkAddress2GreaterThanOrEqualTo(String value) {
            addCriterion("wk_address2 >=", value, "wkAddress2");
            return (Criteria) this;
        }

        public Criteria andWkAddress2LessThan(String value) {
            addCriterion("wk_address2 <", value, "wkAddress2");
            return (Criteria) this;
        }

        public Criteria andWkAddress2LessThanOrEqualTo(String value) {
            addCriterion("wk_address2 <=", value, "wkAddress2");
            return (Criteria) this;
        }

        public Criteria andWkAddress2Like(String value) {
            addCriterion("wk_address2 like", value, "wkAddress2");
            return (Criteria) this;
        }

        public Criteria andWkAddress2NotLike(String value) {
            addCriterion("wk_address2 not like", value, "wkAddress2");
            return (Criteria) this;
        }

        public Criteria andWkAddress2In(List<String> values) {
            addCriterion("wk_address2 in", values, "wkAddress2");
            return (Criteria) this;
        }

        public Criteria andWkAddress2NotIn(List<String> values) {
            addCriterion("wk_address2 not in", values, "wkAddress2");
            return (Criteria) this;
        }

        public Criteria andWkAddress2Between(String value1, String value2) {
            addCriterion("wk_address2 between", value1, value2, "wkAddress2");
            return (Criteria) this;
        }

        public Criteria andWkAddress2NotBetween(String value1, String value2) {
            addCriterion("wk_address2 not between", value1, value2, "wkAddress2");
            return (Criteria) this;
        }

        public Criteria andDetailWkAddIsNull() {
            addCriterion("detail_wk_add is null");
            return (Criteria) this;
        }

        public Criteria andDetailWkAddIsNotNull() {
            addCriterion("detail_wk_add is not null");
            return (Criteria) this;
        }

        public Criteria andDetailWkAddEqualTo(String value) {
            addCriterion("detail_wk_add =", value, "detailWkAdd");
            return (Criteria) this;
        }

        public Criteria andDetailWkAddNotEqualTo(String value) {
            addCriterion("detail_wk_add <>", value, "detailWkAdd");
            return (Criteria) this;
        }

        public Criteria andDetailWkAddGreaterThan(String value) {
            addCriterion("detail_wk_add >", value, "detailWkAdd");
            return (Criteria) this;
        }

        public Criteria andDetailWkAddGreaterThanOrEqualTo(String value) {
            addCriterion("detail_wk_add >=", value, "detailWkAdd");
            return (Criteria) this;
        }

        public Criteria andDetailWkAddLessThan(String value) {
            addCriterion("detail_wk_add <", value, "detailWkAdd");
            return (Criteria) this;
        }

        public Criteria andDetailWkAddLessThanOrEqualTo(String value) {
            addCriterion("detail_wk_add <=", value, "detailWkAdd");
            return (Criteria) this;
        }

        public Criteria andDetailWkAddLike(String value) {
            addCriterion("detail_wk_add like", value, "detailWkAdd");
            return (Criteria) this;
        }

        public Criteria andDetailWkAddNotLike(String value) {
            addCriterion("detail_wk_add not like", value, "detailWkAdd");
            return (Criteria) this;
        }

        public Criteria andDetailWkAddIn(List<String> values) {
            addCriterion("detail_wk_add in", values, "detailWkAdd");
            return (Criteria) this;
        }

        public Criteria andDetailWkAddNotIn(List<String> values) {
            addCriterion("detail_wk_add not in", values, "detailWkAdd");
            return (Criteria) this;
        }

        public Criteria andDetailWkAddBetween(String value1, String value2) {
            addCriterion("detail_wk_add between", value1, value2, "detailWkAdd");
            return (Criteria) this;
        }

        public Criteria andDetailWkAddNotBetween(String value1, String value2) {
            addCriterion("detail_wk_add not between", value1, value2, "detailWkAdd");
            return (Criteria) this;
        }

        public Criteria andWkPostIsNull() {
            addCriterion("wk_post is null");
            return (Criteria) this;
        }

        public Criteria andWkPostIsNotNull() {
            addCriterion("wk_post is not null");
            return (Criteria) this;
        }

        public Criteria andWkPostEqualTo(String value) {
            addCriterion("wk_post =", value, "wkPost");
            return (Criteria) this;
        }

        public Criteria andWkPostNotEqualTo(String value) {
            addCriterion("wk_post <>", value, "wkPost");
            return (Criteria) this;
        }

        public Criteria andWkPostGreaterThan(String value) {
            addCriterion("wk_post >", value, "wkPost");
            return (Criteria) this;
        }

        public Criteria andWkPostGreaterThanOrEqualTo(String value) {
            addCriterion("wk_post >=", value, "wkPost");
            return (Criteria) this;
        }

        public Criteria andWkPostLessThan(String value) {
            addCriterion("wk_post <", value, "wkPost");
            return (Criteria) this;
        }

        public Criteria andWkPostLessThanOrEqualTo(String value) {
            addCriterion("wk_post <=", value, "wkPost");
            return (Criteria) this;
        }

        public Criteria andWkPostLike(String value) {
            addCriterion("wk_post like", value, "wkPost");
            return (Criteria) this;
        }

        public Criteria andWkPostNotLike(String value) {
            addCriterion("wk_post not like", value, "wkPost");
            return (Criteria) this;
        }

        public Criteria andWkPostIn(List<String> values) {
            addCriterion("wk_post in", values, "wkPost");
            return (Criteria) this;
        }

        public Criteria andWkPostNotIn(List<String> values) {
            addCriterion("wk_post not in", values, "wkPost");
            return (Criteria) this;
        }

        public Criteria andWkPostBetween(String value1, String value2) {
            addCriterion("wk_post between", value1, value2, "wkPost");
            return (Criteria) this;
        }

        public Criteria andWkPostNotBetween(String value1, String value2) {
            addCriterion("wk_post not between", value1, value2, "wkPost");
            return (Criteria) this;
        }

        public Criteria andWkPhoneIsNull() {
            addCriterion("wk_phone is null");
            return (Criteria) this;
        }

        public Criteria andWkPhoneIsNotNull() {
            addCriterion("wk_phone is not null");
            return (Criteria) this;
        }

        public Criteria andWkPhoneEqualTo(String value) {
            addCriterion("wk_phone =", value, "wkPhone");
            return (Criteria) this;
        }

        public Criteria andWkPhoneNotEqualTo(String value) {
            addCriterion("wk_phone <>", value, "wkPhone");
            return (Criteria) this;
        }

        public Criteria andWkPhoneGreaterThan(String value) {
            addCriterion("wk_phone >", value, "wkPhone");
            return (Criteria) this;
        }

        public Criteria andWkPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("wk_phone >=", value, "wkPhone");
            return (Criteria) this;
        }

        public Criteria andWkPhoneLessThan(String value) {
            addCriterion("wk_phone <", value, "wkPhone");
            return (Criteria) this;
        }

        public Criteria andWkPhoneLessThanOrEqualTo(String value) {
            addCriterion("wk_phone <=", value, "wkPhone");
            return (Criteria) this;
        }

        public Criteria andWkPhoneLike(String value) {
            addCriterion("wk_phone like", value, "wkPhone");
            return (Criteria) this;
        }

        public Criteria andWkPhoneNotLike(String value) {
            addCriterion("wk_phone not like", value, "wkPhone");
            return (Criteria) this;
        }

        public Criteria andWkPhoneIn(List<String> values) {
            addCriterion("wk_phone in", values, "wkPhone");
            return (Criteria) this;
        }

        public Criteria andWkPhoneNotIn(List<String> values) {
            addCriterion("wk_phone not in", values, "wkPhone");
            return (Criteria) this;
        }

        public Criteria andWkPhoneBetween(String value1, String value2) {
            addCriterion("wk_phone between", value1, value2, "wkPhone");
            return (Criteria) this;
        }

        public Criteria andWkPhoneNotBetween(String value1, String value2) {
            addCriterion("wk_phone not between", value1, value2, "wkPhone");
            return (Criteria) this;
        }

        public Criteria andProfessionTypeIsNull() {
            addCriterion("profession_type is null");
            return (Criteria) this;
        }

        public Criteria andProfessionTypeIsNotNull() {
            addCriterion("profession_type is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionTypeEqualTo(String value) {
            addCriterion("profession_type =", value, "professionType");
            return (Criteria) this;
        }

        public Criteria andProfessionTypeNotEqualTo(String value) {
            addCriterion("profession_type <>", value, "professionType");
            return (Criteria) this;
        }

        public Criteria andProfessionTypeGreaterThan(String value) {
            addCriterion("profession_type >", value, "professionType");
            return (Criteria) this;
        }

        public Criteria andProfessionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("profession_type >=", value, "professionType");
            return (Criteria) this;
        }

        public Criteria andProfessionTypeLessThan(String value) {
            addCriterion("profession_type <", value, "professionType");
            return (Criteria) this;
        }

        public Criteria andProfessionTypeLessThanOrEqualTo(String value) {
            addCriterion("profession_type <=", value, "professionType");
            return (Criteria) this;
        }

        public Criteria andProfessionTypeLike(String value) {
            addCriterion("profession_type like", value, "professionType");
            return (Criteria) this;
        }

        public Criteria andProfessionTypeNotLike(String value) {
            addCriterion("profession_type not like", value, "professionType");
            return (Criteria) this;
        }

        public Criteria andProfessionTypeIn(List<String> values) {
            addCriterion("profession_type in", values, "professionType");
            return (Criteria) this;
        }

        public Criteria andProfessionTypeNotIn(List<String> values) {
            addCriterion("profession_type not in", values, "professionType");
            return (Criteria) this;
        }

        public Criteria andProfessionTypeBetween(String value1, String value2) {
            addCriterion("profession_type between", value1, value2, "professionType");
            return (Criteria) this;
        }

        public Criteria andProfessionTypeNotBetween(String value1, String value2) {
            addCriterion("profession_type not between", value1, value2, "professionType");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeIsNull() {
            addCriterion("economic_type is null");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeIsNotNull() {
            addCriterion("economic_type is not null");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeEqualTo(String value) {
            addCriterion("economic_type =", value, "economicType");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeNotEqualTo(String value) {
            addCriterion("economic_type <>", value, "economicType");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeGreaterThan(String value) {
            addCriterion("economic_type >", value, "economicType");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeGreaterThanOrEqualTo(String value) {
            addCriterion("economic_type >=", value, "economicType");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeLessThan(String value) {
            addCriterion("economic_type <", value, "economicType");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeLessThanOrEqualTo(String value) {
            addCriterion("economic_type <=", value, "economicType");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeLike(String value) {
            addCriterion("economic_type like", value, "economicType");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeNotLike(String value) {
            addCriterion("economic_type not like", value, "economicType");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeIn(List<String> values) {
            addCriterion("economic_type in", values, "economicType");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeNotIn(List<String> values) {
            addCriterion("economic_type not in", values, "economicType");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeBetween(String value1, String value2) {
            addCriterion("economic_type between", value1, value2, "economicType");
            return (Criteria) this;
        }

        public Criteria andEconomicTypeNotBetween(String value1, String value2) {
            addCriterion("economic_type not between", value1, value2, "economicType");
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

        public Criteria andWorktimeYearIsNull() {
            addCriterion("worktime_year is null");
            return (Criteria) this;
        }

        public Criteria andWorktimeYearIsNotNull() {
            addCriterion("worktime_year is not null");
            return (Criteria) this;
        }

        public Criteria andWorktimeYearEqualTo(String value) {
            addCriterion("worktime_year =", value, "worktimeYear");
            return (Criteria) this;
        }

        public Criteria andWorktimeYearNotEqualTo(String value) {
            addCriterion("worktime_year <>", value, "worktimeYear");
            return (Criteria) this;
        }

        public Criteria andWorktimeYearGreaterThan(String value) {
            addCriterion("worktime_year >", value, "worktimeYear");
            return (Criteria) this;
        }

        public Criteria andWorktimeYearGreaterThanOrEqualTo(String value) {
            addCriterion("worktime_year >=", value, "worktimeYear");
            return (Criteria) this;
        }

        public Criteria andWorktimeYearLessThan(String value) {
            addCriterion("worktime_year <", value, "worktimeYear");
            return (Criteria) this;
        }

        public Criteria andWorktimeYearLessThanOrEqualTo(String value) {
            addCriterion("worktime_year <=", value, "worktimeYear");
            return (Criteria) this;
        }

        public Criteria andWorktimeYearLike(String value) {
            addCriterion("worktime_year like", value, "worktimeYear");
            return (Criteria) this;
        }

        public Criteria andWorktimeYearNotLike(String value) {
            addCriterion("worktime_year not like", value, "worktimeYear");
            return (Criteria) this;
        }

        public Criteria andWorktimeYearIn(List<String> values) {
            addCriterion("worktime_year in", values, "worktimeYear");
            return (Criteria) this;
        }

        public Criteria andWorktimeYearNotIn(List<String> values) {
            addCriterion("worktime_year not in", values, "worktimeYear");
            return (Criteria) this;
        }

        public Criteria andWorktimeYearBetween(String value1, String value2) {
            addCriterion("worktime_year between", value1, value2, "worktimeYear");
            return (Criteria) this;
        }

        public Criteria andWorktimeYearNotBetween(String value1, String value2) {
            addCriterion("worktime_year not between", value1, value2, "worktimeYear");
            return (Criteria) this;
        }

        public Criteria andTotIncomeIsNull() {
            addCriterion("tot_income is null");
            return (Criteria) this;
        }

        public Criteria andTotIncomeIsNotNull() {
            addCriterion("tot_income is not null");
            return (Criteria) this;
        }

        public Criteria andTotIncomeEqualTo(String value) {
            addCriterion("tot_income =", value, "totIncome");
            return (Criteria) this;
        }

        public Criteria andTotIncomeNotEqualTo(String value) {
            addCriterion("tot_income <>", value, "totIncome");
            return (Criteria) this;
        }

        public Criteria andTotIncomeGreaterThan(String value) {
            addCriterion("tot_income >", value, "totIncome");
            return (Criteria) this;
        }

        public Criteria andTotIncomeGreaterThanOrEqualTo(String value) {
            addCriterion("tot_income >=", value, "totIncome");
            return (Criteria) this;
        }

        public Criteria andTotIncomeLessThan(String value) {
            addCriterion("tot_income <", value, "totIncome");
            return (Criteria) this;
        }

        public Criteria andTotIncomeLessThanOrEqualTo(String value) {
            addCriterion("tot_income <=", value, "totIncome");
            return (Criteria) this;
        }

        public Criteria andTotIncomeLike(String value) {
            addCriterion("tot_income like", value, "totIncome");
            return (Criteria) this;
        }

        public Criteria andTotIncomeNotLike(String value) {
            addCriterion("tot_income not like", value, "totIncome");
            return (Criteria) this;
        }

        public Criteria andTotIncomeIn(List<String> values) {
            addCriterion("tot_income in", values, "totIncome");
            return (Criteria) this;
        }

        public Criteria andTotIncomeNotIn(List<String> values) {
            addCriterion("tot_income not in", values, "totIncome");
            return (Criteria) this;
        }

        public Criteria andTotIncomeBetween(String value1, String value2) {
            addCriterion("tot_income between", value1, value2, "totIncome");
            return (Criteria) this;
        }

        public Criteria andTotIncomeNotBetween(String value1, String value2) {
            addCriterion("tot_income not between", value1, value2, "totIncome");
            return (Criteria) this;
        }

        public Criteria andConnectionPersonIsNull() {
            addCriterion("connection_person is null");
            return (Criteria) this;
        }

        public Criteria andConnectionPersonIsNotNull() {
            addCriterion("connection_person is not null");
            return (Criteria) this;
        }

        public Criteria andConnectionPersonEqualTo(String value) {
            addCriterion("connection_person =", value, "connectionPerson");
            return (Criteria) this;
        }

        public Criteria andConnectionPersonNotEqualTo(String value) {
            addCriterion("connection_person <>", value, "connectionPerson");
            return (Criteria) this;
        }

        public Criteria andConnectionPersonGreaterThan(String value) {
            addCriterion("connection_person >", value, "connectionPerson");
            return (Criteria) this;
        }

        public Criteria andConnectionPersonGreaterThanOrEqualTo(String value) {
            addCriterion("connection_person >=", value, "connectionPerson");
            return (Criteria) this;
        }

        public Criteria andConnectionPersonLessThan(String value) {
            addCriterion("connection_person <", value, "connectionPerson");
            return (Criteria) this;
        }

        public Criteria andConnectionPersonLessThanOrEqualTo(String value) {
            addCriterion("connection_person <=", value, "connectionPerson");
            return (Criteria) this;
        }

        public Criteria andConnectionPersonLike(String value) {
            addCriterion("connection_person like", value, "connectionPerson");
            return (Criteria) this;
        }

        public Criteria andConnectionPersonNotLike(String value) {
            addCriterion("connection_person not like", value, "connectionPerson");
            return (Criteria) this;
        }

        public Criteria andConnectionPersonIn(List<String> values) {
            addCriterion("connection_person in", values, "connectionPerson");
            return (Criteria) this;
        }

        public Criteria andConnectionPersonNotIn(List<String> values) {
            addCriterion("connection_person not in", values, "connectionPerson");
            return (Criteria) this;
        }

        public Criteria andConnectionPersonBetween(String value1, String value2) {
            addCriterion("connection_person between", value1, value2, "connectionPerson");
            return (Criteria) this;
        }

        public Criteria andConnectionPersonNotBetween(String value1, String value2) {
            addCriterion("connection_person not between", value1, value2, "connectionPerson");
            return (Criteria) this;
        }

        public Criteria andRelationshipIsNull() {
            addCriterion("relationship is null");
            return (Criteria) this;
        }

        public Criteria andRelationshipIsNotNull() {
            addCriterion("relationship is not null");
            return (Criteria) this;
        }

        public Criteria andRelationshipEqualTo(String value) {
            addCriterion("relationship =", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotEqualTo(String value) {
            addCriterion("relationship <>", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipGreaterThan(String value) {
            addCriterion("relationship >", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipGreaterThanOrEqualTo(String value) {
            addCriterion("relationship >=", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipLessThan(String value) {
            addCriterion("relationship <", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipLessThanOrEqualTo(String value) {
            addCriterion("relationship <=", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipLike(String value) {
            addCriterion("relationship like", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotLike(String value) {
            addCriterion("relationship not like", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipIn(List<String> values) {
            addCriterion("relationship in", values, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotIn(List<String> values) {
            addCriterion("relationship not in", values, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipBetween(String value1, String value2) {
            addCriterion("relationship between", value1, value2, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotBetween(String value1, String value2) {
            addCriterion("relationship not between", value1, value2, "relationship");
            return (Criteria) this;
        }

        public Criteria andConPersonWknameIsNull() {
            addCriterion("con_person_wkname is null");
            return (Criteria) this;
        }

        public Criteria andConPersonWknameIsNotNull() {
            addCriterion("con_person_wkname is not null");
            return (Criteria) this;
        }

        public Criteria andConPersonWknameEqualTo(String value) {
            addCriterion("con_person_wkname =", value, "conPersonWkname");
            return (Criteria) this;
        }

        public Criteria andConPersonWknameNotEqualTo(String value) {
            addCriterion("con_person_wkname <>", value, "conPersonWkname");
            return (Criteria) this;
        }

        public Criteria andConPersonWknameGreaterThan(String value) {
            addCriterion("con_person_wkname >", value, "conPersonWkname");
            return (Criteria) this;
        }

        public Criteria andConPersonWknameGreaterThanOrEqualTo(String value) {
            addCriterion("con_person_wkname >=", value, "conPersonWkname");
            return (Criteria) this;
        }

        public Criteria andConPersonWknameLessThan(String value) {
            addCriterion("con_person_wkname <", value, "conPersonWkname");
            return (Criteria) this;
        }

        public Criteria andConPersonWknameLessThanOrEqualTo(String value) {
            addCriterion("con_person_wkname <=", value, "conPersonWkname");
            return (Criteria) this;
        }

        public Criteria andConPersonWknameLike(String value) {
            addCriterion("con_person_wkname like", value, "conPersonWkname");
            return (Criteria) this;
        }

        public Criteria andConPersonWknameNotLike(String value) {
            addCriterion("con_person_wkname not like", value, "conPersonWkname");
            return (Criteria) this;
        }

        public Criteria andConPersonWknameIn(List<String> values) {
            addCriterion("con_person_wkname in", values, "conPersonWkname");
            return (Criteria) this;
        }

        public Criteria andConPersonWknameNotIn(List<String> values) {
            addCriterion("con_person_wkname not in", values, "conPersonWkname");
            return (Criteria) this;
        }

        public Criteria andConPersonWknameBetween(String value1, String value2) {
            addCriterion("con_person_wkname between", value1, value2, "conPersonWkname");
            return (Criteria) this;
        }

        public Criteria andConPersonWknameNotBetween(String value1, String value2) {
            addCriterion("con_person_wkname not between", value1, value2, "conPersonWkname");
            return (Criteria) this;
        }

        public Criteria andConPersonPhoneIsNull() {
            addCriterion("con_person_phone is null");
            return (Criteria) this;
        }

        public Criteria andConPersonPhoneIsNotNull() {
            addCriterion("con_person_phone is not null");
            return (Criteria) this;
        }

        public Criteria andConPersonPhoneEqualTo(String value) {
            addCriterion("con_person_phone =", value, "conPersonPhone");
            return (Criteria) this;
        }

        public Criteria andConPersonPhoneNotEqualTo(String value) {
            addCriterion("con_person_phone <>", value, "conPersonPhone");
            return (Criteria) this;
        }

        public Criteria andConPersonPhoneGreaterThan(String value) {
            addCriterion("con_person_phone >", value, "conPersonPhone");
            return (Criteria) this;
        }

        public Criteria andConPersonPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("con_person_phone >=", value, "conPersonPhone");
            return (Criteria) this;
        }

        public Criteria andConPersonPhoneLessThan(String value) {
            addCriterion("con_person_phone <", value, "conPersonPhone");
            return (Criteria) this;
        }

        public Criteria andConPersonPhoneLessThanOrEqualTo(String value) {
            addCriterion("con_person_phone <=", value, "conPersonPhone");
            return (Criteria) this;
        }

        public Criteria andConPersonPhoneLike(String value) {
            addCriterion("con_person_phone like", value, "conPersonPhone");
            return (Criteria) this;
        }

        public Criteria andConPersonPhoneNotLike(String value) {
            addCriterion("con_person_phone not like", value, "conPersonPhone");
            return (Criteria) this;
        }

        public Criteria andConPersonPhoneIn(List<String> values) {
            addCriterion("con_person_phone in", values, "conPersonPhone");
            return (Criteria) this;
        }

        public Criteria andConPersonPhoneNotIn(List<String> values) {
            addCriterion("con_person_phone not in", values, "conPersonPhone");
            return (Criteria) this;
        }

        public Criteria andConPersonPhoneBetween(String value1, String value2) {
            addCriterion("con_person_phone between", value1, value2, "conPersonPhone");
            return (Criteria) this;
        }

        public Criteria andConPersonPhoneNotBetween(String value1, String value2) {
            addCriterion("con_person_phone not between", value1, value2, "conPersonPhone");
            return (Criteria) this;
        }

        public Criteria andConPersonMobileIsNull() {
            addCriterion("con_person_mobile is null");
            return (Criteria) this;
        }

        public Criteria andConPersonMobileIsNotNull() {
            addCriterion("con_person_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andConPersonMobileEqualTo(String value) {
            addCriterion("con_person_mobile =", value, "conPersonMobile");
            return (Criteria) this;
        }

        public Criteria andConPersonMobileNotEqualTo(String value) {
            addCriterion("con_person_mobile <>", value, "conPersonMobile");
            return (Criteria) this;
        }

        public Criteria andConPersonMobileGreaterThan(String value) {
            addCriterion("con_person_mobile >", value, "conPersonMobile");
            return (Criteria) this;
        }

        public Criteria andConPersonMobileGreaterThanOrEqualTo(String value) {
            addCriterion("con_person_mobile >=", value, "conPersonMobile");
            return (Criteria) this;
        }

        public Criteria andConPersonMobileLessThan(String value) {
            addCriterion("con_person_mobile <", value, "conPersonMobile");
            return (Criteria) this;
        }

        public Criteria andConPersonMobileLessThanOrEqualTo(String value) {
            addCriterion("con_person_mobile <=", value, "conPersonMobile");
            return (Criteria) this;
        }

        public Criteria andConPersonMobileLike(String value) {
            addCriterion("con_person_mobile like", value, "conPersonMobile");
            return (Criteria) this;
        }

        public Criteria andConPersonMobileNotLike(String value) {
            addCriterion("con_person_mobile not like", value, "conPersonMobile");
            return (Criteria) this;
        }

        public Criteria andConPersonMobileIn(List<String> values) {
            addCriterion("con_person_mobile in", values, "conPersonMobile");
            return (Criteria) this;
        }

        public Criteria andConPersonMobileNotIn(List<String> values) {
            addCriterion("con_person_mobile not in", values, "conPersonMobile");
            return (Criteria) this;
        }

        public Criteria andConPersonMobileBetween(String value1, String value2) {
            addCriterion("con_person_mobile between", value1, value2, "conPersonMobile");
            return (Criteria) this;
        }

        public Criteria andConPersonMobileNotBetween(String value1, String value2) {
            addCriterion("con_person_mobile not between", value1, value2, "conPersonMobile");
            return (Criteria) this;
        }

        public Criteria andAccountSendTypeIsNull() {
            addCriterion("account_send_type is null");
            return (Criteria) this;
        }

        public Criteria andAccountSendTypeIsNotNull() {
            addCriterion("account_send_type is not null");
            return (Criteria) this;
        }

        public Criteria andAccountSendTypeEqualTo(String value) {
            addCriterion("account_send_type =", value, "accountSendType");
            return (Criteria) this;
        }

        public Criteria andAccountSendTypeNotEqualTo(String value) {
            addCriterion("account_send_type <>", value, "accountSendType");
            return (Criteria) this;
        }

        public Criteria andAccountSendTypeGreaterThan(String value) {
            addCriterion("account_send_type >", value, "accountSendType");
            return (Criteria) this;
        }

        public Criteria andAccountSendTypeGreaterThanOrEqualTo(String value) {
            addCriterion("account_send_type >=", value, "accountSendType");
            return (Criteria) this;
        }

        public Criteria andAccountSendTypeLessThan(String value) {
            addCriterion("account_send_type <", value, "accountSendType");
            return (Criteria) this;
        }

        public Criteria andAccountSendTypeLessThanOrEqualTo(String value) {
            addCriterion("account_send_type <=", value, "accountSendType");
            return (Criteria) this;
        }

        public Criteria andAccountSendTypeLike(String value) {
            addCriterion("account_send_type like", value, "accountSendType");
            return (Criteria) this;
        }

        public Criteria andAccountSendTypeNotLike(String value) {
            addCriterion("account_send_type not like", value, "accountSendType");
            return (Criteria) this;
        }

        public Criteria andAccountSendTypeIn(List<String> values) {
            addCriterion("account_send_type in", values, "accountSendType");
            return (Criteria) this;
        }

        public Criteria andAccountSendTypeNotIn(List<String> values) {
            addCriterion("account_send_type not in", values, "accountSendType");
            return (Criteria) this;
        }

        public Criteria andAccountSendTypeBetween(String value1, String value2) {
            addCriterion("account_send_type between", value1, value2, "accountSendType");
            return (Criteria) this;
        }

        public Criteria andAccountSendTypeNotBetween(String value1, String value2) {
            addCriterion("account_send_type not between", value1, value2, "accountSendType");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andSendAddressIsNull() {
            addCriterion("send_address is null");
            return (Criteria) this;
        }

        public Criteria andSendAddressIsNotNull() {
            addCriterion("send_address is not null");
            return (Criteria) this;
        }

        public Criteria andSendAddressEqualTo(String value) {
            addCriterion("send_address =", value, "sendAddress");
            return (Criteria) this;
        }

        public Criteria andSendAddressNotEqualTo(String value) {
            addCriterion("send_address <>", value, "sendAddress");
            return (Criteria) this;
        }

        public Criteria andSendAddressGreaterThan(String value) {
            addCriterion("send_address >", value, "sendAddress");
            return (Criteria) this;
        }

        public Criteria andSendAddressGreaterThanOrEqualTo(String value) {
            addCriterion("send_address >=", value, "sendAddress");
            return (Criteria) this;
        }

        public Criteria andSendAddressLessThan(String value) {
            addCriterion("send_address <", value, "sendAddress");
            return (Criteria) this;
        }

        public Criteria andSendAddressLessThanOrEqualTo(String value) {
            addCriterion("send_address <=", value, "sendAddress");
            return (Criteria) this;
        }

        public Criteria andSendAddressLike(String value) {
            addCriterion("send_address like", value, "sendAddress");
            return (Criteria) this;
        }

        public Criteria andSendAddressNotLike(String value) {
            addCriterion("send_address not like", value, "sendAddress");
            return (Criteria) this;
        }

        public Criteria andSendAddressIn(List<String> values) {
            addCriterion("send_address in", values, "sendAddress");
            return (Criteria) this;
        }

        public Criteria andSendAddressNotIn(List<String> values) {
            addCriterion("send_address not in", values, "sendAddress");
            return (Criteria) this;
        }

        public Criteria andSendAddressBetween(String value1, String value2) {
            addCriterion("send_address between", value1, value2, "sendAddress");
            return (Criteria) this;
        }

        public Criteria andSendAddressNotBetween(String value1, String value2) {
            addCriterion("send_address not between", value1, value2, "sendAddress");
            return (Criteria) this;
        }

        public Criteria andNeedPwdIsNull() {
            addCriterion("need_pwd is null");
            return (Criteria) this;
        }

        public Criteria andNeedPwdIsNotNull() {
            addCriterion("need_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andNeedPwdEqualTo(String value) {
            addCriterion("need_pwd =", value, "needPwd");
            return (Criteria) this;
        }

        public Criteria andNeedPwdNotEqualTo(String value) {
            addCriterion("need_pwd <>", value, "needPwd");
            return (Criteria) this;
        }

        public Criteria andNeedPwdGreaterThan(String value) {
            addCriterion("need_pwd >", value, "needPwd");
            return (Criteria) this;
        }

        public Criteria andNeedPwdGreaterThanOrEqualTo(String value) {
            addCriterion("need_pwd >=", value, "needPwd");
            return (Criteria) this;
        }

        public Criteria andNeedPwdLessThan(String value) {
            addCriterion("need_pwd <", value, "needPwd");
            return (Criteria) this;
        }

        public Criteria andNeedPwdLessThanOrEqualTo(String value) {
            addCriterion("need_pwd <=", value, "needPwd");
            return (Criteria) this;
        }

        public Criteria andNeedPwdLike(String value) {
            addCriterion("need_pwd like", value, "needPwd");
            return (Criteria) this;
        }

        public Criteria andNeedPwdNotLike(String value) {
            addCriterion("need_pwd not like", value, "needPwd");
            return (Criteria) this;
        }

        public Criteria andNeedPwdIn(List<String> values) {
            addCriterion("need_pwd in", values, "needPwd");
            return (Criteria) this;
        }

        public Criteria andNeedPwdNotIn(List<String> values) {
            addCriterion("need_pwd not in", values, "needPwd");
            return (Criteria) this;
        }

        public Criteria andNeedPwdBetween(String value1, String value2) {
            addCriterion("need_pwd between", value1, value2, "needPwd");
            return (Criteria) this;
        }

        public Criteria andNeedPwdNotBetween(String value1, String value2) {
            addCriterion("need_pwd not between", value1, value2, "needPwd");
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