package com.czbank.integralservice.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompletionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompletionExample() {
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

        public Criteria andCompletionIdIsNull() {
            addCriterion("completion_id is null");
            return (Criteria) this;
        }

        public Criteria andCompletionIdIsNotNull() {
            addCriterion("completion_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompletionIdEqualTo(Long value) {
            addCriterion("completion_id =", value, "completionId");
            return (Criteria) this;
        }

        public Criteria andCompletionIdNotEqualTo(Long value) {
            addCriterion("completion_id <>", value, "completionId");
            return (Criteria) this;
        }

        public Criteria andCompletionIdGreaterThan(Long value) {
            addCriterion("completion_id >", value, "completionId");
            return (Criteria) this;
        }

        public Criteria andCompletionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("completion_id >=", value, "completionId");
            return (Criteria) this;
        }

        public Criteria andCompletionIdLessThan(Long value) {
            addCriterion("completion_id <", value, "completionId");
            return (Criteria) this;
        }

        public Criteria andCompletionIdLessThanOrEqualTo(Long value) {
            addCriterion("completion_id <=", value, "completionId");
            return (Criteria) this;
        }

        public Criteria andCompletionIdIn(List<Long> values) {
            addCriterion("completion_id in", values, "completionId");
            return (Criteria) this;
        }

        public Criteria andCompletionIdNotIn(List<Long> values) {
            addCriterion("completion_id not in", values, "completionId");
            return (Criteria) this;
        }

        public Criteria andCompletionIdBetween(Long value1, Long value2) {
            addCriterion("completion_id between", value1, value2, "completionId");
            return (Criteria) this;
        }

        public Criteria andCompletionIdNotBetween(Long value1, Long value2) {
            addCriterion("completion_id not between", value1, value2, "completionId");
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

        public Criteria andMissionIdIsNull() {
            addCriterion("mission_id is null");
            return (Criteria) this;
        }

        public Criteria andMissionIdIsNotNull() {
            addCriterion("mission_id is not null");
            return (Criteria) this;
        }

        public Criteria andMissionIdEqualTo(Long value) {
            addCriterion("mission_id =", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdNotEqualTo(Long value) {
            addCriterion("mission_id <>", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdGreaterThan(Long value) {
            addCriterion("mission_id >", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mission_id >=", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdLessThan(Long value) {
            addCriterion("mission_id <", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdLessThanOrEqualTo(Long value) {
            addCriterion("mission_id <=", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdIn(List<Long> values) {
            addCriterion("mission_id in", values, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdNotIn(List<Long> values) {
            addCriterion("mission_id not in", values, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdBetween(Long value1, Long value2) {
            addCriterion("mission_id between", value1, value2, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdNotBetween(Long value1, Long value2) {
            addCriterion("mission_id not between", value1, value2, "missionId");
            return (Criteria) this;
        }

        public Criteria andCompletionTimeIsNull() {
            addCriterion("completion_time is null");
            return (Criteria) this;
        }

        public Criteria andCompletionTimeIsNotNull() {
            addCriterion("completion_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompletionTimeEqualTo(Date value) {
            addCriterion("completion_time =", value, "completionTime");
            return (Criteria) this;
        }

        public Criteria andCompletionTimeNotEqualTo(Date value) {
            addCriterion("completion_time <>", value, "completionTime");
            return (Criteria) this;
        }

        public Criteria andCompletionTimeGreaterThan(Date value) {
            addCriterion("completion_time >", value, "completionTime");
            return (Criteria) this;
        }

        public Criteria andCompletionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("completion_time >=", value, "completionTime");
            return (Criteria) this;
        }

        public Criteria andCompletionTimeLessThan(Date value) {
            addCriterion("completion_time <", value, "completionTime");
            return (Criteria) this;
        }

        public Criteria andCompletionTimeLessThanOrEqualTo(Date value) {
            addCriterion("completion_time <=", value, "completionTime");
            return (Criteria) this;
        }

        public Criteria andCompletionTimeIn(List<Date> values) {
            addCriterion("completion_time in", values, "completionTime");
            return (Criteria) this;
        }

        public Criteria andCompletionTimeNotIn(List<Date> values) {
            addCriterion("completion_time not in", values, "completionTime");
            return (Criteria) this;
        }

        public Criteria andCompletionTimeBetween(Date value1, Date value2) {
            addCriterion("completion_time between", value1, value2, "completionTime");
            return (Criteria) this;
        }

        public Criteria andCompletionTimeNotBetween(Date value1, Date value2) {
            addCriterion("completion_time not between", value1, value2, "completionTime");
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