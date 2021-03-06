/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables.records;


import nl.overheid.aerius.emissionservice.jooq.template.tables.FarmlandCategoriesView;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * View retourneert de landbouwgrond categoriëen.
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/04-views/farmlands.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FarmlandCategoriesViewRecord extends TableRecordImpl<FarmlandCategoriesViewRecord> implements Record4<Short, String, String, Integer> {

    private static final long serialVersionUID = 381430759;

    /**
     * Setter for <code>template.farmland_categories_view.farmland_category_id</code>.
     */
    public void setFarmlandCategoryId(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>template.farmland_categories_view.farmland_category_id</code>.
     */
    public Short getFarmlandCategoryId() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>template.farmland_categories_view.code</code>.
     */
    public void setCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>template.farmland_categories_view.code</code>.
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>template.farmland_categories_view.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>template.farmland_categories_view.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>template.farmland_categories_view.gcn_sector_id</code>.
     */
    public void setGcnSectorId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>template.farmland_categories_view.gcn_sector_id</code>.
     */
    public Integer getGcnSectorId() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Short, String, String, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Short, String, String, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Short> field1() {
        return FarmlandCategoriesView.FARMLAND_CATEGORIES_VIEW.FARMLAND_CATEGORY_ID;
    }

    @Override
    public Field<String> field2() {
        return FarmlandCategoriesView.FARMLAND_CATEGORIES_VIEW.CODE;
    }

    @Override
    public Field<String> field3() {
        return FarmlandCategoriesView.FARMLAND_CATEGORIES_VIEW.NAME;
    }

    @Override
    public Field<Integer> field4() {
        return FarmlandCategoriesView.FARMLAND_CATEGORIES_VIEW.GCN_SECTOR_ID;
    }

    @Override
    public Short component1() {
        return getFarmlandCategoryId();
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
    public Short value1() {
        return getFarmlandCategoryId();
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
    public FarmlandCategoriesViewRecord value1(Short value) {
        setFarmlandCategoryId(value);
        return this;
    }

    @Override
    public FarmlandCategoriesViewRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public FarmlandCategoriesViewRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public FarmlandCategoriesViewRecord value4(Integer value) {
        setGcnSectorId(value);
        return this;
    }

    @Override
    public FarmlandCategoriesViewRecord values(Short value1, String value2, String value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FarmlandCategoriesViewRecord
     */
    public FarmlandCategoriesViewRecord() {
        super(FarmlandCategoriesView.FARMLAND_CATEGORIES_VIEW);
    }

    /**
     * Create a detached, initialised FarmlandCategoriesViewRecord
     */
    public FarmlandCategoriesViewRecord(Short farmlandCategoryId, String code, String name, Integer gcnSectorId) {
        super(FarmlandCategoriesView.FARMLAND_CATEGORIES_VIEW);

        set(0, farmlandCategoryId);
        set(1, code);
        set(2, name);
        set(3, gcnSectorId);
    }
}
