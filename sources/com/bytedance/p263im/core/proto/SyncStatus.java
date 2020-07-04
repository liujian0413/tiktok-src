package com.bytedance.p263im.core.proto;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.SyncStatus */
public enum SyncStatus implements WireEnum {
    S_SEND(0),
    S_NOTIFY(1),
    S_PULL(2),
    S_READ(3),
    R_CLICK(4);
    
    public static final ProtoAdapter<SyncStatus> ADAPTER = null;
    private final int value;

    /* renamed from: com.bytedance.im.core.proto.SyncStatus$ProtoAdapter_SyncStatus */
    static final class ProtoAdapter_SyncStatus extends EnumAdapter<SyncStatus> {
        ProtoAdapter_SyncStatus() {
            super(SyncStatus.class);
        }

        /* access modifiers changed from: protected */
        public final SyncStatus fromValue(int i) {
            return SyncStatus.fromValue(i);
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ADAPTER = new ProtoAdapter_SyncStatus();
    }

    public static SyncStatus fromValue(int i) {
        switch (i) {
            case 0:
                return S_SEND;
            case 1:
                return S_NOTIFY;
            case 2:
                return S_PULL;
            case 3:
                return S_READ;
            case 4:
                return R_CLICK;
            default:
                return null;
        }
    }

    private SyncStatus(int i) {
        this.value = i;
    }
}
