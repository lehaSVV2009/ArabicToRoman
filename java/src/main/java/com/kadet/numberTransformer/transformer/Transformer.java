package com.kadet.numberTransformer.transformer;

/**
 * Date: 17.10.14
 * Time: 10:48
 *
 * @author Kadet
 */
public interface Transformer<T, V> {

    /**
     *  Transform from one entity to another
     *
     * @param v
     * @return
     */
    public T transform (V v);

}
