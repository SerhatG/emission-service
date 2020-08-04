/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables;


import java.util.Arrays;
import java.util.List;

import nl.overheid.aerius.emissionservice.jooq.template.Keys;
import nl.overheid.aerius.emissionservice.jooq.template.Template;
import nl.overheid.aerius.emissionservice.jooq.template.tables.records.FarmLodgingTypesToLodgingSystemDefinitionsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * Koppeling tussen stalsystemen en stalbeschrijvingen (N:N).
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/02-tables/farms.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FarmLodgingTypesToLodgingSystemDefinitions extends TableImpl<FarmLodgingTypesToLodgingSystemDefinitionsRecord> {

    private static final long serialVersionUID = -836985556;

    /**
     * The reference instance of <code>template.farm_lodging_types_to_lodging_system_definitions</code>
     */
    public static final FarmLodgingTypesToLodgingSystemDefinitions FARM_LODGING_TYPES_TO_LODGING_SYSTEM_DEFINITIONS = new FarmLodgingTypesToLodgingSystemDefinitions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FarmLodgingTypesToLodgingSystemDefinitionsRecord> getRecordType() {
        return FarmLodgingTypesToLodgingSystemDefinitionsRecord.class;
    }

    /**
     * The column <code>template.farm_lodging_types_to_lodging_system_definitions.farm_lodging_type_id</code>.
     */
    public final TableField<FarmLodgingTypesToLodgingSystemDefinitionsRecord, Integer> FARM_LODGING_TYPE_ID = createField(DSL.name("farm_lodging_type_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>template.farm_lodging_types_to_lodging_system_definitions.farm_lodging_system_definition_id</code>.
     */
    public final TableField<FarmLodgingTypesToLodgingSystemDefinitionsRecord, Integer> FARM_LODGING_SYSTEM_DEFINITION_ID = createField(DSL.name("farm_lodging_system_definition_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>template.farm_lodging_types_to_lodging_system_definitions</code> table reference
     */
    public FarmLodgingTypesToLodgingSystemDefinitions() {
        this(DSL.name("farm_lodging_types_to_lodging_system_definitions"), null);
    }

    /**
     * Create an aliased <code>template.farm_lodging_types_to_lodging_system_definitions</code> table reference
     */
    public FarmLodgingTypesToLodgingSystemDefinitions(String alias) {
        this(DSL.name(alias), FARM_LODGING_TYPES_TO_LODGING_SYSTEM_DEFINITIONS);
    }

    /**
     * Create an aliased <code>template.farm_lodging_types_to_lodging_system_definitions</code> table reference
     */
    public FarmLodgingTypesToLodgingSystemDefinitions(Name alias) {
        this(alias, FARM_LODGING_TYPES_TO_LODGING_SYSTEM_DEFINITIONS);
    }

    private FarmLodgingTypesToLodgingSystemDefinitions(Name alias, Table<FarmLodgingTypesToLodgingSystemDefinitionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private FarmLodgingTypesToLodgingSystemDefinitions(Name alias, Table<FarmLodgingTypesToLodgingSystemDefinitionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Koppeling tussen stalsystemen en stalbeschrijvingen (N:N).\r\n\r\n@file source/database/src/main/sql/template/02_emission_factors/02-tables/farms.sql"), TableOptions.table());
    }

    public <O extends Record> FarmLodgingTypesToLodgingSystemDefinitions(Table<O> child, ForeignKey<O, FarmLodgingTypesToLodgingSystemDefinitionsRecord> key) {
        super(child, key, FARM_LODGING_TYPES_TO_LODGING_SYSTEM_DEFINITIONS);
    }

    @Override
    public Schema getSchema() {
        return Template.TEMPLATE;
    }

    @Override
    public UniqueKey<FarmLodgingTypesToLodgingSystemDefinitionsRecord> getPrimaryKey() {
        return Keys.FARM_LODGING_TYPES_TO_LODGING_SYSTEM_DEFINITIONS_PKEY;
    }

    @Override
    public List<UniqueKey<FarmLodgingTypesToLodgingSystemDefinitionsRecord>> getKeys() {
        return Arrays.<UniqueKey<FarmLodgingTypesToLodgingSystemDefinitionsRecord>>asList(Keys.FARM_LODGING_TYPES_TO_LODGING_SYSTEM_DEFINITIONS_PKEY);
    }

    @Override
    public List<ForeignKey<FarmLodgingTypesToLodgingSystemDefinitionsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<FarmLodgingTypesToLodgingSystemDefinitionsRecord, ?>>asList(Keys.FARM_LODGING_TYPES_TO_LODGING_SYSTEM_DEFINITIONS__FARM_LODGING_TYPES_TO_LODGING_SYSTEM_DEFINITIONS_FKEY_TYPES, Keys.FARM_LODGING_TYPES_TO_LODGING_SYSTEM_DEFINITIONS__FARM_LODGING_TYPES_TO_LODGING_SYSTEM_DEFINITIONS_FKEY_DEFS);
    }

    public FarmLodgingTypes farmLodgingTypes() {
        return new FarmLodgingTypes(this, Keys.FARM_LODGING_TYPES_TO_LODGING_SYSTEM_DEFINITIONS__FARM_LODGING_TYPES_TO_LODGING_SYSTEM_DEFINITIONS_FKEY_TYPES);
    }

    public FarmLodgingSystemDefinitions farmLodgingSystemDefinitions() {
        return new FarmLodgingSystemDefinitions(this, Keys.FARM_LODGING_TYPES_TO_LODGING_SYSTEM_DEFINITIONS__FARM_LODGING_TYPES_TO_LODGING_SYSTEM_DEFINITIONS_FKEY_DEFS);
    }

    @Override
    public FarmLodgingTypesToLodgingSystemDefinitions as(String alias) {
        return new FarmLodgingTypesToLodgingSystemDefinitions(DSL.name(alias), this);
    }

    @Override
    public FarmLodgingTypesToLodgingSystemDefinitions as(Name alias) {
        return new FarmLodgingTypesToLodgingSystemDefinitions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FarmLodgingTypesToLodgingSystemDefinitions rename(String name) {
        return new FarmLodgingTypesToLodgingSystemDefinitions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FarmLodgingTypesToLodgingSystemDefinitions rename(Name name) {
        return new FarmLodgingTypesToLodgingSystemDefinitions(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
