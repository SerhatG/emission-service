/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.public_.tables;


import java.util.Arrays;
import java.util.List;

import nl.overheid.aerius.emissionservice.jooq.public_.Keys;
import nl.overheid.aerius.emissionservice.jooq.public_.Public;
import nl.overheid.aerius.emissionservice.jooq.public_.tables.records.DatasetsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * De verschillende datasets die beschikbaar zijn.
 * De data voor elke dataset bevindt zich in een eigen database schema.
 * 
 * @file source/database/src/main/sql/datasets/02-tables.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Datasets extends TableImpl<DatasetsRecord> {

    private static final long serialVersionUID = 1535255942;

    /**
     * The reference instance of <code>public.datasets</code>
     */
    public static final Datasets DATASETS = new Datasets();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DatasetsRecord> getRecordType() {
        return DatasetsRecord.class;
    }

    /**
     * The column <code>public.datasets.code</code>.
     */
    public final TableField<DatasetsRecord, String> CODE = createField(DSL.name("code"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.datasets.name</code>.
     */
    public final TableField<DatasetsRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.datasets.schema_name</code>.
     */
    public final TableField<DatasetsRecord, String> SCHEMA_NAME = createField(DSL.name("schema_name"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.datasets.current</code>.
     */
    public final TableField<DatasetsRecord, Boolean> CURRENT = createField(DSL.name("current"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>public.datasets.description</code>.
     */
    public final TableField<DatasetsRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.datasets</code> table reference
     */
    public Datasets() {
        this(DSL.name("datasets"), null);
    }

    /**
     * Create an aliased <code>public.datasets</code> table reference
     */
    public Datasets(String alias) {
        this(DSL.name(alias), DATASETS);
    }

    /**
     * Create an aliased <code>public.datasets</code> table reference
     */
    public Datasets(Name alias) {
        this(alias, DATASETS);
    }

    private Datasets(Name alias, Table<DatasetsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Datasets(Name alias, Table<DatasetsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("De verschillende datasets die beschikbaar zijn.\r\nDe data voor elke dataset bevindt zich in een eigen database schema.\r\n\r\n@file source/database/src/main/sql/datasets/02-tables.sql"), TableOptions.table());
    }

    public <O extends Record> Datasets(Table<O> child, ForeignKey<O, DatasetsRecord> key) {
        super(child, key, DATASETS);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<DatasetsRecord> getPrimaryKey() {
        return Keys.DATASETS_PKEY;
    }

    @Override
    public List<UniqueKey<DatasetsRecord>> getKeys() {
        return Arrays.<UniqueKey<DatasetsRecord>>asList(Keys.DATASETS_PKEY, Keys.DATASETS_NAME_KEY);
    }

    @Override
    public Datasets as(String alias) {
        return new Datasets(DSL.name(alias), this);
    }

    @Override
    public Datasets as(Name alias) {
        return new Datasets(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Datasets rename(String name) {
        return new Datasets(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Datasets rename(Name name) {
        return new Datasets(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, Boolean, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
