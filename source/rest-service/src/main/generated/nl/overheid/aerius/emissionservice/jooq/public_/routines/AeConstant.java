/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.public_.routines;


import nl.overheid.aerius.emissionservice.jooq.public_.Public;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AeConstant extends AbstractRoutine<String> {

    private static final long serialVersionUID = -1015551256;

    /**
     * The parameter <code>public.ae_constant.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>public.ae_constant.constant_key</code>.
     */
    public static final Parameter<String> CONSTANT_KEY = Internal.createParameter("constant_key", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public AeConstant() {
        super("ae_constant", Public.PUBLIC, org.jooq.impl.SQLDataType.CLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(CONSTANT_KEY);
    }

    /**
     * Set the <code>constant_key</code> parameter IN value to the routine
     */
    public void setConstantKey(String value) {
        setValue(CONSTANT_KEY, value);
    }

    /**
     * Set the <code>constant_key</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setConstantKey(Field<String> field) {
        setField(CONSTANT_KEY, field);
    }
}
