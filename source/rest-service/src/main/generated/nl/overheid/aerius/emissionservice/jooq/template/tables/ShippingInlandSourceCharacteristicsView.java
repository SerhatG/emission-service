/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables;


import nl.overheid.aerius.emissionservice.jooq.public_.enums.ShippingInlandLadenState;
import nl.overheid.aerius.emissionservice.jooq.public_.enums.ShippingInlandShipDirectionType;
import nl.overheid.aerius.emissionservice.jooq.template.Template;
import nl.overheid.aerius.emissionservice.jooq.template.tables.records.ShippingInlandSourceCharacteristicsViewRecord;

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
 * View retourneert de emissie karakteristieken voor routes voor binnenvaart.
 * 
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/04-views/shipping_inland.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ShippingInlandSourceCharacteristicsView extends TableImpl<ShippingInlandSourceCharacteristicsViewRecord> {

    private static final long serialVersionUID = 1034508426;

    /**
     * The reference instance of <code>template.shipping_inland_source_characteristics_view</code>
     */
    public static final ShippingInlandSourceCharacteristicsView SHIPPING_INLAND_SOURCE_CHARACTERISTICS_VIEW = new ShippingInlandSourceCharacteristicsView();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShippingInlandSourceCharacteristicsViewRecord> getRecordType() {
        return ShippingInlandSourceCharacteristicsViewRecord.class;
    }

    /**
     * The column <code>template.shipping_inland_source_characteristics_view.shipping_inland_category_id</code>.
     */
    public final TableField<ShippingInlandSourceCharacteristicsViewRecord, Short> SHIPPING_INLAND_CATEGORY_ID = createField(DSL.name("shipping_inland_category_id"), org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>template.shipping_inland_source_characteristics_view.shipping_inland_waterway_category_id</code>.
     */
    public final TableField<ShippingInlandSourceCharacteristicsViewRecord, Integer> SHIPPING_INLAND_WATERWAY_CATEGORY_ID = createField(DSL.name("shipping_inland_waterway_category_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>template.shipping_inland_source_characteristics_view.ship_direction</code>.
     */
    public final TableField<ShippingInlandSourceCharacteristicsViewRecord, ShippingInlandShipDirectionType> SHIP_DIRECTION = createField(DSL.name("ship_direction"), org.jooq.impl.SQLDataType.VARCHAR.asEnumDataType(nl.overheid.aerius.emissionservice.jooq.public_.enums.ShippingInlandShipDirectionType.class), this, "");

    /**
     * The column <code>template.shipping_inland_source_characteristics_view.laden_state</code>.
     */
    public final TableField<ShippingInlandSourceCharacteristicsViewRecord, ShippingInlandLadenState> LADEN_STATE = createField(DSL.name("laden_state"), org.jooq.impl.SQLDataType.VARCHAR.asEnumDataType(nl.overheid.aerius.emissionservice.jooq.public_.enums.ShippingInlandLadenState.class), this, "");

    /**
     * The column <code>template.shipping_inland_source_characteristics_view.gcn_sector_id</code>.
     */
    public final TableField<ShippingInlandSourceCharacteristicsViewRecord, Integer> GCN_SECTOR_ID = createField(DSL.name("gcn_sector_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>template.shipping_inland_source_characteristics_view.heat_content</code>.
     */
    public final TableField<ShippingInlandSourceCharacteristicsViewRecord, Float> HEAT_CONTENT = createField(DSL.name("heat_content"), org.jooq.impl.SQLDataType.REAL, this, "");

    /**
     * The column <code>template.shipping_inland_source_characteristics_view.height</code>.
     */
    public final TableField<ShippingInlandSourceCharacteristicsViewRecord, Float> HEIGHT = createField(DSL.name("height"), org.jooq.impl.SQLDataType.REAL, this, "");

    /**
     * The column <code>template.shipping_inland_source_characteristics_view.spread</code>.
     */
    public final TableField<ShippingInlandSourceCharacteristicsViewRecord, Float> SPREAD = createField(DSL.name("spread"), org.jooq.impl.SQLDataType.REAL, this, "");

    /**
     * The column <code>template.shipping_inland_source_characteristics_view.emission_diurnal_variation_id</code>.
     */
    public final TableField<ShippingInlandSourceCharacteristicsViewRecord, Integer> EMISSION_DIURNAL_VARIATION_ID = createField(DSL.name("emission_diurnal_variation_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>template.shipping_inland_source_characteristics_view.emission_diurnal_variation_code</code>.
     */
    public final TableField<ShippingInlandSourceCharacteristicsViewRecord, String> EMISSION_DIURNAL_VARIATION_CODE = createField(DSL.name("emission_diurnal_variation_code"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>template.shipping_inland_source_characteristics_view</code> table reference
     */
    public ShippingInlandSourceCharacteristicsView() {
        this(DSL.name("shipping_inland_source_characteristics_view"), null);
    }

    /**
     * Create an aliased <code>template.shipping_inland_source_characteristics_view</code> table reference
     */
    public ShippingInlandSourceCharacteristicsView(String alias) {
        this(DSL.name(alias), SHIPPING_INLAND_SOURCE_CHARACTERISTICS_VIEW);
    }

    /**
     * Create an aliased <code>template.shipping_inland_source_characteristics_view</code> table reference
     */
    public ShippingInlandSourceCharacteristicsView(Name alias) {
        this(alias, SHIPPING_INLAND_SOURCE_CHARACTERISTICS_VIEW);
    }

    private ShippingInlandSourceCharacteristicsView(Name alias, Table<ShippingInlandSourceCharacteristicsViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private ShippingInlandSourceCharacteristicsView(Name alias, Table<ShippingInlandSourceCharacteristicsViewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("View retourneert de emissie karakteristieken voor routes voor binnenvaart.\r\n\r\n@file source/database/src/main/sql/template/02_emission_factors/04-views/shipping_inland.sql"), TableOptions.view("create view \"shipping_inland_source_characteristics_view\" as  SELECT shipping_inland_category_source_characteristics.shipping_inland_category_id,\n    shipping_inland_category_source_characteristics.shipping_inland_waterway_category_id,\n    shipping_inland_category_source_characteristics.ship_direction,\n    shipping_inland_category_source_characteristics.laden_state,\n    shipping_inland_category_source_characteristics.gcn_sector_id,\n    shipping_inland_category_source_characteristics.heat_content,\n    shipping_inland_category_source_characteristics.height,\n    shipping_inland_category_source_characteristics.spread,\n    emission_diurnal_variations.emission_diurnal_variation_id,\n    emission_diurnal_variations.code AS emission_diurnal_variation_code\n   FROM ((template.shipping_inland_category_source_characteristics\n     JOIN template.default_gcn_sector_source_characteristics_view USING (gcn_sector_id))\n     JOIN template.emission_diurnal_variations USING (emission_diurnal_variation_id));"));
    }

    public <O extends Record> ShippingInlandSourceCharacteristicsView(Table<O> child, ForeignKey<O, ShippingInlandSourceCharacteristicsViewRecord> key) {
        super(child, key, SHIPPING_INLAND_SOURCE_CHARACTERISTICS_VIEW);
    }

    @Override
    public Schema getSchema() {
        return Template.TEMPLATE;
    }

    @Override
    public ShippingInlandSourceCharacteristicsView as(String alias) {
        return new ShippingInlandSourceCharacteristicsView(DSL.name(alias), this);
    }

    @Override
    public ShippingInlandSourceCharacteristicsView as(Name alias) {
        return new ShippingInlandSourceCharacteristicsView(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingInlandSourceCharacteristicsView rename(String name) {
        return new ShippingInlandSourceCharacteristicsView(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ShippingInlandSourceCharacteristicsView rename(Name name) {
        return new ShippingInlandSourceCharacteristicsView(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Short, Integer, ShippingInlandShipDirectionType, ShippingInlandLadenState, Integer, Float, Float, Float, Integer, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
