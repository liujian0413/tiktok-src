package org.msgpack.type;

abstract class AbstractBooleanValue extends AbstractValue implements BooleanValue {
    AbstractBooleanValue() {
    }

    public BooleanValue asBooleanValue() {
        return this;
    }

    public boolean isBooleanValue() {
        return true;
    }
}
