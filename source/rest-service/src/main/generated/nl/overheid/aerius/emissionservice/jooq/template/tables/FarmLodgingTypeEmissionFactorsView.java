/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables;


import nl.overheid.aerius.emissionservice.jooq.template.Template;
import nl.overheid.aerius.emissionservice.jooq.template.tables.records.FarmLodgingTypeEmissionFactorsViewRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * Geeft de eigenschappen van een stalsysteem, inclusief code, beschrijving, 
 * diercategorie, emissiefactoren, of het een luchtwasser is, het bijbehorende 
 * traditionele stalsysteem, en de stalbeschrijvingen die er bij gekozen kunnen 
 * worden.
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/04-views/farms.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FarmLodgingTypeEmissionFactorsView extends TableImpl<FarmLodgingTypeEmissionFactorsViewRecord> {

    private static final long serialVersionUID = -1245852385;

    /**
     * The reference instance of <code>template.farm_lodging_type_emission_factors_view</code>
     */
    public static final FarmLodgingTypeEmissionFactorsView FARM_LODGING_TYPE_EMISSION_FACTORS_VIEW = new FarmLodgingTypeEmissionFactorsView();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FarmLodgingTypeEmissionFactorsViewRecord> getRecordType() {
        return FarmLodgingTypeEmissionFactorsViewRecord.class;
    }

    /**
     * The column <code>template.farm_lodging_type_emission_factors_view.farm_lodging_type_id</code>.
     */
    public final TableField<FarmLodgingTypeEmissionFactorsViewRecord, Integer> FARM_LODGING_TYPE_ID = createField(DSL.name("farm_lodging_type_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>template.farm_lodging_type_emission_factors_view.code</code>.
     */
    public final TableField<FarmLodgingTypeEmissionFactorsViewRecord, String> CODE = createField(DSL.name("code"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>template.farm_lodging_type_emission_factors_view.name</code>.
     */
    public final TableField<FarmLodgingTypeEmissionFactorsViewRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>template.farm_lodging_type_emission_factors_view.description</code>.
     */
    public final TableField<FarmLodgingTypeEmissionFactorsViewRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>template.farm_lodging_type_emission_factors_view.farm_animal_category_id</code>.
     */
    public final TableField<FarmLodgingTypeEmissionFactorsViewRecord, Integer> FARM_ANIMAL_CATEGORY_ID = createField(DSL.name("farm_animal_category_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>template.farm_lodging_type_emission_factors_view.farm_lodging_system_definition_id</code>.
     */
    public final TableField<FarmLodgingTypeEmissionFactorsViewRecord, Integer> FARM_LODGING_SYSTEM_DEFINITION_ID = createField(DSL.name("farm_lodging_system_definition_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>template.farm_lodging_type_emission_factors_view.substance_id</code>.
     */
    public final TableField<FarmLodgingTypeEmissionFactorsViewRecord, Short> SUBSTANCE_ID = createField(DSL.name("substance_id"), org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>template.farm_lodging_type_emission_factors_view.emission_factor</code>.
     */
    public final TableField<FarmLodgingTypeEmissionFactorsViewRecord, Float> EMISSION_FACTOR = createField(DSL.name("emission_factor"), org.jooq.impl.SQLDataType.REAL, this, "");

    /**
     * The column <code>template.farm_lodging_type_emission_factors_view.farm_other_lodging_type_id</code>.
     */
    public final TableField<FarmLodgingTypeEmissionFactorsViewRecord, Integer> FARM_OTHER_LODGING_TYPE_ID = createField(DSL.name("farm_other_lodging_type_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>template.farm_lodging_type_emission_factors_view.scrubber</code>.
     */
    public final TableField<FarmLodgingTypeEmissionFactorsViewRecord, Boolean> SCRUBBER = createField(DSL.name("scrubber"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * Create a <code>template.farm_lodging_type_emission_factors_view</code> table reference
     */
    public FarmLodgingTypeEmissionFactorsView() {
        this(DSL.name("farm_lodging_type_emission_factors_view"), null);
    }

    /**
     * Create an aliased <code>template.farm_lodging_type_emission_factors_view</code> table reference
     */
    public FarmLodgingTypeEmissionFactorsView(String alias) {
        this(DSL.name(alias), FARM_LODGING_TYPE_EMISSION_FACTORS_VIEW);
    }

    /**
     * Create an aliased <code>template.farm_lodging_type_emission_factors_view</code> table reference
     */
    public FarmLodgingTypeEmissionFactorsView(Name alias) {
        this(alias, FARM_LODGING_TYPE_EMISSION_FACTORS_VIEW);
    }

    private FarmLodgingTypeEmissionFactorsView(Name alias, Table<FarmLodgingTypeEmissionFactorsViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private FarmLodgingTypeEmissionFactorsView(Name alias, Table<FarmLodgingTypeEmissionFactorsViewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Geeft de eigenschappen van een stalsysteem, inclusief code, beschrijving, diercategorie, emissiefactoren, of het een luchtwasser is, het bijbehorende traditionele stalsysteem, en de stalbeschrijvingen die er bij gekozen kunnen worden.\r\n\r\n@file source/database/src/main/sql/template/02_emission_factors/04-views/farms.sql"), TableOptions.view("create view \"farm_lodging_type_emission_factors_view\" as  SELECT farm_lodging_types.farm_lodging_type_id,\n    farm_lodging_types.code,\n    farm_lodging_types.name,\n    farm_lodging_types.description,\n    farm_lodging_types.farm_animal_category_id,\n    farm_lodging_types_to_lodging_system_definitions.farm_lodging_system_definition_id,\n    farm_lodging_type_emission_factors.substance_id,\n    farm_lodging_type_emission_factors.emission_factor,\n    farm_lodging_types_other_lodging_type.farm_other_lodging_type_id,\n    farm_lodging_types.scrubber\n   FROM ((((template.farm_lodging_types\n     JOIN template.farm_animal_categories USING (farm_animal_category_id))\n     JOIN template.farm_lodging_types_to_lodging_system_definitions USING (farm_lodging_type_id))\n     JOIN template.farm_lodging_type_emission_factors USING (farm_lodging_type_id))\n     LEFT JOIN template.farm_lodging_types_other_lodging_type USING (farm_lodging_type_id))\n  ORDER BY (\"left\"(farm_lodging_types.code, 1)), (string_to_array(\"right\"(farm_lodging_types.code, '-1'::integer), '.'::text))::integer[];"));
    }

    public <O extends Record> FarmLodgingTypeEmissionFactorsView(Table<O> child, ForeignKey<O, FarmLodgingTypeEmissionFactorsViewRecord> key) {
        super(child, key, FARM_LODGING_TYPE_EMISSION_FACTORS_VIEW);
    }

    @Override
    public Schema getSchema() {
        return Template.TEMPLATE;
    }

    @Override
    public FarmLodgingTypeEmissionFactorsView as(String alias) {
        return new FarmLodgingTypeEmissionFactorsView(DSL.name(alias), this);
    }

    @Override
    public FarmLodgingTypeEmissionFactorsView as(Name alias) {
        return new FarmLodgingTypeEmissionFactorsView(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FarmLodgingTypeEmissionFactorsView rename(String name) {
        return new FarmLodgingTypeEmissionFactorsView(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FarmLodgingTypeEmissionFactorsView rename(Name name) {
        return new FarmLodgingTypeEmissionFactorsView(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, String, String, String, Integer, Integer, Short, Float, Integer, Boolean> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}