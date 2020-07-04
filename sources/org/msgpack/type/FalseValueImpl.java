package org.msgpack.type;

import java.io.IOException;
import org.msgpack.packer.Packer;

class FalseValueImpl extends AbstractBooleanValue {
    private static FalseValueImpl instance = new FalseValueImpl();

    private FalseValueImpl() {
    }

    static FalseValueImpl getInstance() {
        return instance;
    }

    public boolean getBoolean() {
        return false;
    }

    public int hashCode() {
        return 1237;
    }

    public String toString() {
        return "false";
    }

    public StringBuilder toString(StringBuilder sb) {
        sb.append("false");
        return sb;
    }

    public void writeTo(Packer packer) throws IOException {
        packer.write(false);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Value)) {
            return false;
        }
        Value value = (Value) obj;
        if (value.isBooleanValue() && !value.asBooleanValue().getBoolean()) {
            return true;
        }
        return false;
    }
}
