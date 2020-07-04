package org.msgpack.type;

import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import java.io.IOException;
import org.msgpack.packer.Packer;

public class NilValue extends AbstractValue {
    private static NilValue instance = new NilValue();

    private NilValue() {
    }

    static NilValue getInstance() {
        return instance;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isNilValue() {
        return true;
    }

    public String toString() {
        return TEVideoRecorder.FACE_BEAUTY_NULL;
    }

    public /* bridge */ /* synthetic */ ArrayValue asArrayValue() {
        return super.asArrayValue();
    }

    public /* bridge */ /* synthetic */ BooleanValue asBooleanValue() {
        return super.asBooleanValue();
    }

    public /* bridge */ /* synthetic */ FloatValue asFloatValue() {
        return super.asFloatValue();
    }

    public /* bridge */ /* synthetic */ IntegerValue asIntegerValue() {
        return super.asIntegerValue();
    }

    public /* bridge */ /* synthetic */ MapValue asMapValue() {
        return super.asMapValue();
    }

    public /* bridge */ /* synthetic */ RawValue asRawValue() {
        return super.asRawValue();
    }

    public /* bridge */ /* synthetic */ boolean isArrayValue() {
        return super.isArrayValue();
    }

    public /* bridge */ /* synthetic */ boolean isBooleanValue() {
        return super.isBooleanValue();
    }

    public /* bridge */ /* synthetic */ boolean isFloatValue() {
        return super.isFloatValue();
    }

    public /* bridge */ /* synthetic */ boolean isIntegerValue() {
        return super.isIntegerValue();
    }

    public /* bridge */ /* synthetic */ boolean isMapValue() {
        return super.isMapValue();
    }

    public /* bridge */ /* synthetic */ boolean isRawValue() {
        return super.isRawValue();
    }

    public void writeTo(Packer packer) throws IOException {
        packer.writeNil();
    }

    public StringBuilder toString(StringBuilder sb) {
        sb.append(TEVideoRecorder.FACE_BEAUTY_NULL);
        return sb;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Value)) {
            return false;
        }
        return ((Value) obj).isNilValue();
    }
}
