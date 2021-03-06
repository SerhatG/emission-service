/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables;


import java.util.Arrays;
import java.util.List;

import nl.overheid.aerius.emissionservice.jooq.template.Keys;
import nl.overheid.aerius.emissionservice.jooq.template.Template;
import nl.overheid.aerius.emissionservice.jooq.template.tables.records.ShippingInlandWaterwayCategoriesRecord;

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
 * Alle type vaarwegen in het scheepvaart netwerk voor binnenvaart.
 * Voor sommige types is de stroming van de vaarweg van belang, dit wordt 
 * hier ook aangegeven.
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/02-tables/shipping_inland.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ShippingInlandWaterwayCategories extends TableImpl<ShippingInlandWaterwayCategoriesRecord> {

    private static final long serialVersionUID = -1180201474;

    /**
     * The reference instance of <code>template.shipping_inland_waterway_categories</code>
     */
    public static final ShippingInlandWaterwayCategories SHIPPING_INLAND_WATERWAY_CATEGORIES = new ShippingInlandWaterwayCategories();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShippingInlandWaterwayCategoriesRecord> getRecordType() {
        return ShippingInlandWaterwayCategoriesRecord.class;
    }

    /**
     * The column <code>template.shipping_inland_waterway_categories.shipping_inland_waterway_category_id</code>.
     */
    public final TableField<ShippingInlandWaterwayCategoriesRecord, Integer> SHIPPING_INLAND_WATERWAY_CATEGORY_ID = createField(DSL.name("shipping_inland_waterway_category_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>template.shipping_inland_waterway_categories.code</code>.
     */
    public final TableField<ShippingInlandWaterwayCategoriesRecord, String> CODE = createField(DSL.name("code"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>template.shipping_inland_waterway_categories.name</code>.
     */
    public final TableField<ShippingInlandWaterwayCategoriesRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>template.shipping_inland_waterway_categories.description</code>.
     */
    public final TableField<ShippingInlandWaterwayCategoriesRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>template.shipping_inland_waterway_categories.flowing</code>.
     */
    public final TableField<ShippingInlandWaterwayCategoriesRecord, Boolean> FLOWING = createField(DSL.name("flowing"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * Create a <code>template.shipping_inland_waterway_categories</code> table reference
     */
    public ShippingInlandWaterwayCategories() {
        this(DSL.name("shipping_inland_waterway_categories"), null);
    }

    /**
     * Create an aliased <code>template.shipping_inland_waterway_categories</code> table reference
     */
    public ShippingInlandWaterwayCategories(String alias) {
        this(DSL.name(alias), SHIPPING_INLAND_WATERWAY_CATEGORIES);
    }

    /**
     * Create an aliased <code>template.shipping_inland_waterway_categories</code> table reference
     */
    public ShippingInlandWaterwayCategories(Name alias) {
        this(alias, SHIPPING_INLAND_WATERWAY_CATEGORIES);
    }

    private ShippingInlandWaterwayCategories(Name alias, Table<ShippingInlandWaterwayCategoriesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ShippingInlandWaterwayCategories(Name alias, Table<ShippingInlandWaterwayCategoriesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Alle type vaarwegen in het scheepvaart netwerk voor binnenvaart.\r\nVoor sommige types is de stroming van de vaarweg van belang, dit wordt hier ook aangegeven.\r\n\r\n@file source/database/src/main/sql/template/02_emission_factors/02-tables/shipping_inland.sql"), TableOptions.table());
    }

    public <O extends Record> ShippingInlandWaterwayCategories(Table<O> child, ForeignKey<O, ShippingInlandWaterwayCategoriesRecord> key) {
        super(child, key, SHIPPING_INLAND_WATERWAY_CATEGORIES);
    }

    @Override
    public Schema getSchema() {
        return Template.TEMPLATE;
    }

    @Override
    public UniqueKey<ShippingInlandWaterwayCategoriesRecord> getPrimaryKey() {
        return Keys.SHIPPING_INLAND_WATERWAY_CATEGORIES_PKEY;
    }

    @Override
    public List<UniqueKey<ShippingInlandWaterwayCategoriesRecord>> getKeys() {
        return Arrays.<UniqueKey<ShippingInlandWaterwayCategoriesRecord>>asList(Keys.SHIPPING_INLAND_WATERWAY_CATEGORIES_PKEY, Keys.SHIPPING_INLAND_WATERWAY_CATEGORIES_CODE_KEY, Keys.SHIPPING_INLAND_WATERWAY_CATEGORIES_NAME_KEY);
    }

    @Override
    public ShippingInlandWaterwayCategories as(String alias) {
        return new ShippingInlandWaterwayCategories(DSL.name(alias), this);
    }

    @Override
    public ShippingInlandWaterwayCategories as(Name alias) {
        return new ShippingInlandWaterwayCategories(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingInlandWaterwayCategories rename(String name) {
        return new ShippingInlandWaterwayCategories(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingInlandWaterwayCategories rename(Name name) {
        return new ShippingInlandWaterwayCategories(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, String, String, Boolean> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
