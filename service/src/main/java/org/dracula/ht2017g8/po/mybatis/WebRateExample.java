package org.dracula.ht2017g8.po.mybatis;

import java.util.ArrayList;
import java.util.List;

public class WebRateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WebRateExample() {
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

        public Criteria andCurrIsNull() {
            addCriterion("curr is null");
            return (Criteria) this;
        }

        public Criteria andCurrIsNotNull() {
            addCriterion("curr is not null");
            return (Criteria) this;
        }

        public Criteria andCurrEqualTo(String value) {
            addCriterion("curr =", value, "curr");
            return (Criteria) this;
        }

        public Criteria andCurrNotEqualTo(String value) {
            addCriterion("curr <>", value, "curr");
            return (Criteria) this;
        }

        public Criteria andCurrGreaterThan(String value) {
            addCriterion("curr >", value, "curr");
            return (Criteria) this;
        }

        public Criteria andCurrGreaterThanOrEqualTo(String value) {
            addCriterion("curr >=", value, "curr");
            return (Criteria) this;
        }

        public Criteria andCurrLessThan(String value) {
            addCriterion("curr <", value, "curr");
            return (Criteria) this;
        }

        public Criteria andCurrLessThanOrEqualTo(String value) {
            addCriterion("curr <=", value, "curr");
            return (Criteria) this;
        }

        public Criteria andCurrLike(String value) {
            addCriterion("curr like", value, "curr");
            return (Criteria) this;
        }

        public Criteria andCurrNotLike(String value) {
            addCriterion("curr not like", value, "curr");
            return (Criteria) this;
        }

        public Criteria andCurrIn(List<String> values) {
            addCriterion("curr in", values, "curr");
            return (Criteria) this;
        }

        public Criteria andCurrNotIn(List<String> values) {
            addCriterion("curr not in", values, "curr");
            return (Criteria) this;
        }

        public Criteria andCurrBetween(String value1, String value2) {
            addCriterion("curr between", value1, value2, "curr");
            return (Criteria) this;
        }

        public Criteria andCurrNotBetween(String value1, String value2) {
            addCriterion("curr not between", value1, value2, "curr");
            return (Criteria) this;
        }

        public Criteria andCurrinIsNull() {
            addCriterion("currin is null");
            return (Criteria) this;
        }

        public Criteria andCurrinIsNotNull() {
            addCriterion("currin is not null");
            return (Criteria) this;
        }

        public Criteria andCurrinEqualTo(Double value) {
            addCriterion("currin =", value, "currin");
            return (Criteria) this;
        }

        public Criteria andCurrinNotEqualTo(Double value) {
            addCriterion("currin <>", value, "currin");
            return (Criteria) this;
        }

        public Criteria andCurrinGreaterThan(Double value) {
            addCriterion("currin >", value, "currin");
            return (Criteria) this;
        }

        public Criteria andCurrinGreaterThanOrEqualTo(Double value) {
            addCriterion("currin >=", value, "currin");
            return (Criteria) this;
        }

        public Criteria andCurrinLessThan(Double value) {
            addCriterion("currin <", value, "currin");
            return (Criteria) this;
        }

        public Criteria andCurrinLessThanOrEqualTo(Double value) {
            addCriterion("currin <=", value, "currin");
            return (Criteria) this;
        }

        public Criteria andCurrinIn(List<Double> values) {
            addCriterion("currin in", values, "currin");
            return (Criteria) this;
        }

        public Criteria andCurrinNotIn(List<Double> values) {
            addCriterion("currin not in", values, "currin");
            return (Criteria) this;
        }

        public Criteria andCurrinBetween(Double value1, Double value2) {
            addCriterion("currin between", value1, value2, "currin");
            return (Criteria) this;
        }

        public Criteria andCurrinNotBetween(Double value1, Double value2) {
            addCriterion("currin not between", value1, value2, "currin");
            return (Criteria) this;
        }

        public Criteria andCashinIsNull() {
            addCriterion("cashin is null");
            return (Criteria) this;
        }

        public Criteria andCashinIsNotNull() {
            addCriterion("cashin is not null");
            return (Criteria) this;
        }

        public Criteria andCashinEqualTo(Double value) {
            addCriterion("cashin =", value, "cashin");
            return (Criteria) this;
        }

