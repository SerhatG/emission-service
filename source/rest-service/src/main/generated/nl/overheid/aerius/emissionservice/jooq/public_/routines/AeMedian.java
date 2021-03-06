/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.public_.routines;


import java.math.BigDecimal;

import nl.overheid.aerius.emissionservice.jooq.public_.Public;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AeMedian extends AbstractRoutine<BigDecimal> {

    private static final long serialVersionUID = -1358648670;

    /**
     * The parameter <code>public.ae_median.RETURN_VALUE</code>.
     */
    public static final Parameter<BigDecimal> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false, false);

    /**
     * The parameter <code>public.ae_median.unsorted_array</code>.
     */
    public static final Parameter<BigDecimal[]> UNSORTED_ARRAY = Internal.createParameter("unsorted_array", org.jooq.impl.SQLDataType.NUMERIC.getArrayDataType(), false, false);

    /**
     * Create a new routine call instance
     */
    public AeMedian() {
        super("ae_median", Public.PUBLIC, org.jooq.impl.SQLDataType.NUMERIC);

        setReturnParameter(RETURN_VALUE);
        addInParameter(UNSORTED_ARRAY);
    }

    /**
     * Set the <code>unsorted_array</code> parameter IN value to the routine
     */
    public void setUnsortedArray(BigDecimal[] value) {
        setValue(UNSORTED_ARRAY, value);
    }

    /**
     * Set the <code>unsorted_array</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setUnsortedArray(Field<BigDecimal[]> field) {
        setField(UNSORTED_ARRAY, field);
    }
}
