package org.msgpack.type;

import java.util.List;

public interface ArrayValue extends List<Value>, Value {
    Value[] getElementArray();
}
