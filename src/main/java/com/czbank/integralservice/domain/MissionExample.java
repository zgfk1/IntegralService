package com.czbank.integralservice.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MissionExample() {
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

        public Criteria andMissionNameIsNull() {
            addCriterion("mission_name is null");
            return (Criteria) this;
        }

        public Criteria andMissionNameIsNotNull() {
            addCriterion("mission_name is not null");
            return (Criteria) this;
        }

        public Criteria andMissionNameEqualTo(String value) {
            addCriterion("mission_name =", value, "missionName");
            return (Criteria) this;
        }

        public Criteria andMissionNameNotEqualTo(String value) {
            addCriterion("mission_name <>", value, "missionName");
            return (Criteria) this;
        }

        public Criteria andMissionNameGreaterThan(String value) {
            addCriterion("mission_name >", value, "missionName");
            return (Criteria) this;
        }

        public Criteria andMissionNameGreaterThanOrEqualTo(String value) {
            addCriterion("mission_name >=", value, "missionName");
            return (Criteria) this;
        }

        public Criteria andMissionNameLessThan(String value) {
            addCriterion("mission_name <", value, "missionName");
            return (Criteria) this;
        }

        public Criteria andMissionNameLessThanOrEqualTo(String value) {
            addCriterion("mission_name <=", value, "missionName");
            return (Criteria) this;
        }

        public Criteria andMissionNameLike(String value) {
            addCriterion("mission_name like", value, "missionName");
            return (Criteria) this;
        }

        public Criteria andMissionNameNotLike(String value) {
            addCriterion("mission_name not like", value, "missionName");
            return (Criteria) this;
        }

        public Criteria andMissionNameIn(List<String> values) {
            addCriterion("mission_name in", values, "missionName");
            return (Criteria) this;
        }

        public Criteria andMissionNameNotIn(List<String> values) {
            addCriterion("mission_name not in", values, "missionName");
            return (Criteria) this;
        }

        public Criteria andMissionNameBetween(String value1, String value2) {
            addCriterion("mission_name between", value1, value2, "missionName");
            return (Criteria) this;
        }

        public Criteria andMissionNameNotBetween(String value1, String value2) {
            addCriterion("mission_name not between", value1, value2, "missionName");
            return (Criteria) this;
        }

        public Criteria andMissionIntroIsNull() {
            addCriterion("mission_intro is null");
            return (Criteria) this;
        }

        public Criteria andMissionIntroIsNotNull() {
            addCriterion("mission_intro is not null");
            return (Criteria) this;
        }

        public Criteria andMissionIntroEqualTo(String value) {
            addCriterion("mission_intro =", value, "missionIntro");
            return (Criteria) this;
        }

        public Criteria andMissionIntroNotEqualTo(String value) {
            addCriterion("mission_intro <>", value, "missionIntro");
            return (Criteria) this;
        }

        public Criteria andMissionIntroGreaterThan(String value) {
            addCriterion("mission_intro >", value, "missionIntro");
            return (Criteria) this;
        }

        public Criteria andMissionIntroGreaterThanOrEqualTo(String value) {
            addCriterion("mission_intro >=", value, "missionIntro");
            return (Criteria) this;
        }

        public Criteria andMissionIntroLessThan(String value) {
            addCriterion("mission_intro <", value, "missionIntro");
            return (Criteria) this;
        }

        public Criteria andMissionIntroLessThanOrEqualTo(String value) {
            addCriterion("mission_intro <=", value, "missionIntro");
            return (Criteria) this;
        }

        public Criteria andMissionIntroLike(String value) {
            addCriterion("mission_intro like", value, "missionIntro");
            return (Criteria) this;
        }

        public Criteria andMissionIntroNotLike(String value) {
            addCriterion("mission_intro not like", value, "missionIntro");
            return (Criteria) this;
        }

        public Criteria andMissionIntroIn(List<String> values) {
            addCriterion("mission_intro in", values, "missionIntro");
            return (Criteria) this;
        }

        public Criteria andMissionIntroNotIn(List<String> values) {
            addCriterion("mission_intro not in", values, "missionIntro");
            return (Criteria) this;
        }

        public Criteria andMissionIntroBetween(String value1, String value2) {
            addCriterion("mission_intro between", value1, value2, "missionIntro");
            return (Criteria) this;
        }

        public Criteria andMissionIntroNotBetween(String value1, String value2) {
            addCriterion("mission_intro not between", value1, value2, "missionIntro");
            return (Criteria) this;
        }

        public Criteria andMissionIntergralIsNull() {
            addCriterion("mission_intergral is null");
            return (Criteria) this;
        }

        public Criteria andMissionIntergralIsNotNull() {
            addCriterion("mission_intergral is not null");
            return (Criteria) this;
        }

        public Criteria andMissionIntergralEqualTo(Integer value) {
            addCriterion("mission_intergral =", value, "missionIntergral");
            return (Criteria) this;
        }

        public Criteria andMissionIntergralNotEqualTo(Integer value) {
            addCriterion("mission_intergral <>", value, "missionIntergral");
            return (Criteria) this;
        }

        public Criteria andMissionIntergralGreaterThan(Integer value) {
            addCriterion("mission_intergral >", value, "missionIntergral");
            return (Criteria) this;
        }

        public Criteria andMissionIntergralGreaterThanOrEqualTo(Integer value) {
            addCriterion("mission_intergral >=", value, "missionIntergral");
            return (Criteria) this;
        }

        public Criteria andMissionIntergralLessThan(Integer value) {
            addCriterion("mission_intergral <", value, "missionIntergral");
            return (Criteria) this;
        }

        public Criteria andMissionIntergralLessThanOrEqualTo(Integer value) {
            addCriterion("mission_intergral <=", value, "missionIntergral");
            return (Criteria) this;
        }

        public Criteria andMissionIntergralIn(List<Integer> values) {
            addCriterion("mission_intergral in", values, "missionIntergral");
            return (Criteria) this;
        }

        public Criteria andMissionIntergralNotIn(List<Integer> values) {
            addCriterion("mission_intergral not in", values, "missionIntergral");
            return (Criteria) this;
        }

        public Criteria andMissionIntergralBetween(Integer value1, Integer value2) {
            addCriterion("mission_intergral between", value1, value2, "missionIntergral");
            return (Criteria) this;
        }

        public Criteria andMissionIntergralNotBetween(Integer value1, Integer value2) {
            addCriterion("mission_intergral not between", value1, value2, "missionIntergral");
            return (Criteria) this;
        }

        public Criteria andMissionPathIsNull() {
            addCriterion("mission_path is null");
            return (Criteria) this;
        }

        public Criteria andMissionPathIsNotNull() {
            addCriterion("mission_path is not null");
            return (Criteria) this;
        }

        public Criteria andMissionPathEqualTo(String value) {
            addCriterion("mission_path =", value, "missionPath");
            return (Criteria) this;
        }

        public Criteria andMissionPathNotEqualTo(String value) {
            addCriterion("mission_path <>", value, "missionPath");
            return (Criteria) this;
        }

        public Criteria andMissionPathGreaterThan(String value) {
            addCriterion("mission_path >", value, "missionPath");
            return (Criteria) this;
        }

        public Criteria andMissionPathGreaterThanOrEqualTo(String value) {
            addCriterion("mission_path >=", value, "missionPath");
            return (Criteria) this;
        }

        public Criteria andMissionPathLessThan(String value) {
            addCriterion("mission_path <", value, "missionPath");
            return (Criteria) this;
        }

        public Criteria andMissionPathLessThanOrEqualTo(String value) {
            addCriterion("mission_path <=", value, "missionPath");
            return (Criteria) this;
        }

        public Criteria andMissionPathLike(String value) {
            addCriterion("mission_path like", value, "missionPath");
            return (Criteria) this;
        }

        public Criteria andMissionPathNotLike(String value) {
            addCriterion("mission_path not like", value, "missionPath");
            return (Criteria) this;
        }

        public Criteria andMissionPathIn(List<String> values) {
            addCriterion("mission_path in", values, "missionPath");
            return (Criteria) this;
        }

        public Criteria andMissionPathNotIn(List<String> values) {
            addCriterion("mission_path not in", values, "missionPath");
            return (Criteria) this;
        }

        public Criteria andMissionPathBetween(String value1, String value2) {
            addCriterion("mission_path between", value1, value2, "missionPath");
            return (Criteria) this;
        }

        public Criteria andMissionPathNotBetween(String value1, String value2) {
            addCriterion("mission_path not between", value1, value2, "missionPath");
            return (Criteria) this;
        }

        public Criteria andMissionStarttimeIsNull() {
            addCriterion("mission_starttime is null");
            return (Criteria) this;
        }

        public Criteria andMissionStarttimeIsNotNull() {
            addCriterion("mission_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andMissionStarttimeEqualTo(Date value) {
            addCriterion("mission_starttime =", value, "missionStarttime");
            return (Criteria) this;
        }

        public Criteria andMissionStarttimeNotEqualTo(Date value) {
            addCriterion("mission_starttime <>", value, "missionStarttime");
            return (Criteria) this;
        }

        public Criteria andMissionStarttimeGreaterThan(Date value) {
            addCriterion("mission_starttime >", value, "missionStarttime");
            return (Criteria) this;
        }

        public Criteria andMissionStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mission_starttime >=", value, "missionStarttime");
            return (Criteria) this;
        }

        public Criteria andMissionStarttimeLessThan(Date value) {
            addCriterion("mission_starttime <", value, "missionStarttime");
            return (Criteria) this;
        }

        public Criteria andMissionStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("mission_starttime <=", value, "missionStarttime");
            return (Criteria) this;
        }

        public Criteria andMissionStarttimeIn(List<Date> values) {
            addCriterion("mission_starttime in", values, "missionStarttime");
            return (Criteria) this;
        }

        public Criteria andMissionStarttimeNotIn(List<Date> values) {
            addCriterion("mission_starttime not in", values, "missionStarttime");
            return (Criteria) this;
        }

        public Criteria andMissionStarttimeBetween(Date value1, Date value2) {
            addCriterion("mission_starttime between", value1, value2, "missionStarttime");
            return (Criteria) this;
        }

        public Criteria andMissionStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("mission_starttime not between", value1, value2, "missionStarttime");
            return (Criteria) this;
        }

        public Criteria andMissionEndtimeIsNull() {
            addCriterion("mission_endtime is null");
            return (Criteria) this;
        }

        public Criteria andMissionEndtimeIsNotNull() {
            addCriterion("mission_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andMissionEndtimeEqualTo(Date value) {
            addCriterion("mission_endtime =", value, "missionEndtime");
            return (Criteria) this;
        }

        public Criteria andMissionEndtimeNotEqualTo(Date value) {
            addCriterion("mission_endtime <>", value, "missionEndtime");
            return (Criteria) this;
        }

        public Criteria andMissionEndtimeGreaterThan(Date value) {
            addCriterion("mission_endtime >", value, "missionEndtime");
            return (Criteria) this;
        }

        public Criteria andMissionEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mission_endtime >=", value, "missionEndtime");
            return (Criteria) this;
        }

        public Criteria andMissionEndtimeLessThan(Date value) {
            addCriterion("mission_endtime <", value, "missionEndtime");
            return (Criteria) this;
        }

        public Criteria andMissionEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("mission_endtime <=", value, "missionEndtime");
            return (Criteria) this;
        }

        public Criteria andMissionEndtimeIn(List<Date> values) {
            addCriterion("mission_endtime in", values, "missionEndtime");
            return (Criteria) this;
        }

        public Criteria andMissionEndtimeNotIn(List<Date> values) {
            addCriterion("mission_endtime not in", values, "missionEndtime");
            return (Criteria) this;
        }

        public Criteria andMissionEndtimeBetween(Date value1, Date value2) {
            addCriterion("mission_endtime between", value1, value2, "missionEndtime");
            return (Criteria) this;
        }

        public Criteria andMissionEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("mission_endtime not between", value1, value2, "missionEndtime");
            return (Criteria) this;
        }

        public Criteria andMissionIsvalidIsNull() {
            addCriterion("mission_isvalid is null");
            return (Criteria) this;
        }

        public Criteria andMissionIsvalidIsNotNull() {
            addCriterion("mission_isvalid is not null");
            return (Criteria) this;
        }

        public Criteria andMissionIsvalidEqualTo(Boolean value) {
            addCriterion("mission_isvalid =", value, "missionIsvalid");
            return (Criteria) this;
        }

        public Criteria andMissionIsvalidNotEqualTo(Boolean value) {
            addCriterion("mission_isvalid <>", value, "missionIsvalid");
            return (Criteria) this;
        }

        public Criteria andMissionIsvalidGreaterThan(Boolean value) {
            addCriterion("mission_isvalid >", value, "missionIsvalid");
            return (Criteria) this;
        }

        public Criteria andMissionIsvalidGreaterThanOrEqualTo(Boolean value) {
            addCriterion("mission_isvalid >=", value, "missionIsvalid");
            return (Criteria) this;
        }

        public Criteria andMissionIsvalidLessThan(Boolean value) {
            addCriterion("mission_isvalid <", value, "missionIsvalid");
            return (Criteria) this;
        }

        public Criteria andMissionIsvalidLessThanOrEqualTo(Boolean value) {
            addCriterion("mission_isvalid <=", value, "missionIsvalid");
            return (Criteria) this;
        }

        public Criteria andMissionIsvalidIn(List<Boolean> values) {
            addCriterion("mission_isvalid in", values, "missionIsvalid");
            return (Criteria) this;
        }

        public Criteria andMissionIsvalidNotIn(List<Boolean> values) {
            addCriterion("mission_isvalid not in", values, "missionIsvalid");
            return (Criteria) this;
        }

        public Criteria andMissionIsvalidBetween(Boolean value1, Boolean value2) {
            addCriterion("mission_isvalid between", value1, value2, "missionIsvalid");
            return (Criteria) this;
        }

        public Criteria andMissionIsvalidNotBetween(Boolean value1, Boolean value2) {
            addCriterion("mission_isvalid not between", value1, value2, "missionIsvalid");
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