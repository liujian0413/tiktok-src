package com.squareup.wire;

import java.io.IOException;
import java.net.ProtocolException;

public enum FieldEncoding {
    VARINT(0),
    FIXED64(1),
    LENGTH_DELIMITED(2),
    FIXED32(5);
    
    final int value;

    public final ProtoAdapter<?> rawProtoAdapter() {
        switch (this) {
            case VARINT:
                return ProtoAdapter.UINT64;
            case FIXED32:
                return ProtoAdapter.FIXED32;
            case FIXED64:
                return ProtoAdapter.FIXED64;
            case LENGTH_DELIMITED:
                return ProtoAdapter.BYTES;
            default:
                throw new AssertionError();
        }
    }

    static FieldEncoding get(int i) throws IOException {
        if (i == 5) {
            return FIXED32;
        }
        switch (i) {
            case 0:
                return VARINT;
            case 1:
                return FIXED64;
            case 2:
                return LENGTH_DELIMITED;
            default:
                StringBuilder sb = new StringBuilder("Unexpected FieldEncoding: ");
                sb.append(i);
                throw new ProtocolException(sb.toString());
        }
    }

    private FieldEncoding(int i) {
        this.value = i;
    }
}
