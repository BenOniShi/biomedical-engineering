package com.cdmu.pojo;

import java.util.ArrayList;
import java.util.List;

public class MatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MatchExample() {
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

        public Criteria andMatchNameIsNull() {
            addCriterion("match_name is null");
            return (Criteria) this;
        }

        public Criteria andMatchNameIsNotNull() {
            addCriterion("match_name is not null");
            return (Criteria) this;
        }

        public Criteria andMatchNameEqualTo(String value) {
            addCriterion("match_name =", value, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameNotEqualTo(String value) {
            addCriterion("match_name <>", value, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameGreaterThan(String value) {
            addCriterion("match_name >", value, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameGreaterThanOrEqualTo(String value) {
            addCriterion("match_name >=", value, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameLessThan(String value) {
            addCriterion("match_name <", value, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameLessThanOrEqualTo(String value) {
            addCriterion("match_name <=", value, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameLike(String value) {
            addCriterion("match_name like", value, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameNotLike(String value) {
            addCriterion("match_name not like", value, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameIn(List<String> values) {
            addCriterion("match_name in", values, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameNotIn(List<String> values) {
            addCriterion("match_name not in", values, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameBetween(String value1, String value2) {
            addCriterion("match_name between", value1, value2, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchNameNotBetween(String value1, String value2) {
            addCriterion("match_name not between", value1, value2, "matchName");
            return (Criteria) this;
        }

        public Criteria andMatchThemeIsNull() {
            addCriterion("match_theme is null");
            return (Criteria) this;
        }

        public Criteria andMatchThemeIsNotNull() {
            addCriterion("match_theme is not null");
            return (Criteria) this;
        }

        public Criteria andMatchThemeEqualTo(String value) {
            addCriterion("match_theme =", value, "matchTheme");
            return (Criteria) this;
        }

        public Criteria andMatchThemeNotEqualTo(String value) {
            addCriterion("match_theme <>", value, "matchTheme");
            return (Criteria) this;
        }

        public Criteria andMatchThemeGreaterThan(String value) {
            addCriterion("match_theme >", value, "matchTheme");
            return (Criteria) this;
        }

        public Criteria andMatchThemeGreaterThanOrEqualTo(String value) {
            addCriterion("match_theme >=", value, "matchTheme");
            return (Criteria) this;
        }

        public Criteria andMatchThemeLessThan(String value) {
            addCriterion("match_theme <", value, "matchTheme");
            return (Criteria) this;
        }

        public Criteria andMatchThemeLessThanOrEqualTo(String value) {
            addCriterion("match_theme <=", value, "matchTheme");
            return (Criteria) this;
        }

        public Criteria andMatchThemeLike(String value) {
            addCriterion("match_theme like", value, "matchTheme");
            return (Criteria) this;
        }

        public Criteria andMatchThemeNotLike(String value) {
            addCriterion("match_theme not like", value, "matchTheme");
            return (Criteria) this;
        }

        public Criteria andMatchThemeIn(List<String> values) {
            addCriterion("match_theme in", values, "matchTheme");
            return (Criteria) this;
        }

        public Criteria andMatchThemeNotIn(List<String> values) {
            addCriterion("match_theme not in", values, "matchTheme");
            return (Criteria) this;
        }

        public Criteria andMatchThemeBetween(String value1, String value2) {
            addCriterion("match_theme between", value1, value2, "matchTheme");
            return (Criteria) this;
        }

        public Criteria andMatchThemeNotBetween(String value1, String value2) {
            addCriterion("match_theme not between", value1, value2, "matchTheme");
            return (Criteria) this;
        }

        public Criteria andMatchSessionIsNull() {
            addCriterion("match_session is null");
            return (Criteria) this;
        }

        public Criteria andMatchSessionIsNotNull() {
            addCriterion("match_session is not null");
            return (Criteria) this;
        }

        public Criteria andMatchSessionEqualTo(String value) {
            addCriterion("match_session =", value, "matchSession");
            return (Criteria) this;
        }

        public Criteria andMatchSessionNotEqualTo(String value) {
            addCriterion("match_session <>", value, "matchSession");
            return (Criteria) this;
        }

        public Criteria andMatchSessionGreaterThan(String value) {
            addCriterion("match_session >", value, "matchSession");
            return (Criteria) this;
        }

        public Criteria andMatchSessionGreaterThanOrEqualTo(String value) {
            addCriterion("match_session >=", value, "matchSession");
            return (Criteria) this;
        }

        public Criteria andMatchSessionLessThan(String value) {
            addCriterion("match_session <", value, "matchSession");
            return (Criteria) this;
        }

        public Criteria andMatchSessionLessThanOrEqualTo(String value) {
            addCriterion("match_session <=", value, "matchSession");
            return (Criteria) this;
        }

        public Criteria andMatchSessionLike(String value) {
            addCriterion("match_session like", value, "matchSession");
            return (Criteria) this;
        }

        public Criteria andMatchSessionNotLike(String value) {
            addCriterion("match_session not like", value, "matchSession");
            return (Criteria) this;
        }

        public Criteria andMatchSessionIn(List<String> values) {
            addCriterion("match_session in", values, "matchSession");
            return (Criteria) this;
        }

        public Criteria andMatchSessionNotIn(List<String> values) {
            addCriterion("match_session not in", values, "matchSession");
            return (Criteria) this;
        }

        public Criteria andMatchSessionBetween(String value1, String value2) {
            addCriterion("match_session between", value1, value2, "matchSession");
            return (Criteria) this;
        }

        public Criteria andMatchSessionNotBetween(String value1, String value2) {
            addCriterion("match_session not between", value1, value2, "matchSession");
            return (Criteria) this;
        }

        public Criteria andMatchTypeIsNull() {
            addCriterion("match_type is null");
            return (Criteria) this;
        }

        public Criteria andMatchTypeIsNotNull() {
            addCriterion("match_type is not null");
            return (Criteria) this;
        }

        public Criteria andMatchTypeEqualTo(String value) {
            addCriterion("match_type =", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeNotEqualTo(String value) {
            addCriterion("match_type <>", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeGreaterThan(String value) {
            addCriterion("match_type >", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeGreaterThanOrEqualTo(String value) {
            addCriterion("match_type >=", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeLessThan(String value) {
            addCriterion("match_type <", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeLessThanOrEqualTo(String value) {
            addCriterion("match_type <=", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeLike(String value) {
            addCriterion("match_type like", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeNotLike(String value) {
            addCriterion("match_type not like", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeIn(List<String> values) {
            addCriterion("match_type in", values, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeNotIn(List<String> values) {
            addCriterion("match_type not in", values, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeBetween(String value1, String value2) {
            addCriterion("match_type between", value1, value2, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeNotBetween(String value1, String value2) {
            addCriterion("match_type not between", value1, value2, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchPlaceIsNull() {
            addCriterion("match_place is null");
            return (Criteria) this;
        }

        public Criteria andMatchPlaceIsNotNull() {
            addCriterion("match_place is not null");
            return (Criteria) this;
        }

        public Criteria andMatchPlaceEqualTo(String value) {
            addCriterion("match_place =", value, "matchPlace");
            return (Criteria) this;
        }

        public Criteria andMatchPlaceNotEqualTo(String value) {
            addCriterion("match_place <>", value, "matchPlace");
            return (Criteria) this;
        }

        public Criteria andMatchPlaceGreaterThan(String value) {
            addCriterion("match_place >", value, "matchPlace");
            return (Criteria) this;
        }

        public Criteria andMatchPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("match_place >=", value, "matchPlace");
            return (Criteria) this;
        }

        public Criteria andMatchPlaceLessThan(String value) {
            addCriterion("match_place <", value, "matchPlace");
            return (Criteria) this;
        }

        public Criteria andMatchPlaceLessThanOrEqualTo(String value) {
            addCriterion("match_place <=", value, "matchPlace");
            return (Criteria) this;
        }

        public Criteria andMatchPlaceLike(String value) {
            addCriterion("match_place like", value, "matchPlace");
            return (Criteria) this;
        }

        public Criteria andMatchPlaceNotLike(String value) {
            addCriterion("match_place not like", value, "matchPlace");
            return (Criteria) this;
        }

        public Criteria andMatchPlaceIn(List<String> values) {
            addCriterion("match_place in", values, "matchPlace");
            return (Criteria) this;
        }

        public Criteria andMatchPlaceNotIn(List<String> values) {
            addCriterion("match_place not in", values, "matchPlace");
            return (Criteria) this;
        }

        public Criteria andMatchPlaceBetween(String value1, String value2) {
            addCriterion("match_place between", value1, value2, "matchPlace");
            return (Criteria) this;
        }

        public Criteria andMatchPlaceNotBetween(String value1, String value2) {
            addCriterion("match_place not between", value1, value2, "matchPlace");
            return (Criteria) this;
        }

        public Criteria andEnrollDateIsNull() {
            addCriterion("enroll_date is null");
            return (Criteria) this;
        }

        public Criteria andEnrollDateIsNotNull() {
            addCriterion("enroll_date is not null");
            return (Criteria) this;
        }

        public Criteria andEnrollDateEqualTo(String value) {
            addCriterion("enroll_date =", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateNotEqualTo(String value) {
            addCriterion("enroll_date <>", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateGreaterThan(String value) {
            addCriterion("enroll_date >", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateGreaterThanOrEqualTo(String value) {
            addCriterion("enroll_date >=", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateLessThan(String value) {
            addCriterion("enroll_date <", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateLessThanOrEqualTo(String value) {
            addCriterion("enroll_date <=", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateLike(String value) {
            addCriterion("enroll_date like", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateNotLike(String value) {
            addCriterion("enroll_date not like", value, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateIn(List<String> values) {
            addCriterion("enroll_date in", values, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateNotIn(List<String> values) {
            addCriterion("enroll_date not in", values, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateBetween(String value1, String value2) {
            addCriterion("enroll_date between", value1, value2, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andEnrollDateNotBetween(String value1, String value2) {
            addCriterion("enroll_date not between", value1, value2, "enrollDate");
            return (Criteria) this;
        }

        public Criteria andMatchDateIsNull() {
            addCriterion("match_date is null");
            return (Criteria) this;
        }

        public Criteria andMatchDateIsNotNull() {
            addCriterion("match_date is not null");
            return (Criteria) this;
        }

        public Criteria andMatchDateEqualTo(String value) {
            addCriterion("match_date =", value, "matchDate");
            return (Criteria) this;
        }

        public Criteria andMatchDateNotEqualTo(String value) {
            addCriterion("match_date <>", value, "matchDate");
            return (Criteria) this;
        }

        public Criteria andMatchDateGreaterThan(String value) {
            addCriterion("match_date >", value, "matchDate");
            return (Criteria) this;
        }

        public Criteria andMatchDateGreaterThanOrEqualTo(String value) {
            addCriterion("match_date >=", value, "matchDate");
            return (Criteria) this;
        }

        public Criteria andMatchDateLessThan(String value) {
            addCriterion("match_date <", value, "matchDate");
            return (Criteria) this;
        }

        public Criteria andMatchDateLessThanOrEqualTo(String value) {
            addCriterion("match_date <=", value, "matchDate");
            return (Criteria) this;
        }

        public Criteria andMatchDateLike(String value) {
            addCriterion("match_date like", value, "matchDate");
            return (Criteria) this;
        }

        public Criteria andMatchDateNotLike(String value) {
            addCriterion("match_date not like", value, "matchDate");
            return (Criteria) this;
        }

        public Criteria andMatchDateIn(List<String> values) {
            addCriterion("match_date in", values, "matchDate");
            return (Criteria) this;
        }

        public Criteria andMatchDateNotIn(List<String> values) {
            addCriterion("match_date not in", values, "matchDate");
            return (Criteria) this;
        }

        public Criteria andMatchDateBetween(String value1, String value2) {
            addCriterion("match_date between", value1, value2, "matchDate");
            return (Criteria) this;
        }

        public Criteria andMatchDateNotBetween(String value1, String value2) {
            addCriterion("match_date not between", value1, value2, "matchDate");
            return (Criteria) this;
        }

        public Criteria andMatchHostIsNull() {
            addCriterion("match_host is null");
            return (Criteria) this;
        }

        public Criteria andMatchHostIsNotNull() {
            addCriterion("match_host is not null");
            return (Criteria) this;
        }

        public Criteria andMatchHostEqualTo(String value) {
            addCriterion("match_host =", value, "matchHost");
            return (Criteria) this;
        }

        public Criteria andMatchHostNotEqualTo(String value) {
            addCriterion("match_host <>", value, "matchHost");
            return (Criteria) this;
        }

        public Criteria andMatchHostGreaterThan(String value) {
            addCriterion("match_host >", value, "matchHost");
            return (Criteria) this;
        }

        public Criteria andMatchHostGreaterThanOrEqualTo(String value) {
            addCriterion("match_host >=", value, "matchHost");
            return (Criteria) this;
        }

        public Criteria andMatchHostLessThan(String value) {
            addCriterion("match_host <", value, "matchHost");
            return (Criteria) this;
        }

        public Criteria andMatchHostLessThanOrEqualTo(String value) {
            addCriterion("match_host <=", value, "matchHost");
            return (Criteria) this;
        }

        public Criteria andMatchHostLike(String value) {
            addCriterion("match_host like", value, "matchHost");
            return (Criteria) this;
        }

        public Criteria andMatchHostNotLike(String value) {
            addCriterion("match_host not like", value, "matchHost");
            return (Criteria) this;
        }

        public Criteria andMatchHostIn(List<String> values) {
            addCriterion("match_host in", values, "matchHost");
            return (Criteria) this;
        }

        public Criteria andMatchHostNotIn(List<String> values) {
            addCriterion("match_host not in", values, "matchHost");
            return (Criteria) this;
        }

        public Criteria andMatchHostBetween(String value1, String value2) {
            addCriterion("match_host between", value1, value2, "matchHost");
            return (Criteria) this;
        }

        public Criteria andMatchHostNotBetween(String value1, String value2) {
            addCriterion("match_host not between", value1, value2, "matchHost");
            return (Criteria) this;
        }

        public Criteria andMatchUndertakeIsNull() {
            addCriterion("match_undertake is null");
            return (Criteria) this;
        }

        public Criteria andMatchUndertakeIsNotNull() {
            addCriterion("match_undertake is not null");
            return (Criteria) this;
        }

        public Criteria andMatchUndertakeEqualTo(String value) {
            addCriterion("match_undertake =", value, "matchUndertake");
            return (Criteria) this;
        }

        public Criteria andMatchUndertakeNotEqualTo(String value) {
            addCriterion("match_undertake <>", value, "matchUndertake");
            return (Criteria) this;
        }

        public Criteria andMatchUndertakeGreaterThan(String value) {
            addCriterion("match_undertake >", value, "matchUndertake");
            return (Criteria) this;
        }

        public Criteria andMatchUndertakeGreaterThanOrEqualTo(String value) {
            addCriterion("match_undertake >=", value, "matchUndertake");
            return (Criteria) this;
        }

        public Criteria andMatchUndertakeLessThan(String value) {
            addCriterion("match_undertake <", value, "matchUndertake");
            return (Criteria) this;
        }

        public Criteria andMatchUndertakeLessThanOrEqualTo(String value) {
            addCriterion("match_undertake <=", value, "matchUndertake");
            return (Criteria) this;
        }

        public Criteria andMatchUndertakeLike(String value) {
            addCriterion("match_undertake like", value, "matchUndertake");
            return (Criteria) this;
        }

        public Criteria andMatchUndertakeNotLike(String value) {
            addCriterion("match_undertake not like", value, "matchUndertake");
            return (Criteria) this;
        }

        public Criteria andMatchUndertakeIn(List<String> values) {
            addCriterion("match_undertake in", values, "matchUndertake");
            return (Criteria) this;
        }

        public Criteria andMatchUndertakeNotIn(List<String> values) {
            addCriterion("match_undertake not in", values, "matchUndertake");
            return (Criteria) this;
        }

        public Criteria andMatchUndertakeBetween(String value1, String value2) {
            addCriterion("match_undertake between", value1, value2, "matchUndertake");
            return (Criteria) this;
        }

        public Criteria andMatchUndertakeNotBetween(String value1, String value2) {
            addCriterion("match_undertake not between", value1, value2, "matchUndertake");
            return (Criteria) this;
        }

        public Criteria andMatchNumberIsNull() {
            addCriterion("match_number is null");
            return (Criteria) this;
        }

        public Criteria andMatchNumberIsNotNull() {
            addCriterion("match_number is not null");
            return (Criteria) this;
        }

        public Criteria andMatchNumberEqualTo(String value) {
            addCriterion("match_number =", value, "matchNumber");
            return (Criteria) this;
        }

        public Criteria andMatchNumberNotEqualTo(String value) {
            addCriterion("match_number <>", value, "matchNumber");
            return (Criteria) this;
        }

        public Criteria andMatchNumberGreaterThan(String value) {
            addCriterion("match_number >", value, "matchNumber");
            return (Criteria) this;
        }

        public Criteria andMatchNumberGreaterThanOrEqualTo(String value) {
            addCriterion("match_number >=", value, "matchNumber");
            return (Criteria) this;
        }

        public Criteria andMatchNumberLessThan(String value) {
            addCriterion("match_number <", value, "matchNumber");
            return (Criteria) this;
        }

        public Criteria andMatchNumberLessThanOrEqualTo(String value) {
            addCriterion("match_number <=", value, "matchNumber");
            return (Criteria) this;
        }

        public Criteria andMatchNumberLike(String value) {
            addCriterion("match_number like", value, "matchNumber");
            return (Criteria) this;
        }

        public Criteria andMatchNumberNotLike(String value) {
            addCriterion("match_number not like", value, "matchNumber");
            return (Criteria) this;
        }

        public Criteria andMatchNumberIn(List<String> values) {
            addCriterion("match_number in", values, "matchNumber");
            return (Criteria) this;
        }

        public Criteria andMatchNumberNotIn(List<String> values) {
            addCriterion("match_number not in", values, "matchNumber");
            return (Criteria) this;
        }

        public Criteria andMatchNumberBetween(String value1, String value2) {
            addCriterion("match_number between", value1, value2, "matchNumber");
            return (Criteria) this;
        }

        public Criteria andMatchNumberNotBetween(String value1, String value2) {
            addCriterion("match_number not between", value1, value2, "matchNumber");
            return (Criteria) this;
        }

        public Criteria andMatchRequirementIsNull() {
            addCriterion("match_requirement is null");
            return (Criteria) this;
        }

        public Criteria andMatchRequirementIsNotNull() {
            addCriterion("match_requirement is not null");
            return (Criteria) this;
        }

        public Criteria andMatchRequirementEqualTo(String value) {
            addCriterion("match_requirement =", value, "matchRequirement");
            return (Criteria) this;
        }

        public Criteria andMatchRequirementNotEqualTo(String value) {
            addCriterion("match_requirement <>", value, "matchRequirement");
            return (Criteria) this;
        }

        public Criteria andMatchRequirementGreaterThan(String value) {
            addCriterion("match_requirement >", value, "matchRequirement");
            return (Criteria) this;
        }

        public Criteria andMatchRequirementGreaterThanOrEqualTo(String value) {
            addCriterion("match_requirement >=", value, "matchRequirement");
            return (Criteria) this;
        }

        public Criteria andMatchRequirementLessThan(String value) {
            addCriterion("match_requirement <", value, "matchRequirement");
            return (Criteria) this;
        }

        public Criteria andMatchRequirementLessThanOrEqualTo(String value) {
            addCriterion("match_requirement <=", value, "matchRequirement");
            return (Criteria) this;
        }

        public Criteria andMatchRequirementLike(String value) {
            addCriterion("match_requirement like", value, "matchRequirement");
            return (Criteria) this;
        }

        public Criteria andMatchRequirementNotLike(String value) {
            addCriterion("match_requirement not like", value, "matchRequirement");
            return (Criteria) this;
        }

        public Criteria andMatchRequirementIn(List<String> values) {
            addCriterion("match_requirement in", values, "matchRequirement");
            return (Criteria) this;
        }

        public Criteria andMatchRequirementNotIn(List<String> values) {
            addCriterion("match_requirement not in", values, "matchRequirement");
            return (Criteria) this;
        }

        public Criteria andMatchRequirementBetween(String value1, String value2) {
            addCriterion("match_requirement between", value1, value2, "matchRequirement");
            return (Criteria) this;
        }

        public Criteria andMatchRequirementNotBetween(String value1, String value2) {
            addCriterion("match_requirement not between", value1, value2, "matchRequirement");
            return (Criteria) this;
        }

        public Criteria andMatchIntroduceIsNull() {
            addCriterion("match_introduce is null");
            return (Criteria) this;
        }

        public Criteria andMatchIntroduceIsNotNull() {
            addCriterion("match_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andMatchIntroduceEqualTo(String value) {
            addCriterion("match_introduce =", value, "matchIntroduce");
            return (Criteria) this;
        }

        public Criteria andMatchIntroduceNotEqualTo(String value) {
            addCriterion("match_introduce <>", value, "matchIntroduce");
            return (Criteria) this;
        }

        public Criteria andMatchIntroduceGreaterThan(String value) {
            addCriterion("match_introduce >", value, "matchIntroduce");
            return (Criteria) this;
        }

        public Criteria andMatchIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("match_introduce >=", value, "matchIntroduce");
            return (Criteria) this;
        }

        public Criteria andMatchIntroduceLessThan(String value) {
            addCriterion("match_introduce <", value, "matchIntroduce");
            return (Criteria) this;
        }

        public Criteria andMatchIntroduceLessThanOrEqualTo(String value) {
            addCriterion("match_introduce <=", value, "matchIntroduce");
            return (Criteria) this;
        }

        public Criteria andMatchIntroduceLike(String value) {
            addCriterion("match_introduce like", value, "matchIntroduce");
            return (Criteria) this;
        }

        public Criteria andMatchIntroduceNotLike(String value) {
            addCriterion("match_introduce not like", value, "matchIntroduce");
            return (Criteria) this;
        }

        public Criteria andMatchIntroduceIn(List<String> values) {
            addCriterion("match_introduce in", values, "matchIntroduce");
            return (Criteria) this;
        }

        public Criteria andMatchIntroduceNotIn(List<String> values) {
            addCriterion("match_introduce not in", values, "matchIntroduce");
            return (Criteria) this;
        }

        public Criteria andMatchIntroduceBetween(String value1, String value2) {
            addCriterion("match_introduce between", value1, value2, "matchIntroduce");
            return (Criteria) this;
        }

        public Criteria andMatchIntroduceNotBetween(String value1, String value2) {
            addCriterion("match_introduce not between", value1, value2, "matchIntroduce");
            return (Criteria) this;
        }

        public Criteria andMatchStateIsNull() {
            addCriterion("match_state is null");
            return (Criteria) this;
        }

        public Criteria andMatchStateIsNotNull() {
            addCriterion("match_state is not null");
            return (Criteria) this;
        }

        public Criteria andMatchStateEqualTo(String value) {
            addCriterion("match_state =", value, "matchState");
            return (Criteria) this;
        }

        public Criteria andMatchStateNotEqualTo(String value) {
            addCriterion("match_state <>", value, "matchState");
            return (Criteria) this;
        }

        public Criteria andMatchStateGreaterThan(String value) {
            addCriterion("match_state >", value, "matchState");
            return (Criteria) this;
        }

        public Criteria andMatchStateGreaterThanOrEqualTo(String value) {
            addCriterion("match_state >=", value, "matchState");
            return (Criteria) this;
        }

        public Criteria andMatchStateLessThan(String value) {
            addCriterion("match_state <", value, "matchState");
            return (Criteria) this;
        }

        public Criteria andMatchStateLessThanOrEqualTo(String value) {
            addCriterion("match_state <=", value, "matchState");
            return (Criteria) this;
        }

        public Criteria andMatchStateLike(String value) {
            addCriterion("match_state like", value, "matchState");
            return (Criteria) this;
        }

        public Criteria andMatchStateNotLike(String value) {
            addCriterion("match_state not like", value, "matchState");
            return (Criteria) this;
        }

        public Criteria andMatchStateIn(List<String> values) {
            addCriterion("match_state in", values, "matchState");
            return (Criteria) this;
        }

        public Criteria andMatchStateNotIn(List<String> values) {
            addCriterion("match_state not in", values, "matchState");
            return (Criteria) this;
        }

        public Criteria andMatchStateBetween(String value1, String value2) {
            addCriterion("match_state between", value1, value2, "matchState");
            return (Criteria) this;
        }

        public Criteria andMatchStateNotBetween(String value1, String value2) {
            addCriterion("match_state not between", value1, value2, "matchState");
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