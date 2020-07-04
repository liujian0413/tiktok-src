package org.msgpack.type;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;

class ByteArrayRawValueImpl extends AbstractRawValue {
    private static final ThreadLocal<CharsetDecoder> decoderStore = new ThreadLocal<CharsetDecoder>() {
        /* access modifiers changed from: protected */
        public final CharsetDecoder initialValue() {
            return Charset.forName("UTF-8").newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
        }
    };
    private static ByteArrayRawValueImpl emptyInstance = new ByteArrayRawValueImpl(new byte[0], true);
    private byte[] bytes;

    public static RawValue getEmptyInstance() {
        return emptyInstance;
    }

    public byte[] getByteArray() {
        return this.bytes;
    }

    public int hashCode() {
        return Arrays.hashCode(this.bytes);
    }

    public String getString() {
        try {
            return ((CharsetDecoder) decoderStore.get()).decode(ByteBuffer.wrap(this.bytes)).toString();
        } catch (CharacterCodingException e) {
            throw new MessageTypeException((Throwable) e);
        }
    }

    public void writeTo(Packer packer) throws IOException {
        packer.write(this.bytes);
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
        return Arrays.equals(this.bytes, value.asRawValue().getByteArray());
    }

    ByteArrayRawValueImpl(byte[] bArr, boolean z) {
        if (z) {
            this.bytes = bArr;
            return;
        }
        this.bytes = new byte[bArr.length];
        System.arraycopy(bArr, 0, this.bytes, 0, bArr.length);
    }

    ByteArrayRawValueImpl(byte[] bArr, int i, int i2) {
        this.bytes = new byte[i2];
        System.arraycopy(bArr, i, this.bytes, 0, i2);
    }
}
