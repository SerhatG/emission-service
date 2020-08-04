/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables;


import java.util.Arrays;
import java.util.List;

import nl.overheid.aerius.emissionservice.jooq.template.Keys;
import nl.overheid.aerius.emissionservice.jooq.template.Template;
import nl.overheid.aerius.emissionservice.jooq.template.tables.records.MachineryFuelTypesRecord;

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
 * De verschillende soorten brandstof voor werktuigen.
 * @column density soortelijk gewicht in kg/liter.
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/02-tables/machinery_types.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MachineryFuelTypes extends TableImpl<MachineryFuelTypesRecord> {

    private static final long serialVersionUID = -1579493182;

    /**
     * The reference instance of <code>template.machinery_fuel_types</code>
     */
    public static final MachineryFuelTypes MACHINERY_FUEL_TYPES = new MachineryFuelTypes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MachineryFuelTypesRecord> getRecordType() {
        return MachineryFuelTypesRecord.class;
    }

    /**
     * The column <code>template.machinery_fuel_types.machinery_fuel_type_id</code>.
     */
    public final TableField<MachineryFuelTypesRecord, Integer> MACHINERY_FUEL_TYPE_ID = createField(DSL.name("machinery_fuel_type_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>template.machinery_fuel_types.code</code>.
     */
    public final TableField<MachineryFuelTypesRecord, String> CODE = createField(DSL.name("code"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>template.machinery_fuel_types.name</code>.
     */
    public final TableField<MachineryFuelTypesRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>template.machinery_fuel_types.density</code>.
     */
    public final TableField<MachineryFuelTypesRecord, Float> DENSITY = createField(DSL.name("density"), org.jooq.impl.SQLDataType.REAL.nullable(false), this, "");

    /**
     * Create a <code>template.machinery_fuel_types</code> table reference
     */
    public MachineryFuelTypes() {
        this(DSL.name("machinery_fuel_types"), null);
    }

    /**
     * Create an aliased <code>template.machinery_fuel_types</code> table reference
     */
    public MachineryFuelTypes(String alias) {
        this(DSL.name(alias), MACHINERY_FUEL_TYPES);
    }

    /**
     * Create an aliased <code>template.machinery_fuel_types</code> table reference
     */
    public MachineryFuelTypes(Name alias) {
        this(alias, MACHINERY_FUEL_TYPES);
    }

    private MachineryFuelTypes(Name alias, Table<MachineryFuelTypesRecord> aliased) {
        this(alias, aliased, null);
    }

    private MachineryFuelTypes(Name alias, Table<MachineryFuelTypesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("De verschillende soorten brandstof voor werktuigen.\r\n@column density soortelijk gewicht in kg/liter.\r\n\r\n@file source/database/src/main/sql/template/02_emission_factors/02-tables/machinery_types.sql"), TableOptions.table());
    }

    public <O extends Record> MachineryFuelTypes(Table<O> child, ForeignKey<O, MachineryFuelTypesRecord> key) {
        super(child, key, MACHINERY_FUEL_TYPES);
    }

    @Override
    public Schema getSchema() {
        return Template.TEMPLATE;
    }

    @Override
    public UniqueKey<MachineryFuelTypesRecord> getPrimaryKey() {
        return Keys.MACHINERY_FUEL_TYPES_PKEY;
    }

    @Override
    public List<UniqueKey<MachineryFuelTypesRecord>> getKeys() {
        return Arrays.<UniqueKey<MachineryFuelTypesRecord>>asList(Keys.MACHINERY_FUEL_TYPES_PKEY, Keys.MACHINERY_FUEL_TYPES_CODE_KEY, Keys.MACHINERY_FUEL_TYPES_NAME_KEY);
    }

    @Override
    public MachineryFuelTypes as(String alias) {
        return new MachineryFuelTypes(DSL.name(alias), this);
    }

    @Override
    public MachineryFuelTypes as(Name alias) {
        return new MachineryFuelTypes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MachineryFuelTypes rename(String name) {
        return new MachineryFuelTypes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MachineryFuelTypes rename(Name name) {
        return new MachineryFuelTypes(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, Float> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
