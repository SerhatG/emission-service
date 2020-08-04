/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables.records;


import nl.overheid.aerius.emissionservice.jooq.template.tables.FarmAdditionalLodgingSystemEmissionFactors;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Bevat de emissiefactoren (kg/jaar) van de additionele staltechnieken.
 * Deze emissiefactor wordt extra toegepast op een deel van het aantal dieren 
 * van het stalsysteem waarop gestapeld wordt.
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/02-tables/farms.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FarmAdditionalLodgingSystemEmissionFactorsRecord extends UpdatableRecordImpl<FarmAdditionalLodgingSystemEmissionFactorsRecord> implements Record3<Integer, Short, Float> {

    private static final long serialVersionUID = -1174388905;

    /**
     * Setter for <code>template.farm_additional_lodging_system_emission_factors.farm_additional_lodging_system_id</code>.
     */
    public void setFarmAdditionalLodgingSystemId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>template.farm_additional_lodging_system_emission_factors.farm_additional_lodging_system_id</code>.
     */
    public Integer getFarmAdditionalLodgingSystemId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>template.farm_additional_lodging_system_emission_factors.substance_id</code>.
     */
    public void setSubstanceId(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>template.farm_additional_lodging_system_emission_factors.substance_id</code>.
     */
    public Short getSubstanceId() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>template.farm_additional_lodging_system_emission_factors.emission_factor</code>.
     */
    public void setEmissionFactor(Float value) {
        set(2, value);
    }

    /**
     * Getter for <code>template.farm_additional_lodging_system_emission_factors.emission_factor</code>.
     */
    public Float getEmissionFactor() {
        return (Float) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, Short> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Short, Float> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, Short, Float> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return FarmAdditionalLodgingSystemEmissionFactors.FARM_ADDITIONAL_LODGING_SYSTEM_EMISSION_FACTORS.FARM_ADDITIONAL_LODGING_SYSTEM_ID;
    }

    @Override
    public Field<Short> field2() {
        return FarmAdditionalLodgingSystemEmissionFactors.FARM_ADDITIONAL_LODGING_SYSTEM_EMISSION_FACTORS.SUBSTANCE_ID;
    }

    @Override
    public Field<Float> field3() {
        return FarmAdditionalLodgingSystemEmissionFactors.FARM_ADDITIONAL_LODGING_SYSTEM_EMISSION_FACTORS.EMISSION_FACTOR;
    }

    @Override
    public Integer component1() {
        return getFarmAdditionalLodgingSystemId();
    }

    @Override
    public Short component2() {
        return getSubstanceId();
    }

    @Override
    public Float component3() {
        return getEmissionFactor();
    }

    @Override
    public Integer value1() {
        return getFarmAdditionalLodgingSystemId();
    }

    @Override
    public Short value2() {
        return getSubstanceId();
    }

    @Override
    public Float value3() {
        return getEmissionFactor();
    }

    @Override
    public FarmAdditionalLodgingSystemEmissionFactorsRecord value1(Integer value) {
        setFarmAdditionalLodgingSystemId(value);
        return this;
    }

    @Override
    public FarmAdditionalLodgingSystemEmissionFactorsRecord value2(Short value) {
        setSubstanceId(value);
        return this;
    }

    @Override
    public FarmAdditionalLodgingSystemEmissionFactorsRecord value3(Float value) {
        setEmissionFactor(value);
        return this;
    }

    @Override
    public FarmAdditionalLodgingSystemEmissionFactorsRecord values(Integer value1, Short value2, Float value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FarmAdditionalLodgingSystemEmissionFactorsRecord
     */
    public FarmAdditionalLodgingSystemEmissionFactorsRecord() {
        super(FarmAdditionalLodgingSystemEmissionFactors.FARM_ADDITIONAL_LODGING_SYSTEM_EMISSION_FACTORS);
    }

    /**
     * Create a detached, initialised FarmAdditionalLodgingSystemEmissionFactorsRecord
     */
    public FarmAdditionalLodgingSystemEmissionFactorsRecord(Integer farmAdditionalLodgingSystemId, Short substanceId, Float emissionFactor) {
        super(FarmAdditionalLodgingSystemEmissionFactors.FARM_ADDITIONAL_LODGING_SYSTEM_EMISSION_FACTORS);

        set(0, farmAdditionalLodgingSystemId);
        set(1, substanceId);
        set(2, emissionFactor);
    }
}