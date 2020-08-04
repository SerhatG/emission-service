/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.public_.enums;


import nl.overheid.aerius.emissionservice.jooq.public_.Public;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum RoadType implements EnumType {

    urban_road("urban_road"),

    non_urban_road("non_urban_road"),

    freeway("freeway");

    private final String literal;

    private RoadType(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return getSchema() == null ? null : getSchema().getCatalog();
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public String getName() {
        return "road_type";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}