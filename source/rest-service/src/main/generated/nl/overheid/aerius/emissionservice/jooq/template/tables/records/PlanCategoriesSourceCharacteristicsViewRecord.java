/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables.records;


import nl.overheid.aerius.emissionservice.jooq.public_.enums.UnitType;
import nl.overheid.aerius.emissionservice.jooq.template.tables.PlanCategoriesSourceCharacteristicsView;

import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.TableRecordImpl;


/**
 * View retourneert de categorieen voor plannen. Dit bevat onder andere de 
 * emissiefactoren en de emissie karakteristieken.
 * Zie plan_categories en plan_category_emission_factors voor meer informatie.
 * 
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/04-views/misc.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PlanCategoriesSourceCharacteristicsViewRecord extends TableRecordImpl<PlanCategoriesSourceCharacteristicsViewRecord> implements Record13<Short, String, String, Integer, Short, UnitType, Float, Float, Float, Float, Integer, Integer, String> {

    private static final long serialVersionUID = -2003683928;

    /**
     * Setter for <code>template.plan_categories_source_characteristics_view.plan_category_id</code>.
     */
    public void setPlanCategoryId(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>template.plan_categories_source_characteristics_view.plan_category_id</code>.
     */
    public Short getPlanCategoryId() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>template.plan_categories_source_characteristics_view.code</code>.
     */
    public void setCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>template.plan_categories_source_characteristics_view.code</code>.
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>template.plan_categories_source_characteristics_view.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>template.plan_categories_source_characteristics_view.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>template.plan_categories_source_characteristics_view.gcn_sector_id</code>.
     */
    public void setGcnSectorId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>template.plan_categories_source_characteristics_view.gcn_sector_id</code>.
     */
    public Integer getGcnSectorId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>template.plan_categories_source_characteristics_view.substance_id</code>.
     */
    public void setSubstanceId(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>template.plan_categories_source_characteristics_view.substance_id</code>.
     */
    public Short getSubstanceId() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>template.plan_categories_source_characteristics_view.category_unit</code>.
     */
    public void setCategoryUnit(UnitType value) {
        set(5, value);
    }

    /**
     * Getter for <code>template.plan_categories_source_characteristics_view.category_unit</code>.
     */
    public UnitType getCategoryUnit() {
        return (UnitType) get(5);
    }

    /**
     * Setter for <code>template.plan_categories_source_characteristics_view.emission_factor</code>.
     */
    public void setEmissionFactor(Float value) {
        set(6, value);
    }

    /**
     * Getter for <code>template.plan_categories_source_characteristics_view.emission_factor</code>.
     */
    public Float getEmissionFactor() {
        return (Float) get(6);
    }

    /**
     * Setter for <code>template.plan_categories_source_characteristics_view.heat_content</code>.
     */
    public void setHeatContent(Float value) {
        set(7, value);
    }

    /**
     * Getter for <code>template.plan_categories_source_characteristics_view.heat_content</code>.
     */
    public Float getHeatContent() {
        return (Float) get(7);
    }

    /**
     * Setter for <code>template.plan_categories_source_characteristics_view.height</code>.
     */
    public void setHeight(Float value) {
        set(8, value);
    }

    /**
     * Getter for <code>template.plan_categories_source_characteristics_view.height</code>.
     */
    public Float getHeight() {
        return (Float) get(8);
    }

    /**
     * Setter for <code>template.plan_categories_source_characteristics_view.spread</code>.
     */
    public void setSpread(Float value) {
        set(9, value);
    }

    /**
     * Getter for <code>template.plan_categories_source_characteristics_view.spread</code>.
     */
    public Float getSpread() {
        return (Float) get(9);
    }

    /**
     * Setter for <code>template.plan_categories_source_characteristics_view.particle_size_distribution</code>.
     */
    public void setParticleSizeDistribution(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>template.plan_categories_source_characteristics_view.particle_size_distribution</code>.
     */
    public Integer getParticleSizeDistribution() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>template.plan_categories_source_characteristics_view.emission_diurnal_variation_id</code>.
     */
    public void setEmissionDiurnalVariationId(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>template.plan_categories_source_characteristics_view.emission_diurnal_variation_id</code>.
     */
    public Integer getEmissionDiurnalVariationId() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>template.plan_categories_source_characteristics_view.emission_diurnal_variation_code</code>.
     */
    public void setEmissionDiurnalVariationCode(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>template.plan_categories_source_characteristics_view.emission_diurnal_variation_code</code>.
     */
    public String getEmissionDiurnalVariationCode() {
        return (String) get(12);
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<Short, String, String, Integer, Short, UnitType, Float, Float, Float, Float, Integer, Integer, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<Short, String, String, Integer, Short, UnitType, Float, Float, Float, Float, Integer, Integer, String> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<Short> field1() {
        return PlanCategoriesSourceCharacteristicsView.PLAN_CATEGORIES_SOURCE_CHARACTERISTICS_VIEW.PLAN_CATEGORY_ID;
    }

    @Override
    public Field<String> field2() {
        return PlanCategoriesSourceCharacteristicsView.PLAN_CATEGORIES_SOURCE_CHARACTERISTICS_VIEW.CODE;
    }

    @Override
    public Field<String> field3() {
        return PlanCategoriesSourceCharacteristicsView.PLAN_CATEGORIES_SOURCE_CHARACTERISTICS_VIEW.NAME;
    }

    @Override
    public Field<Integer> field4() {
        return PlanCategoriesSourceCharacteristicsView.PLAN_CATEGORIES_SOURCE_CHARACTERISTICS_VIEW.GCN_SECTOR_ID;
    }

    @Override
    public Field<Short> field5() {
        return PlanCategoriesSourceCharacteristicsView.PLAN_CATEGORIES_SOURCE_CHARACTERISTICS_VIEW.SUBSTANCE_ID;
    }

    @Override
    public Field<UnitType> field6() {
        return PlanCategoriesSourceCharacteristicsView.PLAN_CATEGORIES_SOURCE_CHARACTERISTICS_VIEW.CATEGORY_UNIT;
    }

    @Override
    public Field<Float> field7() {
        return PlanCategoriesSourceCharacteristicsView.PLAN_CATEGORIES_SOURCE_CHARACTERISTICS_VIEW.EMISSION_FACTOR;
    }

    @Override
    public Field<Float> field8() {
        return PlanCategoriesSourceCharacteristicsView.PLAN_CATEGORIES_SOURCE_CHARACTERISTICS_VIEW.HEAT_CONTENT;
    }

    @Override
    public Field<Float> field9() {
        return PlanCategoriesSourceCharacteristicsView.PLAN_CATEGORIES_SOURCE_CHARACTERISTICS_VIEW.HEIGHT;
    }

    @Override
    public Field<Float> field10() {
        return PlanCategoriesSourceCharacteristicsView.PLAN_CATEGORIES_SOURCE_CHARACTERISTICS_VIEW.SPREAD;
    }

    @Override
    public Field<Integer> field11() {
        return PlanCategoriesSourceCharacteristicsView.PLAN_CATEGORIES_SOURCE_CHARACTERISTICS_VIEW.PARTICLE_SIZE_DISTRIBUTION;
    }

    @Override
    public Field<Integer> field12() {
        return PlanCategoriesSourceCharacteristicsView.PLAN_CATEGORIES_SOURCE_CHARACTERISTICS_VIEW.EMISSION_DIURNAL_VARIATION_ID;
    }

    @Override
    public Field<String> field13() {
        return PlanCategoriesSourceCharacteristicsView.PLAN_CATEGORIES_SOURCE_CHARACTERISTICS_VIEW.EMISSION_DIURNAL_VARIATION_CODE;
    }

    @Override
    public Short component1() {
        return getPlanCategoryId();
    }

    @Override
    public String component2() {
        return getCode();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public Integer component4() {
        return getGcnSectorId();
    }

    @Override
    public Short component5() {
        return getSubstanceId();
    }

    @Override
    public UnitType component6() {
        return getCategoryUnit();
    }

    @Override
    public Float component7() {
        return getEmissionFactor();
    }

    @Override
    public Float component8() {
        return getHeatContent();
    }

    @Override
    public Float component9() {
        return getHeight();
    }

    @Override
    public Float component10() {
        return getSpread();
    }

    @Override
    public Integer component11() {
        return getParticleSizeDistribution();
    }

    @Override
    public Integer component12() {
        return getEmissionDiurnalVariationId();
    }

    @Override
    public String component13() {
        return getEmissionDiurnalVariationCode();
    }

    @Override
    public Short value1() {
        return getPlanCategoryId();
    }

    @Override
    public String value2() {
        return getCode();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public Integer value4() {
        return getGcnSectorId();
    }

    @Override
    public Short value5() {
        return getSubstanceId();
    }

    @Override
    public UnitType value6() {
        return getCategoryUnit();
    }

    @Override
    public Float value7() {
        return getEmissionFactor();
    }

    @Override
    public Float value8() {
        return getHeatContent();
    }

    @Override
    public Float value9() {
        return getHeight();
    }

    @Override
    public Float value10() {
        return getSpread();
    }

    @Override
    public Integer value11() {
        return getParticleSizeDistribution();
    }

    @Override
    public Integer value12() {
        return getEmissionDiurnalVariationId();
    }

    @Override
    public String value13() {
        return getEmissionDiurnalVariationCode();
    }

    @Override
    public PlanCategoriesSourceCharacteristicsViewRecord value1(Short value) {
        setPlanCategoryId(value);
        return this;
    }

    @Override
    public PlanCategoriesSourceCharacteristicsViewRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public PlanCategoriesSourceCharacteristicsViewRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public PlanCategoriesSourceCharacteristicsViewRecord value4(Integer value) {
        setGcnSectorId(value);
        return this;
    }

    @Override
    public PlanCategoriesSourceCharacteristicsViewRecord value5(Short value) {
        setSubstanceId(value);
        return this;
    }

    @Override
    public PlanCategoriesSourceCharacteristicsViewRecord value6(UnitType value) {
        setCategoryUnit(value);
        return this;
    }

    @Override
    public PlanCategoriesSourceCharacteristicsViewRecord value7(Float value) {
        setEmissionFactor(value);
        return this;
    }

    @Override
    public PlanCategoriesSourceCharacteristicsViewRecord value8(Float value) {
        setHeatContent(value);
        return this;
    }

    @Override
    public PlanCategoriesSourceCharacteristicsViewRecord value9(Float value) {
        setHeight(value);
        return this;
    }

    @Override
    public PlanCategoriesSourceCharacteristicsViewRecord value10(Float value) {
        setSpread(value);
        return this;
    }

    @Override
    public PlanCategoriesSourceCharacteristicsViewRecord value11(Integer value) {
        setParticleSizeDistribution(value);
        return this;
    }

    @Override
    public PlanCategoriesSourceCharacteristicsViewRecord value12(Integer value) {
        setEmissionDiurnalVariationId(value);
        return this;
    }

    @Override
    public PlanCategoriesSourceCharacteristicsViewRecord value13(String value) {
        setEmissionDiurnalVariationCode(value);
        return this;
    }

    @Override
    public PlanCategoriesSourceCharacteristicsViewRecord values(Short value1, String value2, String value3, Integer value4, Short value5, UnitType value6, Float value7, Float value8, Float value9, Float value10, Integer value11, Integer value12, String value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PlanCategoriesSourceCharacteristicsViewRecord
     */
    public PlanCategoriesSourceCharacteristicsViewRecord() {
        super(PlanCategoriesSourceCharacteristicsView.PLAN_CATEGORIES_SOURCE_CHARACTERISTICS_VIEW);
    }

    /**
     * Create a detached, initialised PlanCategoriesSourceCharacteristicsViewRecord
     */
    public PlanCategoriesSourceCharacteristicsViewRecord(Short planCategoryId, String code, String name, Integer gcnSectorId, Short substanceId, UnitType categoryUnit, Float emissionFactor, Float heatContent, Float height, Float spread, Integer particleSizeDistribution, Integer emissionDiurnalVariationId, String emissionDiurnalVariationCode) {
        super(PlanCategoriesSourceCharacteristicsView.PLAN_CATEGORIES_SOURCE_CHARACTERISTICS_VIEW);

        set(0, planCategoryId);
        set(1, code);
        set(2, name);
        set(3, gcnSectorId);
        set(4, substanceId);
        set(5, categoryUnit);
        set(6, emissionFactor);
        set(7, heatContent);
        set(8, height);
        set(9, spread);
        set(10, particleSizeDistribution);
        set(11, emissionDiurnalVariationId);
        set(12, emissionDiurnalVariationCode);
    }
}