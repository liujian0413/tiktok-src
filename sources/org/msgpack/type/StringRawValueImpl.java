package org.msgpack.type;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;

class StringRawValueImpl extends AbstractRawValue {
    private String string;

    public String getString() {
        return this.string;
    }

    public byte[] getByteArray() {
        try {
            return this.string.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new MessageTypeException((Throwable) e);
        }
    }

    StringRawValueImpl(String str) {
        this.string = str;
    }

    public void writeTo(Packer packer) throws IOException {
        packer.write(this.string);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Value)) {
            return false;
        }
        Value value = (Value) obj;
        if (!value.isRawValue()) {
            return false;
        }
        if (value.getClass() == StringRawValueImpl.class) {
            return this.string.equals(((StringRawValueImpl) value).string);
        }
        return Arrays.equals(getByteArray(), value.asRawValue().getByteArray());
    }
}
