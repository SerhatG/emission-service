/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables;


import java.util.Arrays;
import java.util.List;

import nl.overheid.aerius.emissionservice.jooq.i18n.enums.LanguageCodeType;
import nl.overheid.aerius.emissionservice.jooq.template.Keys;
import nl.overheid.aerius.emissionservice.jooq.template.Template;
import nl.overheid.aerius.emissionservice.jooq.template.tables.records.I18nFarmLodgingFodderMeasuresRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * Vertaaltabel voor voer- en managementmaatregelen.
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/i18n/farms.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class I18nFarmLodgingFodderMeasures extends TableImpl<I18nFarmLodgingFodderMeasuresRecord> {

    private static final long serialVersionUID = 1439383871;

    /**
     * The reference instance of <code>template.i18n_farm_lodging_fodder_measures</code>
     */
    public static final I18nFarmLodgingFodderMeasures I18N_FARM_LODGING_FODDER_MEASURES = new I18nFarmLodgingFodderMeasures();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<I18nFarmLodgingFodderMeasuresRecord> getRecordType() {
        return I18nFarmLodgingFodderMeasuresRecord.class;
    }

    /**
     * The column <code>template.i18n_farm_lodging_fodder_measures.farm_lodging_fodder_measure_id</code>.
     */
    public final TableField<I18nFarmLodgingFodderMeasuresRecord, Integer> FARM_LODGING_FODDER_MEASURE_ID = createField(DSL.name("farm_lodging_fodder_measure_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>template.i18n_farm_lodging_fodder_measures.language_code</code>.
     */
    public final TableField<I18nFarmLodgingFodderMeasuresRecord, LanguageCodeType> LANGUAGE_CODE = createField(DSL.name("language_code"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false).asEnumDataType(nl.overheid.aerius.emissionservice.jooq.i18n.enums.LanguageCodeType.class), this, "");

    /**
     * The column <code>template.i18n_farm_lodging_fodder_measures.description</code>.
     */
    public final TableField<I18nFarmLodgingFodderMeasuresRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>template.i18n_farm_lodging_fodder_measures</code> table reference
     */
    public I18nFarmLodgingFodderMeasures() {
        this(DSL.name("i18n_farm_lodging_fodder_measures"), null);
    }

    /**
     * Create an aliased <code>template.i18n_farm_lodging_fodder_measures</code> table reference
     */
    public I18nFarmLodgingFodderMeasures(String alias) {
        this(DSL.name(alias), I18N_FARM_LODGING_FODDER_MEASURES);
    }

    /**
     * Create an aliased <code>template.i18n_farm_lodging_fodder_measures</code> table reference
     */
    public I18nFarmLodgingFodderMeasures(Name alias) {
        this(alias, I18N_FARM_LODGING_FODDER_MEASURES);
    }

    private I18nFarmLodgingFodderMeasures(Name alias, Table<I18nFarmLodgingFodderMeasuresRecord> aliased) {
        this(alias, aliased, null);
    }

    private I18nFarmLodgingFodderMeasures(Name alias, Table<I18nFarmLodgingFodderMeasuresRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Vertaaltabel voor voer- en managementmaatregelen.\r\n\r\n@file source/database/src/main/sql/template/02_emission_factors/i18n/farms.sql"), TableOptions.table());
    }

    public <O extends Record> I18nFarmLodgingFodderMeasures(Table<O> child, ForeignKey<O, I18nFarmLodgingFodderMeasuresRecord> key) {
        super(child, key, I18N_FARM_LODGING_FODDER_MEASURES);
    }

    @Override
    public Schema getSchema() {
        return Template.TEMPLATE;
    }

    @Override
    public UniqueKey<I18nFarmLodgingFodderMeasuresRecord> getPrimaryKey() {
        return Keys.I18N_FARM_LODGING_FODDER_MEASURES_PKEY;
    }

    @Override
    public List<UniqueKey<I18nFarmLodgingFodderMeasuresRecord>> getKeys() {
        return Arrays.<UniqueKey<I18nFarmLodgingFodderMeasuresRecord>>asList(Keys.I18N_FARM_LODGING_FODDER_MEASURES_PKEY);
    }

    @Override
    public List<ForeignKey<I18nFarmLodgingFodderMeasuresRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<I18nFarmLodgingFodderMeasuresRecord, ?>>asList(Keys.I18N_FARM_LODGING_FODDER_MEASURES__I18N_FARM_LODGING_FODDER_MEASURES_FKEY);
    }

    public FarmLodgingFodderMeasures farmLodgingFodderMeasures() {
        return new FarmLodgingFodderMeasures(this, Keys.I18N_FARM_LODGING_FODDER_MEASURES__I18N_FARM_LODGING_FODDER_MEASURES_FKEY);
    }

    @Override
    public I18nFarmLodgingFodderMeasures as(String alias) {
        return new I18nFarmLodgingFodderMeasures(DSL.name(alias), this);
    }

    @Override
    public I18nFarmLodgingFodderMeasures as(Name alias) {
        return new I18nFarmLodgingFodderMeasures(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nFarmLodgingFodderMeasures rename(String name) {
        return new I18nFarmLodgingFodderMeasures(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nFarmLodgingFodderMeasures rename(Name name) {
        return new I18nFarmLodgingFodderMeasures(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, LanguageCodeType, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
