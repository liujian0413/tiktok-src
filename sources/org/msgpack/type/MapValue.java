package org.msgpack.type;

import java.util.Map;

public interface MapValue extends Map<Value, Value>, Value {
    Value[] getKeyValueArray();
}
