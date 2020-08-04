/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables;


import java.util.Arrays;
import java.util.List;

import nl.overheid.aerius.emissionservice.jooq.public_.enums.ShippingMovementType;
import nl.overheid.aerius.emissionservice.jooq.template.Keys;
import nl.overheid.aerius.emissionservice.jooq.template.Template;
import nl.overheid.aerius.emissionservice.jooq.template.tables.records.ShippingMaritimeCategorySourceCharacteristicsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * De OPS karakteristieken per scheepstype.
 * 
 * De warmteinhoud (heat_content) in deze tabel overschrijft verder de warmteinhoud 
 * verkregen via de sector van het scheepstype.
 * Dit omdat de warmteinhoud afhankelijk is van de scheepstype en beweegtype.
 * 
 * De hoogte gedefinieerd in deze tabel overschrijft daarbij de hoogte verkregen 
 * via de sector.
 * Dit omdat de hoogte varieert per tonnage-reeks en beweeg type, niet alleen 
 * per sector.
 * Spreiding is verder weer een karakteristiek die sterk samenhangt per hoogte, 
 * en is daarom ook meegenomen in deze tabel.
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/02-tables/shipping_maritime.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ShippingMaritimeCategorySourceCharacteristics extends TableImpl<ShippingMaritimeCategorySourceCharacteristicsRecord> {

    private static final long serialVersionUID = -98091593;

    /**
     * The reference instance of <code>template.shipping_maritime_category_source_characteristics</code>
     */
    public static final ShippingMaritimeCategorySourceCharacteristics SHIPPING_MARITIME_CATEGORY_SOURCE_CHARACTERISTICS = new ShippingMaritimeCategorySourceCharacteristics();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShippingMaritimeCategorySourceCharacteristicsRecord> getRecordType() {
        return ShippingMaritimeCategorySourceCharacteristicsRecord.class;
    }

    /**
     * The column <code>template.shipping_maritime_category_source_characteristics.shipping_maritime_category_id</code>.
     */
    public final TableField<ShippingMaritimeCategorySourceCharacteristicsRecord, Short> SHIPPING_MARITIME_CATEGORY_ID = createField(DSL.name("shipping_maritime_category_id"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>template.shipping_maritime_category_source_characteristics.year</code>.
     */
    public final TableField<ShippingMaritimeCategorySourceCharacteristicsRecord, Short> YEAR = createField(DSL.name("year"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>template.shipping_maritime_category_source_characteristics.movement_type</code>.
     */
    public final TableField<ShippingMaritimeCategorySourceCharacteristicsRecord, ShippingMovementType> MOVEMENT_TYPE = createField(DSL.name("movement_type"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false).asEnumDataType(nl.overheid.aerius.emissionservice.jooq.public_.enums.ShippingMovementType.class), this, "");

    /**
     * The column <code>template.shipping_maritime_category_source_characteristics.gcn_sector_id</code>.
     */
    public final TableField<ShippingMaritimeCategorySourceCharacteristicsRecord, Integer> GCN_SECTOR_ID = createField(DSL.name("gcn_sector_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>template.shipping_maritime_category_source_characteristics.heat_content</code>.
     */
    public final TableField<ShippingMaritimeCategorySourceCharacteristicsRecord, Float> HEAT_CONTENT = createField(DSL.name("heat_content"), org.jooq.impl.SQLDataType.REAL.nullable(false), this, "");

    /**
     * The column <code>template.shipping_maritime_category_source_characteristics.height</code>.
     */
    public final TableField<ShippingMaritimeCategorySourceCharacteristicsRecord, Float> HEIGHT = createField(DSL.name("height"), org.jooq.impl.SQLDataType.REAL.nullable(false), this, "");

    /**
     * The column <code>template.shipping_maritime_category_source_characteristics.spread</code>.
     */
    public final TableField<ShippingMaritimeCategorySourceCharacteristicsRecord, Float> SPREAD = createField(DSL.name("spread"), org.jooq.impl.SQLDataType.REAL.nullable(false), this, "");

    /**
     * Create a <code>template.shipping_maritime_category_source_characteristics</code> table reference
     */
    public ShippingMaritimeCategorySourceCharacteristics() {
        this(DSL.name("shipping_maritime_category_source_characteristics"), null);
    }

    /**
     * Create an aliased <code>template.shipping_maritime_category_source_characteristics</code> table reference
     */
    public ShippingMaritimeCategorySourceCharacteristics(String alias) {
        this(DSL.name(alias), SHIPPING_MARITIME_CATEGORY_SOURCE_CHARACTERISTICS);
    }

    /**
     * Create an aliased <code>template.shipping_maritime_category_source_characteristics</code> table reference
     */
    public ShippingMaritimeCategorySourceCharacteristics(Name alias) {
        this(alias, SHIPPING_MARITIME_CATEGORY_SOURCE_CHARACTERISTICS);
    }

    private ShippingMaritimeCategorySourceCharacteristics(Name alias, Table<ShippingMaritimeCategorySourceCharacteristicsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ShippingMaritimeCategorySourceCharacteristics(Name alias, Table<ShippingMaritimeCategorySourceCharacteristicsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("De OPS karakteristieken per scheepstype.\r\n\r\nDe warmteinhoud (heat_content) in deze tabel overschrijft verder de warmteinhoud verkregen via de sector van het scheepstype.\r\nDit omdat de warmteinhoud afhankelijk is van de scheepstype en beweegtype.\r\nDe hoogte gedefinieerd in deze tabel overschrijft daarbij de hoogte verkregen via de sector.\r\nDit omdat de hoogte varieert per tonnage-reeks en beweeg type, niet alleen per sector.\r\nSpreiding is verder weer een karakteristiek die sterk samenhangt per hoogte, en is daarom ook meegenomen in deze tabel.\r\n\r\n@file source/database/src/main/sql/template/02_emission_factors/02-tables/shipping_maritime.sql"), TableOptions.table());
    }

    public <O extends Record> ShippingMaritimeCategorySourceCharacteristics(Table<O> child, ForeignKey<O, ShippingMaritimeCategorySourceCharacteristicsRecord> key) {
        super(child, key, SHIPPING_MARITIME_CATEGORY_SOURCE_CHARACTERISTICS);
    }

    @Override
    public Schema getSchema() {
        return Template.TEMPLATE;
    }

    @Override
    public UniqueKey<ShippingMaritimeCategorySourceCharacteristicsRecord> getPrimaryKey() {
        return Keys.SHIPPING_MARITIME_CATEGORY_SOURCE_CHAR_PKEY;
    }

    @Override
    public List<UniqueKey<ShippingMaritimeCategorySourceCharacteristicsRecord>> getKeys() {
        return Arrays.<UniqueKey<ShippingMaritimeCategorySourceCharacteristicsRecord>>asList(Keys.SHIPPING_MARITIME_CATEGORY_SOURCE_CHAR_PKEY);
    }

    @Override
    public List<ForeignKey<ShippingMaritimeCategorySourceCharacteristicsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ShippingMaritimeCategorySourceCharacteristicsRecord, ?>>asList(Keys.SHIPPING_MARITIME_CATEGORY_SOURCE_CHARACTERISTICS__SHIPPING_MARITIME_CATEGORY_SOURCE_CHAR_FKEY_CATEGORIES, Keys.SHIPPING_MARITIME_CATEGORY_SOURCE_CHARACTERISTICS__SHIPPING_MARITIME_CATEGORY_SOURCE_CHAR_FKEY_GCN_SECTORS);
    }

    public ShippingMaritimeCategories shippingMaritimeCategories() {
        return new ShippingMaritimeCategories(this, Keys.SHIPPING_MARITIME_CATEGORY_SOURCE_CHARACTERISTICS__SHIPPING_MARITIME_CATEGORY_SOURCE_CHAR_FKEY_CATEGORIES);
    }

    public GcnSectors gcnSectors() {
        return new GcnSectors(this, Keys.SHIPPING_MARITIME_CATEGORY_SOURCE_CHARACTERISTICS__SHIPPING_MARITIME_CATEGORY_SOURCE_CHAR_FKEY_GCN_SECTORS);
    }

    @Override
    public ShippingMaritimeCategorySourceCharacteristics as(String alias) {
        return new ShippingMaritimeCategorySourceCharacteristics(DSL.name(alias), this);
    }

    @Override
    public ShippingMaritimeCategorySourceCharacteristics as(Name alias) {
        return new ShippingMaritimeCategorySourceCharacteristics(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingMaritimeCategorySourceCharacteristics rename(String name) {
        return new ShippingMaritimeCategorySourceCharacteristics(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingMaritimeCategorySourceCharacteristics rename(Name name) {
        return new ShippingMaritimeCategorySourceCharacteristics(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Short, Short, ShippingMovementType, Integer, Float, Float, Float> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
