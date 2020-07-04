package org.msgpack.type;

import java.util.AbstractList;
import org.msgpack.MessageTypeException;

abstract class AbstractArrayValue extends AbstractList<Value> implements ArrayValue {
    AbstractArrayValue() {
    }

    public ArrayValue asArrayValue() {
        return this;
    }

    public boolean isArrayValue() {
        return true;
    }

    public boolean isBooleanValue() {
        return false;
    }

    public boolean isFloatValue() {
        return false;
    }

    public boolean isIntegerValue() {
        return false;
    }

    public boolean isMapValue() {
        return false;
    }

    public boolean isNilValue() {
        return false;
    }

    public boolean isRawValue() {
        return false;
    }

    public BooleanValue asBooleanValue() {
        throw new MessageTypeException();
    }

    public FloatValue asFloatValue() {
        throw new MessageTypeException();
    }

    public IntegerValue asIntegerValue() {
        throw new MessageTypeException();
    }

    public MapValue asMapValue() {
        throw new MessageTypeException();
    }

    public RawValue asRawValue() {
        throw new MessageTypeException();
    }
}
