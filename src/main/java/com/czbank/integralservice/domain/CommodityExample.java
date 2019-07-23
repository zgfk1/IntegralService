package com.czbank.integralservice.domain;

import java.util.ArrayList;
import java.util.List;

public class CommodityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommodityExample() {
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

        public Criteria andCommodityIdIsNull() {
            addCriterion("commodity_id is null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIsNotNull() {
            addCriterion("commodity_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdEqualTo(Long value) {
            addCriterion("commodity_id =", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotEqualTo(Long value) {
            addCriterion("commodity_id <>", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThan(Long value) {
            addCriterion("commodity_id >", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("commodity_id >=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThan(Long value) {
            addCriterion("commodity_id <", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThanOrEqualTo(Long value) {
            addCriterion("commodity_id <=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIn(List<Long> values) {
            addCriterion("commodity_id in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotIn(List<Long> values) {
            addCriterion("commodity_id not in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdBetween(Long value1, Long value2) {
            addCriterion("commodity_id between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotBetween(Long value1, Long value2) {
            addCriterion("commodity_id not between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNull() {
            addCriterion("commodity_name is null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNotNull() {
            addCriterion("commodity_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameEqualTo(String value) {
            addCriterion("commodity_name =", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotEqualTo(String value) {
            addCriterion("commodity_name <>", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThan(String value) {
            addCriterion("commodity_name >", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_name >=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThan(String value) {
            addCriterion("commodity_name <", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThanOrEqualTo(String value) {
            addCriterion("commodity_name <=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLike(String value) {
            addCriterion("commodity_name like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotLike(String value) {
            addCriterion("commodity_name not like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIn(List<String> values) {
            addCriterion("commodity_name in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotIn(List<String> values) {
            addCriterion("commodity_name not in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameBetween(String value1, String value2) {
            addCriterion("commodity_name between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotBetween(String value1, String value2) {
            addCriterion("commodity_name not between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityIntegralIsNull() {
            addCriterion("commodity_integral is null");
            return (Criteria) this;
        }

        public Criteria andCommodityIntegralIsNotNull() {
            addCriterion("commodity_integral is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityIntegralEqualTo(Integer value) {
            addCriterion("commodity_integral =", value, "commodityIntegral");
            return (Criteria) this;
        }

        public Criteria andCommodityIntegralNotEqualTo(Integer value) {
            addCriterion("commodity_integral <>", value, "commodityIntegral");
            return (Criteria) this;
        }

        public Criteria andCommodityIntegralGreaterThan(Integer value) {
            addCriterion("commodity_integral >", value, "commodityIntegral");
            return (Criteria) this;
        }

        public Criteria andCommodityIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_integral >=", value, "commodityIntegral");
            return (Criteria) this;
        }

        public Criteria andCommodityIntegralLessThan(Integer value) {
            addCriterion("commodity_integral <", value, "commodityIntegral");
            return (Criteria) this;
        }

        public Criteria andCommodityIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_integral <=", value, "commodityIntegral");
            return (Criteria) this;
        }

        public Criteria andCommodityIntegralIn(List<Integer> values) {
            addCriterion("commodity_integral in", values, "commodityIntegral");
            return (Criteria) this;
        }

        public Criteria andCommodityIntegralNotIn(List<Integer> values) {
            addCriterion("commodity_integral not in", values, "commodityIntegral");
            return (Criteria) this;
        }

        public Criteria andCommodityIntegralBetween(Integer value1, Integer value2) {
            addCriterion("commodity_integral between", value1, value2, "commodityIntegral");
            return (Criteria) this;
        }

        public Criteria andCommodityIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_integral not between", value1, value2, "commodityIntegral");
            return (Criteria) this;
        }

        public Criteria andCommodityAmountIsNull() {
            addCriterion("commodity_amount is null");
            return (Criteria) this;
        }

        public Criteria andCommodityAmountIsNotNull() {
            addCriterion("commodity_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityAmountEqualTo(Integer value) {
            addCriterion("commodity_amount =", value, "commodityAmount");
            return (Criteria) this;
        }

        public Criteria andCommodityAmountNotEqualTo(Integer value) {
            addCriterion("commodity_amount <>", value, "commodityAmount");
            return (Criteria) this;
        }

        public Criteria andCommodityAmountGreaterThan(Integer value) {
            addCriterion("commodity_amount >", value, "commodityAmount");
            return (Criteria) this;
        }

        public Criteria andCommodityAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_amount >=", value, "commodityAmount");
            return (Criteria) this;
        }

        public Criteria andCommodityAmountLessThan(Integer value) {
            addCriterion("commodity_amount <", value, "commodityAmount");
            return (Criteria) this;
        }

        public Criteria andCommodityAmountLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_amount <=", value, "commodityAmount");
            return (Criteria) this;
        }

        public Criteria andCommodityAmountIn(List<Integer> values) {
            addCriterion("commodity_amount in", values, "commodityAmount");
            return (Criteria) this;
        }

        public Criteria andCommodityAmountNotIn(List<Integer> values) {
            addCriterion("commodity_amount not in", values, "commodityAmount");
            return (Criteria) this;
        }

        public Criteria andCommodityAmountBetween(Integer value1, Integer value2) {
            addCriterion("commodity_amount between", value1, value2, "commodityAmount");
            return (Criteria) this;
        }

        public Criteria andCommodityAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_amount not between", value1, value2, "commodityAmount");
            return (Criteria) this;
        }

        public Criteria andCommodityExchangenumIsNull() {
            addCriterion("commodity_exchangenum is null");
            return (Criteria) this;
        }

        public Criteria andCommodityExchangenumIsNotNull() {
            addCriterion("commodity_exchangenum is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityExchangenumEqualTo(Integer value) {
            addCriterion("commodity_exchangenum =", value, "commodityExchangenum");
            return (Criteria) this;
        }

        public Criteria andCommodityExchangenumNotEqualTo(Integer value) {
            addCriterion("commodity_exchangenum <>", value, "commodityExchangenum");
            return (Criteria) this;
        }

        public Criteria andCommodityExchangenumGreaterThan(Integer value) {
            addCriterion("commodity_exchangenum >", value, "commodityExchangenum");
            return (Criteria) this;
        }

        public Criteria andCommodityExchangenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_exchangenum >=", value, "commodityExchangenum");
            return (Criteria) this;
        }

        public Criteria andCommodityExchangenumLessThan(Integer value) {
            addCriterion("commodity_exchangenum <", value, "commodityExchangenum");
            return (Criteria) this;
        }

        public Criteria andCommodityExchangenumLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_exchangenum <=", value, "commodityExchangenum");
            return (Criteria) this;
        }

        public Criteria andCommodityExchangenumIn(List<Integer> values) {
            addCriterion("commodity_exchangenum in", values, "commodityExchangenum");
            return (Criteria) this;
        }

        public Criteria andCommodityExchangenumNotIn(List<Integer> values) {
            addCriterion("commodity_exchangenum not in", values, "commodityExchangenum");
            return (Criteria) this;
        }

        public Criteria andCommodityExchangenumBetween(Integer value1, Integer value2) {
            addCriterion("commodity_exchangenum between", value1, value2, "commodityExchangenum");
            return (Criteria) this;
        }

        public Criteria andCommodityExchangenumNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_exchangenum not between", value1, value2, "commodityExchangenum");
            return (Criteria) this;
        }

        public Criteria andCommodityAvailablenumIsNull() {
            addCriterion("commodity_availablenum is null");
            return (Criteria) this;
        }

        public Criteria andCommodityAvailablenumIsNotNull() {
            addCriterion("commodity_availablenum is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityAvailablenumEqualTo(Integer value) {
            addCriterion("commodity_availablenum =", value, "commodityAvailablenum");
            return (Criteria) this;
        }

        public Criteria andCommodityAvailablenumNotEqualTo(Integer value) {
            addCriterion("commodity_availablenum <>", value, "commodityAvailablenum");
            return (Criteria) this;
        }

        public Criteria andCommodityAvailablenumGreaterThan(Integer value) {
            addCriterion("commodity_availablenum >", value, "commodityAvailablenum");
            return (Criteria) this;
        }

        public Criteria andCommodityAvailablenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_availablenum >=", value, "commodityAvailablenum");
            return (Criteria) this;
        }

        public Criteria andCommodityAvailablenumLessThan(Integer value) {
            addCriterion("commodity_availablenum <", value, "commodityAvailablenum");
            return (Criteria) this;
        }

        public Criteria andCommodityAvailablenumLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_availablenum <=", value, "commodityAvailablenum");
            return (Criteria) this;
        }

        public Criteria andCommodityAvailablenumIn(List<Integer> values) {
            addCriterion("commodity_availablenum in", values, "commodityAvailablenum");
            return (Criteria) this;
        }

        public Criteria andCommodityAvailablenumNotIn(List<Integer> values) {
            addCriterion("commodity_availablenum not in", values, "commodityAvailablenum");
            return (Criteria) this;
        }

        public Criteria andCommodityAvailablenumBetween(Integer value1, Integer value2) {
            addCriterion("commodity_availablenum between", value1, value2, "commodityAvailablenum");
            return (Criteria) this;
        }

        public Criteria andCommodityAvailablenumNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_availablenum not between", value1, value2, "commodityAvailablenum");
            return (Criteria) this;
        }

        public Criteria andCommodityIntroIsNull() {
            addCriterion("commodity_intro is null");
            return (Criteria) this;
        }

        public Criteria andCommodityIntroIsNotNull() {
            addCriterion("commodity_intro is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityIntroEqualTo(String value) {
            addCriterion("commodity_intro =", value, "commodityIntro");
            return (Criteria) this;
        }

        public Criteria andCommodityIntroNotEqualTo(String value) {
            addCriterion("commodity_intro <>", value, "commodityIntro");
            return (Criteria) this;
        }

        public Criteria andCommodityIntroGreaterThan(String value) {
            addCriterion("commodity_intro >", value, "commodityIntro");
            return (Criteria) this;
        }

        public Criteria andCommodityIntroGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_intro >=", value, "commodityIntro");
            return (Criteria) this;
        }

        public Criteria andCommodityIntroLessThan(String value) {
            addCriterion("commodity_intro <", value, "commodityIntro");
            return (Criteria) this;
        }

        public Criteria andCommodityIntroLessThanOrEqualTo(String value) {
            addCriterion("commodity_intro <=", value, "commodityIntro");
            return (Criteria) this;
        }

        public Criteria andCommodityIntroLike(String value) {
            addCriterion("commodity_intro like", value, "commodityIntro");
            return (Criteria) this;
        }

        public Criteria andCommodityIntroNotLike(String value) {
            addCriterion("commodity_intro not like", value, "commodityIntro");
            return (Criteria) this;
        }

        public Criteria andCommodityIntroIn(List<String> values) {
            addCriterion("commodity_intro in", values, "commodityIntro");
            return (Criteria) this;
        }

        public Criteria andCommodityIntroNotIn(List<String> values) {
            addCriterion("commodity_intro not in", values, "commodityIntro");
            return (Criteria) this;
        }

        public Criteria andCommodityIntroBetween(String value1, String value2) {
            addCriterion("commodity_intro between", value1, value2, "commodityIntro");
            return (Criteria) this;
        }

        public Criteria andCommodityIntroNotBetween(String value1, String value2) {
            addCriterion("commodity_intro not between", value1, value2, "commodityIntro");
            return (Criteria) this;
        }

        public Criteria andCommodityPictureIsNull() {
            addCriterion("commodity_picture is null");
            return (Criteria) this;
        }

        public Criteria andCommodityPictureIsNotNull() {
            addCriterion("commodity_picture is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityPictureEqualTo(String value) {
            addCriterion("commodity_picture =", value, "commodityPicture");
            return (Criteria) this;
        }

        public Criteria andCommodityPictureNotEqualTo(String value) {
            addCriterion("commodity_picture <>", value, "commodityPicture");
            return (Criteria) this;
        }

        public Criteria andCommodityPictureGreaterThan(String value) {
            addCriterion("commodity_picture >", value, "commodityPicture");
            return (Criteria) this;
        }

        public Criteria andCommodityPictureGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_picture >=", value, "commodityPicture");
            return (Criteria) this;
        }

        public Criteria andCommodityPictureLessThan(String value) {
            addCriterion("commodity_picture <", value, "commodityPicture");
            return (Criteria) this;
        }

        public Criteria andCommodityPictureLessThanOrEqualTo(String value) {
            addCriterion("commodity_picture <=", value, "commodityPicture");
            return (Criteria) this;
        }

        public Criteria andCommodityPictureLike(String value) {
            addCriterion("commodity_picture like", value, "commodityPicture");
            return (Criteria) this;
        }

        public Criteria andCommodityPictureNotLike(String value) {
            addCriterion("commodity_picture not like", value, "commodityPicture");
            return (Criteria) this;
        }

        public Criteria andCommodityPictureIn(List<String> values) {
            addCriterion("commodity_picture in", values, "commodityPicture");
            return (Criteria) this;
        }

        public Criteria andCommodityPictureNotIn(List<String> values) {
            addCriterion("commodity_picture not in", values, "commodityPicture");
            return (Criteria) this;
        }

        public Criteria andCommodityPictureBetween(String value1, String value2) {
            addCriterion("commodity_picture between", value1, value2, "commodityPicture");
            return (Criteria) this;
        }

        public Criteria andCommodityPictureNotBetween(String value1, String value2) {
            addCriterion("commodity_picture not between", value1, value2, "commodityPicture");
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