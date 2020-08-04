/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables;


import java.util.Arrays;
import java.util.List;

import nl.overheid.aerius.emissionservice.jooq.template.Keys;
import nl.overheid.aerius.emissionservice.jooq.template.Template;
import nl.overheid.aerius.emissionservice.jooq.template.tables.records.FarmLodgingFodderMeasuresAnimalCategoryRecord;

import org.jooq.Check;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.TableImpl;


/**
 * De diercategorieën van de stalsystemen waarop een maatregel mag worden 
 * toegepast, en de bijbehorende verhouding van de ammoniakemissie afkomstig 
 * van de vloer en uit de mestkelder welke de verdeling van reductiefactoren 
 * bepaalt.
 * De ammoniakverhouding voor alle maatregelen moet altijd gelijk zijn, wat 
 * impliceert dat alle gekozen maatregelen moeten gelden voor dezelfde diercategorie: 
 * dat van het het stalsysteem. Met andere woorden, een maatregel reduceert 
 * alleen de emissies van een stalsysteem als deze kan worden toegepast op 
 * de diercategorie van het stalsysteem.
 * 
 * @column proportion_floor Het aandeel van de totale ammoniakemissie afkomstig 
 * van de vloer voor deze combinatie van maatregel en diercategorie
 * @column proportion_cellar Het aandeel van de totale ammoniakemissie uit 
 * de mestkelder voor deze combinatie van maatregel en diercategorie
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/02-tables/farms.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FarmLodgingFodderMeasuresAnimalCategory extends TableImpl<FarmLodgingFodderMeasuresAnimalCategoryRecord> {

    private static final long serialVersionUID = -930810846;

    /**
     * The reference instance of <code>template.farm_lodging_fodder_measures_animal_category</code>
     */
    public static final FarmLodgingFodderMeasuresAnimalCategory FARM_LODGING_FODDER_MEASURES_ANIMAL_CATEGORY = new FarmLodgingFodderMeasuresAnimalCategory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FarmLodgingFodderMeasuresAnimalCategoryRecord> getRecordType() {
        return FarmLodgingFodderMeasuresAnimalCategoryRecord.class;
    }

    /**
     * The column <code>template.farm_lodging_fodder_measures_animal_category.farm_lodging_fodder_measure_id</code>.
     */
    public final TableField<FarmLodgingFodderMeasuresAnimalCategoryRecord, Integer> FARM_LODGING_FODDER_MEASURE_ID = createField(DSL.name("farm_lodging_fodder_measure_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>template.farm_lodging_fodder_measures_animal_category.farm_animal_category_id</code>.
     */
    public final TableField<FarmLodgingFodderMeasuresAnimalCategoryRecord, Integer> FARM_ANIMAL_CATEGORY_ID = createField(DSL.name("farm_animal_category_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>template.farm_lodging_fodder_measures_animal_category.proportion_floor</code>.
     */
    public final TableField<FarmLodgingFodderMeasuresAnimalCategoryRecord, Float> PROPORTION_FLOOR = createField(DSL.name("proportion_floor"), org.jooq.impl.SQLDataType.REAL.nullable(false), this, "");

    /**
     * The column <code>template.farm_lodging_fodder_measures_animal_category.proportion_cellar</code>.
     */
    public final TableField<FarmLodgingFodderMeasuresAnimalCategoryRecord, Float> PROPORTION_CELLAR = createField(DSL.name("proportion_cellar"), org.jooq.impl.SQLDataType.REAL.nullable(false), this, "");

    /**
     * Create a <code>template.farm_lodging_fodder_measures_animal_category</code> table reference
     */
    public FarmLodgingFodderMeasuresAnimalCategory() {
        this(DSL.name("farm_lodging_fodder_measures_animal_category"), null);
    }

    /**
     * Create an aliased <code>template.farm_lodging_fodder_measures_animal_category</code> table reference
     */
    public FarmLodgingFodderMeasuresAnimalCategory(String alias) {
        this(DSL.name(alias), FARM_LODGING_FODDER_MEASURES_ANIMAL_CATEGORY);
    }

    /**
     * Create an aliased <code>template.farm_lodging_fodder_measures_animal_category</code> table reference
     */
    public FarmLodgingFodderMeasuresAnimalCategory(Name alias) {
        this(alias, FARM_LODGING_FODDER_MEASURES_ANIMAL_CATEGORY);
    }

    private FarmLodgingFodderMeasuresAnimalCategory(Name alias, Table<FarmLodgingFodderMeasuresAnimalCategoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private FarmLodgingFodderMeasuresAnimalCategory(Name alias, Table<FarmLodgingFodderMeasuresAnimalCategoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("De diercategorieën van de stalsystemen waarop een maatregel mag worden toegepast, en de bijbehorende verhouding van de ammoniakemissie afkomstig van de vloer en uit de mestkelder welke de verdeling van reductiefactoren bepaalt.\r\nDe ammoniakverhouding voor alle maatregelen moet altijd gelijk zijn, wat impliceert dat alle gekozen maatregelen moeten gelden voor dezelfde diercategorie: dat van het het stalsysteem. Met andere woorden, een maatregel reduceert alleen de emissies van een stalsysteem als deze kan worden toegepast op de diercategorie van het stalsysteem.\r\n\r\n@column proportion_floor Het aandeel van de totale ammoniakemissie afkomstig van de vloer voor deze combinatie van maatregel en diercategorie\r\n@column proportion_cellar Het aandeel van de totale ammoniakemissie uit de mestkelder voor deze combinatie van maatregel en diercategorie\r\n\r\n@file source/database/src/main/sql/template/02_emission_factors/02-tables/farms.sql"), TableOptions.table());
    }

    public <O extends Record> FarmLodgingFodderMeasuresAnimalCategory(Table<O> child, ForeignKey<O, FarmLodgingFodderMeasuresAnimalCategoryRecord> key) {
        super(child, key, FARM_LODGING_FODDER_MEASURES_ANIMAL_CATEGORY);
    }

    @Override
    public Schema getSchema() {
        return Template.TEMPLATE;
    }

    @Override
    public UniqueKey<FarmLodgingFodderMeasuresAnimalCategoryRecord> getPrimaryKey() {
        return Keys.FARM_LODGING_FODDER_MEASURES_ANIMAL_CATEGORY_PKEY;
    }

    @Override
    public List<UniqueKey<FarmLodgingFodderMeasuresAnimalCategoryRecord>> getKeys() {
        return Arrays.<UniqueKey<FarmLodgingFodderMeasuresAnimalCategoryRecord>>asList(Keys.FARM_LODGING_FODDER_MEASURES_ANIMAL_CATEGORY_PKEY);
    }

    @Override
    public List<ForeignKey<FarmLodgingFodderMeasuresAnimalCategoryRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<FarmLodgingFodderMeasuresAnimalCategoryRecord, ?>>asList(Keys.FARM_LODGING_FODDER_MEASURES_ANIMAL_CATEGORY__FARM_LODGING_FODDER_MEASURES_ANIMAL_CATEGORY_FKEY_MEASURES, Keys.FARM_LODGING_FODDER_MEASURES_ANIMAL_CATEGORY__FARM_LODGING_FODDER_MEASURES_ANIMAL_CATEGORY_FKEY_ANIMALCAT);
    }

    public FarmLodgingFodderMeasures farmLodgingFodderMeasures() {
        return new FarmLodgingFodderMeasures(this, Keys.FARM_LODGING_FODDER_MEASURES_ANIMAL_CATEGORY__FARM_LODGING_FODDER_MEASURES_ANIMAL_CATEGORY_FKEY_MEASURES);
    }

    public FarmAnimalCategories farmAnimalCategories() {
        return new FarmAnimalCategories(this, Keys.FARM_LODGING_FODDER_MEASURES_ANIMAL_CATEGORY__FARM_LODGING_FODDER_MEASURES_ANIMAL_CATEGORY_FKEY_ANIMALCAT);
    }

    @Override
    public List<Check<FarmLodgingFodderMeasuresAnimalCategoryRecord>> getChecks() {
        return Arrays.<Check<FarmLodgingFodderMeasuresAnimalCategoryRecord>>asList(
              Internal.createCheck(this, DSL.name("farm_lodging_fodder_measures_animal_category_chk_proportions"), "((((proportion_floor)::real + (proportion_cellar)::real) = (1.0)::double precision))", true)
        );
    }

    @Override
    public FarmLodgingFodderMeasuresAnimalCategory as(String alias) {
        return new FarmLodgingFodderMeasuresAnimalCategory(DSL.name(alias), this);
    }

    @Override
    public FarmLodgingFodderMeasuresAnimalCategory as(Name alias) {
        return new FarmLodgingFodderMeasuresAnimalCategory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FarmLodgingFodderMeasuresAnimalCategory rename(String name) {
        return new FarmLodgingFodderMeasuresAnimalCategory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FarmLodgingFodderMeasuresAnimalCategory rename(Name name) {
        return new FarmLodgingFodderMeasuresAnimalCategory(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Integer, Float, Float> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
