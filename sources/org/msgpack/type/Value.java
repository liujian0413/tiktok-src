package org.msgpack.type;

import java.io.IOException;
import org.msgpack.packer.Packer;

public interface Value {
    ArrayValue asArrayValue();

    BooleanValue asBooleanValue();

    FloatValue asFloatValue();

    IntegerValue asIntegerValue();

    MapValue asMapValue();

    RawValue asRawValue();

    boolean isArrayValue();

    boolean isBooleanValue();

    boolean isFloatValue();

    boolean isIntegerValue();

    boolean isMapValue();

    boolean isNilValue();

    boolean isRawValue();

    StringBuilder toString(StringBuilder sb);

    void writeTo(Packer packer) throws IOException;
}
