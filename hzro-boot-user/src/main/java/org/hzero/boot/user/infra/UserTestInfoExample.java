package org.hzero.boot.user.infra;

import java.util.ArrayList;
import java.util.List;

public class UserTestInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserTestInfoExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUser_nameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUser_nameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUser_nameEqualTo(String value) {
            addCriterion("user_name =", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameGreaterThan(String value) {
            addCriterion("user_name >", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLessThan(String value) {
            addCriterion("user_name <", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLike(String value) {
            addCriterion("user_name like", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotLike(String value) {
            addCriterion("user_name not like", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameIn(List<String> values) {
            addCriterion("user_name in", values, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_sexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUser_sexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUser_sexEqualTo(String value) {
            addCriterion("user_sex =", value, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_sexNotEqualTo(String value) {
            addCriterion("user_sex <>", value, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_sexGreaterThan(String value) {
            addCriterion("user_sex >", value, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_sexGreaterThanOrEqualTo(String value) {
            addCriterion("user_sex >=", value, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_sexLessThan(String value) {
            addCriterion("user_sex <", value, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_sexLessThanOrEqualTo(String value) {
            addCriterion("user_sex <=", value, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_sexLike(String value) {
            addCriterion("user_sex like", value, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_sexNotLike(String value) {
            addCriterion("user_sex not like", value, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_sexIn(List<String> values) {
            addCriterion("user_sex in", values, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_sexNotIn(List<String> values) {
            addCriterion("user_sex not in", values, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_sexBetween(String value1, String value2) {
            addCriterion("user_sex between", value1, value2, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_sexNotBetween(String value1, String value2) {
            addCriterion("user_sex not between", value1, value2, "user_sex");
            return (Criteria) this;
        }

        public Criteria andUser_phoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUser_phoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUser_phoneEqualTo(String value) {
            addCriterion("user_phone =", value, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneLessThan(String value) {
            addCriterion("user_phone <", value, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneLike(String value) {
            addCriterion("user_phone like", value, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneNotLike(String value) {
            addCriterion("user_phone not like", value, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneIn(List<String> values) {
            addCriterion("user_phone in", values, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_phoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "user_phone");
            return (Criteria) this;
        }

        public Criteria andUser_ageIsNull() {
            addCriterion("user_age is null");
            return (Criteria) this;
        }

        public Criteria andUser_ageIsNotNull() {
            addCriterion("user_age is not null");
            return (Criteria) this;
        }

        public Criteria andUser_ageEqualTo(String value) {
            addCriterion("user_age =", value, "user_age");
            return (Criteria) this;
        }

        public Criteria andUser_ageNotEqualTo(String value) {
            addCriterion("user_age <>", value, "user_age");
            return (Criteria) this;
        }

        public Criteria andUser_ageGreaterThan(String value) {
            addCriterion("user_age >", value, "user_age");
            return (Criteria) this;
        }

        public Criteria andUser_ageGreaterThanOrEqualTo(String value) {
            addCriterion("user_age >=", value, "user_age");
            return (Criteria) this;
        }

        public Criteria andUser_ageLessThan(String value) {
            addCriterion("user_age <", value, "user_age");
            return (Criteria) this;
        }

        public Criteria andUser_ageLessThanOrEqualTo(String value) {
            addCriterion("user_age <=", value, "user_age");
            return (Criteria) this;
        }

        public Criteria andUser_ageLike(String value) {
            addCriterion("user_age like", value, "user_age");
            return (Criteria) this;
        }

        public Criteria andUser_ageNotLike(String value) {
            addCriterion("user_age not like", value, "user_age");
            return (Criteria) this;
        }

        public Criteria andUser_ageIn(List<String> values) {
            addCriterion("user_age in", values, "user_age");
            return (Criteria) this;
        }

        public Criteria andUser_ageNotIn(List<String> values) {
            addCriterion("user_age not in", values, "user_age");
            return (Criteria) this;
        }

        public Criteria andUser_ageBetween(String value1, String value2) {
            addCriterion("user_age between", value1, value2, "user_age");
            return (Criteria) this;
        }

        public Criteria andUser_ageNotBetween(String value1, String value2) {
            addCriterion("user_age not between", value1, value2, "user_age");
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