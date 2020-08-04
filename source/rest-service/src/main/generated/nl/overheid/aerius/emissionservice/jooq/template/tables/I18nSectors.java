/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables;


import java.util.Arrays;
import java.util.List;

import nl.overheid.aerius.emissionservice.jooq.i18n.enums.LanguageCodeType;
import nl.overheid.aerius.emissionservice.jooq.template.Keys;
import nl.overheid.aerius.emissionservice.jooq.template.Template;
import nl.overheid.aerius.emissionservice.jooq.template.tables.records.I18nSectorsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * Vertaaltabel voor sectoren.
 * 
 * @file source/database/src/main/sql/template/01_sectors/i18n/base_keys.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class I18nSectors extends TableImpl<I18nSectorsRecord> {

    private static final long serialVersionUID = 1290797363;

    /**
     * The reference instance of <code>template.i18n_sectors</code>
     */
    public static final I18nSectors I18N_SECTORS = new I18nSectors();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<I18nSectorsRecord> getRecordType() {
        return I18nSectorsRecord.class;
    }

    /**
     * The column <code>template.i18n_sectors.sector_id</code>.
     */
    public final TableField<I18nSectorsRecord, Integer> SECTOR_ID = createField(DSL.name("sector_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>template.i18n_sectors.language_code</code>.
     */
    public final TableField<I18nSectorsRecord, LanguageCodeType> LANGUAGE_CODE = createField(DSL.name("language_code"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false).asEnumDataType(nl.overheid.aerius.emissionservice.jooq.i18n.enums.LanguageCodeType.class), this, "");

    /**
     * The column <code>template.i18n_sectors.description</code>.
     */
    public final TableField<I18nSectorsRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>template.i18n_sectors</code> table reference
     */
    public I18nSectors() {
        this(DSL.name("i18n_sectors"), null);
    }

    /**
     * Create an aliased <code>template.i18n_sectors</code> table reference
     */
    public I18nSectors(String alias) {
        this(DSL.name(alias), I18N_SECTORS);
    }

    /**
     * Create an aliased <code>template.i18n_sectors</code> table reference
     */
    public I18nSectors(Name alias) {
        this(alias, I18N_SECTORS);
    }

    private I18nSectors(Name alias, Table<I18nSectorsRecord> aliased) {
        this(alias, aliased, null);
    }

    private I18nSectors(Name alias, Table<I18nSectorsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Vertaaltabel voor sectoren.\r\n\r\n@file source/database/src/main/sql/template/01_sectors/i18n/base_keys.sql"), TableOptions.table());
    }

    public <O extends Record> I18nSectors(Table<O> child, ForeignKey<O, I18nSectorsRecord> key) {
        super(child, key, I18N_SECTORS);
    }

    @Override
    public Schema getSchema() {
        return Template.TEMPLATE;
    }

    @Override
    public UniqueKey<I18nSectorsRecord> getPrimaryKey() {
        return Keys.I18N_SECTORS_PKEY;
    }

    @Override
    public List<UniqueKey<I18nSectorsRecord>> getKeys() {
        return Arrays.<UniqueKey<I18nSectorsRecord>>asList(Keys.I18N_SECTORS_PKEY);
    }

    @Override
    public List<ForeignKey<I18nSectorsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<I18nSectorsRecord, ?>>asList(Keys.I18N_SECTORS__I18N_SECTORS_FKEY);
    }

    public Sectors sectors() {
        return new Sectors(this, Keys.I18N_SECTORS__I18N_SECTORS_FKEY);
    }

    @Override
    public I18nSectors as(String alias) {
        return new I18nSectors(DSL.name(alias), this);
    }

    @Override
    public I18nSectors as(Name alias) {
        return new I18nSectors(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nSectors rename(String name) {
        return new I18nSectors(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nSectors rename(Name name) {
        return new I18nSectors(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, LanguageCodeType, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}