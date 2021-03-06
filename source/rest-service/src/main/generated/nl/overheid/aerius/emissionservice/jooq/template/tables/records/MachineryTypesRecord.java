/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables.records;


import nl.overheid.aerius.emissionservice.jooq.template.tables.MachineryTypes;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * De verschillende soorten werktuigen met naam en sector waarin zij gebruikt 
 * worden.
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/02-tables/machinery_types.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MachineryTypesRecord extends UpdatableRecordImpl<MachineryTypesRecord> implements Record5<Integer, Integer, String, String, Integer> {

    private static final long serialVersionUID = -1373738047;

    /**
     * Setter for <code>template.machinery_types.machinery_type_id</code>.
     */
    public void setMachineryTypeId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>template.machinery_types.machinery_type_id</code>.
     */
    public Integer getMachineryTypeId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>template.machinery_types.sector_id</code>.
     */
    public void setSectorId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>template.machinery_types.sector_id</code>.
     */
    public Integer getSectorId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>template.machinery_types.code</code>.
     */
    public void setCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>template.machinery_types.code</code>.
     */
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>template.machinery_types.name</code>.
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>template.machinery_types.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>template.machinery_types.sort_order</code>.
     */
    public void setSortOrder(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>template.machinery_types.sort_order</code>.
     */
    public Integer getSortOrder() {
        return (Integer) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Integer, String, String, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, Integer, String, String, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return MachineryTypes.MACHINERY_TYPES.MACHINERY_TYPE_ID;
    }

    @Override
    public Field<Integer> field2() {
        return MachineryTypes.MACHINERY_TYPES.SECTOR_ID;
    }

    @Override
    public Field<String> field3() {
        return MachineryTypes.MACHINERY_TYPES.CODE;
    }

    @Override
    public Field<String> field4() {
        return MachineryTypes.MACHINERY_TYPES.NAME;
    }

    @Override
    public Field<Integer> field5() {
        return MachineryTypes.MACHINERY_TYPES.SORT_ORDER;
    }

    @Override
    public Integer component1() {
        return getMachineryTypeId();
    }

    @Override
    public Integer component2() {
        return getSectorId();
    }

    @Override
    public String component3() {
        return getCode();
    }

    @Override
    public String component4() {
        return getName();
    }

    @Override
    public Integer component5() {
        return getSortOrder();
    }

    @Override
    public Integer value1() {
        return getMachineryTypeId();
    }

    @Override
    public Integer value2() {
        return getSectorId();
    }

    @Override
    public String value3() {
        return getCode();
    }

    @Override
    public String value4() {
        return getName();
    }

    @Override
    public Integer value5() {
        return getSortOrder();
    }

    @Override
    public MachineryTypesRecord value1(Integer value) {
        setMachineryTypeId(value);
        return this;
    }

    @Override
    public MachineryTypesRecord value2(Integer value) {
        setSectorId(value);
        return this;
    }

    @Override
    public MachineryTypesRecord value3(String value) {
        setCode(value);
        return this;
    }

    @Override
    public MachineryTypesRecord value4(String value) {
        setName(value);
        return this;
    }

    @Override
    public MachineryTypesRecord value5(Integer value) {
        setSortOrder(value);
        return this;
    }

    @Override
    public MachineryTypesRecord values(Integer value1, Integer value2, String value3, String value4, Integer value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MachineryTypesRecord
     */
    public MachineryTypesRecord() {
        super(MachineryTypes.MACHINERY_TYPES);
    }

    /**
     * Create a detached, initialised MachineryTypesRecord
     */
    public MachineryTypesRecord(Integer machineryTypeId, Integer sectorId, String code, String name, Integer sortOrder) {
        super(MachineryTypes.MACHINERY_TYPES);

        set(0, machineryTypeId);
        set(1, sectorId);
        set(2, code);
        set(3, name);
        set(4, sortOrder);
    }
}
