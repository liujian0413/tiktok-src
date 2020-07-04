package com.p280ss.android.websocket.internal.proto;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.ss.android.websocket.internal.proto.Version */
public enum Version implements WireEnum {
    V1(1);
    
    public static final ProtoAdapter<Version> ADAPTER = null;
    private final int value;

    public final int getValue() {
        return this.value;
    }

    static {
        ADAPTER = ProtoAdapter.newEnumAdapter(Version.class);
    }

    public static Version fromValue(int i) {
        if (i != 1) {
            return null;
        }
        return V1;
    }

    private Version(int i) {
        this.value = i;
    }
}
