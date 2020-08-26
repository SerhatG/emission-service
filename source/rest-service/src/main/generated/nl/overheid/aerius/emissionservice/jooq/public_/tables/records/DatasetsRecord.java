/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.public_.tables.records;


import nl.overheid.aerius.emissionservice.jooq.public_.tables.Datasets;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * De verschillende datasets die beschikbaar zijn.
 * De data voor elke dataset bevindt zich in een eigen database schema.
 * 
 * @file source/database/src/main/sql/datasets/02-tables.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DatasetsRecord extends UpdatableRecordImpl<DatasetsRecord> implements Record5<String, String, String, Boolean, String> {

    private static final long serialVersionUID = -1136389175;

    /**
     * Setter for <code>public.datasets.code</code>.
     */
    public void setCode(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.datasets.code</code>.
     */
    public String getCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.datasets.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.datasets.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.datasets.schema_name</code>.
     */
    public void setSchemaName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.datasets.schema_name</code>.
     */
    public String getSchemaName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.datasets.current</code>.
     */
    public void setCurrent(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.datasets.current</code>.
     */
    public Boolean getCurrent() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>public.datasets.description</code>.
     */
    public void setDescription(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.datasets.description</code>.
     */
    public String getDescription() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, Boolean, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, String, String, Boolean, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Datasets.DATASETS.CODE;
    }

    @Override
    public Field<String> field2() {
        return Datasets.DATASETS.NAME;
    }

    @Override
    public Field<String> field3() {
        return Datasets.DATASETS.SCHEMA_NAME;
    }

    @Override
    public Field<Boolean> field4() {
        return Datasets.DATASETS.CURRENT;
    }

    @Override
    public Field<String> field5() {
        return Datasets.DATASETS.DESCRIPTION;
    }

    @Override
    public String component1() {
        return getCode();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getSchemaName();
    }

    @Override
    public Boolean component4() {
        return getCurrent();
    }

    @Override
    public String component5() {
        return getDescription();
    }

    @Override
    public String value1() {
        return getCode();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getSchemaName();
    }

    @Override
    public Boolean value4() {
        return getCurrent();
    }

    @Override
    public String value5() {
        return getDescription();
    }

    @Override
    public DatasetsRecord value1(String value) {
        setCode(value);
        return this;
    }

    @Override
    public DatasetsRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public DatasetsRecord value3(String value) {
        setSchemaName(value);
        return this;
    }

    @Override
    public DatasetsRecord value4(Boolean value) {
        setCurrent(value);
        return this;
    }

    @Override
    public DatasetsRecord value5(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public DatasetsRecord values(String value1, String value2, String value3, Boolean value4, String value5) {
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
     * Create a detached DatasetsRecord
     */
    public DatasetsRecord() {
        super(Datasets.DATASETS);
    }

    /**
     * Create a detached, initialised DatasetsRecord
     */
    public DatasetsRecord(String code, String name, String schemaName, Boolean current, String description) {
        super(Datasets.DATASETS);

        set(0, code);
        set(1, name);
        set(2, schemaName);
        set(3, current);
        set(4, description);
    }
}
