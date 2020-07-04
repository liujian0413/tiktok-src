package org.msgpack.unpacker;

import org.msgpack.MessageTypeException;

final class LongAccept extends Accept {
    long value;

    LongAccept() {
        super("integer");
    }

    /* access modifiers changed from: 0000 */
    public final void acceptInteger(byte b) {
        this.value = (long) b;
    }

    /* access modifiers changed from: 0000 */
    public final void acceptInteger(int i) {
        this.value = (long) i;
    }

    /* access modifiers changed from: 0000 */
    public final void acceptUnsignedInteger(byte b) {
        this.value = (long) (b & 255);
    }

    /* access modifiers changed from: 0000 */
    public final void acceptInteger(long j) {
        this.value = j;
    }

    /* access modifiers changed from: 0000 */
    public final void acceptUnsignedInteger(long j) {
        if (j >= 0) {
            this.value = j;
            return;
        }
        throw new MessageTypeException();
    }

    /* access modifiers changed from: 0000 */
    public final void acceptInteger(short s) {
        this.value = (long) s;
    }

    /* access modifiers changed from: 0000 */
    public final void acceptUnsignedInteger(int i) {
        if (i < 0) {
            this.value = ((long) (i & Integer.MAX_VALUE)) + 2147483648L;
        } else {
            this.value = (long) i;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void acceptUnsignedInteger(short s) {
        this.value = (long) (s & 65535);
    }
}