        public Criteria andCashinNotEqualTo(Double value) {
            addCriterion("cashin <>", value, "cashin");
            return (Criteria) this;
        }

        public Criteria andCashinGreaterThan(Double value) {
            addCriterion("cashin >", value, "cashin");
            return (Criteria) this;
        }

        public Criteria andCashinGreaterThanOrEqualTo(Double value) {
            addCriterion("cashin >=", value, "cashin");
            return (Criteria) this;
        }

        public Criteria andCashinLessThan(Double value) {
            addCriterion("cashin <", value, "cashin");
            return (Criteria) this;
        }

        public Criteria andCashinLessThanOrEqualTo(Double value) {
            addCriterion("cashin <=", value, "cashin");
            return (Criteria) this;
        }

        public Criteria andCashinIn(List<Double> values) {
            addCriterion("cashin in", values, "cashin");
            return (Criteria) this;
        }

        public Criteria andCashinNotIn(List<Double> values) {
            addCriterion("cashin not in", values, "cashin");
            return (Criteria) this;
        }

        public Criteria andCashinBetween(Double value1, Double value2) {
            addCriterion("cashin between", value1, value2, "cashin");
            return (Criteria) this;
        }

        public Criteria andCashinNotBetween(Double value1, Double value2) {
            addCriterion("cashin not between", value1, value2, "cashin");
            return (Criteria) this;
        }

        public Criteria andCurroutIsNull() {
            addCriterion("currout is null");
            return (Criteria) this;
        }

        public Criteria andCurroutIsNotNull() {
            addCriterion("currout is not null");
            return (Criteria) this;
        }

        public Criteria andCurroutEqualTo(Double value) {
            addCriterion("currout =", value, "currout");
            return (Criteria) this;
        }

        public Criteria andCurroutNotEqualTo(Double value) {
            addCriterion("currout <>", value, "currout");
            return (Criteria) this;
        }

        public Criteria andCurroutGreaterThan(Double value) {
            addCriterion("currout >", value, "currout");
            return (Criteria) this;
        }

        public Criteria andCurroutGreaterThanOrEqualTo(Double value) {
            addCriterion("currout >=", value, "currout");
            return (Criteria) this;
        }

        public Criteria andCurroutLessThan(Double value) {
            addCriterion("currout <", value, "currout");
            return (Criteria) this;
        }

        public Criteria andCurroutLessThanOrEqualTo(Double value) {
            addCriterion("currout <=", value, "currout");
            return (Criteria) this;
        }

        public Criteria andCurroutIn(List<Double> values) {
            addCriterion("currout in", values, "currout");
            return (Criteria) this;
        }

        public Criteria andCurroutNotIn(List<Double> values) {
            addCriterion("currout not in", values, "currout");
            return (Criteria) this;
        }

        public Criteria andCurroutBetween(Double value1, Double value2) {
            addCriterion("currout between", value1, value2, "currout");
            return (Criteria) this;
        }

        public Criteria andCurroutNotBetween(Double value1, Double value2) {
            addCriterion("currout not between", value1, value2, "currout");
            return (Criteria) this;
        }

        public Criteria andCashoutIsNull() {
            addCriterion("cashout is null");
            return (Criteria) this;
        }

        public Criteria andCashoutIsNotNull() {
            addCriterion("cashout is not null");
            return (Criteria) this;
        }

        public Criteria andCashoutEqualTo(Double value) {
            addCriterion("cashout =", value, "cashout");
            return (Criteria) this;
        }

        public Criteria andCashoutNotEqualTo(Double value) {
            addCriterion("cashout <>", value, "cashout");
            return (Criteria) this;
        }

        public Criteria andCashoutGreaterThan(Double value) {
            addCriterion("cashout >", value, "cashout");
            return (Criteria) this;
        }

        public Criteria andCashoutGreaterThanOrEqualTo(Double value) {
            addCriterion("cashout >=", value, "cashout");
            return (Criteria) this;
        }

        public Criteria andCashoutLessThan(Double value) {
            addCriterion("cashout <", value, "cashout");
            return (Criteria) this;
        }

        public Criteria andCashoutLessThanOrEqualTo(Double value) {
            addCriterion("cashout <=", value, "cashout");
            return (Criteria) this;
        }

