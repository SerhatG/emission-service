/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables;


import java.util.Arrays;
import java.util.List;

import nl.overheid.aerius.emissionservice.jooq.public_.tables.Substances;
import nl.overheid.aerius.emissionservice.jooq.template.Keys;
import nl.overheid.aerius.emissionservice.jooq.template.Template;
import nl.overheid.aerius.emissionservice.jooq.template.tables.records.GcnSectorSourceCharacteristicsRecord;

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
 * Voorgedefinieerde OPS kenmerken per GCN sector.
 * 
 * @file source/database/src/main/sql/template/01_sectors/02-tables/02-source_characteristics.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GcnSectorSourceCharacteristics extends TableImpl<GcnSectorSourceCharacteristicsRecord> {

    private static final long serialVersionUID = -1898667760;

    /**
     * The reference instance of <code>template.gcn_sector_source_characteristics</code>
     */
    public static final GcnSectorSourceCharacteristics GCN_SECTOR_SOURCE_CHARACTERISTICS = new GcnSectorSourceCharacteristics();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GcnSectorSourceCharacteristicsRecord> getRecordType() {
        return GcnSectorSourceCharacteristicsRecord.class;
    }

    /**
     * The column <code>template.gcn_sector_source_characteristics.gcn_sector_id</code>.
     */
    public final TableField<GcnSectorSourceCharacteristicsRecord, Integer> GCN_SECTOR_ID = createField(DSL.name("gcn_sector_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>template.gcn_sector_source_characteristics.substance_id</code>.
     */
    public final TableField<GcnSectorSourceCharacteristicsRecord, Short> SUBSTANCE_ID = createField(DSL.name("substance_id"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>template.gcn_sector_source_characteristics.heat_content</code>.
     */
    public final TableField<GcnSectorSourceCharacteristicsRecord, Float> HEAT_CONTENT = createField(DSL.name("heat_content"), org.jooq.impl.SQLDataType.REAL.nullable(false), this, "");

    /**
     * The column <code>template.gcn_sector_source_characteristics.height</code>.
     */
    public final TableField<GcnSectorSourceCharacteristicsRecord, Float> HEIGHT = createField(DSL.name("height"), org.jooq.impl.SQLDataType.REAL.nullable(false), this, "");

    /**
     * The column <code>template.gcn_sector_source_characteristics.spread</code>.
     */
    public final TableField<GcnSectorSourceCharacteristicsRecord, Float> SPREAD = createField(DSL.name("spread"), org.jooq.impl.SQLDataType.REAL.nullable(false), this, "");

    /**
     * The column <code>template.gcn_sector_source_characteristics.emission_diurnal_variation_id</code>.
     */
    public final TableField<GcnSectorSourceCharacteristicsRecord, Integer> EMISSION_DIURNAL_VARIATION_ID = createField(DSL.name("emission_diurnal_variation_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>template.gcn_sector_source_characteristics.particle_size_distribution</code>.
     */
    public final TableField<GcnSectorSourceCharacteristicsRecord, Integer> PARTICLE_SIZE_DISTRIBUTION = createField(DSL.name("particle_size_distribution"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>template.gcn_sector_source_characteristics</code> table reference
     */
    public GcnSectorSourceCharacteristics() {
        this(DSL.name("gcn_sector_source_characteristics"), null);
    }

    /**
     * Create an aliased <code>template.gcn_sector_source_characteristics</code> table reference
     */
    public GcnSectorSourceCharacteristics(String alias) {
        this(DSL.name(alias), GCN_SECTOR_SOURCE_CHARACTERISTICS);
    }

    /**
     * Create an aliased <code>template.gcn_sector_source_characteristics</code> table reference
     */
    public GcnSectorSourceCharacteristics(Name alias) {
        this(alias, GCN_SECTOR_SOURCE_CHARACTERISTICS);
    }

    private GcnSectorSourceCharacteristics(Name alias, Table<GcnSectorSourceCharacteristicsRecord> aliased) {
        this(alias, aliased, null);
    }

    private GcnSectorSourceCharacteristics(Name alias, Table<GcnSectorSourceCharacteristicsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Voorgedefinieerde OPS kenmerken per GCN sector.\r\n\r\n@file source/database/src/main/sql/template/01_sectors/02-tables/02-source_characteristics.sql"), TableOptions.table());
    }

    public <O extends Record> GcnSectorSourceCharacteristics(Table<O> child, ForeignKey<O, GcnSectorSourceCharacteristicsRecord> key) {
        super(child, key, GCN_SECTOR_SOURCE_CHARACTERISTICS);
    }

    @Override
    public Schema getSchema() {
        return Template.TEMPLATE;
    }

    @Override
    public UniqueKey<GcnSectorSourceCharacteristicsRecord> getPrimaryKey() {
        return Keys.GCN_SECTOR_SOURCE_CHARACTERISTICS_PKEY;
    }

    @Override
    public List<UniqueKey<GcnSectorSourceCharacteristicsRecord>> getKeys() {
        return Arrays.<UniqueKey<GcnSectorSourceCharacteristicsRecord>>asList(Keys.GCN_SECTOR_SOURCE_CHARACTERISTICS_PKEY);
    }

    @Override
    public List<ForeignKey<GcnSectorSourceCharacteristicsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<GcnSectorSourceCharacteristicsRecord, ?>>asList(Keys.GCN_SECTOR_SOURCE_CHARACTERISTICS__GCN_SECTOR_SOURCE_CHARACTERISTICS_FKEY_GCN_SECTORS, Keys.GCN_SECTOR_SOURCE_CHARACTERISTICS__GCN_SECTOR_SOURCE_CHARACTERISTICS_FKEY_GCN_SUBSTANCES, Keys.GCN_SECTOR_SOURCE_CHARACTERISTICS__GCN_SECTOR_SOURCE_CHARACTERISTICS_FKEY_EMISSION_DIURNAL_VARIATI);
    }

    public GcnSectors gcnSectors() {
        return new GcnSectors(this, Keys.GCN_SECTOR_SOURCE_CHARACTERISTICS__GCN_SECTOR_SOURCE_CHARACTERISTICS_FKEY_GCN_SECTORS);
    }

    public Substances substances() {
        return new Substances(this, Keys.GCN_SECTOR_SOURCE_CHARACTERISTICS__GCN_SECTOR_SOURCE_CHARACTERISTICS_FKEY_GCN_SUBSTANCES);
    }

    public EmissionDiurnalVariations emissionDiurnalVariations() {
        return new EmissionDiurnalVariations(this, Keys.GCN_SECTOR_SOURCE_CHARACTERISTICS__GCN_SECTOR_SOURCE_CHARACTERISTICS_FKEY_EMISSION_DIURNAL_VARIATI);
    }

    @Override
    public GcnSectorSourceCharacteristics as(String alias) {
        return new GcnSectorSourceCharacteristics(DSL.name(alias), this);
    }

    @Override
    public GcnSectorSourceCharacteristics as(Name alias) {
        return new GcnSectorSourceCharacteristics(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GcnSectorSourceCharacteristics rename(String name) {
        return new GcnSectorSourceCharacteristics(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GcnSectorSourceCharacteristics rename(Name name) {
        return new GcnSectorSourceCharacteristics(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, Short, Float, Float, Float, Integer, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
