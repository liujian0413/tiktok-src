package org.msgpack.unpacker;

final class MapAccept extends Accept {
    int size;

    MapAccept() {
        super("map");
    }

    /* access modifiers changed from: 0000 */
    public final void acceptMap(int i) {
        this.size = i;
    }
}
