package org.msgpack.type;

public abstract class FloatValue extends NumberValue {
    public FloatValue asFloatValue() {
        return this;
    }

    public abstract double getDouble();

    public abstract float getFloat();

    public ValueType getType() {
        return ValueType.FLOAT;
    }

    public boolean isFloatValue() {
        return true;
    }
}
