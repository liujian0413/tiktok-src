package org.msgpack.unpacker;

final class DoubleAccept extends Accept {
    double value;

    DoubleAccept() {
        super("float");
    }

    /* access modifiers changed from: 0000 */
    public final void acceptDouble(double d) {
        this.value = d;
    }

    /* access modifiers changed from: 0000 */
    public final void acceptFloat(float f) {
        this.value = (double) f;
    }
}
