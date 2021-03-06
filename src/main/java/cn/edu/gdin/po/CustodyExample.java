package cn.edu.gdin.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustodyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table custody
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table custody
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table custody
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custody
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    public CustodyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custody
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custody
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custody
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custody
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custody
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custody
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custody
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custody
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custody
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custody
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table custody
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
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

        public Criteria andUserAccountIsNull() {
            addCriterion("user_account is null");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNotNull() {
            addCriterion("user_account is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccountEqualTo(String value) {
            addCriterion("user_account =", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotEqualTo(String value) {
            addCriterion("user_account <>", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThan(String value) {
            addCriterion("user_account >", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThanOrEqualTo(String value) {
            addCriterion("user_account >=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThan(String value) {
            addCriterion("user_account <", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThanOrEqualTo(String value) {
            addCriterion("user_account <=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLike(String value) {
            addCriterion("user_account like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotLike(String value) {
            addCriterion("user_account not like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountIn(List<String> values) {
            addCriterion("user_account in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotIn(List<String> values) {
            addCriterion("user_account not in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountBetween(String value1, String value2) {
            addCriterion("user_account between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotBetween(String value1, String value2) {
            addCriterion("user_account not between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeIsNull() {
            addCriterion("collection_time is null");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeIsNotNull() {
            addCriterion("collection_time is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeEqualTo(Date value) {
            addCriterion("collection_time =", value, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeNotEqualTo(Date value) {
            addCriterion("collection_time <>", value, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeGreaterThan(Date value) {
            addCriterion("collection_time >", value, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("collection_time >=", value, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeLessThan(Date value) {
            addCriterion("collection_time <", value, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeLessThanOrEqualTo(Date value) {
            addCriterion("collection_time <=", value, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeIn(List<Date> values) {
            addCriterion("collection_time in", values, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeNotIn(List<Date> values) {
            addCriterion("collection_time not in", values, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeBetween(Date value1, Date value2) {
            addCriterion("collection_time between", value1, value2, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeNotBetween(Date value1, Date value2) {
            addCriterion("collection_time not between", value1, value2, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andHeartRateIsNull() {
            addCriterion("heart_rate is null");
            return (Criteria) this;
        }

        public Criteria andHeartRateIsNotNull() {
            addCriterion("heart_rate is not null");
            return (Criteria) this;
        }

        public Criteria andHeartRateEqualTo(Integer value) {
            addCriterion("heart_rate =", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateNotEqualTo(Integer value) {
            addCriterion("heart_rate <>", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateGreaterThan(Integer value) {
            addCriterion("heart_rate >", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("heart_rate >=", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateLessThan(Integer value) {
            addCriterion("heart_rate <", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateLessThanOrEqualTo(Integer value) {
            addCriterion("heart_rate <=", value, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateIn(List<Integer> values) {
            addCriterion("heart_rate in", values, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateNotIn(List<Integer> values) {
            addCriterion("heart_rate not in", values, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateBetween(Integer value1, Integer value2) {
            addCriterion("heart_rate between", value1, value2, "heartRate");
            return (Criteria) this;
        }

        public Criteria andHeartRateNotBetween(Integer value1, Integer value2) {
            addCriterion("heart_rate not between", value1, value2, "heartRate");
            return (Criteria) this;
        }

        public Criteria andSystolicPressureIsNull() {
            addCriterion("systolic_pressure is null");
            return (Criteria) this;
        }

        public Criteria andSystolicPressureIsNotNull() {
            addCriterion("systolic_pressure is not null");
            return (Criteria) this;
        }

        public Criteria andSystolicPressureEqualTo(Integer value) {
            addCriterion("systolic_pressure =", value, "systolicPressure");
            return (Criteria) this;
        }

        public Criteria andSystolicPressureNotEqualTo(Integer value) {
            addCriterion("systolic_pressure <>", value, "systolicPressure");
            return (Criteria) this;
        }

        public Criteria andSystolicPressureGreaterThan(Integer value) {
            addCriterion("systolic_pressure >", value, "systolicPressure");
            return (Criteria) this;
        }

        public Criteria andSystolicPressureGreaterThanOrEqualTo(Integer value) {
            addCriterion("systolic_pressure >=", value, "systolicPressure");
            return (Criteria) this;
        }

        public Criteria andSystolicPressureLessThan(Integer value) {
            addCriterion("systolic_pressure <", value, "systolicPressure");
            return (Criteria) this;
        }

        public Criteria andSystolicPressureLessThanOrEqualTo(Integer value) {
            addCriterion("systolic_pressure <=", value, "systolicPressure");
            return (Criteria) this;
        }

        public Criteria andSystolicPressureIn(List<Integer> values) {
            addCriterion("systolic_pressure in", values, "systolicPressure");
            return (Criteria) this;
        }

        public Criteria andSystolicPressureNotIn(List<Integer> values) {
            addCriterion("systolic_pressure not in", values, "systolicPressure");
            return (Criteria) this;
        }

        public Criteria andSystolicPressureBetween(Integer value1, Integer value2) {
            addCriterion("systolic_pressure between", value1, value2, "systolicPressure");
            return (Criteria) this;
        }

        public Criteria andSystolicPressureNotBetween(Integer value1, Integer value2) {
            addCriterion("systolic_pressure not between", value1, value2, "systolicPressure");
            return (Criteria) this;
        }

        public Criteria andDiastolicPressurIsNull() {
            addCriterion("diastolic_pressur is null");
            return (Criteria) this;
        }

        public Criteria andDiastolicPressurIsNotNull() {
            addCriterion("diastolic_pressur is not null");
            return (Criteria) this;
        }

        public Criteria andDiastolicPressurEqualTo(Integer value) {
            addCriterion("diastolic_pressur =", value, "diastolicPressur");
            return (Criteria) this;
        }

        public Criteria andDiastolicPressurNotEqualTo(Integer value) {
            addCriterion("diastolic_pressur <>", value, "diastolicPressur");
            return (Criteria) this;
        }

        public Criteria andDiastolicPressurGreaterThan(Integer value) {
            addCriterion("diastolic_pressur >", value, "diastolicPressur");
            return (Criteria) this;
        }

        public Criteria andDiastolicPressurGreaterThanOrEqualTo(Integer value) {
            addCriterion("diastolic_pressur >=", value, "diastolicPressur");
            return (Criteria) this;
        }

        public Criteria andDiastolicPressurLessThan(Integer value) {
            addCriterion("diastolic_pressur <", value, "diastolicPressur");
            return (Criteria) this;
        }

        public Criteria andDiastolicPressurLessThanOrEqualTo(Integer value) {
            addCriterion("diastolic_pressur <=", value, "diastolicPressur");
            return (Criteria) this;
        }

        public Criteria andDiastolicPressurIn(List<Integer> values) {
            addCriterion("diastolic_pressur in", values, "diastolicPressur");
            return (Criteria) this;
        }

        public Criteria andDiastolicPressurNotIn(List<Integer> values) {
            addCriterion("diastolic_pressur not in", values, "diastolicPressur");
            return (Criteria) this;
        }

        public Criteria andDiastolicPressurBetween(Integer value1, Integer value2) {
            addCriterion("diastolic_pressur between", value1, value2, "diastolicPressur");
            return (Criteria) this;
        }

        public Criteria andDiastolicPressurNotBetween(Integer value1, Integer value2) {
            addCriterion("diastolic_pressur not between", value1, value2, "diastolicPressur");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNull() {
            addCriterion("temperature is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("temperature is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(Float value) {
            addCriterion("temperature =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(Float value) {
            addCriterion("temperature <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(Float value) {
            addCriterion("temperature >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(Float value) {
            addCriterion("temperature >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(Float value) {
            addCriterion("temperature <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(Float value) {
            addCriterion("temperature <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<Float> values) {
            addCriterion("temperature in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<Float> values) {
            addCriterion("temperature not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(Float value1, Float value2) {
            addCriterion("temperature between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(Float value1, Float value2) {
            addCriterion("temperature not between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenIsNull() {
            addCriterion("blood_oxygen is null");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenIsNotNull() {
            addCriterion("blood_oxygen is not null");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenEqualTo(Float value) {
            addCriterion("blood_oxygen =", value, "bloodOxygen");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenNotEqualTo(Float value) {
            addCriterion("blood_oxygen <>", value, "bloodOxygen");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenGreaterThan(Float value) {
            addCriterion("blood_oxygen >", value, "bloodOxygen");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenGreaterThanOrEqualTo(Float value) {
            addCriterion("blood_oxygen >=", value, "bloodOxygen");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenLessThan(Float value) {
            addCriterion("blood_oxygen <", value, "bloodOxygen");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenLessThanOrEqualTo(Float value) {
            addCriterion("blood_oxygen <=", value, "bloodOxygen");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenIn(List<Float> values) {
            addCriterion("blood_oxygen in", values, "bloodOxygen");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenNotIn(List<Float> values) {
            addCriterion("blood_oxygen not in", values, "bloodOxygen");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenBetween(Float value1, Float value2) {
            addCriterion("blood_oxygen between", value1, value2, "bloodOxygen");
            return (Criteria) this;
        }

        public Criteria andBloodOxygenNotBetween(Float value1, Float value2) {
            addCriterion("blood_oxygen not between", value1, value2, "bloodOxygen");
            return (Criteria) this;
        }

        public Criteria andUvIndexIsNull() {
            addCriterion("uv_index is null");
            return (Criteria) this;
        }

        public Criteria andUvIndexIsNotNull() {
            addCriterion("uv_index is not null");
            return (Criteria) this;
        }

        public Criteria andUvIndexEqualTo(Byte value) {
            addCriterion("uv_index =", value, "uvIndex");
            return (Criteria) this;
        }

        public Criteria andUvIndexNotEqualTo(Byte value) {
            addCriterion("uv_index <>", value, "uvIndex");
            return (Criteria) this;
        }

        public Criteria andUvIndexGreaterThan(Byte value) {
            addCriterion("uv_index >", value, "uvIndex");
            return (Criteria) this;
        }

        public Criteria andUvIndexGreaterThanOrEqualTo(Byte value) {
            addCriterion("uv_index >=", value, "uvIndex");
            return (Criteria) this;
        }

        public Criteria andUvIndexLessThan(Byte value) {
            addCriterion("uv_index <", value, "uvIndex");
            return (Criteria) this;
        }

        public Criteria andUvIndexLessThanOrEqualTo(Byte value) {
            addCriterion("uv_index <=", value, "uvIndex");
            return (Criteria) this;
        }

        public Criteria andUvIndexIn(List<Byte> values) {
            addCriterion("uv_index in", values, "uvIndex");
            return (Criteria) this;
        }

        public Criteria andUvIndexNotIn(List<Byte> values) {
            addCriterion("uv_index not in", values, "uvIndex");
            return (Criteria) this;
        }

        public Criteria andUvIndexBetween(Byte value1, Byte value2) {
            addCriterion("uv_index between", value1, value2, "uvIndex");
            return (Criteria) this;
        }

        public Criteria andUvIndexNotBetween(Byte value1, Byte value2) {
            addCriterion("uv_index not between", value1, value2, "uvIndex");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table custody
     *
     * @mbggenerated do_not_delete_during_merge Sun Mar 05 16:13:32 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table custody
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
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