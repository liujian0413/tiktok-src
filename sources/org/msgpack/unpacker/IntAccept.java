package org.msgpack.unpacker;

import org.msgpack.MessageTypeException;

final class IntAccept extends Accept {
    int value;

    IntAccept() {
        super("integer");
    }

    /* access modifiers changed from: 0000 */
    public final void acceptInteger(byte b) {
        this.value = b;
    }

    /* access modifiers changed from: 0000 */
    public final void acceptInteger(int i) {
        this.value = i;
    }

    /* access modifiers changed from: 0000 */
    public final void acceptUnsignedInteger(byte b) {
        this.value = b & 255;
    }

    /* access modifiers changed from: 0000 */
    public final void acceptInteger(short s) {
        this.value = s;
    }

    /* access modifiers changed from: 0000 */
    public final void acceptUnsignedInteger(int i) {
        if (i >= 0) {
            this.value = i;
            return;
        }
        throw new MessageTypeException();
    }

    /* access modifiers changed from: 0000 */
    public final void acceptInteger(long j) {
        if (j < -2147483648L || j > 2147483647L) {
            throw new MessageTypeException();
        }
        this.value = (int) j;
    }

    /* access modifiers changed from: 0000 */
    public final void acceptUnsignedInteger(long j) {
        if (j < 0 || j > 2147483647L) {
            throw new MessageTypeException();
        }
        this.value = (int) j;
    }

    /* access modifiers changed from: 0000 */
    public final void acceptUnsignedInteger(short s) {
        this.value = s & 65535;
    }
}
