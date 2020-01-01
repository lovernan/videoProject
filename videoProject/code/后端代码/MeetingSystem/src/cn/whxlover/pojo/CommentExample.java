package cn.whxlover.pojo;

import java.util.ArrayList;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andUsername1IsNull() {
            addCriterion("username1 is null");
            return (Criteria) this;
        }

        public Criteria andUsername1IsNotNull() {
            addCriterion("username1 is not null");
            return (Criteria) this;
        }

        public Criteria andUsername1EqualTo(String value) {
            addCriterion("username1 =", value, "username1");
            return (Criteria) this;
        }

        public Criteria andUsername1NotEqualTo(String value) {
            addCriterion("username1 <>", value, "username1");
            return (Criteria) this;
        }

        public Criteria andUsername1GreaterThan(String value) {
            addCriterion("username1 >", value, "username1");
            return (Criteria) this;
        }

        public Criteria andUsername1GreaterThanOrEqualTo(String value) {
            addCriterion("username1 >=", value, "username1");
            return (Criteria) this;
        }

        public Criteria andUsername1LessThan(String value) {
            addCriterion("username1 <", value, "username1");
            return (Criteria) this;
        }

        public Criteria andUsername1LessThanOrEqualTo(String value) {
            addCriterion("username1 <=", value, "username1");
            return (Criteria) this;
        }

        public Criteria andUsername1Like(String value) {
            addCriterion("username1 like", value, "username1");
            return (Criteria) this;
        }

        public Criteria andUsername1NotLike(String value) {
            addCriterion("username1 not like", value, "username1");
            return (Criteria) this;
        }

        public Criteria andUsername1In(List<String> values) {
            addCriterion("username1 in", values, "username1");
            return (Criteria) this;
        }

        public Criteria andUsername1NotIn(List<String> values) {
            addCriterion("username1 not in", values, "username1");
            return (Criteria) this;
        }

        public Criteria andUsername1Between(String value1, String value2) {
            addCriterion("username1 between", value1, value2, "username1");
            return (Criteria) this;
        }

        public Criteria andUsername1NotBetween(String value1, String value2) {
            addCriterion("username1 not between", value1, value2, "username1");
            return (Criteria) this;
        }

        public Criteria andUsername2IsNull() {
            addCriterion("username2 is null");
            return (Criteria) this;
        }

        public Criteria andUsername2IsNotNull() {
            addCriterion("username2 is not null");
            return (Criteria) this;
        }

        public Criteria andUsername2EqualTo(String value) {
            addCriterion("username2 =", value, "username2");
            return (Criteria) this;
        }

        public Criteria andUsername2NotEqualTo(String value) {
            addCriterion("username2 <>", value, "username2");
            return (Criteria) this;
        }

        public Criteria andUsername2GreaterThan(String value) {
            addCriterion("username2 >", value, "username2");
            return (Criteria) this;
        }

        public Criteria andUsername2GreaterThanOrEqualTo(String value) {
            addCriterion("username2 >=", value, "username2");
            return (Criteria) this;
        }

        public Criteria andUsername2LessThan(String value) {
            addCriterion("username2 <", value, "username2");
            return (Criteria) this;
        }

        public Criteria andUsername2LessThanOrEqualTo(String value) {
            addCriterion("username2 <=", value, "username2");
            return (Criteria) this;
        }

        public Criteria andUsername2Like(String value) {
            addCriterion("username2 like", value, "username2");
            return (Criteria) this;
        }

        public Criteria andUsername2NotLike(String value) {
            addCriterion("username2 not like", value, "username2");
            return (Criteria) this;
        }

        public Criteria andUsername2In(List<String> values) {
            addCriterion("username2 in", values, "username2");
            return (Criteria) this;
        }

        public Criteria andUsername2NotIn(List<String> values) {
            addCriterion("username2 not in", values, "username2");
            return (Criteria) this;
        }

        public Criteria andUsername2Between(String value1, String value2) {
            addCriterion("username2 between", value1, value2, "username2");
            return (Criteria) this;
        }

        public Criteria andUsername2NotBetween(String value1, String value2) {
            addCriterion("username2 not between", value1, value2, "username2");
            return (Criteria) this;
        }

        public Criteria andVidIsNull() {
            addCriterion("vid is null");
            return (Criteria) this;
        }

        public Criteria andVidIsNotNull() {
            addCriterion("vid is not null");
            return (Criteria) this;
        }

        public Criteria andVidEqualTo(Integer value) {
            addCriterion("vid =", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotEqualTo(Integer value) {
            addCriterion("vid <>", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThan(Integer value) {
            addCriterion("vid >", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vid >=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThan(Integer value) {
            addCriterion("vid <", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThanOrEqualTo(Integer value) {
            addCriterion("vid <=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidIn(List<Integer> values) {
            addCriterion("vid in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotIn(List<Integer> values) {
            addCriterion("vid not in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidBetween(Integer value1, Integer value2) {
            addCriterion("vid between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotBetween(Integer value1, Integer value2) {
            addCriterion("vid not between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andVerifiedIsNull() {
            addCriterion("verified is null");
            return (Criteria) this;
        }

        public Criteria andVerifiedIsNotNull() {
            addCriterion("verified is not null");
            return (Criteria) this;
        }

        public Criteria andVerifiedEqualTo(Integer value) {
            addCriterion("verified =", value, "verified");
            return (Criteria) this;
        }

        public Criteria andVerifiedNotEqualTo(Integer value) {
            addCriterion("verified <>", value, "verified");
            return (Criteria) this;
        }

        public Criteria andVerifiedGreaterThan(Integer value) {
            addCriterion("verified >", value, "verified");
            return (Criteria) this;
        }

        public Criteria andVerifiedGreaterThanOrEqualTo(Integer value) {
            addCriterion("verified >=", value, "verified");
            return (Criteria) this;
        }

        public Criteria andVerifiedLessThan(Integer value) {
            addCriterion("verified <", value, "verified");
            return (Criteria) this;
        }

        public Criteria andVerifiedLessThanOrEqualTo(Integer value) {
            addCriterion("verified <=", value, "verified");
            return (Criteria) this;
        }

        public Criteria andVerifiedIn(List<Integer> values) {
            addCriterion("verified in", values, "verified");
            return (Criteria) this;
        }

        public Criteria andVerifiedNotIn(List<Integer> values) {
            addCriterion("verified not in", values, "verified");
            return (Criteria) this;
        }

        public Criteria andVerifiedBetween(Integer value1, Integer value2) {
            addCriterion("verified between", value1, value2, "verified");
            return (Criteria) this;
        }

        public Criteria andVerifiedNotBetween(Integer value1, Integer value2) {
            addCriterion("verified not between", value1, value2, "verified");
            return (Criteria) this;
        }

        public Criteria andAvatorIsNull() {
            addCriterion("avator is null");
            return (Criteria) this;
        }

        public Criteria andAvatorIsNotNull() {
            addCriterion("avator is not null");
            return (Criteria) this;
        }

        public Criteria andAvatorEqualTo(String value) {
            addCriterion("avator =", value, "avator");
            return (Criteria) this;
        }

        public Criteria andAvatorNotEqualTo(String value) {
            addCriterion("avator <>", value, "avator");
            return (Criteria) this;
        }

        public Criteria andAvatorGreaterThan(String value) {
            addCriterion("avator >", value, "avator");
            return (Criteria) this;
        }

        public Criteria andAvatorGreaterThanOrEqualTo(String value) {
            addCriterion("avator >=", value, "avator");
            return (Criteria) this;
        }

        public Criteria andAvatorLessThan(String value) {
            addCriterion("avator <", value, "avator");
            return (Criteria) this;
        }

        public Criteria andAvatorLessThanOrEqualTo(String value) {
            addCriterion("avator <=", value, "avator");
            return (Criteria) this;
        }

        public Criteria andAvatorLike(String value) {
            addCriterion("avator like", value, "avator");
            return (Criteria) this;
        }

        public Criteria andAvatorNotLike(String value) {
            addCriterion("avator not like", value, "avator");
            return (Criteria) this;
        }

        public Criteria andAvatorIn(List<String> values) {
            addCriterion("avator in", values, "avator");
            return (Criteria) this;
        }

        public Criteria andAvatorNotIn(List<String> values) {
            addCriterion("avator not in", values, "avator");
            return (Criteria) this;
        }

        public Criteria andAvatorBetween(String value1, String value2) {
            addCriterion("avator between", value1, value2, "avator");
            return (Criteria) this;
        }

        public Criteria andAvatorNotBetween(String value1, String value2) {
            addCriterion("avator not between", value1, value2, "avator");
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