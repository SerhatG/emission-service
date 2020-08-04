/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.i18n;


import java.util.Arrays;
import java.util.List;

import nl.overheid.aerius.emissionservice.jooq.DefaultCatalog;
import nl.overheid.aerius.emissionservice.jooq.i18n.tables.Messages;
import nl.overheid.aerius.emissionservice.jooq.i18n.tables.SystemInfoMessages;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class I18n extends SchemaImpl {

    private static final long serialVersionUID = -61399678;

    /**
     * The reference instance of <code>i18n</code>
     */
    public static final I18n I18N = new I18n();

    /**
     * Systeem tabel voor localized teksten.

@file source/database/src/main/sql/i18n/02-tables.sql
     */
    public final Messages MESSAGES = Messages.MESSAGES;

    /**
     * Systeem info tabel voor localized teksten, voor tonen van systeem berichten.

@file source/database/src/main/sql/i18n/02-tables.sql
     */
    public final SystemInfoMessages SYSTEM_INFO_MESSAGES = SystemInfoMessages.SYSTEM_INFO_MESSAGES;

    /**
     * No further instances allowed
     */
    private I18n() {
        super("i18n", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Messages.MESSAGES,
            SystemInfoMessages.SYSTEM_INFO_MESSAGES);
    }
}
