package org.msgpack.unpacker;

import com.C1642a;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.msgpack.MessageTypeException;
import org.msgpack.p1895io.C48353b;

abstract class Accept implements C48353b {
    private final String expected;

    /* access modifiers changed from: 0000 */
    public void acceptEmptyRaw() throws IOException {
        throw new MessageTypeException(C1642a.m8034a("Expected %s, but got raw value", new Object[]{this.expected}));
    }

    /* access modifiers changed from: 0000 */
    public void acceptNil() throws IOException {
        throw new MessageTypeException(C1642a.m8034a("Expected %s, but got nil value", new Object[]{this.expected}));
    }

    Accept(String str) {
        this.expected = str;
    }

    /* access modifiers changed from: 0000 */
    public void acceptArray(int i) throws IOException {
        throw new MessageTypeException(C1642a.m8034a("Expected %s, but got array value", new Object[]{this.expected}));
    }

    /* access modifiers changed from: 0000 */
    public void acceptBoolean(boolean z) throws IOException {
        throw new MessageTypeException(C1642a.m8034a("Expected %s, but got boolean", new Object[]{this.expected}));
    }

    /* access modifiers changed from: 0000 */
    public void acceptDouble(double d) throws IOException {
        throw new MessageTypeException(C1642a.m8034a("Expected %s, but got float value", new Object[]{this.expected}));
    }

    /* access modifiers changed from: 0000 */
    public void acceptFloat(float f) throws IOException {
        throw new MessageTypeException(C1642a.m8034a("Expected %s, but got float value", new Object[]{this.expected}));
    }

    /* access modifiers changed from: 0000 */
    public void acceptInteger(byte b) throws IOException {
        throw new MessageTypeException(C1642a.m8034a("Expected %s, but got integer value", new Object[]{this.expected}));
    }

    /* access modifiers changed from: 0000 */
    public void acceptMap(int i) throws IOException {
        throw new MessageTypeException(C1642a.m8034a("Expected %s, but got map value", new Object[]{this.expected}));
    }

    /* access modifiers changed from: 0000 */
    public void acceptRaw(byte[] bArr) throws IOException {
        throw new MessageTypeException(C1642a.m8034a("Expected %s, but got raw value", new Object[]{this.expected}));
    }

    /* access modifiers changed from: 0000 */
    public void acceptUnsignedInteger(byte b) throws IOException {
        throw new MessageTypeException(C1642a.m8034a("Expected %s, but got integer value", new Object[]{this.expected}));
    }

    /* access modifiers changed from: 0000 */
    public void acceptInteger(int i) throws IOException {
        throw new MessageTypeException(C1642a.m8034a("Expected %s, but got integer value", new Object[]{this.expected}));
    }

    /* access modifiers changed from: 0000 */
    public void acceptUnsignedInteger(int i) throws IOException {
        throw new MessageTypeException(C1642a.m8034a("Expected %s, but got integer value", new Object[]{this.expected}));
    }

    /* access modifiers changed from: 0000 */
    public void acceptInteger(long j) throws IOException {
        throw new MessageTypeException(C1642a.m8034a("Expected %s, but got integer value", new Object[]{this.expected}));
    }

    /* access modifiers changed from: 0000 */
    public void acceptUnsignedInteger(long j) throws IOException {
        throw new MessageTypeException(C1642a.m8034a("Expected %s, but got integer value", new Object[]{this.expected}));
    }

    /* access modifiers changed from: 0000 */
    public void acceptInteger(short s) throws IOException {
        throw new MessageTypeException(C1642a.m8034a("Expected %s, but got integer value", new Object[]{this.expected}));
    }

    /* access modifiers changed from: 0000 */
    public void acceptUnsignedInteger(short s) throws IOException {
        throw new MessageTypeException(C1642a.m8034a("Expected %s, but got integer value", new Object[]{this.expected}));
    }

    public void refer(ByteBuffer byteBuffer, boolean z) throws IOException {
        throw new MessageTypeException(C1642a.m8034a("Expected %s, but got raw value", new Object[]{this.expected}));
    }
}
