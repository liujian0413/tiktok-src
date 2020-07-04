package org.msgpack.unpacker;

final class ArrayAccept extends Accept {
    int size;

    ArrayAccept() {
        super("array");
    }

    /* access modifiers changed from: 0000 */
    public final void acceptArray(int i) {
        this.size = i;
    }
}
