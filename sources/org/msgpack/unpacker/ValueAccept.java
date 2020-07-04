package org.msgpack.unpacker;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import org.msgpack.packer.Unconverter;
import org.msgpack.type.ValueFactory;

final class ValueAccept extends Accept {

    /* renamed from: uc */
    public Unconverter f123488uc;

    ValueAccept() {
        super(null);
    }

    /* access modifiers changed from: 0000 */
    public final void acceptEmptyRaw() throws IOException {
        this.f123488uc.write(ValueFactory.createRawValue());
    }

    /* access modifiers changed from: 0000 */
    public final void acceptNil() throws IOException {
        this.f123488uc.write(ValueFactory.createNilValue());
    }

    /* access modifiers changed from: 0000 */
    public final void acceptArray(int i) throws IOException {
        this.f123488uc.writeArrayBegin(i);
    }

    /* access modifiers changed from: 0000 */
    public final void acceptMap(int i) throws IOException {
        this.f123488uc.writeMapBegin(i);
    }

    /* access modifiers changed from: 0000 */
    public final void acceptBoolean(boolean z) throws IOException {
        this.f123488uc.write(ValueFactory.createBooleanValue(z));
    }

    /* access modifiers changed from: 0000 */
    public final void acceptDouble(double d) throws IOException {
        this.f123488uc.write(ValueFactory.createFloatValue(d));
    }

    /* access modifiers changed from: 0000 */
    public final void acceptFloat(float f) throws IOException {
        this.f123488uc.write(ValueFactory.createFloatValue(f));
    }

    /* access modifiers changed from: 0000 */
    public final void acceptInteger(byte b) throws IOException {
        this.f123488uc.write(ValueFactory.createIntegerValue(b));
    }

    /* access modifiers changed from: 0000 */
    public final void acceptRaw(byte[] bArr) throws IOException {
        this.f123488uc.write(ValueFactory.createRawValue(bArr));
    }

    /* access modifiers changed from: 0000 */
    public final void acceptUnsignedInteger(byte b) throws IOException {
        this.f123488uc.write(ValueFactory.createIntegerValue((int) b & 255));
    }

    /* access modifiers changed from: 0000 */
    public final void acceptInteger(int i) throws IOException {
        this.f123488uc.write(ValueFactory.createIntegerValue(i));
    }

    /* access modifiers changed from: 0000 */
    public final void acceptUnsignedInteger(short s) throws IOException {
        this.f123488uc.write(ValueFactory.createIntegerValue((int) s & 65535));
    }

    /* access modifiers changed from: 0000 */
    public final void acceptInteger(long j) throws IOException {
        this.f123488uc.write(ValueFactory.createIntegerValue(j));
    }

    /* access modifiers changed from: 0000 */
    public final void acceptUnsignedInteger(int i) throws IOException {
        if (i < 0) {
            this.f123488uc.write(ValueFactory.createIntegerValue(((long) (i & Integer.MAX_VALUE)) + 2147483648L));
            return;
        }
        this.f123488uc.write(ValueFactory.createIntegerValue(i));
    }

    /* access modifiers changed from: 0000 */
    public final void acceptInteger(short s) throws IOException {
        this.f123488uc.write(ValueFactory.createIntegerValue(s));
    }

    /* access modifiers changed from: 0000 */
    public final void acceptUnsignedInteger(long j) throws IOException {
        if (j < 0) {
            this.f123488uc.write(ValueFactory.createIntegerValue(BigInteger.valueOf(j + Long.MAX_VALUE + 1).setBit(63)));
            return;
        }
        this.f123488uc.write(ValueFactory.createIntegerValue(j));
    }

    public final void refer(ByteBuffer byteBuffer, boolean z) throws IOException {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        this.f123488uc.write(ValueFactory.createRawValue(bArr, true));
    }
}
