/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables;


import java.util.Arrays;
import java.util.List;

import nl.overheid.aerius.emissionservice.jooq.i18n.enums.LanguageCodeType;
import nl.overheid.aerius.emissionservice.jooq.template.Keys;
import nl.overheid.aerius.emissionservice.jooq.template.Template;
import nl.overheid.aerius.emissionservice.jooq.template.tables.records.I18nMobileSourceOnRoadCategoriesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * Vertaaltabel voor categorieën van verschillende soorten onroad mobiele 
 * bronnen.
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/i18n/mobile_sources.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class I18nMobileSourceOnRoadCategories extends TableImpl<I18nMobileSourceOnRoadCategoriesRecord> {

    private static final long serialVersionUID = -2125274997;

    /**
     * The reference instance of <code>template.i18n_mobile_source_on_road_categories</code>
     */
    public static final I18nMobileSourceOnRoadCategories I18N_MOBILE_SOURCE_ON_ROAD_CATEGORIES = new I18nMobileSourceOnRoadCategories();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<I18nMobileSourceOnRoadCategoriesRecord> getRecordType() {
        return I18nMobileSourceOnRoadCategoriesRecord.class;
    }

    /**
     * The column <code>template.i18n_mobile_source_on_road_categories.mobile_source_on_road_category_id</code>.
     */
    public final TableField<I18nMobileSourceOnRoadCategoriesRecord, Short> MOBILE_SOURCE_ON_ROAD_CATEGORY_ID = createField(DSL.name("mobile_source_on_road_category_id"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>template.i18n_mobile_source_on_road_categories.language_code</code>.
     */
    public final TableField<I18nMobileSourceOnRoadCategoriesRecord, LanguageCodeType> LANGUAGE_CODE = createField(DSL.name("language_code"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false).asEnumDataType(nl.overheid.aerius.emissionservice.jooq.i18n.enums.LanguageCodeType.class), this, "");

    /**
     * The column <code>template.i18n_mobile_source_on_road_categories.name</code>.
     */
    public final TableField<I18nMobileSourceOnRoadCategoriesRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>template.i18n_mobile_source_on_road_categories.description</code>.
     */
    public final TableField<I18nMobileSourceOnRoadCategoriesRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>template.i18n_mobile_source_on_road_categories</code> table reference
     */
    public I18nMobileSourceOnRoadCategories() {
        this(DSL.name("i18n_mobile_source_on_road_categories"), null);
    }

    /**
     * Create an aliased <code>template.i18n_mobile_source_on_road_categories</code> table reference
     */
    public I18nMobileSourceOnRoadCategories(String alias) {
        this(DSL.name(alias), I18N_MOBILE_SOURCE_ON_ROAD_CATEGORIES);
    }

    /**
     * Create an aliased <code>template.i18n_mobile_source_on_road_categories</code> table reference
     */
    public I18nMobileSourceOnRoadCategories(Name alias) {
        this(alias, I18N_MOBILE_SOURCE_ON_ROAD_CATEGORIES);
    }

    private I18nMobileSourceOnRoadCategories(Name alias, Table<I18nMobileSourceOnRoadCategoriesRecord> aliased) {
        this(alias, aliased, null);
    }

    private I18nMobileSourceOnRoadCategories(Name alias, Table<I18nMobileSourceOnRoadCategoriesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Vertaaltabel voor categorieën van verschillende soorten onroad mobiele bronnen.\r\n\r\n@file source/database/src/main/sql/template/02_emission_factors/i18n/mobile_sources.sql"), TableOptions.table());
    }

    public <O extends Record> I18nMobileSourceOnRoadCategories(Table<O> child, ForeignKey<O, I18nMobileSourceOnRoadCategoriesRecord> key) {
        super(child, key, I18N_MOBILE_SOURCE_ON_ROAD_CATEGORIES);
    }

    @Override
    public Schema getSchema() {
        return Template.TEMPLATE;
    }

    @Override
    public UniqueKey<I18nMobileSourceOnRoadCategoriesRecord> getPrimaryKey() {
        return Keys.I18N_MOBILE_SOURCE_ON_ROAD_CATEGORIES_PKEY;
    }

    @Override
    public List<UniqueKey<I18nMobileSourceOnRoadCategoriesRecord>> getKeys() {
        return Arrays.<UniqueKey<I18nMobileSourceOnRoadCategoriesRecord>>asList(Keys.I18N_MOBILE_SOURCE_ON_ROAD_CATEGORIES_PKEY);
    }

    @Override
    public List<ForeignKey<I18nMobileSourceOnRoadCategoriesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<I18nMobileSourceOnRoadCategoriesRecord, ?>>asList(Keys.I18N_MOBILE_SOURCE_ON_ROAD_CATEGORIES__I18N_MOBILE_SOURCE_ON_ROAD_CATEGORIES_FKEY);
    }

    public MobileSourceOnRoadCategories mobileSourceOnRoadCategories() {
        return new MobileSourceOnRoadCategories(this, Keys.I18N_MOBILE_SOURCE_ON_ROAD_CATEGORIES__I18N_MOBILE_SOURCE_ON_ROAD_CATEGORIES_FKEY);
    }

    @Override
    public I18nMobileSourceOnRoadCategories as(String alias) {
        return new I18nMobileSourceOnRoadCategories(DSL.name(alias), this);
    }

    @Override
    public I18nMobileSourceOnRoadCategories as(Name alias) {
        return new I18nMobileSourceOnRoadCategories(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nMobileSourceOnRoadCategories rename(String name) {
        return new I18nMobileSourceOnRoadCategories(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nMobileSourceOnRoadCategories rename(Name name) {
        return new I18nMobileSourceOnRoadCategories(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Short, LanguageCodeType, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
