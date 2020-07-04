package com.bytedance.p263im.core.proto;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.SortType */
public enum SortType implements WireEnum {
    JOIN_TIME(1);
    
    public static final ProtoAdapter<SortType> ADAPTER = null;
    private final int value;

    /* renamed from: com.bytedance.im.core.proto.SortType$ProtoAdapter_SortType */
    static final class ProtoAdapter_SortType extends EnumAdapter<SortType> {
        ProtoAdapter_SortType() {
            super(SortType.class);
        }

        /* access modifiers changed from: protected */
        public final SortType fromValue(int i) {
            return SortType.fromValue(i);
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ADAPTER = new ProtoAdapter_SortType();
    }

    public static SortType fromValue(int i) {
        if (i != 1) {
            return null;
        }
        return JOIN_TIME;
    }

    private SortType(int i) {
        this.value = i;
    }
}
