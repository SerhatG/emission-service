/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables;


import java.util.Arrays;
import java.util.List;

import nl.overheid.aerius.emissionservice.jooq.template.Keys;
import nl.overheid.aerius.emissionservice.jooq.template.Template;
import nl.overheid.aerius.emissionservice.jooq.template.tables.records.FarmlandCategoriesRecord;

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
 * De categorieën van verschillende soorten landbouwgrond activiteiten 
 * De naam is hierbij de identificatie van de categorie voor de gebruiker.
 * 
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/02-tables/farmlands.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FarmlandCategories extends TableImpl<FarmlandCategoriesRecord> {

    private static final long serialVersionUID = 1204068105;

    /**
     * The reference instance of <code>template.farmland_categories</code>
     */
    public static final FarmlandCategories FARMLAND_CATEGORIES = new FarmlandCategories();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FarmlandCategoriesRecord> getRecordType() {
        return FarmlandCategoriesRecord.class;
    }

    /**
     * The column <code>template.farmland_categories.farmland_category_id</code>.
     */
    public final TableField<FarmlandCategoriesRecord, Short> FARMLAND_CATEGORY_ID = createField(DSL.name("farmland_category_id"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>template.farmland_categories.gcn_sector_id</code>.
     */
    public final TableField<FarmlandCategoriesRecord, Integer> GCN_SECTOR_ID = createField(DSL.name("gcn_sector_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>template.farmland_categories.code</code>.
     */
    public final TableField<FarmlandCategoriesRecord, String> CODE = createField(DSL.name("code"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>template.farmland_categories.name</code>.
     */
    public final TableField<FarmlandCategoriesRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>template.farmland_categories.description</code>.
     */
    public final TableField<FarmlandCategoriesRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>template.farmland_categories</code> table reference
     */
    public FarmlandCategories() {
        this(DSL.name("farmland_categories"), null);
    }

    /**
     * Create an aliased <code>template.farmland_categories</code> table reference
     */
    public FarmlandCategories(String alias) {
        this(DSL.name(alias), FARMLAND_CATEGORIES);
    }

    /**
     * Create an aliased <code>template.farmland_categories</code> table reference
     */
    public FarmlandCategories(Name alias) {
        this(alias, FARMLAND_CATEGORIES);
    }

    private FarmlandCategories(Name alias, Table<FarmlandCategoriesRecord> aliased) {
        this(alias, aliased, null);
    }

    private FarmlandCategories(Name alias, Table<FarmlandCategoriesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("De categorieën van verschillende soorten landbouwgrond activiteiten \r\nDe naam is hierbij de identificatie van de categorie voor de gebruiker.\r\n\r\n@file source/database/src/main/sql/template/02_emission_factors/02-tables/farmlands.sql"), TableOptions.table());
    }

    public <O extends Record> FarmlandCategories(Table<O> child, ForeignKey<O, FarmlandCategoriesRecord> key) {
        super(child, key, FARMLAND_CATEGORIES);
    }

    @Override
    public Schema getSchema() {
        return Template.TEMPLATE;
    }

    @Override
    public UniqueKey<FarmlandCategoriesRecord> getPrimaryKey() {
        return Keys.FARMLAND_CATEGORIES_PKEY;
    }

    @Override
    public List<UniqueKey<FarmlandCategoriesRecord>> getKeys() {
        return Arrays.<UniqueKey<FarmlandCategoriesRecord>>asList(Keys.FARMLAND_CATEGORIES_PKEY, Keys.FARMLAND_CATEGORIES_CODE_KEY, Keys.FARMLAND_CATEGORIES_NAME_KEY);
    }

    @Override
    public List<ForeignKey<FarmlandCategoriesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<FarmlandCategoriesRecord, ?>>asList(Keys.FARMLAND_CATEGORIES__FARMLAND_CATEGORIES_FKEY_GCN_SECTORS);
    }

    public GcnSectors gcnSectors() {
        return new GcnSectors(this, Keys.FARMLAND_CATEGORIES__FARMLAND_CATEGORIES_FKEY_GCN_SECTORS);
    }

    @Override
    public FarmlandCategories as(String alias) {
        return new FarmlandCategories(DSL.name(alias), this);
    }

    @Override
    public FarmlandCategories as(Name alias) {
        return new FarmlandCategories(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FarmlandCategories rename(String name) {
        return new FarmlandCategories(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FarmlandCategories rename(Name name) {
        return new FarmlandCategories(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Short, Integer, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}