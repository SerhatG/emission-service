/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.public_.tables.records;


import nl.overheid.aerius.emissionservice.jooq.i18n.enums.LanguageCodeType;
import nl.overheid.aerius.emissionservice.jooq.public_.tables.I18nDatasets;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Vertaaltabel voor de verschillende datasets die beschikbaar zijn.
 * 
 * @file source/database/src/main/sql/datasets/02-tables.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class I18nDatasetsRecord extends UpdatableRecordImpl<I18nDatasetsRecord> implements Record4<String, LanguageCodeType, String, String> {

    private static final long serialVersionUID = 1608103455;

    /**
     * Setter for <code>public.i18n_datasets.code</code>.
     */
    public void setCode(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.i18n_datasets.code</code>.
     */
    public String getCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.i18n_datasets.language_code</code>.
     */
    public void setLanguageCode(LanguageCodeType value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.i18n_datasets.language_code</code>.
     */
    public LanguageCodeType getLanguageCode() {
        return (LanguageCodeType) get(1);
    }

    /**
     * Setter for <code>public.i18n_datasets.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.i18n_datasets.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.i18n_datasets.description</code>.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.i18n_datasets.description</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, LanguageCodeType> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, LanguageCodeType, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, LanguageCodeType, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return I18nDatasets.I18N_DATASETS.CODE;
    }

    @Override
    public Field<LanguageCodeType> field2() {
        return I18nDatasets.I18N_DATASETS.LANGUAGE_CODE;
    }

    @Override
    public Field<String> field3() {
        return I18nDatasets.I18N_DATASETS.NAME;
    }

    @Override
    public Field<String> field4() {
        return I18nDatasets.I18N_DATASETS.DESCRIPTION;
    }

    @Override
    public String component1() {
        return getCode();
    }

    @Override
    public LanguageCodeType component2() {
        return getLanguageCode();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public String component4() {
        return getDescription();
    }

    @Override
    public String value1() {
        return getCode();
    }

    @Override
    public LanguageCodeType value2() {
        return getLanguageCode();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public String value4() {
        return getDescription();
    }

    @Override
    public I18nDatasetsRecord value1(String value) {
        setCode(value);
        return this;
    }

    @Override
    public I18nDatasetsRecord value2(LanguageCodeType value) {
        setLanguageCode(value);
        return this;
    }

    @Override
    public I18nDatasetsRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public I18nDatasetsRecord value4(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public I18nDatasetsRecord values(String value1, LanguageCodeType value2, String value3, String value4) {
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
     * Create a detached I18nDatasetsRecord
     */
    public I18nDatasetsRecord() {
        super(I18nDatasets.I18N_DATASETS);
    }

    /**
     * Create a detached, initialised I18nDatasetsRecord
     */
    public I18nDatasetsRecord(String code, LanguageCodeType languageCode, String name, String description) {
        super(I18nDatasets.I18N_DATASETS);

        set(0, code);
        set(1, languageCode);
        set(2, name);
        set(3, description);
    }
}