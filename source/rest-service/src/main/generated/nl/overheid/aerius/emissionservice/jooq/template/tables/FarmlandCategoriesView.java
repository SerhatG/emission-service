/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables;


import nl.overheid.aerius.emissionservice.jooq.template.Template;
import nl.overheid.aerius.emissionservice.jooq.template.tables.records.FarmlandCategoriesViewRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * View retourneert de landbouwgrond categoriëen.
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/04-views/farmlands.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FarmlandCategoriesView extends TableImpl<FarmlandCategoriesViewRecord> {

    private static final long serialVersionUID = -83423416;

    /**
     * The reference instance of <code>template.farmland_categories_view</code>
     */
    public static final FarmlandCategoriesView FARMLAND_CATEGORIES_VIEW = new FarmlandCategoriesView();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FarmlandCategoriesViewRecord> getRecordType() {
        return FarmlandCategoriesViewRecord.class;
    }

    /**
     * The column <code>template.farmland_categories_view.farmland_category_id</code>.
     */
    public final TableField<FarmlandCategoriesViewRecord, Short> FARMLAND_CATEGORY_ID = createField(DSL.name("farmland_category_id"), org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>template.farmland_categories_view.code</code>.
     */
    public final TableField<FarmlandCategoriesViewRecord, String> CODE = createField(DSL.name("code"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>template.farmland_categories_view.name</code>.
     */
    public final TableField<FarmlandCategoriesViewRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>template.farmland_categories_view.gcn_sector_id</code>.
     */
    public final TableField<FarmlandCategoriesViewRecord, Integer> GCN_SECTOR_ID = createField(DSL.name("gcn_sector_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>template.farmland_categories_view</code> table reference
     */
    public FarmlandCategoriesView() {
        this(DSL.name("farmland_categories_view"), null);
    }

    /**
     * Create an aliased <code>template.farmland_categories_view</code> table reference
     */
    public FarmlandCategoriesView(String alias) {
        this(DSL.name(alias), FARMLAND_CATEGORIES_VIEW);
    }

    /**
     * Create an aliased <code>template.farmland_categories_view</code> table reference
     */
    public FarmlandCategoriesView(Name alias) {
        this(alias, FARMLAND_CATEGORIES_VIEW);
    }

    private FarmlandCategoriesView(Name alias, Table<FarmlandCategoriesViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private FarmlandCategoriesView(Name alias, Table<FarmlandCategoriesViewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("View retourneert de landbouwgrond categoriëen.\r\n\r\n@file source/database/src/main/sql/template/02_emission_factors/04-views/farmlands.sql"), TableOptions.view("create view \"farmland_categories_view\" as  SELECT farmland_categories.farmland_category_id,\n    farmland_categories.code,\n    farmland_categories.name,\n    farmland_categories.gcn_sector_id\n   FROM template.farmland_categories;"));
    }

    public <O extends Record> FarmlandCategoriesView(Table<O> child, ForeignKey<O, FarmlandCategoriesViewRecord> key) {
        super(child, key, FARMLAND_CATEGORIES_VIEW);
    }

    @Override
    public Schema getSchema() {
        return Template.TEMPLATE;
    }

    @Override
    public FarmlandCategoriesView as(String alias) {
        return new FarmlandCategoriesView(DSL.name(alias), this);
    }

    @Override
    public FarmlandCategoriesView as(Name alias) {
        return new FarmlandCategoriesView(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FarmlandCategoriesView rename(String name) {
        return new FarmlandCategoriesView(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FarmlandCategoriesView rename(Name name) {
        return new FarmlandCategoriesView(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Short, String, String, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
