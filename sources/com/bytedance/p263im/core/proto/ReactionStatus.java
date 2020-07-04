package com.bytedance.p263im.core.proto;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.ReactionStatus */
public enum ReactionStatus implements WireEnum {
    POSITIVE(0),
    NEGATIVE(1);
    
    public static final ProtoAdapter<ReactionStatus> ADAPTER = null;
    private final int value;

    /* renamed from: com.bytedance.im.core.proto.ReactionStatus$ProtoAdapter_ReactionStatus */
    static final class ProtoAdapter_ReactionStatus extends EnumAdapter<ReactionStatus> {
        ProtoAdapter_ReactionStatus() {
            super(ReactionStatus.class);
        }

        /* access modifiers changed from: protected */
        public final ReactionStatus fromValue(int i) {
            return ReactionStatus.fromValue(i);
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ADAPTER = new ProtoAdapter_ReactionStatus();
    }

    public static ReactionStatus fromValue(int i) {
        switch (i) {
            case 0:
                return POSITIVE;
            case 1:
                return NEGATIVE;
            default:
                return null;
        }
    }

    private ReactionStatus(int i) {
        this.value = i;
    }
}