        public Criteria andCashoutIn(List<Double> values) {
            addCriterion("cashout in", values, "cashout");
            return (Criteria) this;
        }

        public Criteria andCashoutNotIn(List<Double> values) {
            addCriterion("cashout not in", values, "cashout");
            return (Criteria) this;
        }

        public Criteria andCashoutBetween(Double value1, Double value2) {
            addCriterion("cashout between", value1, value2, "cashout");
            return (Criteria) this;
        }

        public Criteria andCashoutNotBetween(Double value1, Double value2) {
            addCriterion("cashout not between", value1, value2, "cashout");
            return (Criteria) this;
        }

        public Criteria andMidrateIsNull() {
            addCriterion("midrate is null");
            return (Criteria) this;
        }

        public Criteria andMidrateIsNotNull() {
            addCriterion("midrate is not null");
            return (Criteria) this;
        }

        public Criteria andMidrateEqualTo(Double value) {
            addCriterion("midrate =", value, "midrate");
            return (Criteria) this;
        }

        public Criteria andMidrateNotEqualTo(Double value) {
            addCriterion("midrate <>", value, "midrate");
            return (Criteria) this;
        }

        public Criteria andMidrateGreaterThan(Double value) {
            addCriterion("midrate >", value, "midrate");
            return (Criteria) this;
        }

        public Criteria andMidrateGreaterThanOrEqualTo(Double value) {
            addCriterion("midrate >=", value, "midrate");
            return (Criteria) this;
        }

        public Criteria andMidrateLessThan(Double value) {
            addCriterion("midrate <", value, "midrate");
            return (Criteria) this;
        }

        public Criteria andMidrateLessThanOrEqualTo(Double value) {
            addCriterion("midrate <=", value, "midrate");
            return (Criteria) this;
        }

        public Criteria andMidrateIn(List<Double> values) {
            addCriterion("midrate in", values, "midrate");
            return (Criteria) this;
        }

        public Criteria andMidrateNotIn(List<Double> values) {
            addCriterion("midrate not in", values, "midrate");
            return (Criteria) this;
        }

        public Criteria andMidrateBetween(Double value1, Double value2) {
            addCriterion("midrate between", value1, value2, "midrate");
            return (Criteria) this;
        }

        public Criteria andMidrateNotBetween(Double value1, Double value2) {
            addCriterion("midrate not between", value1, value2, "midrate");
            return (Criteria) this;
        }

        public Criteria andReldateIsNull() {
            addCriterion("reldate is null");
            return (Criteria) this;
        }

        public Criteria andReldateIsNotNull() {
            addCriterion("reldate is not null");
            return (Criteria) this;
        }

        public Criteria andReldateEqualTo(String value) {
            addCriterion("reldate =", value, "reldate");
            return (Criteria) this;
        }

        public Criteria andReldateNotEqualTo(String value) {
            addCriterion("reldate <>", value, "reldate");
            return (Criteria) this;
        }

        public Criteria andReldateGreaterThan(String value) {
            addCriterion("reldate >", value, "reldate");
            return (Criteria) this;
        }

        public Criteria andReldateGreaterThanOrEqualTo(String value) {
            addCriterion("reldate >=", value, "reldate");
            return (Criteria) this;
        }

        public Criteria andReldateLessThan(String value) {
            addCriterion("reldate <", value, "reldate");
            return (Criteria) this;
        }

        public Criteria andReldateLessThanOrEqualTo(String value) {
            addCriterion("reldate <=", value, "reldate");
            return (Criteria) this;
        }

        public Criteria andReldateLike(String value) {
            addCriterion("reldate like", value, "reldate");
            return (Criteria) this;
        }

        public Criteria andReldateNotLike(String value) {
            addCriterion("reldate not like", value, "reldate");
            return (Criteria) this;
        }

        public Criteria andReldateIn(List<String> values) {
            addCriterion("reldate in", values, "reldate");
            return (Criteria) this;
        }

        public Criteria andReldateNotIn(List<String> values) {
            addCriterion("reldate not in", values, "reldate");
            return (Criteria) this;
        }

        public Criteria andReldateBetween(String value1, String value2) {
            addCriterion("reldate between", value1, value2, "reldate");
            return (Criteria) this;
        }

        public Criteria andReldateNotBetween(String value1, String value2) {
            addCriterion("reldate not between", value1, value2, "reldate");
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