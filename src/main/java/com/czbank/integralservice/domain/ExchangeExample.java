package com.czbank.integralservice.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExchangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExchangeExample() {
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

        public Criteria andExchangeIdIsNull() {
            addCriterion("exchange_id is null");
            return (Criteria) this;
        }

        public Criteria andExchangeIdIsNotNull() {
            addCriterion("exchange_id is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeIdEqualTo(Long value) {
            addCriterion("exchange_id =", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdNotEqualTo(Long value) {
            addCriterion("exchange_id <>", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdGreaterThan(Long value) {
            addCriterion("exchange_id >", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("exchange_id >=", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdLessThan(Long value) {
            addCriterion("exchange_id <", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdLessThanOrEqualTo(Long value) {
            addCriterion("exchange_id <=", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdIn(List<Long> values) {
            addCriterion("exchange_id in", values, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdNotIn(List<Long> values) {
            addCriterion("exchange_id not in", values, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdBetween(Long value1, Long value2) {
            addCriterion("exchange_id between", value1, value2, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdNotBetween(Long value1, Long value2) {
            addCriterion("exchange_id not between", value1, value2, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
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

        public Criteria andExchangeQuantityIsNull() {
            addCriterion("exchange_quantity is null");
            return (Criteria) this;
        }

        public Criteria andExchangeQuantityIsNotNull() {
            addCriterion("exchange_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeQuantityEqualTo(Integer value) {
            addCriterion("exchange_quantity =", value, "exchangeQuantity");
            return (Criteria) this;
        }

        public Criteria andExchangeQuantityNotEqualTo(Integer value) {
            addCriterion("exchange_quantity <>", value, "exchangeQuantity");
            return (Criteria) this;
        }

        public Criteria andExchangeQuantityGreaterThan(Integer value) {
            addCriterion("exchange_quantity >", value, "exchangeQuantity");
            return (Criteria) this;
        }

        public Criteria andExchangeQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("exchange_quantity >=", value, "exchangeQuantity");
            return (Criteria) this;
        }

        public Criteria andExchangeQuantityLessThan(Integer value) {
            addCriterion("exchange_quantity <", value, "exchangeQuantity");
            return (Criteria) this;
        }

        public Criteria andExchangeQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("exchange_quantity <=", value, "exchangeQuantity");
            return (Criteria) this;
        }

        public Criteria andExchangeQuantityIn(List<Integer> values) {
            addCriterion("exchange_quantity in", values, "exchangeQuantity");
            return (Criteria) this;
        }

        public Criteria andExchangeQuantityNotIn(List<Integer> values) {
            addCriterion("exchange_quantity not in", values, "exchangeQuantity");
            return (Criteria) this;
        }

        public Criteria andExchangeQuantityBetween(Integer value1, Integer value2) {
            addCriterion("exchange_quantity between", value1, value2, "exchangeQuantity");
            return (Criteria) this;
        }

        public Criteria andExchangeQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("exchange_quantity not between", value1, value2, "exchangeQuantity");
            return (Criteria) this;
        }

        public Criteria andExchangeTimeIsNull() {
            addCriterion("exchange_time is null");
            return (Criteria) this;
        }

        public Criteria andExchangeTimeIsNotNull() {
            addCriterion("exchange_time is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeTimeEqualTo(Date value) {
            addCriterion("exchange_time =", value, "exchangeTime");
            return (Criteria) this;
        }

        public Criteria andExchangeTimeNotEqualTo(Date value) {
            addCriterion("exchange_time <>", value, "exchangeTime");
            return (Criteria) this;
        }

        public Criteria andExchangeTimeGreaterThan(Date value) {
            addCriterion("exchange_time >", value, "exchangeTime");
            return (Criteria) this;
        }

        public Criteria andExchangeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exchange_time >=", value, "exchangeTime");
            return (Criteria) this;
        }

        public Criteria andExchangeTimeLessThan(Date value) {
            addCriterion("exchange_time <", value, "exchangeTime");
            return (Criteria) this;
        }

        public Criteria andExchangeTimeLessThanOrEqualTo(Date value) {
            addCriterion("exchange_time <=", value, "exchangeTime");
            return (Criteria) this;
        }

        public Criteria andExchangeTimeIn(List<Date> values) {
            addCriterion("exchange_time in", values, "exchangeTime");
            return (Criteria) this;
        }

        public Criteria andExchangeTimeNotIn(List<Date> values) {
            addCriterion("exchange_time not in", values, "exchangeTime");
            return (Criteria) this;
        }

        public Criteria andExchangeTimeBetween(Date value1, Date value2) {
            addCriterion("exchange_time between", value1, value2, "exchangeTime");
            return (Criteria) this;
        }

        public Criteria andExchangeTimeNotBetween(Date value1, Date value2) {
            addCriterion("exchange_time not between", value1, value2, "exchangeTime");
            return (Criteria) this;
        }

        public Criteria andAmountbeforeIsNull() {
            addCriterion("amountbefore is null");
            return (Criteria) this;
        }

        public Criteria andAmountbeforeIsNotNull() {
            addCriterion("amountbefore is not null");
            return (Criteria) this;
        }

        public Criteria andAmountbeforeEqualTo(Integer value) {
            addCriterion("amountbefore =", value, "amountbefore");
            return (Criteria) this;
        }

        public Criteria andAmountbeforeNotEqualTo(Integer value) {
            addCriterion("amountbefore <>", value, "amountbefore");
            return (Criteria) this;
        }

        public Criteria andAmountbeforeGreaterThan(Integer value) {
            addCriterion("amountbefore >", value, "amountbefore");
            return (Criteria) this;
        }

        public Criteria andAmountbeforeGreaterThanOrEqualTo(Integer value) {
            addCriterion("amountbefore >=", value, "amountbefore");
            return (Criteria) this;
        }

        public Criteria andAmountbeforeLessThan(Integer value) {
            addCriterion("amountbefore <", value, "amountbefore");
            return (Criteria) this;
        }

        public Criteria andAmountbeforeLessThanOrEqualTo(Integer value) {
            addCriterion("amountbefore <=", value, "amountbefore");
            return (Criteria) this;
        }

        public Criteria andAmountbeforeIn(List<Integer> values) {
            addCriterion("amountbefore in", values, "amountbefore");
            return (Criteria) this;
        }

        public Criteria andAmountbeforeNotIn(List<Integer> values) {
            addCriterion("amountbefore not in", values, "amountbefore");
            return (Criteria) this;
        }

        public Criteria andAmountbeforeBetween(Integer value1, Integer value2) {
            addCriterion("amountbefore between", value1, value2, "amountbefore");
            return (Criteria) this;
        }

        public Criteria andAmountbeforeNotBetween(Integer value1, Integer value2) {
            addCriterion("amountbefore not between", value1, value2, "amountbefore");
            return (Criteria) this;
        }

        public Criteria andAmountafterIsNull() {
            addCriterion("amountafter is null");
            return (Criteria) this;
        }

        public Criteria andAmountafterIsNotNull() {
            addCriterion("amountafter is not null");
            return (Criteria) this;
        }

        public Criteria andAmountafterEqualTo(Integer value) {
            addCriterion("amountafter =", value, "amountafter");
            return (Criteria) this;
        }

        public Criteria andAmountafterNotEqualTo(Integer value) {
            addCriterion("amountafter <>", value, "amountafter");
            return (Criteria) this;
        }

        public Criteria andAmountafterGreaterThan(Integer value) {
            addCriterion("amountafter >", value, "amountafter");
            return (Criteria) this;
        }

        public Criteria andAmountafterGreaterThanOrEqualTo(Integer value) {
            addCriterion("amountafter >=", value, "amountafter");
            return (Criteria) this;
        }

        public Criteria andAmountafterLessThan(Integer value) {
            addCriterion("amountafter <", value, "amountafter");
            return (Criteria) this;
        }

        public Criteria andAmountafterLessThanOrEqualTo(Integer value) {
            addCriterion("amountafter <=", value, "amountafter");
            return (Criteria) this;
        }

        public Criteria andAmountafterIn(List<Integer> values) {
            addCriterion("amountafter in", values, "amountafter");
            return (Criteria) this;
        }

        public Criteria andAmountafterNotIn(List<Integer> values) {
            addCriterion("amountafter not in", values, "amountafter");
            return (Criteria) this;
        }

        public Criteria andAmountafterBetween(Integer value1, Integer value2) {
            addCriterion("amountafter between", value1, value2, "amountafter");
            return (Criteria) this;
        }

        public Criteria andAmountafterNotBetween(Integer value1, Integer value2) {
            addCriterion("amountafter not between", value1, value2, "amountafter");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIsNull() {
            addCriterion("\"delivery address\" is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIsNotNull() {
            addCriterion("\"delivery address\" is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressEqualTo(String value) {
            addCriterion("\"delivery address\" =", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotEqualTo(String value) {
            addCriterion("\"delivery address\" <>", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressGreaterThan(String value) {
            addCriterion("\"delivery address\" >", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressGreaterThanOrEqualTo(String value) {
            addCriterion("\"delivery address\" >=", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressLessThan(String value) {
            addCriterion("\"delivery address\" <", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressLessThanOrEqualTo(String value) {
            addCriterion("\"delivery address\" <=", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressLike(String value) {
            addCriterion("\"delivery address\" like", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotLike(String value) {
            addCriterion("\"delivery address\" not like", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIn(List<String> values) {
            addCriterion("\"delivery address\" in", values, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotIn(List<String> values) {
            addCriterion("\"delivery address\" not in", values, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressBetween(String value1, String value2) {
            addCriterion("\"delivery address\" between", value1, value2, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotBetween(String value1, String value2) {
            addCriterion("\"delivery address\" not between", value1, value2, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andUserContactIsNull() {
            addCriterion("user_contact is null");
            return (Criteria) this;
        }

        public Criteria andUserContactIsNotNull() {
            addCriterion("user_contact is not null");
            return (Criteria) this;
        }

        public Criteria andUserContactEqualTo(String value) {
            addCriterion("user_contact =", value, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactNotEqualTo(String value) {
            addCriterion("user_contact <>", value, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactGreaterThan(String value) {
            addCriterion("user_contact >", value, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactGreaterThanOrEqualTo(String value) {
            addCriterion("user_contact >=", value, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactLessThan(String value) {
            addCriterion("user_contact <", value, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactLessThanOrEqualTo(String value) {
            addCriterion("user_contact <=", value, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactLike(String value) {
            addCriterion("user_contact like", value, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactNotLike(String value) {
            addCriterion("user_contact not like", value, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactIn(List<String> values) {
            addCriterion("user_contact in", values, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactNotIn(List<String> values) {
            addCriterion("user_contact not in", values, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactBetween(String value1, String value2) {
            addCriterion("user_contact between", value1, value2, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactNotBetween(String value1, String value2) {
            addCriterion("user_contact not between", value1, value2, "userContact");
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